/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.*;
import br.com.infotera.common.politica.WSPolitica;
import br.com.infotera.common.politica.WSPoliticaVoucher;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.common.servico.WSVeiculoDetalhe;
import br.com.infotera.common.servico.WSVeiculoLocadora;
import br.com.infotera.common.servico.WSVeiculoLocal;
import br.com.infotera.common.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ConsultarCarWS {

//    @Autowired
//    private AmadeusClient amadeusClient;
//
//    public WSReservaRS consulta(WSReservaRQ reservaRQ) throws ErrorException {
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
//        PNRRetrieve retrieve = montaConsulta(cdLocalizador);
//        PNRReply retrieveRS = amadeusClient.PNRRetrieve(reservaRQ.getIntegrador(), retrieve, 1);
////        PNRReply retrieveRS = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), retrieve, PNRReply.class, 1);
//
//        String sequence = null;
//        CarRateInformationFromCarSegmentReply carRateInformationFromCarSegmentReply = null;
//        if (retrieveRS.getOriginDestinationDetails() != null && retrieveRS.getOriginDestinationDetails().size() > 0) {
//
//            for (PNRReply.OriginDestinationDetails odd : retrieveRS.getOriginDestinationDetails()) {
//                if (!Utils.isListNothing(odd.getItineraryInfo())) {
//                    for (PNRReply.OriginDestinationDetails.ItineraryInfo ii : odd.getItineraryInfo()) {
//                        if (ii.getElementManagementItinerary() != null && ii.getElementManagementItinerary().getReference() != null && ii.getElementManagementItinerary().getReference().getNumber() != null) {
//                            sequence = ii.getElementManagementItinerary().getReference().getNumber().toString();
//                        }
//                    }
//                }
//            }
//
//            if (sequence == null) {
//                throw new ErrorException(reservaRQ.getIntegrador(), ConsultarCarWS.class, "Consulta", WSMensagemErroEnum.GENNULO, "Numero de segmento nao informado, contate o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null);
//            }
//
//            CarRateInformationFromCarSegment carRateInformationFromCarSegment = montaConsultaCarRateInformation(parReserva.getB10(), cdLocalizador, sequence);
//            carRateInformationFromCarSegmentReply = amadeusClient.carRateInformationFromCarSegmentReply(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, 2);
////            carRateInformationFromCarSegmentReply = chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), carRateInformationFromCarSegment, CarRateInformationFromCarSegmentReply.class, 2);
//        }
//
//        SecuritySignOut segurancaSair = new SecuritySignOut();
//        amadeusClient.segurancaSair(reservaRQ.getIntegrador(), segurancaSair, 3);
////        chamaWS.chamadaPadrao(reservaRQ.getIntegrador(), segurancaSair, SecuritySignOutReply.class, 3);
//
//        //caso venha do fluxo de importação
//        String dsOperadora = null;
//
//        //grava o dsTarifa
//        String dsTarifa = "";
//
//        List<WSVeiculoDetalhe> veiculoDetalheList = null;
//        if (!Utils.isListNothing(reservaRQ.getReserva().getReservaServicoList()) && reservaRQ.getReserva().getReservaServicoList().get(0) != null && reservaRQ.getReserva().getReservaServicoList().get(0).getServico() != null) {
//            WSVeiculo veiculo = (WSVeiculo) reservaRQ.getReserva().getReservaServicoList().get(0).getServico();
//            dsOperadora = veiculo.getDsOperadora();
//            parReserva.setB4(dsOperadora);
//            veiculoDetalheList = veiculo.getVeiculoDetalheList();
//            dsTarifa = veiculo.getTarifa().getDsTarifa();
//        }
//        return new WSReservaRS(montaReserva(retrieveRS, reservaRQ.getIntegrador(), parReserva, carRateInformationFromCarSegmentReply, veiculoDetalheList, dsTarifa), reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
//
//    public PNRRetrieve montaConsulta(String cdLocalizador) {
//
//        PNRRetrieve retrieve = new PNRRetrieve();
//        PNRRetrieve.RetrievalFacts facts = new PNRRetrieve.RetrievalFacts();
//        PNRRetrieve.RetrievalFacts.Retrieve pnrType = new PNRRetrieve.RetrievalFacts.Retrieve();
//        pnrType.setType(BigDecimal.valueOf(2));
//        facts.setRetrieve(pnrType);
//        PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier reservation = new PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier();
//        PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation reservationType = new PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation();
//        reservationType.setControlNumber(cdLocalizador);
//        reservation.getReservation().add(reservationType);
//        facts.setReservationOrProfileIdentifier(reservation);
//        retrieve.setRetrievalFacts(facts);
//        return retrieve;
//    }
//
//    public CarRateInformationFromCarSegment montaConsultaCarRateInformation(String sgMoeda, String cdLocalizador, String sequence) {
//
//        CarRateInformationFromCarSegment carRateInformationFromCarSegment = new CarRateInformationFromCarSegment();
//        CarRateInformationFromCarSegment.PnrRecLoc pnrRecLoc = new CarRateInformationFromCarSegment.PnrRecLoc();
//        CarRateInformationFromCarSegment.PnrRecLoc.Reservation reservation = new CarRateInformationFromCarSegment.PnrRecLoc.Reservation();
//
//        reservation.setCompanyId("1A");
//        reservation.setControlType("P");
//        reservation.setControlNumber(cdLocalizador);
//        pnrRecLoc.setReservation(reservation);
//        carRateInformationFromCarSegment.setPnrRecLoc(pnrRecLoc);
//
//        CarRateInformationFromCarSegment.BookingIdentifier bookingIdentifier = new CarRateInformationFromCarSegment.BookingIdentifier();
//
//        bookingIdentifier.setReferenceType("S");
//        bookingIdentifier.setUniqueReference(sequence);
//        carRateInformationFromCarSegment.setBookingIdentifier(bookingIdentifier);
//
//        if (sgMoeda != null) {
//            Currency currency = new CarRateInformationFromCarSegment.Currency();
//            CurrencyDetails currencyDetails = new CurrencyDetails();
//            currencyDetails.setDisplayCurrency(sgMoeda);
//            currencyDetails.setCurrencyQualifier("2");
//            currency.setCurrencyDetails(currencyDetails);
//            carRateInformationFromCarSegment.setCurrency(currency);
//        }
//
//        return carRateInformationFromCarSegment;
//    }
//
//    public WSReserva montaReserva(PNRReply reply, WSIntegrador integrador, ParReserva parReserva, CarRateInformationFromCarSegmentReply carRateInfo, List<WSVeiculoDetalhe> veiculoDetalheList, String dsTarifa) throws ErrorException {
//
//        List<WSReservaServico> reservaServicoList = new ArrayList();
//        String nrLocalizador = null;
//        String nrFornecedorLocalizador = null;
//        String nmFornecedor = null;
//        WSReservaStatusEnum reservaStatus = null;
//        WSVeiculo veiculo = null;
//
//        try {
//            for (PNRReply.PnrHeader ph : reply.getPnrHeader()) {
//                try {
//                    for (ReservationControlInformationDetailsType idt : ph.getReservationInfo().getReservation()) {
//                        nrLocalizador = idt.getControlNumber();
//                    }
//                } catch (Exception ex) {
//                    throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao montar localizador", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                }
//            }
//        } catch (Exception ex) {
//            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao ler PnrHeader", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//        }
//
//        List<WSReservaNome> reservaNomeList = new ArrayList();
//        if (reply.getTravellerInfo() != null) {
//            try {
//                for (PNRReply.TravellerInfo ti : reply.getTravellerInfo()) {
//                    try {
//                        ti.getPassengerData().forEach((pd) -> {
//                            reservaNomeList.add(new WSReservaNome(pd.getTravellerInformation().getPassenger().get(0).getFirstName(), pd.getTravellerInformation().getTraveller().getSurname(), WSPaxTipoEnum.ADT, null, null));
//                        });
//                    } catch (Exception ex) {
//                        throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao montar pax", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                    }
//                }
//            } catch (Exception ex) {
//                throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao ler TravellerInfo", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//            }
//        }
//
//        if (reply.getOriginDestinationDetails() != null && reply.getOriginDestinationDetails().size() > 0) {
//            try {
//                for (PNRReply.OriginDestinationDetails odd : reply.getOriginDestinationDetails()) {
//                    if (odd.getItineraryInfo() != null) {
//                        try {
//                            for (PNRReply.OriginDestinationDetails.ItineraryInfo ii : odd.getItineraryInfo()) {
//                                String status = ii.getRelatedProduct().getStatus().get(0);
//                                switch (status) {
//                                    case "HK":
//                                        reservaStatus = WSReservaStatusEnum.CONFIRMADO;
//                                        break;
//                                    case "HX":
//                                        reservaStatus = WSReservaStatusEnum.CANCELADO;
//                                        break;
//                                    default:
//                                        reservaStatus = WSReservaStatusEnum.INCONSISTENTE;
//                                        break;
//                                }
//
//                                if (!reservaStatus.equals(WSReservaStatusEnum.INCONSISTENTE)) {
//                                    WSVeiculoLocal localRetirada = null;
//                                    WSVeiculoLocal localDevolucao = null;
//                                    Date dtRetirada = null;
//                                    Date dtDevolucao = null;
//                                    String classe = null;
//                                    String modelo = null;
//                                    String cdServico = null;
//                                    WSVeiculoLocadora locadora = null;
//                                    WSTarifa tarifa = null;
//                                    List<WSPolitica> politicaList = new ArrayList();
//                                    String cdConta = "";
//                                    String cdTarifa = null;
////                                    String dsTarifa = null;
//                                    String sgMoeda = null;
//
//                                    Map<String, String> mapEnderecoAlternativo = new HashMap();
//                                    if (ii.getTypicalCarData() != null && ii.getTypicalCarData().getLocationInfo() != null) {
//                                        try {
//                                            for (PlaceLocationIdentificationTypeU typeU : ii.getTypicalCarData().getLocationInfo()) {
//                                                if (typeU.getLocationType().equals("176") && typeU.getLocationDescription().getCode() != null && typeU.getLocationDescription().getCode().equals("1A")) {
//                                                    String cdLocadora = typeU.getLocationDescription().getName();
//                                                    if (Utils.locadoraMap != null && Utils.locadoraMap.get(ii.getTypicalCarData().getCompanyIdentification().getCompanyCode() + "#" + cdLocadora) != null) {
//                                                        WSVeiculoLocadora veiculoLocadora = Utils.locadoraMap.get(ii.getTypicalCarData().getCompanyIdentification().getCompanyCode() + "#" + cdLocadora);
//                                                        localRetirada = new WSVeiculoLocal(cdLocadora,
//                                                                veiculoLocadora.getNmLocadora().trim(),
//                                                                (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getDsEndereco() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmMunicipio() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmPais() : null),
//                                                                (veiculoLocadora.getTelefone() != null ? veiculoLocadora.getTelefone().getTransNrTelefone() : null));
//                                                    } else {
//                                                        String nmLocadora[] = typeU.getLocationDescription().getName().split("\\*");
//                                                        localRetirada = new WSVeiculoLocal(cdLocadora,
//                                                                null,
//                                                                (nmLocadora.length > 1 ? nmLocadora[1] : null),
//                                                                null,
//                                                                null,
//                                                                null);
//                                                    }
//                                                } else if (typeU.getLocationType().equals("DOL") && typeU.getLocationDescription().getCode() != null && typeU.getLocationDescription().getCode().equals("1A")) {
//                                                    String cdLocadora = typeU.getLocationDescription().getName();
//                                                    if (Utils.locadoraMap != null && Utils.locadoraMap.get(ii.getTypicalCarData().getCompanyIdentification().getCompanyCode() + "#" + cdLocadora) != null) {
//                                                        WSVeiculoLocadora veiculoLocadora = Utils.locadoraMap.get(ii.getTypicalCarData().getCompanyIdentification().getCompanyCode() + "#" + cdLocadora);
//                                                        localDevolucao = new WSVeiculoLocal(cdLocadora,
//                                                                veiculoLocadora.getNmLocadora().trim(),
//                                                                (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getDsEndereco() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmMunicipio() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmPais() : null),
//                                                                (veiculoLocadora.getTelefone() != null ? veiculoLocadora.getTelefone().getTransNrTelefone() : null));
//                                                    } else if ((ii.getTypicalCarData().getCompanyIdentification().getCompanyCode() + "#" + cdLocadora).equals("ZI#MCO") && Utils.locadoraMap != null && Utils.locadoraMap.get("ZI#ORLT01") != null) {//inserido para corrigir o chamado 9569
//                                                        WSVeiculoLocadora veiculoLocadora = Utils.locadoraMap.get("ZI#ORLT01");
//                                                        localDevolucao = new WSVeiculoLocal(cdLocadora,
//                                                                veiculoLocadora.getNmLocadora().trim(),
//                                                                (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getDsEndereco() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmMunicipio() : null),
//                                                                (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmPais() : null),
//                                                                (veiculoLocadora.getTelefone() != null ? veiculoLocadora.getTelefone().getTransNrTelefone() : null));
//                                                    } else {
//                                                        String nmLocadora[] = typeU.getLocationDescription().getName().split("\\*");
//                                                        localDevolucao = new WSVeiculoLocal(nmLocadora[0],
//                                                                null,
//                                                                (nmLocadora.length > 1 ? nmLocadora[1] : null),
//                                                                null,
//                                                                null,
//                                                                null);
//                                                    }
//                                                } else {
//                                                    mapEnderecoAlternativo.put(typeU.getLocationType(), typeU.getLocationDescription().getName());
//                                                }
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao montar dados da locadora", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                                        }
//                                    }
//
//                                    //busca endereço alternativo
//                                    if (localDevolucao != null && localDevolucao.getDsEndereco() == null) {
//                                        String endereco = mapEnderecoAlternativo.get("DOL");
//                                        if (endereco != null) {
//                                            String nmEndereco[] = endereco.split("\\*");
//                                            localDevolucao.setDsEndereco((nmEndereco.length > 1 ? nmEndereco[1] : null));
//                                        }
//                                    }
//
//                                    if (localRetirada != null && localRetirada.getDsEndereco() == null) {
//                                        String endereco = mapEnderecoAlternativo.get("176");
//                                        if (endereco != null) {
//                                            String nmEndereco[] = endereco.split("\\*");
//                                            localRetirada.setDsEndereco((nmEndereco.length > 1 ? nmEndereco[1] : null));
//                                        }
//                                    }
//
//                                    if (ii.getTypicalCarData().getPickupDropoffTimes() != null) {
//                                        StructuredDateTimeType287345C bdt = ii.getTypicalCarData().getPickupDropoffTimes().getBeginDateTime();
//                                        StructuredDateTimeType287345C edt = ii.getTypicalCarData().getPickupDropoffTimes().getEndDateTime();
//
//                                        dtRetirada = Utils.toDate(bdt.getYear() + "-" + bdt.getMonth().toString() + "-" + bdt.getDay().toString() + "T" + bdt.getHour().toString() + ":" + bdt.getMinutes(), "yyyy-MM-dd'T'HH:mm");
//                                        dtDevolucao = Utils.toDate(edt.getYear() + "-" + edt.getMonth().toString() + "-" + edt.getDay().toString() + "T" + edt.getHour().toString() + ":" + edt.getMinutes(), "yyyy-MM-dd'T'HH:mm");
//                                    }
//
//                                    String tpCodDetalheVeiculo = null;
//
//                                    if (ii.getTypicalCarData().getVehicleInformation() != null) {
//                                        tpCodDetalheVeiculo = ii.getTypicalCarData().getVehicleInformation().getVehicleCharacteristic().getVehicleRentalPrefType().get(0);
//                                        classe = UtilsWSCar.buscaClasse(ii.getTypicalCarData().getVehicleInformation().getVehicleCharacteristic().getVehicleRentalPrefType().get(0));
//                                        modelo = ii.getTypicalCarData().getVehicleInformation().getCarModel();
//
//                                        if (modelo == null) {
//                                            modelo = "Modelo não informado";
//                                        }
//
//                                        cdServico = ii.getTypicalCarData().getVehicleInformation().getVehicleCharacteristic().getVehicleRentalPrefType().get(0);
//                                    }
//
//                                    if (ii.getTypicalCarData().getInclusiveTour() != null && ii.getTypicalCarData().getInclusiveTour().getTourInformationDetails() != null && ii.getTypicalCarData().getInclusiveTour().getTourInformationDetails().getTourCode() != null) {
//                                        cdConta = ii.getTypicalCarData().getInclusiveTour().getTourInformationDetails().getTourCode();
//                                    }
//
//                                    if (ii.getTypicalCarData().getCompanyIdentification() != null) {
//                                        locadora = new WSVeiculoLocadora(ii.getTypicalCarData().getCompanyIdentification().getCompanyCode(), ii.getTypicalCarData().getCompanyIdentification().getCompanyName(), null, null, false);
//                                        nmFornecedor = ii.getTypicalCarData().getCompanyIdentification().getCompanyName();
//                                    }
//
//                                    if (ii.getTypicalCarData().getCancelOrConfirmNbr() != null) {
//                                        try {
//                                            for (ReservationControlInformationTypeI196503S s : ii.getTypicalCarData().getCancelOrConfirmNbr()) {
//                                                nrFornecedorLocalizador = s.getReservation().getControlNumber();
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao montar localizador do fornecedor", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                                        }
//                                    }
//
//                                    if (ii.getTypicalCarData().getRateCodeGroup() != null && ii.getTypicalCarData().getRateCodeGroup().getRateCodeInfo() != null && ii.getTypicalCarData().getRateCodeGroup().getRateCodeInfo().getFareCategories() != null && ii.getTypicalCarData().getRateCodeGroup().getRateCodeInfo().getFareCategories().getFareType() != null) {
//                                        cdTarifa = ii.getTypicalCarData().getRateCodeGroup().getRateCodeInfo().getFareCategories().getFareType();
//                                    }
//
//                                    //politica de voucher
//                                    if (ii.getTypicalCarData().getSupleInfo() != null) {
//                                        try {
//                                            for (MiscellaneousRemarksType136700S mrts : ii.getTypicalCarData().getSupleInfo()) {
//                                                if (mrts.getRemarkDetails().getType().equals("CSI")) {
//                                                    WSPoliticaVoucher politicaVoucher = UtilsWSCar.buscaPoliticaVoucher(locadora.getCdLocadora(), mrts.getRemarkDetails().getFreetext());
//                                                    if (politicaVoucher != null) {
//                                                        politicaList.add(politicaVoucher);
//                                                    }
//                                                }
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao montar forma de pagamento", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                                        }
//                                    }
//                                    //politica da locadora
//                                    if (UtilsWSCar.buscaPoliticas(integrador, locadora.getCdLocadora()) != null) {
//                                        politicaList.addAll(UtilsWSCar.buscaPoliticas(integrador, locadora.getCdLocadora()));
//                                    }
//
//                                    //tarifas
//                                    List<ParCharge> parChargeList = new ArrayList();
//                                    List<ParRate> parRateList = new ArrayList();
//
//                                    //no caso da localiza a taxa de devolucao esta vindo no prnReply
//                                    if (locadora.getCdLocadora().equals("LL")) {
//                                        try {
//                                            for (PNRReply.OriginDestinationDetails od : reply.getOriginDestinationDetails()) {
//                                                for (PNRReply.OriginDestinationDetails.ItineraryInfo odii : od.getItineraryInfo()) {
//                                                    if (odii.getTypicalCarData() != null && !Utils.isListNothing(odii.getTypicalCarData().getRateInfo())) {
//                                                        for (TariffInformationTypeI136706S ri : odii.getTypicalCarData().getRateInfo()) {
//                                                            if (!Utils.isListNothing(ri.getChargeDetails())) {
//                                                                for (AssociatedChargesInformationTypeI198205C at : ri.getChargeDetails()) {
//                                                                    if (at.getType().equals("DC")) {
//                                                                        String vlLocal = at.getComment().replace("*LL*", "").replace("BRL", "");
//                                                                        if (UtilsWSCar.isStringDouble(vlLocal)) {
//                                                                            parChargeList.add(new ParCharge("108", BigDecimal.valueOf(Double.parseDouble(vlLocal)), "OWC"));
//                                                                        }
//                                                                    }
//                                                                }
//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao verificar taxa local Localiza", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                                        }
//                                    } else if (ii.getTypicalCarData().getRateInfo() != null && !Utils.isListNothing(ii.getTypicalCarData().getRateInfo())) {
//                                        try {
//                                            sgMoeda = carRateInfo.getRateDetails().getRateDetail().get(0).getTariffInfo().getCurrency();
//                                            // Implementado código a fim de obter a taxa de devolução em pnrAddMultiElements (ReservarWS) para incluir no objeto
//                                            for (TariffInformationTypeI136706S tariffInfo : ii.getTypicalCarData().getRateInfo()) {
//                                                TariffInformationDetailsTypeI tariffInfoDetails = tariffInfo.getTariffInfo();
//                                                if (tariffInfoDetails.getAmountType().equals("DC")) {
//                                                    if (sgMoeda != null && sgMoeda.equals(tariffInfoDetails.getCurrency())) {
//                                                        parChargeList.add(new ParCharge("108", tariffInfoDetails.getAmount(), "OWC"));
//                                                    }
//                                                }
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao verificar taxa de devolução local", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                                        }
//                                    }
//
//                                    for (CarRateInformationFromCarSegmentReply.RateDetails.RateDetail rd : carRateInfo.getRateDetails().getRateDetail()) {
//
//                                        if (rd.getTariffInfo() != null) {
//                                            if (rd.getTariffInfo().getAmountType() != null) {
//                                                parRateList.add(new ParRate(rd.getTariffInfo().getAmountType(), rd.getTariffInfo().getCurrency(), rd.getTariffInfo().getRatePlanIndicator(), rd.getTariffInfo().getAmount(), rd.getTariffInfo().getRateChangeIndicator()));
//                                            }
//                                            sgMoeda = rd.getTariffInfo().getCurrency();
//                                        }
//                                        // TKT 29278 - Verifica se a taxa de devolução foi devolvida no pnrAddMultiElements, caso seja não será necessário inseri o do carRateInformationFromCarSegment caso tenha sido devolvido também
//                                        if (rd.getChargeDetails() != null) {
//                                            for (CarRateInformationFromCarSegmentReply.RateDetails.RateDetail.ChargeDetails cd : rd.getChargeDetails()) {
//                                                if (cd.getType() != null && cd.getComment() != null && cd.getAmount() != null) {
//                                                    ParCharge chargeVerificado = parChargeList.stream()
//                                                            .filter(charge -> charge.getType().equals(cd.getType()) && charge.getComment().equals("OWC"))
//                                                            .findAny()
//                                                            .orElse(null);
//                                                    if (chargeVerificado == null) {
//                                                        parChargeList.add(new ParCharge(cd.getType(), cd.getAmount(), cd.getComment()));
//                                                    }
//                                                }
//                                            }
//                                        }
//
//                                    }
//
//                                    List<CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup> taxCovSurchargeGroupList = new ArrayList();
//
//                                    for (CarRateInformationFromCarSegmentReply.RateDetails.TaxCovSurchargeGroup tc : carRateInfo.getRateDetails().getTaxCovSurchargeGroup()) {
//                                        CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup taxCovSurchargeGroup = new CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup();
//                                        CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup.TaxSurchargeCoverageInfo taxSurchargeCoverageInfo = new CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup.TaxSurchargeCoverageInfo();
//
//                                        for (CarRateInformationFromCarSegmentReply.RateDetails.TaxCovSurchargeGroup.TaxSurchargeCoverageInfo.ChargeDetails cd : tc.getTaxSurchargeCoverageInfo().getChargeDetails()) {
//
//                                            CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup.TaxSurchargeCoverageInfo.ChargeDetails chardeDetails = new CarRateInformationFromAvailabilityReply.RateDetails.TaxCovSurchargeGroup.TaxSurchargeCoverageInfo.ChargeDetails();
//                                            chardeDetails.setAmount(cd.getAmount());
//                                            chardeDetails.setComment(cd.getComment());
//                                            chardeDetails.setType(cd.getType());
//                                            chardeDetails.setDescription(cd.getDescription());
//                                            taxSurchargeCoverageInfo.getChargeDetails().add(chardeDetails);
//
//                                        }
//                                        taxCovSurchargeGroup.setTaxSurchargeCoverageInfo(taxSurchargeCoverageInfo);
//                                        taxCovSurchargeGroupList.add(taxCovSurchargeGroup);
//                                    }
//
//                                    Boolean isDevMesmoLocal = null;
//                                    if (localRetirada.getCdLocal().equals(localDevolucao.getCdLocal())) {
//                                        isDevMesmoLocal = true;
//                                    } else {
//                                        isDevMesmoLocal = false;
//                                    }
//
//                                    //encontra o pais para tratar verificar se é nacional
//                                    String cdPais = null;
//                                    if (carRateInfo.getRateDetails().getPickupDropoffLocation() != null && carRateInfo.getRateDetails().getPickupDropoffLocation().get(0).getAddress() != null) {
//                                        cdPais = carRateInfo.getRateDetails().getPickupDropoffLocation().get(0).getAddress().getCountryCode();
//                                    } else if (localRetirada.getNmPais() != null) {
//                                        cdPais = localRetirada.getNmPais();
//                                    } else {
//                                        if (sgMoeda.equals("BRL")) {
//                                            cdPais = "BR";
//                                        } else {
//                                            cdPais = "US";
//                                        }
//                                    }
//                                    boolean isNacional = false;
//                                    if (cdPais.equals("BR") || cdPais.toUpperCase().equals("BRASIL")) {
//                                        isNacional = true;
//                                    }
//
//                                    ParTarifa parTarifa = UtilsWSCar.calcularTarifa(integrador,
//                                            locadora.getCdLocadora(),
//                                            parRateList,
//                                            parChargeList,
//                                            taxCovSurchargeGroupList,
//                                            sgMoeda,
//                                            isDevMesmoLocal,
//                                            isNacional,
//                                            dtRetirada,
//                                            dtDevolucao,
//                                            parReserva.getB11(),
//                                            parReserva.getB12(),
//                                            false);
//
//                                    tarifa = new WSTarifa(sgMoeda,
//                                            parTarifa.getVlTarifa(),
//                                            null,
//                                            null);
//
//                                    if (dsTarifa == null) {
//                                        dsTarifa = cdConta;
//                                    }
//                                    tarifa.setDsTarifa(dsTarifa);
//                                    tarifa.setCdTarifa(cdTarifa);
//
//                                    tarifa.setDsParametro(UtilsWSCar.toJson(parReserva));
//
//                                    if (tarifa != null && !Utils.isListNothing(politicaList)) {
//                                        tarifa.setPoliticaList(politicaList);
//                                    }
//                                    List<WSTarifaAdicional> tarifaAdiconalList = new ArrayList();
//                                    if (parTarifa.getVlTaxaAdm() > 0.0) {
//                                        tarifaAdiconalList.add(new WSTarifaAdicional(WSTarifaAdicionalTipoEnum.TAXA_SERVICO, "Tarifa administrativa", sgMoeda, parTarifa.getVlTaxaAdm()));
//                                        tarifa.setTarifaAdicionalList(tarifaAdiconalList);
//                                    }
//
//                                    if (veiculoDetalheList == null) {
//                                        veiculoDetalheList = new ArrayList();
//                                        veiculoDetalheList.addAll(UtilsWSCar.buscaVeiculoDetalhes(tpCodDetalheVeiculo));
//                                    }
//
//                                    veiculo = new WSVeiculo(null,
//                                            localRetirada,
//                                            localDevolucao,
//                                            dtRetirada,
//                                            dtDevolucao,
//                                            classe,
//                                            modelo,
//                                            veiculoDetalheList,
//                                            locadora,
//                                            null,
//                                            WSServicoTipoEnum.VEICULO,
//                                            cdServico,
//                                            null,
//                                            null,
//                                            reservaNomeList,
//                                            tarifa,
//                                            dtRetirada,
//                                            null,
//                                            null,
//                                            cdConta,
//                                            false,
//                                            null);
//
//                                    if (parTarifa.getVlDevolucao() > 0.0) {
//                                        veiculo.setVlObservacao(parTarifa.getVlDevolucao());
//                                        veiculo.setDsObservacao("Drop Charge");
//                                        veiculo.setSgMoedaObservacao(sgMoeda);
//                                    }
//                                }
//                            }
//                        } catch (Exception ex) {
//                            throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao ler ItineraryInfo", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//                        }
//                    }
//                }
//            } catch (Exception ex) {
//                throw new ErrorException(integrador, ConsultarCarWS.class, "MontaReserva", WSMensagemErroEnum.SCO, "Erro ao ler OriginDestinationDetails", WSIntegracaoStatusEnum.INCONSISTENTE, ex);
//            }
//        } else {
//            veiculo = new WSVeiculo();
//            veiculo.setTarifa(new WSTarifa());
//            reservaStatus = WSReservaStatusEnum.CANCELADO;
//        }
//
//        WSReservaServico reservaServico = new WSReservaServico(integrador,
//                WSServicoTipoEnum.VEICULO,
//                nrLocalizador,
//                reservaStatus,
//                null,
//                veiculo);
//
//        reservaServico.setNmFornecedor(nmFornecedor);
//        reservaServico.setNrLocalizadorFornecedor(nrFornecedorLocalizador);
//        reservaServicoList.add(reservaServico);
//
//        return new WSReserva(reservaServicoList);
//    }
}
