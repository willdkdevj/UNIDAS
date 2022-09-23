/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSReserva;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSReservaStatusEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CancelarCarWS {

//    @Autowired
//    private ConsultarCarWS consultarWS;
//    @Autowired
//    private AmadeusClient amadeusClient;
//
//    public WSReservaRS cancelar(WSReservaRQ reservaRQ) throws ErrorException {
//
//        String cdLocalizador = reservaRQ.getReserva().getReservaServicoList().get(0).getNrLocalizador();
//
//        ParReserva parReserva = null;
//        if (reservaRQ.getReserva().getReservaServicoList().get(0) != null) {
//            if (reservaRQ.getReserva().getReservaServicoList().get(0).getServico() != null && reservaRQ.getReserva().getReservaServicoList().get(0).getServico().getTarifa() != null) {
//                parReserva = (ParReserva) UtilsWSCar.fromJson(reservaRQ.getReserva().getReservaServicoList().get(0).getServico().getTarifa().getDsParametro(), ParReserva.class);
//            }
//        }
//        if (parReserva == null) {
//            parReserva = new ParReserva(null, null, null);
//        }
//
//        PNRRetrieve retrieve = consultarWS.montaConsulta(cdLocalizador);

//        PNRReply retrieveRS = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), retrieve, PNRReply.class, 1);
//        PNRReply retrieveRS = amadeusClient.PNRRetrieve(reservaRQ.getIntegrador(), retrieve, 1);

//        CarRateInformationFromCarSegment carRateInformationFromCarSegment = consultarWS.montaConsultaCarRateInformation(null, cdLocalizador, retrieveRS.getTechnicalData().getEnveloppeNumberData().getSequenceDetails().getNumber());

//        CarRateInformationFromCarSegmentReply carRateInformationFromCarSegmentReply = amadeusClient.carRateInformationFromCarSegmentReply(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, 2);
//        CarRateInformationFromCarSegmentReply carRateInformationFromCarSegmentReply = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, CarRateInformationFromCarSegmentReply.class, 2);
//
//        WSReserva consulta = consultarWS.montaReserva(retrieveRS, reservaRQ.getIntegrador(), parReserva, carRateInformationFromCarSegmentReply, null, "");
//
//        if (!consulta.getReservaServicoList().get(0).getReservaStatus().equals(WSReservaStatusEnum.CANCELADO)) {
//            PNRCancel pnrCancelar = new PNRCancel();
//            PNRCancel.ReservationInfo reservationControlInformationType = new PNRCancel.ReservationInfo();
//            PNRCancel.ReservationInfo.Reservation reservationControlInformationDetailsTypeI = new PNRCancel.ReservationInfo.Reservation();
//            reservationControlInformationDetailsTypeI.setControlNumber(reservaRQ.getReserva().getReservaServicoList().get(0).getNrLocalizador());
//            reservationControlInformationType.setReservation(reservationControlInformationDetailsTypeI);
//            pnrCancelar.setReservationInfo(reservationControlInformationType);
//            PNRCancel.PnrActions acoesPnr = new PNRCancel.PnrActions();
//            acoesPnr.getOptionCode().add(BigDecimal.valueOf(11));
//            pnrCancelar.setPnrActions(acoesPnr);
//            PNRCancel.CancelElements cancelarElementos = new PNRCancel.CancelElements();
//            cancelarElementos.setEntryType("I");
//            pnrCancelar.getCancelElements().add(cancelarElementos);
//            amadeusClient.pnrCancelar(reservaRQ.getIntegrador(), pnrCancelar, 2);
////            chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), pnrCancelar, PNRReply.class, 2);
//        }
//
//        PNRRetrieve retrieve1 = consultarWS.montaConsulta(cdLocalizador);
//
//        PNRReply retrieveRS1 = amadeusClient.PNRRetrieve(reservaRQ.getIntegrador(), retrieve1, 2);
////        PNRReply retrieveRS1 = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), retrieve1, PNRReply.class, 2);
//
//        carRateInformationFromCarSegmentReply = null;
//        if (retrieveRS1.getOriginDestinationDetails() != null && retrieveRS1.getOriginDestinationDetails().size() > 0) {
//            carRateInformationFromCarSegment = consultarWS.montaConsultaCarRateInformation(null, cdLocalizador, retrieveRS1.getTechnicalData().getEnveloppeNumberData().getSequenceDetails().getNumber());
//            carRateInformationFromCarSegmentReply = amadeusClient.carRateInformationFromCarSegmentReply(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, 2);
////            carRateInformationFromCarSegmentReply = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, CarRateInformationFromCarSegmentReply.class, 2);
//        }
//
//        WSReserva consulta1 = consultarWS.montaReserva(retrieveRS1, reservaRQ.getIntegrador(), null, carRateInformationFromCarSegmentReply, null, "");
//
//        SecuritySignOut segurancaSair = new SecuritySignOut();
//        amadeusClient.segurancaSair(reservaRQ.getIntegrador(), segurancaSair, 3);
////        chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), segurancaSair, SecuritySignOutReply.class, 3);
//
//        return new WSReservaRS(consulta1, reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
}
