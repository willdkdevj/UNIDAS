/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.reserva.rqrs.WSReservarRS;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.model.gen.unidas.OtaVehResResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehResRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SpringBoot default configuration class
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
        
        OtaVehResResponse response = unidasClient.callOTAVehRes(reservarRQ.getIntegrador(), vehRes);
        
        checkStatusBooking(reservarRQ, response);
        
        return new WSReservarRS(reservarRQ.getReserva(), reservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkStatusBooking(WSReservarRQ reservarRQ, OtaVehResResponse response) {
        
    }
}
