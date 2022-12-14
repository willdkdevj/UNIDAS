package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.reserva.rqrs.WSReservarRS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.VehicleResRSCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.model.gen.unidas.OtaVehResResponse;
import br.com.infotera.unidas.service.interfaces.OTAVehResRequest;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    @Autowired
    private ConsultarCarWS consultar;

    public WSReservarRS book(WSReservarRQ reservarRQ) throws ErrorException {
        /** Assemble requisition for call to do reservation */
        OtaVehRes vehRes = request.builderOTAVehResRequest(reservarRQ);
        /** Get response object from the vendor according to parameters sent by the request */
        OtaVehResResponse otaVehResResponse = unidasClient.callOTAVehRes(reservarRQ.getIntegrador(), vehRes);
        /** Verifica o retorno do localizador da reserva após solicitação */
        checkStatusLOCBooking(reservarRQ, otaVehResResponse);
        /** Verifica o estado da reserva na plataforma do fornecedor */
        WSReservaRS checkReservation = consultar.check(new WSReservaRQ(reservarRQ.getIntegrador(), reservarRQ.getReserva()));
        
        return new WSReservarRS(checkReservation.getReserva(), checkReservation.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkStatusLOCBooking(WSReservarRQ reservarRQ, OtaVehResResponse otaVehResResponse) throws ErrorException {
        if(otaVehResResponse != null && otaVehResResponse.getOtaVehResResult() != null) {
            List<VehicleResRSCoreType> responses = request.checkResReturn(reservarRQ.getIntegrador(), otaVehResResponse.getOtaVehResResult().getErrorsOrSuccessOrVehResRSCore());
            if(!Utils.isListNothing(responses)){
                responses.forEach(response -> {
                    if(response.getVehReservation() != null){
                        try {
                            if(response.getVehReservation().getVehSegmentCore() != null){
                                reservarRQ.getReserva().getReservaServicoList().forEach(reservaServico -> {
                                    response.getVehReservation().getVehSegmentCore().getConfID().forEach(codID -> {
                                        reservarRQ.getIntegrador().setCdLocalizador(codID.getID());
                                        reservaServico.setNrLocalizador(codID.getID());
                                    });
                                });
                            } else {
                                throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "checkStatusLOCBooking", WSMensagemErroEnum.SRE,
                                        "Não foi retornado o localizador para a reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                            }
                        } catch (ErrorException ex) {
                            try {
                                throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "checkStatusLOCBooking", WSMensagemErroEnum.SRE,
                                        "Não foi possível verificar o status da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
                            } catch (ErrorException ex1) {
                                Logger.getLogger(ReservarCarWS.class.getName()).log(Level.SEVERE, null, ex1);
                            }
                        }
                    }
                });
            } else {
                throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "checkStatusLOCBooking", WSMensagemErroEnum.SRE,
                        "Não foi possível obter a validação da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
            
        } else {
            throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "checkStatusLOCBooking", WSMensagemErroEnum.SRE, 
                "Não foi possível obter a validação da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
}
