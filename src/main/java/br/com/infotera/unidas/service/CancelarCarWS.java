/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehCancel;
import br.com.infotera.unidas.model.gen.unidas.OtaVehCancelResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehCancelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for handling the data to be received and sent from the OTAVehCancel method (Cancel) 
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class CancelarCarWS {
    
    @Autowired
    private UnidasClient unidasClient;
    
    @Autowired
    private OTAVehCancelRequest request;
    
    @Autowired
    private ConsultarCarWS consultar;

    public WSReservaRS cancel(WSReservaRQ reservaRQ) throws ErrorException {
        
        OtaVehCancel vehCancel = request.builderOTAVehCancelRequest(reservaRQ);
        
        OtaVehCancelResponse response = unidasClient.callOTAVehCancel(reservaRQ.getIntegrador(), vehCancel);
        
        updateStatusCancelByBooking(reservaRQ, response);
        
        return consultar.check(reservaRQ, Boolean.TRUE);
    }

    private void updateStatusCancelByBooking(WSReservaRQ reservaRQ, OtaVehCancelResponse response) {
        
    }
}
