package br.com.infotera.unidas.client.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSAmbienteEnum;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.interfaces.ConnectionWebservice;
import br.com.infotera.unidas.model.gen.opentravel.ErrorType;
import br.com.infotera.unidas.model.gen.opentravel.ErrorsType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.unidas.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import org.springframework.stereotype.Component;
import org.springframework.ws.soap.SoapEnvelopeException;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

/**
 *
 * @author William Dias
 * @version 1.0
 * @since Branch Master (29/08/2022)
 * 
 * @see - checkError - Implemented method of the ConnectionWebservice Interface that allows checking error messages identified in the request performed webservice actions
 * @see - builderPost - Implemented method of ConnectionWebservice Interface that customizes HttpPost framework in order to parameterize the send protocol for requests
 * @see - logOff -  Implemented method of the ConnectionWebservice Interface that performs the process for closing the connection with the partner webservice
 * @see - checkEndpointError - ConnectionWebservice Interface implemented method that checks the state of the response provided by the partner webservice on the parameters sent by the request (HTTP)
 * @see - builderURI - Implemented method of the ConnectionWebservice Interface that checks which endpoint must be assigned to the Client to invoke the partner webservice
 */
@Component
public class ConnectionWebServiceImp implements ConnectionWebservice {
    
    /**
     * Allow checking error messages identified in the request performed webservice actions
     * 
     * @param integrador Parameter responsible for passing information between the API and the Legacy System 
     * @param response
     * @throws ErrorException - If errors occur in the process to be carried out, an exception is launched in order to inform the user through the Legacy System 
     */
    @Override
    public void checkError(WSIntegrador integrador, Object response) throws ErrorException {
        String dsErro = null;
        try {
            if(response instanceof OtaVehAvailRateResponse){
                OtaVehAvailRateResponse retorno = (OtaVehAvailRateResponse) response;
                if(retorno.getOtaVehAvailRateResult() != null && !Utils.isListNothing(retorno.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore())) {
                    for(Object obj : retorno.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore()){
                        if(obj instanceof ErrorsType){
                            ErrorsType errors = (ErrorsType) obj;
                            if(!Utils.isListNothing(errors.getError())){
                                for(ErrorType error : errors.getError()){
                                    dsErro = error.getCode() + " - " + error.getValue();
                                }
                            }
                        }
                    }
                }
            }

        } catch(NullPointerException ex){
            throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkError", WSMensagemErroEnum.GENNULO, 
                    "Não houve resposta do webservice parceiro - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, true);
        } catch(Exception ex){
            throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkError", WSMensagemErroEnum.GENCLIENT, 
                    "Não foi possível determinar o retorno do webservice - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }

        if (dsErro != null && !dsErro.equals("")) {
            throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkError", WSMensagemErroEnum.GENCONEC, 
                    "Problema relatado pelo Fornecedor: " + dsErro, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
    
    /**
     * Returns the URI to be invoked in the partner webservice
     * 
     * @param integrador Parameter responsible for passing information between the API and the Legacy System 
     * @return String Object that contains the endpoint to be invoked in the partner webservice
     * @throws ErrorException - If errors occur in the process to be carried out, an exception is launched in order to inform the user through the Legacy System 
     */
    @Override
    public String checkURI(WSIntegrador integrador) throws ErrorException {
        String uri = null;
        try {
            /** CONTRATO: https://wbs.unidas.com.br/WBS2Z_OTA.asmx?wsdl */
            if (WSAmbienteEnum.PRODUCAO.equals(integrador.getAmbiente())) {
                uri = "https://externo-wbsota.novaunidas.com.br/WBS2Z_OTA.asmx";
            } else {
                uri = "https://wbsota.hml.unidas.com.br/WBS2Z_OTA.asmx";
            }
        } catch (Exception ex){
            throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkURI", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível obter o endpoint (URI) " + ex.getMessage(), WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }    
        return uri;
    }

    @Override
    public Usuario buiderUserCredential(WSIntegrador integrador) throws ErrorException {
        Usuario user = null;
        try {
            /** Retorna a lista de parâmetros da credencial cadastrada */
            List<String> credentials = integrador.getDsCredencialList();
            
            user = new Usuario();
            user.setAcordo(credentials.get(0));
            user.setSenha(credentials.get(1));
            
        } catch (Exception ex){
            throw new ErrorException(integrador, ConnectionWebServiceImp.class, "buiderUserCredential", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível obter as credenciais do usuário " + ex.getMessage(), WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }    
        
        return user;
    }

    @Override
    public void soapEnvelopeCustom(SaajSoapMessage message) {
        try {
            SOAPMessage soapMessage = (SOAPMessage) message.getSaajMessage();
            SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
            SOAPHeader header = soapMessage.getSOAPHeader();
            SOAPBody body = soapMessage.getSOAPBody();
            
            envelope.removeNamespaceDeclaration(envelope.getPrefix());
            envelope.addNamespaceDeclaration("soap", "http://www.w3.org/2003/05/soap-envelope");
            envelope.addNamespaceDeclaration("unid", "http://www.unidas.com.br/");
            envelope.addNamespaceDeclaration("ns", "http://www.opentravel.org/OTA/2003/05");
            envelope.setPrefix("soap");

            header.removeNamespaceDeclaration(header.getPrefix());
            header.setPrefix("soap");

            body.removeNamespaceDeclaration(body.getPrefix());
            body.setPrefix("soap");
            
        } catch(SoapEnvelopeException ex){
        } catch (SOAPException ex) {
            Logger.getLogger(ConnectionWebServiceImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
