/*
 * DOCUMENTAÇÃO DO FORNECEDOR: https://www.dotwconnect.com/interface/pt/documentation
 */
package br.com.infotera.unidas.config;

import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.SOAPClient;
import br.com.infotera.unidas.model.gen.ObjectFactory;
import br.com.infotera.unidas.model.gen.unidas.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.axiom.AxiomSoapMessageFactory;
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
    
    @Bean
    public SOAPClient soapClient() {
        Jaxb2Marshaller marshaller = assembleMarshaller();
        SOAPClient soapClient = new SOAPClient(saajSoapMessageFactory());
        soapClient.setMarshaller(marshaller);
        soapClient.setUnmarshaller(marshaller);
        return soapClient;
    }

//    @Bean
//    AxiomSoapMessageFactory axiomSoapMessageFactory() {
//        AxiomSoapMessageFactory axiomSoapMessageFactory = new AxiomSoapMessageFactory();
//        axiomSoapMessageFactory.setPayloadCaching(false);
//        try {
//            axiomSoapMessageFactory.afterPropertiesSet();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return axiomSoapMessageFactory;
//    }

     @Bean
    SaajSoapMessageFactory saajSoapMessageFactory() {
        SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory();
        saajSoapMessageFactory.setSoapVersion(SoapVersion.SOAP_12);
        saajSoapMessageFactory.setLangAttributeOnSoap11FaultString(true);

        try {
            saajSoapMessageFactory.afterPropertiesSet();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return saajSoapMessageFactory;
    }
    
//    @Bean
//    public ObjectFactory objectFactory() {
//        return new ObjectFactory();
//    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        return mapper;
    }


}
