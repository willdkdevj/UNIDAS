/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.client.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.unidas.model.gen.unidas.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

/**
 * Interface responsible for standardizing the methods to be implemented for treatments to be applied to the Client
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 * 
 * @see - builderPost - responsible for building all the necessary parameters requested by the partner to be sent via the POST (HTTP) protocol
 * @see - execute - responsible for initiating the communication by sending the request previously requested by the partner through the HttpClient framework
 * @see - checkEndpointError - checks if the response from the connector that evaluates the HTTP protocol is the returned state
 * @see - checkError - checks whether the return submitted by the partner contains error information
 * @see - logOff - takes care of closing the connection to the partner webservice
 * @see - customIntegradorTimeout - custom webservice client into get timeout by Integrador parameter
 */
@Component
public interface ConnectionWebservice {
    
    void checkError(WSIntegrador integrador, Object response) throws ErrorException;
    
    String checkURI(WSIntegrador integrador) throws ErrorException;
    
    Usuario buiderUserCredential(WSIntegrador integrador) throws ErrorException;
    
    void soapEnvelopeCustom(SaajSoapMessage message);
    
}   
