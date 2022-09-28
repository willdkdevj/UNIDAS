/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehRetRes;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRetrieveResRSCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRetResResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehRetResRequest;
import java.util.List;
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
        
        OtaVehRetResResponse otaVehRetResResponse = unidasClient.callOTAVehRetRes(reservaRQ.getIntegrador(), vehRetRes);
        
        checkBooking(reservaRQ, otaVehRetResResponse, isCancel);
        
        return new WSReservaRS(reservaRQ.getReserva(), reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkBooking(WSReservaRQ reservaRQ, OtaVehRetResResponse otaVehRetResResponse, Boolean isCancel) throws ErrorException {
        if(otaVehRetResResponse != null && otaVehRetResResponse.getOtaVehRetResResult() != null) {
            List<VehicleRetrieveResRSCoreType> response = request.checkRetResReturn(reservaRQ.getIntegrador(), otaVehRetResResponse.getOtaVehRetResResult().getErrorsOrSuccessOrVehRetResRSCore());
            
            
        }  else {
            throw new ErrorException(reservaRQ.getIntegrador(), ConsultarCarWS.class, "checkBooking", WSMensagemErroEnum.SCO, 
                "Não foi possível obter o retorno da consulta a reserva. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
}
