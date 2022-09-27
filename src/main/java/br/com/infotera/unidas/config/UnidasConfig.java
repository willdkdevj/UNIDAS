package br.com.infotera.unidas.config;

import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.SOAPClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

/**
 * Class responsible for configuring the serialization and deserialization of objects 
 * and for customizing the client to be used in the connection with the partner webservice
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (29/08/2022)
 * 
 * @see - assembleMarshaller
 * @see - gson
 * @see - httpClient
 */
@Configuration
public class UnidasConfig {
    
    /**
     * Responsible for delivering an instance of JABX to the API
     * 
     * @return Jaxb2Marshaller - Responsible for delivering an instance of JAXB for serialization and deserialization of classes present in the context provided to it
     */
    @Bean
    public Jaxb2Marshaller assembleMarshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPaths("br.com.infotera.unidas.model.gen",
                                        "br.com.infotera.unidas.model.gen.unidas",
                                        "br.com.infotera.unidas.model.gen.opentravel");
        
        return jaxb2Marshaller;
    }

    /**
     * Responsible for delivering an instance of GSON into API and Legacy System
     * 
     * @return Gson - Responsible for delivering an instance of GSON for serialization and deserialization to the API in order to exchange context with the Legacy System
     */
    @Bean
    public Gson gson() {
        return Utils.getGson();
    }
    
    /**
     * Responsible for delivering an instance of GSON into API and Legacy System
     * 
     * @return Gson - Responsible for delivering an instance of GSON for serialization and deserialization to the API in order to exchange context with the Legacy System
     */
    @Bean
    public SOAPClient soapClient() {
        Jaxb2Marshaller marshaller = assembleMarshaller();
        SOAPClient soapClient = new SOAPClient(saajSoapMessageFactory());
        soapClient.setMarshaller(marshaller);
        soapClient.setUnmarshaller(marshaller);
        
        return soapClient;
    }

    /**
     * Responsible for delivering an instance of GSON into API and Legacy System
     * 
     * @return Gson - Responsible for delivering an instance of GSON for serialization and deserialization to the API in order to exchange context with the Legacy System
     */
    @Bean
    SaajSoapMessageFactory saajSoapMessageFactory() {
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory();
        saajSoapMessageFactory.setSoapVersion(SoapVersion.SOAP_12);
        saajSoapMessageFactory.setLangAttributeOnSoap11FaultString(Boolean.TRUE);

        try {
            saajSoapMessageFactory.afterPropertiesSet();
        } catch (Exception ex) {
        }
        
        return saajSoapMessageFactory;
    }
    
    /**
     * Responsible for delivering an instance of GSON into API and Legacy System
     * 
     * @return Gson - Responsible for delivering an instance of GSON for serialization and deserialization to the API in order to exchange context with the Legacy System
     */
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, Boolean.FALSE);
        
        return mapper;
    }


}
