/*
 * DOCUMENTAÇÃO DO FORNECEDOR: https://www.dotwconnect.com/interface/pt/documentation
 */
package br.com.infotera.unidas.client.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSAmbienteEnum;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.interfaces.ConnectionWebservice;
import br.com.infotera.unidas.model.gen.ErrorType;
import br.com.infotera.unidas.model.gen.ErrorsType;
import br.com.infotera.unidas.model.gen.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.Usuario;
import br.com.infotera.unidas.util.ObjectHandling;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

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
                        ErrorsType errors = (ErrorsType) obj;
                        if(!Utils.isListNothing(errors.getError())){
                            for(ErrorType error : errors.getError()){
                                dsErro = error.getCode() + " - " + error.getValue();
                            }
                        }
                    }
                }
            }
//                dsErro = retorno.getRequest() != null && retorno.getRequest().getError() != null ? retorno.getRequest().getError().getDetails() : "";
//            } else if(retorno.getRequest() != null && retorno.getRequest().getSuccessful() != null && !Boolean.parseBoolean(retorno.getRequest().getSuccessful())){
//                dsErro = retorno.getRequest() != null && retorno.getRequest().getError() != null ? retorno.getRequest().getError().getDetails() : "";
//            }
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
     * Check the state of the response provided by the partner webservice on the parameters sent by the request (HTTP)
     * 
     * @param integrador Parameter responsible for passing information between the API and the Legacy System 
     * @param response HttpClient framework's HttpResponse object analyzes the response state of the partner webservice
     * @throws ErrorException - If errors occur in the process to be carried out, an exception is launched in order to inform the user through the Legacy System 
     */
    @Override
    public void checkEndpointError(WSIntegrador integrador, HttpResponse response) throws ErrorException {
        int statusCode = response.getStatusLine().getStatusCode();
        if(statusCode > 300) {
            String dsMsg = response.getStatusLine().getReasonPhrase();
            switch (String.valueOf(statusCode)) {
                case "400":
                case "500":
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "401":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: O usuário e senha ou token de acesso são inválidos! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "403":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: O acesso à API está bloqueado ou o usuário está bloqueado! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "404":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: O endereço acessado não existe! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "405":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: O acesso ao método não permitido! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "406":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: A requisição está fora do formato (JSON) permitido! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "422":
                    //Erro 422 não retorna lista de campos, apenas mensagem
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: CODERROR - "  + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "429":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: O usuário atingiu o limite de requisições! CODERROR: " + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                case "503":
                    //Erro generico, mensagem especificada na documentação
                    throw new ErrorException(integrador, ConnectionWebServiceImp.class, "checkEndpointError", WSMensagemErroEnum.GENENDPOINT, 
                            "Erro do conector: Servidor temporariamente off-line! CODERROR: "  + statusCode + " " + dsMsg, WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                default:
            }
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
    
    
}
