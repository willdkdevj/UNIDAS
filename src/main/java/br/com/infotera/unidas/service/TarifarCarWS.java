/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.*;
import br.com.infotera.common.politica.WSPolitica;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.common.servico.WSVeiculoLocal;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRQ;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRS;
import br.com.infotera.common.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TarifarCarWS {

//    @Autowired
//    private AmadeusClient amadeusClient;
//
//    public WSTarifarServicoRS tarifar(WSTarifarServicoRQ tarifarServicoRQ) throws ErrorException {
//
//        CarRateInformationFromAvailability rateInformation = new CarRateInformationFromAvailability();
//        WSVeiculo veiculo = (WSVeiculo) tarifarServicoRQ.getReservaServico().getServico();
//
//        if (veiculo.getTarifa().getDsParametro() == null) {
//            throw new ErrorException(tarifarServicoRQ.getIntegrador(), PreReservarCarWS.class, "preReservar", WSMensagemErroEnum.SPR, "É necessario cadastrar o rate code para a locadora.", WSIntegracaoStatusEnum.NEGADO, null, false);
//        }
//
//        ParDisponibilidade parDisp = (ParDisponibilidade) UtilsWSCar.fromJson(veiculo.getTarifa().getDsParametro(), ParDisponibilidade.class);
//
//        List<String> tourCodeList = Arrays.asList(parDisp.getA5().split("/"));
//        String tpRC = null;
//        String tpCD = null;
//        String tpPC = null;
//        for (String s : tourCodeList) {
//            if (s.substring(0, 2).equals("RC")) {
//                tpRC = s.substring(2, s.length());
//            } else if (s.substring(0, 2).equals("CD")) {
//                tpCD = s.substring(2, s.length());
//            } else if (s.substring(0, 2).equals("PC")) {
//                tpPC = s.substring(2, s.length());
//            }
//        }
//
//        if (parDisp.getA11() != null) {
//            com.amadeus.xml.rcfarq_14_1_1a.AdditionalBusinessSourceInformationType additionalBusinessSourceInformationType = new com.amadeus.xml.rcfarq_14_1_1a.AdditionalBusinessSourceInformationType();
//            com.amadeus.xml.rcfarq_14_1_1a.OriginatorIdentificationDetailsTypeI originatorIdentificationDetailsTypeI = new OriginatorIdentificationDetailsTypeI();
//            originatorIdentificationDetailsTypeI.setOriginatorId(parDisp.getA11());
//            additionalBusinessSourceInformationType.setOriginatorDetails(originatorIdentificationDetailsTypeI);
//            rateInformation.setBookingSource(additionalBusinessSourceInformationType);
//        }
//
//        CompanyInformationType companyInformationType = new CompanyInformationType();
//
//        companyInformationType.setTravelSector(parDisp.getA0());
//        companyInformationType.setCompanyCode(veiculo.getLocadora().getCdLocadora());
//        companyInformationType.setCompanyName(veiculo.getLocadora().getNmLocadora());
//        companyInformationType.setAccessLevel(parDisp.getA1());
//
//        rateInformation.setCompanyDetails(companyInformationType);
//
//        SelectionDetailsTypeI detailsTypeI = new SelectionDetailsTypeI();
//        SelectionDetailsInformationTypeI detailsInformationTypeI = new SelectionDetailsInformationTypeI();
//
//        detailsInformationTypeI.setOption("P6");
//        detailsTypeI.setSelectionDetails(detailsInformationTypeI);
//        rateInformation.setRateSource(detailsTypeI);
//        //
//        PlaceLocationIdentificationTypeU identificationTypeU = new PlaceLocationIdentificationTypeU();
//        LocationIdentificationBatchTypeU batchTypeU = new LocationIdentificationBatchTypeU();
//
//        identificationTypeU.setLocationType("176");
//        batchTypeU.setCode("1A");
//        batchTypeU.setName(veiculo.getLocalRetirada().getCdLocal());
//        identificationTypeU.setLocationDescription(batchTypeU);
//        rateInformation.getPickupDropoffLocs().add(identificationTypeU);
//        //
//        identificationTypeU = new PlaceLocationIdentificationTypeU();
//        batchTypeU = new LocationIdentificationBatchTypeU();
//
//        identificationTypeU.setLocationType("DOL");
//        batchTypeU.setCode("1A");
//        batchTypeU.setName(veiculo.getLocalDevolucao().getCdLocal());
//        identificationTypeU.setLocationDescription(batchTypeU);
//        rateInformation.getPickupDropoffLocs().add(identificationTypeU);
//        //
//        StructuredPeriodInformationType informationType = new StructuredPeriodInformationType();
//        informationType.setBusinessSemantic("BED");
//
//        informationType.setBeginDateTime(montaStructuredDateTimeType(veiculo.getDtRetirada()));
//        informationType.setEndDateTime(montaStructuredDateTimeType(veiculo.getDtDevolucao()));
//        rateInformation.setPickupDropoffTimes(informationType);
//        //
//        TariffInformationTypeI informationTypeI = new TariffInformationTypeI();
//
//        TariffInformationDetailsTypeI detailsTypeI1 = new TariffInformationDetailsTypeI();
//        detailsTypeI1.setRateType(parDisp.getA3());
//        // if (veiculo.getLocadora().getCdLocadora().equals("ZR")) {
//
//        int rateType = Integer.parseInt(parDisp.getA8());
//        String ratePlanIndicator = null;
//        if (rateType == 3) {
//            ratePlanIndicator = "DY";
//        } else if (rateType == 5) {
//            ratePlanIndicator = "WD";
//        } else if (rateType == 6) {
//            ratePlanIndicator = "WY";
//        } else if (rateType == 4) {
//            ratePlanIndicator = "MY";
//        }
//        detailsTypeI1.setRatePlanIndicator(ratePlanIndicator);
//
//        informationTypeI.setTariffInfo(detailsTypeI1);
//
//        RateInformationTypeI informationTypeI1 = new RateInformationTypeI();
//
//        informationTypeI1.setCategory(parDisp.getA2());
//        informationTypeI.setRateInformation(informationTypeI1);
//        rateInformation.setRateInfo(informationTypeI);
//        //
//
//        if (tpRC != null) {
//            FareQualifierDetailsTypeI detailsTypeI2 = new FareQualifierDetailsTypeI();
//            FareCategoryCodesTypeI categoryCodesTypeI = new FareCategoryCodesTypeI();
//            categoryCodesTypeI.setFareType(tpRC);
//            detailsTypeI2.setFareCategories(categoryCodesTypeI);
//            rateInformation.setRateCodeInfo(detailsTypeI2);
//        }
//        //
//        VehicleSelectionType selectionType = new VehicleSelectionType();
//        VehicleTypeOptionType optionType = new VehicleTypeOptionType();
//
//        selectionType.setVehTypeOptionQualifier("VT");
//        optionType.setVehicleTypeOwner(parDisp.getA4());
//        optionType.getVehicleRentalPrefType().add(veiculo.getCdServico());
//        selectionType.setVehicleRentalNeedType(optionType);
//        rateInformation.setVehicleInformation(selectionType);
//        //
//        CurrenciesTypeU ctu = new CurrenciesTypeU();
//        CurrencyDetailsTypeU cdtu = new CurrencyDetailsTypeU();
//
//        cdtu.setCurrencyIsoCode(veiculo.getTarifa().getSgMoedaNeto());
//        cdtu.setCurrencyQualifier("2");
//        ctu.setCurrencyDetails(cdtu);
//        rateInformation.setCurrency(ctu);
//
//        if (tpCD != null) {
//            ConsumerReferenceInformationTypeI consumerReferenceInformationTypeI = new ConsumerReferenceInformationTypeI();
//            ConsumerReferenceIdentificationTypeI consumerReferenceIdentificationTypeI = new ConsumerReferenceIdentificationTypeI();
//            consumerReferenceIdentificationTypeI.setReferenceNumber(tpCD);
//            consumerReferenceIdentificationTypeI.setReferenceQualifier("CD");
//            consumerReferenceInformationTypeI.setCustomerReferences(consumerReferenceIdentificationTypeI);
//            rateInformation.setCustomerInfo(consumerReferenceInformationTypeI);
//        }
//
//        if (tpPC != null) {
//            ConsumerReferenceInformationTypeI consumerReferenceInformationTypeI = new ConsumerReferenceInformationTypeI();
//            ConsumerReferenceIdentificationTypeI consumerReferenceIdentificationTypeI = new ConsumerReferenceIdentificationTypeI();
//            consumerReferenceIdentificationTypeI.setReferenceNumber(tpPC);
//            consumerReferenceIdentificationTypeI.setReferenceQualifier("PC");
//            consumerReferenceInformationTypeI.setCustomerReferences(consumerReferenceIdentificationTypeI);
//            rateInformation.setCustomerInfo(consumerReferenceInformationTypeI);
//        }
//        CarRateInformationFromAvailabilityReply carRateInformation = amadeusClient.rateInformation(tarifarServicoRQ.getIntegrador(), rateInformation, 0);
////        CarRateInformationFromAvailabilityReply carRateInformation = chamaWS.chamadaPadrao(tarifarServicoRQ.getIntegrador(), rateInformation, CarRateInformationFromAvailabilityReply.class, 0);
//
//        WSVeiculoLocal localRetirada = null;
//        WSVeiculoLocal localDevolucao = null;
//        try {
//            for (CarRateInformationFromAvailabilityReply.RateDetails.PickupDropoffLocation pdl : carRateInformation.getRateDetails().getPickupDropoffLocation()) {
//                if (pdl.getLocationCode().getLocationType().equals("176")) {
//                    localRetirada = new WSVeiculoLocal(pdl.getLocationCode().getLocationDescription().getName(),
//                            carRateInformation.getRateDetails().getCompanyIdentification().getCompanyName(),
//                            pdl.getAddress().getAddressDetails().getLine1() + " " + pdl.getAddress().getAddressDetails().getLine2(),
//                            pdl.getAddress().getCity(),
//                            pdl.getAddress().getCountryCode(),
//                            null);
//                } else if (pdl.getLocationCode().getLocationType().equals("DOL")) {
//                    localDevolucao = new WSVeiculoLocal(pdl.getLocationCode().getLocationDescription().getName(),
//                            carRateInformation.getRateDetails().getCompanyIdentification().getCompanyName(),
//                            pdl.getAddress().getAddressDetails().getLine1() + " " + pdl.getAddress().getAddressDetails().getLine2(),
//                            pdl.getAddress().getCity(),
//                            pdl.getAddress().getCountryCode(),
//                            null);
//                }
//            }
//        } catch (Exception ex) {
//            throw new ErrorException(tarifarServicoRQ.getIntegrador(), TarifarCarWS.class, "tarifar", WSMensagemErroEnum.SPR, "Erro ao montar dados da locadora", WSIntegracaoStatusEnum.NEGADO, ex, false);
//        }
//
//        String sgMoeda = null;
//
//        List<ParRate> parRateList = new ArrayList();
//        List<ParCharge> parChargeList = new ArrayList();
//
//        String ratePlan = null;
//        try {
//            for (CarRateInformationFromAvailabilityReply.RateDetails.RateDetail detail : carRateInformation.getRateDetails().getRateDetail()) {
//                if (detail.getTariffInfo() != null) {
//                    if (detail.getTariffInfo().getAmountType() != null) {
//                        parRateList.add(new ParRate(detail.getTariffInfo().getAmountType(), detail.getTariffInfo().getCurrency(), detail.getTariffInfo().getRatePlanIndicator(), detail.getTariffInfo().getAmount(), detail.getTariffInfo().getRateChangeIndicator()));
//                        if (detail.getTariffInfo().getAmountType().equals("RP")) {
//                            if (detail.getTariffInfo().getRatePlanIndicator() != null) {
//                                ratePlan = detail.getTariffInfo().getRatePlanIndicator();
//                            }
//                        }
//                    }
//                    sgMoeda = detail.getTariffInfo().getCurrency();
//                }
//
//                if (detail.getChargeDetails() != null) {
//                    for (CarRateInformationFromAvailabilityReply.RateDetails.RateDetail.ChargeDetails c : detail.getChargeDetails()) {
//                        if (c.getType() != null && c.getComment() != null && c.getAmount() != null) {
//                            parChargeList.add(new ParCharge(c.getType(), c.getAmount(), c.getComment()));
//                        }
//                    }
//                }
//            }
//
//        } catch (Exception ex) {
//            throw new ErrorException(tarifarServicoRQ.getIntegrador(), PreReservarCarWS.class, "preReservar", WSMensagemErroEnum.SPR, "Erro ao montar tarifa", WSIntegracaoStatusEnum.NEGADO, ex, false);
//        }
//
//        //nome do veiculo
//        String nmModeloCarro = null;
//        if (carRateInformation.getRateDetails().getVehicleInfoGroup() != null && carRateInformation.getRateDetails().getVehicleInfoGroup().getVehicleDetails() != null && carRateInformation.getRateDetails().getVehicleInfoGroup().getVehicleDetails().getCarModel() != null) {
//            nmModeloCarro = carRateInformation.getRateDetails().getVehicleInfoGroup().getVehicleDetails().getCarModel();
//        }
//
//        if (nmModeloCarro == null) {
//            nmModeloCarro = veiculo.getNmModelo();
//        }
//
//        Boolean isDevMesmoLocal = null;
//        if (localRetirada.getCdLocal().equals(localDevolucao.getCdLocal())) {
//            isDevMesmoLocal = true;
//        } else {
//            isDevMesmoLocal = false;
//        }
//
//        boolean isNacional = false;
//        if (localRetirada != null) {
//            if (localRetirada.getNmPais().equals("BR") || localRetirada.getNmPais().toUpperCase().equals("BRASIL")) {
//                isNacional = true;
//            }
//        } else if (sgMoeda.equals("BRL")) {
//            isNacional = true;
//        }
//
//        ParTarifa parTarifa = UtilsWSCar.calcularTarifa(tarifarServicoRQ.getIntegrador(),
//                veiculo.getLocadora().getCdLocadora(),
//                parRateList,
//                parChargeList,
//                carRateInformation.getRateDetails().getTaxCovSurchargeGroup(),
//                sgMoeda,
//                isDevMesmoLocal,
//                isNacional,
//                veiculo.getDtRetirada(),
//                veiculo.getDtDevolucao(),
//                parDisp.getA9(),
//                parDisp.getA10(),
//                false);
//
//        List<WSTarifaAdicional> tarifaAdicionalList = new ArrayList();
//
//        if (parTarifa.getVlTaxaAdm() > 0.0) {
//            tarifaAdicionalList.add(new WSTarifaAdicional(WSTarifaAdicionalTipoEnum.TAXA_SERVICO, "Taxa administrativa", sgMoeda, parTarifa.getVlTaxaAdm()));
//        }
//
//        List<WSPolitica> politicaList = null;
//        if (UtilsWSCar.buscaPoliticas(tarifarServicoRQ.getIntegrador(), veiculo.getLocadora().getCdLocadora()) != null) {
//            politicaList = UtilsWSCar.buscaPoliticas(tarifarServicoRQ.getIntegrador(), veiculo.getLocadora().getCdLocadora());
//        }
//
//        WSTarifa tarifa = new WSTarifa(sgMoeda,
//                parTarifa.getVlTarifa(),
//                null,
//                null,
//                null,
//                politicaList,
//                tarifaAdicionalList);
//
//        tarifa.setDsParametro(veiculo.getTarifa().getDsParametro());
//        tarifa.setDsTarifa(tarifarServicoRQ.getReservaServico().getServico().getTarifa().getDsTarifa());
//
//        ParReserva parReserva = new ParReserva(parDisp.getA0(),
//                parDisp.getA4(),
//                parDisp.getA3(),
//                parDisp.getA2(),
//                tarifarServicoRQ.getReservaServico().getServico().getTarifa().getDsTarifa(),
//                tpRC,
//                tpCD,
//                parDisp.getA6(),
//                parDisp.getA7(),
//                ratePlan,
//                sgMoeda,
//                parDisp.getA9(),
//                parDisp.getA10(),
//                tpPC,
//                parDisp.getA11());
//
//        String dsParametro = UtilsWSCar.toJson(parReserva);
//
//        WSVeiculo veiculoRetorno = new WSVeiculo(null,
//                localRetirada,
//                localDevolucao,
//                veiculo.getDtRetirada(),
//                veiculo.getDtDevolucao(),
//                veiculo.getNmClasse(),
//                nmModeloCarro,
//                veiculo.getVeiculoDetalheList(),
//                veiculo.getLocadora(),
//                null,
//                WSServicoTipoEnum.VEICULO,
//                veiculo.getCdServico(),
//                veiculo.getNmServico(),
//                veiculo.getDsServico(),
//                veiculo.getReservaNomeList(),
//                tarifa,
//                veiculo.getDtServico(),
//                veiculo.getMediaList(),
//                null,
//                dsParametro,
//                false,
//                null);
//
//        if (parTarifa.getVlDevolucao() > 0.0) {
//            veiculoRetorno.setDsObservacao("Valor a ser pago no local de devolução");
//            veiculoRetorno.setSgMoedaObservacao(sgMoeda);
//            veiculoRetorno.setVlObservacao(parTarifa.getVlDevolucao());
//        }
//
//        veiculoRetorno.setDtServicoFim(veiculo.getDtServicoFim());
//
//        List<WSReservaServico> reservaServicoList = new ArrayList();
//
//        WSReservaServico reservaServico = new WSReservaServico(null,
//                WSServicoTipoEnum.VEICULO,
//                null,
//                WSReservaStatusEnum.SOLICITACAO,
//                null,
//                veiculoRetorno);
//
//        reservaServicoList.add(reservaServico);
//
//        WSReserva reserva = new WSReserva(reservaServicoList);
//        return new WSTarifarServicoRS(reservaServico, tarifarServicoRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
//
//    private StructuredDateTimeType montaStructuredDateTimeType(Date data) {
//        StructuredDateTimeType dateTimeType = new StructuredDateTimeType();
//        dateTimeType.setYear(Utils.formatData(data, "yyyy"));
//        dateTimeType.setMonth(Utils.formatData(data, "MM"));
//        dateTimeType.setDay(Utils.formatData(data, "dd"));
//        dateTimeType.setHour(Utils.formatData(data, "HH"));
//        return dateTimeType;
//    }
}
