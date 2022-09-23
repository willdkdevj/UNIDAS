/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.client;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSIntegradorLog;
import br.com.infotera.common.enumerator.WSIntegradorLogTipoEnum;
import br.com.infotera.common.util.LogWS;
import br.com.infotera.unidas.client.interfaces.ConnectionWebservice;
import br.com.infotera.unidas.util.ObjectHandling;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.soap.SOAPException;
import javax.xml.transform.TransformerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapEnvelope;
import org.springframework.ws.soap.SoapEnvelopeException;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.support.MarshallingUtils;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

/**
 * Class responsible for instantiating the client calling the partner webservice
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 * 
 * @see - sendAndReceive - responsibles for executing the HttpClient functionality in order to meet the communication metrics with the webservice partner
 */
public class SOAPClient extends WebServiceGatewaySupport {

    @Autowired
    protected ConnectionWebservice connection;
    
    public SOAPClient(WebServiceMessageFactory messageFactory) {
        super(messageFactory);
    }

    public Object sendAndReceive(WSIntegrador integrador, Object object, String action) throws ErrorException {
        Object result = null;
        WSIntegradorLog log = new WSIntegradorLog(integrador.getDsAction(), WSIntegradorLogTipoEnum.XML);

        try {
            WebServiceMessageSender[] senders = getMessageSenders();
            setDefaultUri(connection.checkURI(integrador));
            for (WebServiceMessageSender sender : senders) {
                try {
                    HttpUrlConnectionMessageSender httpSender = (HttpUrlConnectionMessageSender) sender;
                    httpSender.setConnectionTimeout(Duration.ofSeconds(5));
                    httpSender.setReadTimeout(Duration.ofSeconds(integrador.getTimeoutSegundos()));
                    httpSender.setAcceptGzipEncoding(true);
                } catch (ClassCastException | NumberFormatException cex) {
                    logger.warn("Cannot set WS timeout: " + cex.getMessage());
                }
            }

            WebServiceTemplate wsTemplate = getWebServiceTemplate();
            
            result = wsTemplate.sendAndReceive(
                    new WebServiceMessageCallback() {
                        @Override
                        public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                            SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();
                            try {
                                getMarshaller().marshal(connection.buiderUserCredential(integrador), soapHeader.getResult());
                            } catch (ErrorException | IOException | XmlMappingException ex) {
                                Logger.getLogger(SOAPClient.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            ((SoapMessage) message).setSoapAction(action);
                            SoapBody soapBody = ((SoapMessage) message).getSoapBody();
                            try {
                                getMarshaller().marshal(object, soapBody.getPayloadResult());
                            } catch (IOException | XmlMappingException ex) {
                                Logger.getLogger(SOAPClient.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
//                            try {
//                                alterarEnvelope(message);
//                            } catch (SOAPException ex) {
//                                Logger.getLogger(SOAPClient.class.getName()).log(Level.SEVERE, null, ex);
//                            }
                            
                            ByteArrayOutputStream out = new ByteArrayOutputStream();
                            ((WebServiceMessage) message).writeTo(out);
                            ObjectHandling.generateFile(out.toString(), "/home/william/Documentos/Unidas/", "responseRQ_header.xml");
                            LogWS.convertRequestSoap(integrador, log, message);
                        }
                    }, new WebServiceMessageExtractor<Object>() {
                        @Override
                        public Object extractData(WebServiceMessage message) throws IOException {
                            Object result = null;
                            try {
                                result = MarshallingUtils.unmarshal(getUnmarshaller(), message);
                            } catch (IOException ex) {
                                ByteArrayOutputStream out = new ByteArrayOutputStream();
                                ((WebServiceMessage) message).writeTo(out);
                                log.setDsResponse(out.toByteArray());
                                throw ex;
                            }
                            LogWS.convertResponseSoap(integrador, log, result);
                            ObjectHandling.generateFile(ObjectHandling.marshalObjectXML(result), "/home/william/Documentos/Unidas/", "responseRS_header.xml");
                            
                            return result;
                        }
                    });

            
            connection.checkError(integrador, result);
        } catch (ErrorException ex) {
            LogWS.convertResponseSoap(integrador, log, result);
            throw ex;
        } catch (Exception ex) {
            throw LogWS.convertResponseSoapException(integrador, ex, log);
        } finally {
            LogWS.montaLog(integrador, log);
        }

        return result;
    }    
    
    private void alterarEnvelope(WebServiceMessage message) throws SOAPException {
        try {
            SoapEnvelope envelope = ((SoapMessage) message).getEnvelope();
//            SoapHeader header = ((SoapMessage) message).getSoapHeader();
//            SoapBody body = ((SoapMessage) message).getSoapBody();
            
            envelope.addNamespaceDeclaration("soap", "http://www.w3.org/2003/05/soap-envelope");
            envelope.addNamespaceDeclaration("unid", "http://www.unidas.com.br/");
            envelope.addNamespaceDeclaration("ns", "http://www.opentravel.org/OTA/2003/05");
//            header.addNamespaceDeclaration("soap", "http://www.w3.org/2003/05/soap-envelope");
//            body.addNamespaceDeclaration("soap", "http://www.w3.org/2003/05/soap-envelope");
            
        } catch(SoapEnvelopeException ex){
            ex.printStackTrace();
        }
    }
}
