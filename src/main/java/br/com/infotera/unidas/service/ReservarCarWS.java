/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaNome;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.reserva.rqrs.WSReservarRS;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.common.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Service
public class ReservarCarWS {

//    @Autowired
//    private AmadeusClient amadeusClient;
//
//    public WSReservarRS reservar(WSReservarRQ reservarRQ) throws ErrorException {
//
//        PNRAddMultiElements addMultiElements = new PNRAddMultiElements();
//        OptionalPNRActionsType actionsType = new OptionalPNRActionsType();
//
//        actionsType.getOptionCode().add(BigInteger.valueOf(0));
//        actionsType.getOptionCode().add(BigInteger.valueOf(30));
//        addMultiElements.setPnrActions(actionsType);
//
//        PNRAddMultiElements.TravellerInfo travellerInfo = new PNRAddMultiElements.TravellerInfo();
//        ElementManagementSegmentType elementManagementSegmentType1 = new ElementManagementSegmentType();
//        ReferencingDetailsType detailsType = new ReferencingDetailsType();
//
//        detailsType.setNumber("1");
//        detailsType.setQualifier("PR");
//        elementManagementSegmentType1.setReference(detailsType);
//        elementManagementSegmentType1.setSegmentName("NM");
//        travellerInfo.setElementManagementPassenger(elementManagementSegmentType1);
//
//        try {
//            for (WSReservaNome rn : reservarRQ.getReserva().getReservaServicoList().get(0).getServico().getReservaNomeList()) {
//                // TKT 32171 - Obtem o primeiro e ultimo nome (ReservaNome)
//                String nomeCompleto = rn.getNmNome() + " " + rn.getNmSobrenome();
//                String[] primeiroUltimoNome = Utils.tiraAcento(nomeCompleto).split(" ");
//
//                PNRAddMultiElements.TravellerInfo.PassengerData passengerData = new PNRAddMultiElements.TravellerInfo.PassengerData();
//                TravellerInformationTypeI informationTypeI1 = new TravellerInformationTypeI();
//                TravellerSurnameInformationTypeI travellerSurnameInformationTypeI = new TravellerSurnameInformationTypeI();
//
//                travellerSurnameInformationTypeI.setQuantity(BigInteger.ONE);
//                travellerSurnameInformationTypeI.setSurname(primeiroUltimoNome[primeiroUltimoNome.length - 1]); // Utils.tiraAcento(rn.getNmSobrenome())
//                informationTypeI1.setTraveller(travellerSurnameInformationTypeI);
//
//                TravellerDetailsTypeI detailsTypeI1 = new TravellerDetailsTypeI();
//
//                detailsTypeI1.setFirstName(primeiroUltimoNome[0]); //Utils.tiraAcento(rn.getNmNome())
//                informationTypeI1.getPassenger().add(detailsTypeI1);
//                passengerData.setTravellerInformation(informationTypeI1);
//                travellerInfo.getPassengerData().add(passengerData);
//                addMultiElements.getTravellerInfo().add(travellerInfo);
//            }
//        } catch (Exception ex) {
//            throw new ErrorException(reservarRQ.getIntegrador(), ReservarCarWS.class, "reservar", WSMensagemErroEnum.SRE, "Erro ao ler dados dos pax", WSIntegracaoStatusEnum.NEGADO, ex, false);
//        }
//
//        PNRAddMultiElements.DataElementsMaster dataElementsMaster = new PNRAddMultiElements.DataElementsMaster();
//        PNRAddMultiElements.DataElementsMaster.DataElementsIndiv dataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
//        ElementManagementSegmentType elementManagementSegmentType = new ElementManagementSegmentType();
//        ReferencingDetailsType referencingDetailsType = new ReferencingDetailsType();
//        elementManagementSegmentType.setSegmentName("AP");
//        referencingDetailsType.setQualifier("OT");
//        referencingDetailsType.setNumber("1");
//        elementManagementSegmentType.setReference(referencingDetailsType);
//        dataElementsIndiv.setElementManagementData(elementManagementSegmentType);
//
//        LongFreeTextType freeTextType = new LongFreeTextType();
//        FreeTextQualificationType freeTextQualificationType = new FreeTextQualificationType();
//        freeTextQualificationType.setType("6");
//        freeTextQualificationType.setSubjectQualifier("3");
//        freeTextType.setFreetextDetail(freeTextQualificationType);
//        freeTextType.setLongFreetext(reservarRQ.getReserva().getContato().getTelefone().getTransNrTelefone());
//        dataElementsIndiv.setFreetextData(freeTextType);
//        dataElementsMaster.getDataElementsIndiv().add(dataElementsIndiv);
//
//        dataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
//        elementManagementSegmentType = new ElementManagementSegmentType();
//        elementManagementSegmentType.setSegmentName("RF");
//        dataElementsIndiv.setElementManagementData(elementManagementSegmentType);
//
//        freeTextType = new LongFreeTextType();
//        freeTextQualificationType = new FreeTextQualificationType();
//        freeTextQualificationType.setType("P22");
//        freeTextQualificationType.setSubjectQualifier("3");
//        freeTextType.setFreetextDetail(freeTextQualificationType);
//        freeTextType.setLongFreetext("Internet-");
//        dataElementsIndiv.setFreetextData(freeTextType);
//        dataElementsMaster.getDataElementsIndiv().add(dataElementsIndiv);
//
//        dataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
//        elementManagementSegmentType = new ElementManagementSegmentType();
//        elementManagementSegmentType.setSegmentName("AP");
//        dataElementsIndiv.setElementManagementData(elementManagementSegmentType);
//
//        freeTextType = new LongFreeTextType();
//        freeTextQualificationType = new FreeTextQualificationType();
//        freeTextQualificationType.setType("PO2");
//        freeTextQualificationType.setSubjectQualifier("3");
//        freeTextType.setFreetextDetail(freeTextQualificationType);
//        freeTextType.setLongFreetext(reservarRQ.getReserva().getContato().getEmail());
//        dataElementsIndiv.setFreetextData(freeTextType);
//        dataElementsMaster.getDataElementsIndiv().add(dataElementsIndiv);//
//
//        dataElementsIndiv = new PNRAddMultiElements.DataElementsMaster.DataElementsIndiv();
//        elementManagementSegmentType = new ElementManagementSegmentType();
//        elementManagementSegmentType.setSegmentName("TK");
//        dataElementsIndiv.setElementManagementData(elementManagementSegmentType);
//
//        TicketElementType elementType = new TicketElementType();
//        TicketInformationType informationType1 = new TicketInformationType();
//        informationType1.setIndicator("OK");
//        elementType.setTicket(informationType1);
//        dataElementsIndiv.setTicketElement(elementType);
//        dataElementsMaster.getDataElementsIndiv().add(dataElementsIndiv);//
//
//        DummySegmentTypeI dummySegmentTypeI = new DummySegmentTypeI();
//        dataElementsMaster.setMarker1(dummySegmentTypeI);
//
//        addMultiElements.setDataElementsMaster(dataElementsMaster);
//
////        chamaWS.chamadaPadrao(reservarRQ.getIntegrador(), addMultiElements, PNRReply.class, 1);
//        amadeusClient.pnrAddMultiElementsFIM(reservarRQ.getIntegrador(), addMultiElements, 1);
//
//        CarSell carSell = new CarSell();
//        WSVeiculo veiculo = (WSVeiculo) reservarRQ.getReserva().getReservaServicoList().get(0).getServico();
//
//        ParReserva parReserva = (ParReserva) UtilsWSCar.fromJson(veiculo.getDsParametro(), ParReserva.class);
//
//        CarSell.PnrInfo info = new CarSell.PnrInfo();
//        ReferenceInformationTypeI informationTypeI = new ReferenceInformationTypeI();
//        ReferencingDetailsTypeI detailsTypeI = new ReferencingDetailsTypeI();
//
//        detailsTypeI.setType("PT");
//        detailsTypeI.setValue("2");
//        informationTypeI.setReferenceDetails(detailsTypeI);
//        info.setPaxTattooNbr(informationTypeI);
//        carSell.setPnrInfo(info);
//
//        CarSell.SellData sellData = new CarSell.SellData();
//
//        CompanyInformationType companyInformationType = new CompanyInformationType();
//        companyInformationType.setTravelSector(parReserva.getB0());
//        companyInformationType.setCompanyCode(veiculo.getLocadora().getCdLocadora());
//        companyInformationType.setCompanyName(veiculo.getLocadora().getNmLocadora());
//        companyInformationType.setAccessLevel("CP");
//        sellData.setCompanyIdentification(companyInformationType);
//
//        // TKT 30008 - Envia o DOC (CPF) caso seja especifado na reserva (Movida Exige) na tag CustomerInfo
//        if (reservarRQ.getReserva().getReservaServicoList() != null && reservarRQ.getReserva().getReservaServicoList().get(0).getServico().getNmServico().contains("MOVIDA") && reservarRQ.getReserva().getReservaServicoList().get(0).getServico().getReservaNomeList().get(0).getDocumento().getDocumentoTipo().isStCpf()) {
//            String numCPF = reservarRQ.getReserva().getReservaServicoList().get(0).getServico().getReservaNomeList().get(0).getDocumento().getNrDocumento().replace(".", "").replace("-", "");
//            ConsumerReferenceInformationTypeI consumerReferenceInformationType = new ConsumerReferenceInformationTypeI();
//            ConsumerReferenceIdentificationTypeI consumerReferenceIdentificationType = new ConsumerReferenceIdentificationTypeI();
//            consumerReferenceIdentificationType.setReferenceQualifier("ID");
//            consumerReferenceIdentificationType.setReferenceNumber(numCPF);
//            consumerReferenceInformationType.setCustomerReferences(consumerReferenceIdentificationType);
//            sellData.setCustomerInfo(consumerReferenceInformationType);
//        }
//
//        SelectionDetailsTypeI selectionDetailsTypeI = new SelectionDetailsTypeI();
//        SelectionDetailsInformationTypeI selectionDetailsInformationTypeI = new SelectionDetailsInformationTypeI();
//        selectionDetailsInformationTypeI.setOption("P6");
//        selectionDetailsTypeI.setSelectionDetails(selectionDetailsInformationTypeI);
//        sellData.setBookingType(selectionDetailsTypeI);
//
//        TourInformationTypeI tourInformationTypeI = new TourInformationTypeI();
//        TourDetailsTypeI detailsTypeI1 = new TourDetailsTypeI();
//
//        //codigo IT
//        if (parReserva.getB8() != null) {
//            detailsTypeI1.setTourCode(parReserva.getB8());
//            tourInformationTypeI.setTourInformationDetails(detailsTypeI1);
//            sellData.setInclusiveTour(tourInformationTypeI);
//        }
//
//        PlaceLocationIdentificationTypeU identificationTypeU176 = new PlaceLocationIdentificationTypeU();
//        LocationIdentificationBatchTypeU batchTypeU176 = new LocationIdentificationBatchTypeU();
//
//        identificationTypeU176.setLocationType("176");
//        batchTypeU176.setCode("1A");
//        batchTypeU176.setName(veiculo.getLocalRetirada().getCdLocal());
//        identificationTypeU176.setLocationDescription(batchTypeU176);
//        sellData.getLocationInfo().add(identificationTypeU176);//ida
//
//        PlaceLocationIdentificationTypeU identificationTypeUDOP = new PlaceLocationIdentificationTypeU();
//        LocationIdentificationBatchTypeU batchTypeUDOP = new LocationIdentificationBatchTypeU();
//
//        identificationTypeUDOP.setLocationType("DOL");
//        batchTypeUDOP.setCode("1A");
//        batchTypeUDOP.setName(veiculo.getLocalDevolucao().getCdLocal());
//        identificationTypeUDOP.setLocationDescription(batchTypeUDOP);
//        sellData.getLocationInfo().add(identificationTypeUDOP);//volta
//
//        StructuredPeriodInformationType informationType = new StructuredPeriodInformationType();
//        informationType.setBeginDateTime(montaStructuredDateTimeType(veiculo.getDtRetirada()));
//        informationType.setEndDateTime(montaStructuredDateTimeType(veiculo.getDtDevolucao()));
//        sellData.setPickupDropoffTimes(informationType);
//
//        VehicleSelectionType selectionType = new VehicleSelectionType();
//        VehicleTypeOptionType optionType = new VehicleTypeOptionType();
//
//        optionType.setVehicleTypeOwner(parReserva.getB1());
//        optionType.getVehicleRentalPrefType().add(veiculo.getCdServico());
//        selectionType.setVehicleRentalNeedType(optionType);
//        selectionType.setVehTypeOptionQualifier("VT");
//        sellData.setVehicleInformation(selectionType);
//
//        //ratecode
//        if (parReserva.getB5() != null) {
//            FareQualifierDetailsTypeI detailsTypeI2 = new FareQualifierDetailsTypeI();
//            FareCategoryCodesTypeI categoryCodesTypeI = new FareCategoryCodesTypeI();
//            categoryCodesTypeI.setFareType(parReserva.getB5());
//            detailsTypeI2.setFareCategories(categoryCodesTypeI);
//            sellData.setRateCodeInfo(detailsTypeI2);
//        }
//
//        TariffInformationTypeI informationTypeI2 = new TariffInformationTypeI();
//        TariffInformationDetailsTypeI detailsTypeI3 = new TariffInformationDetailsTypeI();
//        detailsTypeI3.setRateType(parReserva.getB2());
//
//        if (parReserva.getB9() != null) {
//            detailsTypeI3.setRatePlanIndicator(parReserva.getB9());
//        } else {
//            detailsTypeI3.setRatePlanIndicator("DY");
//        }
//
//        detailsTypeI3.setCurrency(parReserva.getB10());
//        informationTypeI2.setTariffInfo(detailsTypeI3);
//
//        RateInformationTypeI rateInformationTypeI = new RateInformationTypeI();
//
//        rateInformationTypeI.setCategory(parReserva.getB3());
//        informationTypeI2.setRateInformation(rateInformationTypeI);
//
//        //emissao de voucher EuropCar
//        if (veiculo.getLocadora().getCdLocadora().equals("EP")) {
//            AssociatedChargesInformationTypeI associatedChargesInformationTypeI = new AssociatedChargesInformationTypeI();
//            associatedChargesInformationTypeI.setType("VV");
//            associatedChargesInformationTypeI.setComment("GDA");
//            informationTypeI2.getChargeDetails().add(associatedChargesInformationTypeI);
//            BillableInformationTypeU billableInformationTypeU = new BillableInformationTypeU();
//            DiagnosisTypeU diagnosisTypeU = new DiagnosisTypeU();
//            diagnosisTypeU.setBillingDetails("C" + parReserva.getB6());
//            diagnosisTypeU.setBillingQualifier("901");
//            billableInformationTypeU.getBillingInfo().add(diagnosisTypeU);
//            sellData.setBillingData(billableInformationTypeU);
//        } else if (parReserva.getB7() != null) {
//            MiscellaneousRemarksType miscellaneousRemarksType = new MiscellaneousRemarksType();
//            MiscellaneousRemarkType miscellaneousRemarkType = new MiscellaneousRemarkType();
//            miscellaneousRemarkType.setType("CSI");
//            miscellaneousRemarkType.setFreetext(parReserva.getB7());
//            miscellaneousRemarkType.setBusinessFunction("CAR");
//            miscellaneousRemarkType.setLanguage("EN");
//            miscellaneousRemarkType.setSource("M");
//            miscellaneousRemarkType.setEncoding("1");
//            miscellaneousRemarksType.setRemarkDetails(miscellaneousRemarkType);
//            sellData.setSupleInfo(miscellaneousRemarksType);
//        }
//        ////////////
//
//        sellData.getRateInfo().add(informationTypeI2);
//
//        //passa iata qdo tiver na credencial
//        if (parReserva.getB14() != null) {
//            AdditionalBusinessSourceInformationType additionalBusinessSourceInformationType = new AdditionalBusinessSourceInformationType();
//            OriginatorIdentificationDetailsTypeI originatorIdentificationDetailsTypeI = new OriginatorIdentificationDetailsTypeI();
//            originatorIdentificationDetailsTypeI.setOriginatorId(parReserva.getB14());
//            additionalBusinessSourceInformationType.setOriginatorDetails(originatorIdentificationDetailsTypeI);
//            sellData.setBookingSource(additionalBusinessSourceInformationType);
//        }
//
//        ConsumerReferenceInformationTypeI typeI = new ConsumerReferenceInformationTypeI();
//
//        //insere os tour codes na reserva
//        if (parReserva.getB6() != null) {
//            ConsumerReferenceIdentificationTypeI criti = new ConsumerReferenceIdentificationTypeI();
//            criti.setReferenceQualifier("CD");
//            criti.setReferenceNumber(parReserva.getB6());
//            typeI.setCustomerReferences(criti);
//            if (parReserva.getB13() != null) {
//                ConsumerReferenceIdentificationTypeI critiOther = new ConsumerReferenceIdentificationTypeI();
//                critiOther.setReferenceQualifier("PC");
//                critiOther.setReferenceNumber(parReserva.getB13());
//                typeI.getOtherCustomerRef().add(critiOther);
//            }
//            sellData.setCustomerInfo(typeI);
//        } else {
//            if (parReserva.getB13() != null) {
//                ConsumerReferenceIdentificationTypeI criti = new ConsumerReferenceIdentificationTypeI();
//                criti.setReferenceQualifier("PC");
//                criti.setReferenceNumber(parReserva.getB13());
//                typeI.setCustomerReferences(criti);
//                sellData.setCustomerInfo(typeI);
//            }
//        }
//
//        carSell.setSellData(sellData);
//
////        chamaWS.chamadaPadrao(reservarRQ.getIntegrador(), carSell, CarSellReply.class, 2);
//        CarSellReply carSellReply = amadeusClient.carSell(reservarRQ.getIntegrador(), carSell, 2);
//
//        addMultiElements = new PNRAddMultiElements();
//        actionsType = new OptionalPNRActionsType();
//
//        actionsType.getOptionCode().add(BigInteger.valueOf(11));
//        addMultiElements.setPnrActions(actionsType);
//
////        PNRReply pnrReply1 = chamaWS.chamadaPadrao(reservarRQ.getIntegrador(), addMultiElements, PNRReply.class, 2);
//        PNRReply pnrReply1 = amadeusClient.pnrAddMultiElementsFIM(reservarRQ.getIntegrador(), addMultiElements, 2);
//
//        String cdLocalizador = pnrReply1.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber();
//
//        reservarRQ.getIntegrador().setCdLocalizador(cdLocalizador);
//
////        ////////        //GERAR COMANDO CRYPTIC (nao usar)
//        if (veiculo.getLocadora().getCdLocadora().equals("EP")) {
//            enviarCommadCryptic(reservarRQ.getIntegrador(), cdLocalizador);
//        }
//        ConsultarCarWS consultarWS = new ConsultarCarWS();
//
//        CarRateInformationFromCarSegment carRateInformationFromCarSegment = consultarWS.montaConsultaCarRateInformation(parReserva.getB10(), cdLocalizador, "1");
//        CarRateInformationFromCarSegmentReply carRateInformationFromCarSegmentReply = amadeusClient.carRateInformationFromCarSegmentReply(reservarRQ.getIntegrador(), carRateInformationFromCarSegment, 2);
////        CarRateInformationFromCarSegmentReply carRateInformationFromCarSegmentReply = chamaWS.chamadaPadrao(reservarRQ.getIntegrador(), carRateInformationFromCarSegment, CarRateInformationFromCarSegmentReply.class, 2);
//
//        SecuritySignOut segurancaSair = new SecuritySignOut();
//        amadeusClient.segurancaSair(reservarRQ.getIntegrador(), segurancaSair, 3);
////        chamaWS.chamadaPadrao(reservarRQ.getIntegrador(), segurancaSair, SecuritySignOutReply.class, 3);
//
//        //busca dsTarifa do RQ
//        String dsTarifa = veiculo.getTarifa().getDsTarifa();
//
//        return new WSReservarRS(consultarWS.montaReserva(pnrReply1, reservarRQ.getIntegrador(), parReserva, carRateInformationFromCarSegmentReply, veiculo.getVeiculoDetalheList(), dsTarifa), reservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
//
//    private StructuredDateTimeType montaStructuredDateTimeType(Date data) {
//        StructuredDateTimeType dateTimeType = new StructuredDateTimeType();
//        dateTimeType.setYear(Utils.formatData(data, "yyyy"));
//        dateTimeType.setMonth(Utils.formatData(data, "MM"));
//        dateTimeType.setDay(Utils.formatData(data, "dd"));
//        dateTimeType.setHour(Utils.formatData(data, "HH"));
//        dateTimeType.setMinutes(Utils.formatData(data, "mm"));
//        return dateTimeType;
//    }
//
//    private void enviarCommadCryptic(WSIntegrador integrador, String cdLocalizador) throws ErrorException {
//
//        try {
//            PNRRetrieve retrieve = new PNRRetrieve();
//            PNRRetrieve.RetrievalFacts facts = new PNRRetrieve.RetrievalFacts();
//            PNRRetrieve.RetrievalFacts.Retrieve pnrType = new PNRRetrieve.RetrievalFacts.Retrieve();
//            pnrType.setType(BigDecimal.valueOf(2));
//            facts.setRetrieve(pnrType);
//            PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier reservation = new PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier();
//            PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation reservationType = new PNRRetrieve.RetrievalFacts.ReservationOrProfileIdentifier.Reservation();
//            reservationType.setControlNumber(cdLocalizador);
//            reservation.getReservation().add(reservationType);
//            facts.setReservationOrProfileIdentifier(reservation);
//            retrieve.setRetrievalFacts(facts);
//            amadeusClient.PNRRetrieve(integrador, retrieve, 2);
////            chamaWS.chamadaPadrao(integrador, retrieve, PNRReply.class, 2);
//        } catch (Exception ex) {
//            throw new ErrorException(integrador, ReservarCarWS.class, "reservar", WSMensagemErroEnum.SRE, "Erro ao enviar comando cryptic", WSIntegracaoStatusEnum.NEGADO, ex, false);
//        }
//        try {
//            CommandCryptic commandCryptic = new CommandCryptic();
//            MessageAction messageAction = new CommandCryptic.MessageAction();
//            MessageFunctionDetails messageFunctionsDetails = new MessageAction.MessageFunctionDetails();
//            messageFunctionsDetails.setMessageFunction("M");
//            messageAction.setMessageFunctionDetails(messageFunctionsDetails);
//
//            commandCryptic.setMessageAction(messageAction);
//            CommandCryptic.LongTextString commLongTextString = new CommandCryptic.LongTextString();
//            commLongTextString.setTextStringDetails("CVP/S2/ET");
//            commandCryptic.setLongTextString(commLongTextString);
//            CommandCrypticReply commandCrypticReply = amadeusClient.commandCryptic(integrador, commandCryptic, 2);
////            chamaWS.chamadaPadrao(integrador, commandCryptic, CommandCrypticReply.class, 2);
//        } catch (Exception ex) {
//            throw new ErrorException(integrador, ReservarCarWS.class, "reservar", WSMensagemErroEnum.SRE, "Erro ao enviar comando cryptic", WSIntegracaoStatusEnum.NEGADO, ex, false);
//        }
//    }
}
