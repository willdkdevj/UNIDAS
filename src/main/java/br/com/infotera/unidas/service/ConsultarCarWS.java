package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaNome;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.WSTarifa;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSPaxTipoEnum;
import br.com.infotera.common.enumerator.WSReservaStatusEnum;
import br.com.infotera.common.enumerator.WSServicoTipoEnum;
import br.com.infotera.common.politica.WSPolitica;
import br.com.infotera.common.politica.WSPoliticaVoucher;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.common.servico.WSServico;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.common.servico.WSVeiculoLocal;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.AddressInfoType;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfCoveragePricedType;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleEquipmentPricedType;
import br.com.infotera.unidas.model.gen.opentravel.CoverageDetailsType;
import br.com.infotera.unidas.model.gen.opentravel.CoveragePricedType;
import br.com.infotera.unidas.model.gen.opentravel.CoverageTextType;
import br.com.infotera.unidas.model.gen.opentravel.CustomerPrimaryAdditionalType;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehRetRes;
import br.com.infotera.unidas.model.gen.opentravel.VehicleEquipmentPricedType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleLocationDetailsType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRetrieveResRSCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRetResResponse;
import br.com.infotera.unidas.service.interfaces.BuilderInput;
import br.com.infotera.unidas.service.interfaces.OTAVehRetResRequest;
import br.com.infotera.unidas.util.SupplierBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    @Autowired
    private BuilderInput builderIn;
    
    public WSReservaRS check(WSReservaRQ reservaRQ) throws ErrorException {
        
        OtaVehRetRes vehRetRes = request.builderOTAVehRetResRequest(reservaRQ);
        
        OtaVehRetResResponse otaVehRetResResponse = unidasClient.callOTAVehRetRes(reservaRQ.getIntegrador(), vehRetRes);
        
        checkBooking(reservaRQ, otaVehRetResResponse);
        
        return new WSReservaRS(reservaRQ.getReserva(), reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

    private void checkBooking(WSReservaRQ reservaRQ, OtaVehRetResResponse otaVehRetResResponse) throws ErrorException {
        if(otaVehRetResResponse != null && otaVehRetResResponse.getOtaVehRetResResult() != null) {
            List<VehicleRetrieveResRSCoreType> responses = request.checkRetResReturn(reservaRQ.getIntegrador(), otaVehRetResResponse.getOtaVehRetResResult().getErrorsOrSuccessOrVehRetResRSCore());
            if(!Utils.isListNothing(responses)){
                responses.forEach(response -> {
                    try {
                        WSReservaServico reservaServico = reservaRQ.getReserva().getReservaServicoList().stream()
                                .findFirst()
                                .orElseThrow(() -> new ErrorException(reservaRQ.getIntegrador(), ReservarCarWS.class, "checkStatusBooking", WSMensagemErroEnum.SRE,
                                        "Não foi possível obter a validação da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
                        
                        if(reservaServico.getServico() != null){
                            
                            reservaServico.getServico().getTarifa().setPoliticaList(setUpVouchersPolicies(reservaRQ.getIntegrador(), 
                                            response.getVehReservation().getVehSegmentInfo().getPricedCoverages()));
                            
                            reservaServico.setServicoAdicionalList(setAdditionalServiceList(reservaRQ.getIntegrador(), 
                                            response.getVehReservation().getVehSegmentInfo().getPricedCoverages(), 
                                            response.getVehReservation().getVehSegmentCore().getPricedEquips()));
                            
                            checkStatusReservation(reservaRQ.getIntegrador(), reservaServico, response);
                        } else {
                            importLOCReservation(reservaRQ.getIntegrador(), reservaServico, response);
                        }
                    } catch (ErrorException ex) {
                        Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
            } else {
                throw new ErrorException(reservaRQ.getIntegrador(), ConsultarCarWS.class, "checkBooking", WSMensagemErroEnum.SCO, 
                    "Não foi possível obter analisar o retorno da consulta a reserva. Entre em contato com o Fornecedor", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        }  else {
            throw new ErrorException(reservaRQ.getIntegrador(), ConsultarCarWS.class, "checkBooking", WSMensagemErroEnum.SCO, 
                "Não foi possível obter o retorno da consulta a reserva. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }
    
    private void importLOCReservation(WSIntegrador integrador, WSReservaServico reservaServico, VehicleRetrieveResRSCoreType response) {
        try{
            if(response.getVehReservation() != null){
                WSVeiculo veiculo = new WSVeiculo();
                veiculo.setServicoTipo(WSServicoTipoEnum.VEICULO);
                veiculo.setStOperadora(Boolean.FALSE);
                veiculo.setReservaNomeList(setUpReservaNomeList(response.getVehReservation().getCustomer()));
                veiculo.setLocadora(builderIn.assembleRentalCompany());

                WSTarifa tarifa = null;
                if(response.getVehReservation().getVehSegmentCore() != null){ 
                    /** Assemble list with details about the vehicle */
                    veiculo.setVeiculoDetalheList(builderIn.assembleDetailsVehicle(integrador, 
                            response.getVehReservation().getVehSegmentCore().getVehicle(), 
                            response.getVehReservation().getVehSegmentCore().getRentalRate().getRateDistance()));

                    /** Assembles media list about the vehicle */
                    veiculo.setMediaList(builderIn.assembleMediaList(integrador, 
                            response.getVehReservation().getVehSegmentCore().getVehicle()));

                    /** Pick-up, return and service dates */
                    setUpPickUpAndReturnDate(veiculo, response.getVehReservation().getVehSegmentCore().getVehRentalCore());

                    /** Sets up the rate and possible fees applied to the rental */
                    tarifa = builderIn.assembleRate(integrador, 
                            Arrays.asList(response.getVehReservation().getVehSegmentCore().getTotalCharge()), 
                            response.getVehReservation().getVehSegmentCore().getFees());
                    
                    veiculo.setCdServico(response.getVehReservation().getVehSegmentCore().getVehicle().getCode());
                    veiculo.setNmServico(response.getVehReservation().getVehSegmentCore().getVehicle().getVehMakeModel().getName());
                    veiculo.setDsParametro(response.getVehReservation().getVehSegmentCore().getVehicle().getCodeContext());
                    veiculo.setNmClasse(SupplierBase.loadingClassVehicle().get(response.getVehReservation().getVehSegmentCore().getVehicle().getCode()));
                    veiculo.setNmModelo(response.getVehReservation().getVehSegmentCore().getVehicle().getVehMakeModel().getName());
                    
                }

                if(response.getVehReservation().getVehSegmentInfo() != null){
                    /** Checks the vehicle pickup and return location */
                    setUpPickUpAndReturnLocation(integrador, veiculo, response.getVehReservation().getVehSegmentInfo().getLocationDetails());
                    
                    tarifa.setPoliticaList(setUpVouchersPolicies(integrador, 
                                           response.getVehReservation().getVehSegmentInfo().getPricedCoverages()));
                    
                    veiculo.setTarifa(tarifa);
                    veiculo.setTarifaOpcionalList(Arrays.asList(tarifa));
                }
                
                reservaServico.setServico(veiculo);
                reservaServico.setServicoAdicionalList(setAdditionalServiceList(integrador, 
                        response.getVehReservation().getVehSegmentInfo().getPricedCoverages(), 
                        response.getVehReservation().getVehSegmentCore().getPricedEquips()));
                
                checkStatusReservation(integrador,  reservaServico, response);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, ReservarCarWS.class, "importLOCReservation", WSMensagemErroEnum.SCO,
                        "Não foi possível realizar a importação da reserva. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ee) {
                Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ee);
            }
        }
    }

    private List<WSReservaNome> setUpReservaNomeList(CustomerPrimaryAdditionalType customer) {
        List<WSReservaNome> reservaNomeList = null;
        if(customer != null && customer.getPrimary() != null && !Utils.isListNothing(customer.getPrimary().getPersonName())){
            reservaNomeList = new ArrayList();
            customer.getPrimary().getPersonName().stream().map(person -> {
                WSReservaNome reservaNome = new WSReservaNome();
                reservaNome.setNmNome(person.getGivenName().stream().findFirst().orElse(null));
                reservaNome.setNmSobrenome(person.getSurname());
                reservaNome.setPaxTipo(WSPaxTipoEnum.ADT);
                reservaNome.setQtIdade(30);
                
                return reservaNome;
            }).forEachOrdered(reservaNomeList::add);
        }   
        
        return reservaNomeList;
    }

    private void checkStatusReservation(WSIntegrador integrador, WSReservaServico reservaServico, VehicleRetrieveResRSCoreType response) throws ErrorException {
        if(response.getVehResSummaries() != null && !Utils.isListNothing(response.getVehResSummaries().getVehResSummary())){
            response.getVehResSummaries().getVehResSummary().forEach(summary -> {
                if(summary.getReservationStatus() != null && !summary.getReservationStatus().equals("")){
                    switch(summary.getReservationStatus()){
                        case "CFA":
                            reservaServico.setReservaStatus(WSReservaStatusEnum.CONFIRMADO);
                            break;
                        case "CAN":
                            reservaServico.setReservaStatus(WSReservaStatusEnum.CANCELADO);
                            break;
                        case "SOL":
                            reservaServico.setReservaStatus(WSReservaStatusEnum.ON_REQUEST);
                            break;
                        default:
                            reservaServico.setReservaStatus(WSReservaStatusEnum.INCONSISTENTE);
                            try {
                                throw new ErrorException(integrador, ReservarCarWS.class, "checkStatusReservation", WSMensagemErroEnum.SCO,
                                        "Não foi possível determinar o status da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                            } catch (ErrorException ex) {
                                Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
                }
            });
        } else {
            throw new ErrorException(integrador, ReservarCarWS.class, "checkStatusReservation", WSMensagemErroEnum.SCO,
                                        "Não foi possível determinar o status da reserva do veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
    }

    private void setUpPickUpAndReturnDate(WSVeiculo veiculo, VehicleRentalCoreType vehRentalCore) {
        if(vehRentalCore != null){
            veiculo.setDtRetirada(vehRentalCore.getPickUpDateTime().toGregorianCalendar().getTime());
            veiculo.setDtDevolucao(vehRentalCore.getReturnDateTime().toGregorianCalendar().getTime());
            veiculo.setDtServico(vehRentalCore.getPickUpDateTime().toGregorianCalendar().getTime());
        }
    }

    private void setUpPickUpAndReturnLocation(WSIntegrador integrador, WSVeiculo veiculo, List<VehicleLocationDetailsType> locationDetails) {
        try {
            if(!Utils.isListNothing(locationDetails)){
                List<WSVeiculoLocal> veiculoLocalList = new ArrayList();
                locationDetails.stream().map(localDetail -> {
                    /** Get the locations of the car rental companies (Pickup - Return) */
                    WSVeiculoLocal veiculoLocal = new WSVeiculoLocal();
                    veiculoLocal.setCdLocal(localDetail.getCode());
                    veiculoLocal.setNmLocal(localDetail.getName());

                    /** Get the phone book tied to the rental companies */
                    VehicleLocationDetailsType.Telephone telefone = localDetail.getTelephone().stream().findFirst().orElse(null);
                    veiculoLocal.setDsTelefone(telefone != null ? telefone.getPhoneNumber() : null);

                    AddressInfoType address = localDetail.getAddress().stream().findFirst().orElse(null);
                    if(address != null) {
                        veiculoLocal.setDsEndereco(address.getAddressLine().stream().findFirst().orElse(null));
                        veiculoLocal.setNmMunicipio(address.getCityName());
                        veiculoLocal.setNmPais(address.getStateProv().getValue());
    //                        veiculoLocal.setCdLatitude(address.);
    //                        veiculoLocal.setCdLongitude(cdLongitude);

                    }

                    return veiculoLocal;
                }).forEachOrdered(veiculoLocalList::add);

                if(!Utils.isListNothing(veiculoLocalList)){
                    veiculo.setLocalRetirada(veiculoLocalList.get(0));
                    veiculo.setLocalDevolucao(veiculoLocalList.get(1));
                }

            } else {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleDestinationRental", WSMensagemErroEnum.SDI, 
                    "Não foi possível obter as informações sobre as lojas. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleDestinationRental", WSMensagemErroEnum.SDI, 
                    "Não foi possível montar as informações sobre logradouro das lojas. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ee) {
                Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ee);
            }
        }
    }

    private List<WSServico> setAdditionalServiceList(WSIntegrador integrador, ArrayOfCoveragePricedType pricedCoverages, ArrayOfVehicleEquipmentPricedType pricedEquips) {
        List<WSServico> additionalServicesList = null;
        try {
            if(pricedCoverages != null && !Utils.isListNothing(pricedCoverages.getPricedCoverage())){
                additionalServicesList = new ArrayList();
                for(CoveragePricedType priced : pricedCoverages.getPricedCoverage()){
                    String nmCobertura = null, dsCobertura = null;
                    try {
                        for (CoverageDetailsType detail : priced.getCoverage().getDetails()) {
                            if (detail.getCoverageTextType().equals(CoverageTextType.SUPPLEMENT)) {
                                nmCobertura = detail.getValue();
                            } else if (detail.getCoverageTextType().equals(CoverageTextType.DESCRIPTION)) {
                                dsCobertura = detail.getValue();
                            }
                        }
                    } catch (Exception ex) {
                        throw new ErrorException(integrador, ConsultarCarWS.class, "setAdditionalServiceList", WSMensagemErroEnum.SCO, 
                                "Erro ao montar detalhes da cobertura do serviço (CoverageDetail)", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
                    }
                    
                    additionalServicesList.add(new WSServico(null, 
                            priced.getCoverage().getCode(), 
                            "ACESSÓRIOS E SERVIÇOS ADICIONAIS", 
                            nmCobertura + " " + dsCobertura, 
                            null,null,null){});
                }
            }
            
            if(pricedEquips != null && !Utils.isListNothing(pricedEquips.getPricedEquip())){
                if(!Utils.isListNothing(additionalServicesList)){
                    additionalServicesList = new ArrayList();
                }
                
                for(VehicleEquipmentPricedType equipment :pricedEquips.getPricedEquip()){
                    additionalServicesList.add(new WSServico(null,
                            equipment.getEquipment().getEquipType(), 
                            "ACESSÓRIOS E SERVIÇOS ADICIONAIS", 
                            equipment.getEquipment().getDescription(), 
                            null, null, null){});
                }
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, ConsultarCarWS.class, "setAdditionalServiceList", WSMensagemErroEnum.SCO, 
                    "Não foi possível montar os serviços adicionais para o insumo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ee) {
                Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ee);
            }
        }
        
        return additionalServicesList;
    }

    private List<WSPolitica> setUpVouchersPolicies(WSIntegrador integrador, ArrayOfCoveragePricedType pricedCoverages) {
        List<WSPolitica> policiesList = null;
        try {
            if(pricedCoverages != null && !Utils.isListNothing(pricedCoverages.getPricedCoverage())){
                policiesList = new ArrayList();
                for(CoveragePricedType priced : pricedCoverages.getPricedCoverage()){
                    String nmCobertura = null, dsCobertura = null;
                    try {
                        for (CoverageDetailsType detail : priced.getCoverage().getDetails()) {
                            if (detail.getCoverageTextType().equals(CoverageTextType.SUPPLEMENT)) {
                                nmCobertura = detail.getValue();
                            } else if (detail.getCoverageTextType().equals(CoverageTextType.DESCRIPTION)) {
                                dsCobertura = detail.getValue();
                            }
                        }
                    } catch (Exception ex) {
                        throw new ErrorException(integrador, ConsultarCarWS.class, "setUpVouchersPolicies", WSMensagemErroEnum.SCO, 
                                "Erro ao montar as politicas de voucher do serviço (CoverageDetail)", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
                    }
                    
                    policiesList.add(new WSPoliticaVoucher("PROTEÇÃO", nmCobertura + " " + dsCobertura + "\n"));
                }
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, ConsultarCarWS.class, "setUpVouchersPolicies", WSMensagemErroEnum.SCO, 
                    "Não foi possível montar as politicas de voucher para o insumo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ee) {
                Logger.getLogger(ConsultarCarWS.class.getName()).log(Level.SEVERE, null, ee);
            }
        }
        
        return policiesList;    
    }
}
