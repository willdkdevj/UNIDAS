/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehRetRes;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRetResResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehRetResRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for handling the sending and receiving of data related to a specific reservation
 * when invoking the method OTAVehLOCSearch (Get)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class ConsultarCarWS {

    @Autowired
    private UnidasClient unidasClient;
    @Autowired
    private OTAVehRetResRequest request;
    
    public WSReservaRS check(WSReservaRQ reservaRQ, Boolean isCancel) throws ErrorException {
        
        OtaVehRetRes vehRetRes = request.builderOTAVehRetResRequest(reservaRQ);
        
        OtaVehRetResResponse response = unidasClient.callOTAVehRetRes(reservaRQ.getIntegrador(), vehRetRes);
        
        checkBooking(reservaRQ, response, isCancel);
        
        return new WSReservaRS(reservaRQ.getReserva(), reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkBooking(WSReservaRQ reservaRQ, OtaVehRetResResponse response, Boolean isCancel) {
        
    }
}
