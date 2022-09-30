package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.unidas.OtaVehCancel;
import br.com.infotera.unidas.model.gen.opentravel.VehicleCancelRSAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleSegmentCoreType.ConfID;
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
        
        return updateStatusCancelByBooking(reservaRQ, otaVehCancelResponse);
    }

    private WSReservaRS updateStatusCancelByBooking(WSReservaRQ reservaRQ, OtaVehCancelResponse otaVehCancelResponse) throws ErrorException {
        WSReservaRS reservaRS = null;
        WSReservaServico reservaServico = reservaRQ.getReserva().getReservaServicoList().stream()
                .findFirst()
                .orElseThrow(() -> new ErrorException(reservaRQ.getIntegrador(), CancelarCarWS.class, "updateStatusCancelByBooking", WSMensagemErroEnum.SCA, 
                "Não foi possível obter a validação do cancelamento da reserva! Entre em contato com o Fornecedor", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
        
        if(otaVehCancelResponse != null && otaVehCancelResponse.getOtaVehCancelResult() != null) {
            List<VehicleCancelRSAdditionalInfoType> checkCancelReturn = request.checkCancelReturn(reservaRQ.getIntegrador(), otaVehCancelResponse.getOtaVehCancelResult().getErrorsOrSuccessOrVehCancelRSCore());
            if(!Utils.isListNothing(checkCancelReturn)){
                for(VehicleCancelRSAdditionalInfoType vehCancelInfo : checkCancelReturn){
                    if(vehCancelInfo.getVehReservation() != null && vehCancelInfo.getVehReservation().getVehSegmentCore() != null){
                        /** Checked the returned locator in order to validate when querying whether the reservation was cancelled in the partner webservice */
                        for(ConfID id : vehCancelInfo.getVehReservation().getVehSegmentCore().getConfID()){
                            if(id.getType().equals("14") && id.getID().equals(reservaServico.getNrLocalizador())){
                                reservaRS = consultar.check(reservaRQ);
                            } else {
                                throw new ErrorException(reservaRQ.getIntegrador(), CancelarCarWS.class, "updateStatusCancelByBooking", WSMensagemErroEnum.SCA, 
                                    "Não foi identificado o localizador para verificar o status de cancelamento para a reserva! Entre em contato com o Suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                            }
                        }
                    }
                }
            }
        }  else {
            throw new ErrorException(reservaRQ.getIntegrador(), CancelarCarWS.class, "updateStatusCancelByBooking", WSMensagemErroEnum.SCA, 
                "Não foi possível obter a validação do cancelamento da reserva! Entre em contato com o Fornecedor", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
        
        return reservaRS;
    }
}
