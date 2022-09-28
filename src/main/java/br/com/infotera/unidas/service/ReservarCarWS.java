/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.reserva.rqrs.WSReservarRS;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.VehicleResRSAdditionalInfoType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.model.gen.unidas.OtaVehResResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehResRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for making the reservation of the vehicle according to the data sent by the passenger (Booking)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class ReservarCarWS {

    @Autowired
    private UnidasClient unidasClient;
    @Autowired
    private OTAVehResRequest request;

    public WSReservarRS book(WSReservarRQ reservarRQ) throws ErrorException {
        
        OtaVehRes vehRes = request.builderOTAVehResRequest(reservarRQ);
        
        OtaVehResResponse otaVehResResponse = unidasClient.callOTAVehRes(reservarRQ.getIntegrador(), vehRes);
        
        checkStatusBooking(reservarRQ, otaVehResResponse);
        
        return new WSReservarRS(reservarRQ.getReserva(), reservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkStatusBooking(WSReservarRQ reservarRQ, OtaVehResResponse otaVehResResponse) throws ErrorException {
        if(otaVehResResponse != null && otaVehResResponse.getOtaVehResResult() != null) {
            List<VehicleResRSAdditionalInfoType> response = request.checkResReturn(reservarRQ.getIntegrador(), otaVehResResponse.getOtaVehResResult().getErrorsOrSuccessOrVehResRSCore());
            
            
        }  else {
            throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "checkStatusBooking", WSMensagemErroEnum.SRE, 
                "Não foi possível obter a validação da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
}
