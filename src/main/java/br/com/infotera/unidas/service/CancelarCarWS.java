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
import br.com.infotera.unidas.model.gen.opentravel.OtaVehCancel;
import br.com.infotera.unidas.model.gen.opentravel.VehicleCancelRSAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleResRSAdditionalInfoType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehCancelResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehCancelRequest;
import java.util.List;
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
        
        OtaVehCancelResponse otaVehCancelResponse = unidasClient.callOTAVehCancel(reservaRQ.getIntegrador(), vehCancel);
        
        updateStatusCancelByBooking(reservaRQ, otaVehCancelResponse);
        
        return consultar.check(reservaRQ, Boolean.TRUE);
    }

    private void updateStatusCancelByBooking(WSReservaRQ reservaRQ, OtaVehCancelResponse otaVehCancelResponse) throws ErrorException {
        if(otaVehCancelResponse != null && otaVehCancelResponse.getOtaVehCancelResult() != null) {
            List<VehicleCancelRSAdditionalInfoType> checkCancelReturn = request.checkCancelReturn(reservaRQ.getIntegrador(), otaVehCancelResponse.getOtaVehCancelResult().getErrorsOrSuccessOrVehCancelRSCore());
            
            
        }  else {
            throw new ErrorException(reservaRQ.getIntegrador(), CancelarCarWS.class, "updateStatusCancelByBooking", WSMensagemErroEnum.SCA, 
                "Não foi possível obter a validação do cancelamento da reserva! Entre em contato com o Fornecedor", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
}
