package br.com.infotera.unidas.client;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.model.gen.unidas.OtaVehResResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for allocating the methods to be invoked on the vendor
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 * 
 * @see - callOTAVehAvailRate - Method responsible for invoking the availability function
 * @see - callOTAVehRes - Method responsible for invoking the reservation function
 */
@Service
public class UnidasClient {
    
    @Autowired
    private SOAPClient soapClient;
    
    /**
     * The callOTAVehAvailRate method is responsible for forwarding requests created from the OtaVehAvailRateResponse 
     * that follow a certain ordering pattern of its parameters that is checked when arriving at the partner webservice
     * 
     * @param vehAvailRateRQ - Request object parameter expected by the partner webservice method
     * @see - sendAndReceive - responsible for handling the validation of the transaction of sending and receiving requests (XML)
     * @see - marshalXMLToObject - responsible for converting the returned text into an object (POJO)
     * 
     * @param integrador Parameter responsible for passing information between the API and the Legacy System
     * @return Result - Class responsible for encapsulating the response referring to the type (command) of request sent
     * @throws ErrorException - If errors occur in the process to be carried out, an exception is launched in order to inform the user through the Legacy System
     */
    public OtaVehAvailRateResponse callOTAVehAvailRate(WSIntegrador integrador, OtaVehAvailRate vehAvailRateRQ) throws ErrorException {
        OtaVehAvailRateResponse response = null;
        try {
            integrador.setDsAction("OTAVehAvailRate");
            response = (OtaVehAvailRateResponse) soapClient.sendAndReceive(integrador, vehAvailRateRQ, "http://www.unidas.com.br/OtaVehAvailRate");
            
        } catch (ErrorException ex){
            throw ex;
        } catch (Exception ex) {
            integrador.setDsMensagem(ex.getMessage());
            integrador.setIntegracaoStatus(WSIntegracaoStatusEnum.NEGADO);
            throw new ErrorException(integrador, UnidasClient.class, "getSearchHotels", WSMensagemErroEnum.GENCLIENT, 
                    "Erro ao realizar a chamada ao webservice: " + ex.getMessage(), WSIntegracaoStatusEnum.NEGADO, ex, false);
        }
        
        return response;
    }
    
    /**
     * The callOTAVehRes method is responsible for forwarding requests created from the OtaVehResResponse 
     * that follow a certain ordering pattern of its parameters that is checked when arriving at the partner webservice
     * 
     * @param vehAvailRateRQ - Parametro de objeto de requisição aguardado pelo método do webservice parceiro
     * @see - sendAndReceive - responsible for handling the validation of the transaction of sending and receiving requests (XML)
     * @see - marshalXMLToObject - responsible for converting the returned text into an object (POJO)
     * 
     * @param integrador Parameter responsible for passing information between the API and the Legacy System
     * @return Result - Class responsible for encapsulating the response referring to the type (command) of request sent
     * @throws ErrorException - If errors occur in the process to be carried out, an exception is launched in order to inform the user through the Legacy System
     */
    public OtaVehResResponse callOTAVehRes(WSIntegrador integrador, OtaVehRes vehAvailRateRQ) throws ErrorException {
        OtaVehResResponse response = null;
        try {
            integrador.setDsAction("OTAVehRes");
            response = (OtaVehResResponse) soapClient.sendAndReceive(integrador, vehAvailRateRQ, "http://www.unidas.com.br/OtaVehRes");
            
        } catch (ErrorException ex){
            throw ex;
        } catch (Exception ex) {
            integrador.setDsMensagem(ex.getMessage());
            integrador.setIntegracaoStatus(WSIntegracaoStatusEnum.NEGADO);
            throw new ErrorException(integrador, UnidasClient.class, "callOTAVehRes", WSMensagemErroEnum.GENCLIENT, 
                    "Erro ao realizar a chamada ao webservice: " + ex.getMessage(), WSIntegracaoStatusEnum.NEGADO, ex, false);
        }
        
        return response;
    }
}
