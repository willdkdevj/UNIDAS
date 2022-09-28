/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.*;
import br.com.infotera.common.media.WSMedia;
import br.com.infotera.common.servico.*;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.opentravel.AddressInfoType;
import br.com.infotera.unidas.model.gen.opentravel.CoverageDetailsType;
import br.com.infotera.unidas.model.gen.opentravel.CoveragePricedType;
import br.com.infotera.unidas.model.gen.opentravel.CoverageTextType;
import br.com.infotera.unidas.model.gen.opentravel.DistanceUnitNameType;
import br.com.infotera.unidas.model.gen.opentravel.InventoryStatusType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailCoreType.TotalCharge;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRSCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailVendorInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleChargePurposeType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleLocationDetailsType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalRateType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleVendorAvailabilityType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleVendorAvailabilityType.VehAvails.VehAvail;
import br.com.infotera.unidas.service.interfaces.OTAVehAvailRequest;
import br.com.infotera.unidas.util.SupplierBase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * Class responsible for performing the analysis of the supplier's product availability when dealing with the sending and receiving
 * of information 
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class DisponibilidadeCarWS {

    @Autowired
    private UnidasClient unidasClient;
    @Autowired
    private OTAVehAvailRequest request;

    public WSDisponibilidadeVeiculoRS availability(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {

        request.validateBusinessRules(disponibilidadeVeiculoRQ);
        
        OtaVehAvailRate carAvailability = request.builderOTAVehAvailRateRequest(disponibilidadeVeiculoRQ);

        OtaVehAvailRateResponse  otaVehAvailRateResponse = unidasClient.callOTAVehAvailRate(disponibilidadeVeiculoRQ.getIntegrador(), carAvailability);
        
        List<WSVeiculoPesquisa> searchVehiclesList = assembleSearchVehiclesList(disponibilidadeVeiculoRQ, otaVehAvailRateResponse);

        return builderDisponibilidadeVeiculoRS(disponibilidadeVeiculoRQ.getIntegrador(), searchVehiclesList);
    }

    private List<WSVeiculoPesquisa> assembleSearchVehiclesList(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ, OtaVehAvailRateResponse otaVehAvailRateResponse) throws ErrorException {
        List<WSVeiculoPesquisa> veiculoPesquisaList = null;
        WSIntegrador integrador = disponibilidadeVeiculoRQ.getIntegrador();
        
        try {
            if(otaVehAvailRateResponse != null && otaVehAvailRateResponse.getOtaVehAvailRateResult() != null && !Utils.isListNothing(otaVehAvailRateResponse.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore())) {
                
                List<VehicleAvailRSCoreType> vehicleAvailCoreList = request.checkAvailityReturn(integrador, otaVehAvailRateResponse.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore());
                
                if(!Utils.isListNothing(vehicleAvailCoreList)){
                    for(VehicleAvailRSCoreType vehicleAvailCore : vehicleAvailCoreList){
                        /** Pick-up and return dates */
                        Date dtRetirada = vehicleAvailCore.getVehRentalCore().getPickUpDateTime().toGregorianCalendar().getTime();
                        Date dtDevolucao = vehicleAvailCore.getVehRentalCore().getReturnDateTime().toGregorianCalendar().getTime();
                        
                        /** Checks the list of available vehicles and their details */
                        if(vehicleAvailCore.getVehVendorAvails() != null && !Utils.isListNothing(vehicleAvailCore.getVehVendorAvails().getVehVendorAvail())){
                            
                            /** Checks the availability of the vehicles */
                            List<WSVeiculo> veiculoList = new ArrayList();
                            for(VehicleVendorAvailabilityType vehVendorAvail : vehicleAvailCore.getVehVendorAvails().getVehVendorAvail()){
                                
                                /** Checks the vehicle pickup and return location */
                                List<WSVeiculoLocal> veiculoLocalList = assembleDestinationRental(integrador, vehVendorAvail.getInfo());
                            
                                for(VehAvail vehAvail : vehVendorAvail.getVehAvails().getVehAvail()){
                                    if(vehAvail.getVehAvailCore() != null && vehAvail.getVehAvailCore().getStatus().equals(InventoryStatusType.AVAILABLE)){
                                        /** Assemble list with details about the vehicle */
                                        List<WSVeiculoDetalhe> veiculoDetalheList = assembleDetailsVehicle(integrador, vehAvail.getVehAvailCore());
                                        
                                        /** Assembles media list about the vehicle */
                                        List<WSMedia> mediaList = assembleMediaList(integrador, vehAvail.getVehAvailCore());        
                                        
                                        /** Sets up the rate and possible fees applied to the rental */
                                        WSTarifa tarifa = assembleRate(integrador, vehAvail.getVehAvailCore(), vehAvail.getVehAvailInfo());
                                        
                                        /** Set up Rental Object UNIDAS */
                                        WSVeiculoLocadora locadora = assembleRentalCompany();
                                        
                                        WSVeiculo veiculo = new WSVeiculo();
                                        veiculo.setServicoTipo(WSServicoTipoEnum.VEICULO);
                                        veiculo.setDtRetirada(dtRetirada);
                                        veiculo.setDtDevolucao(dtDevolucao);
                                        veiculo.setNmClasse(SupplierBase.loadingClassVehicle().get(vehAvail.getVehAvailCore().getVehicle().getVehMakeModel().getCode()));
                                        veiculo.setNmModelo(vehAvail.getVehAvailCore().getVehicle().getVehMakeModel().getName());
                                        veiculo.setLocalRetirada(veiculoLocalList.get(0));
                                        veiculo.setLocalDevolucao(veiculoLocalList.size() > 1 ? veiculoLocalList.get(1) : veiculoLocalList.get(0));
                                        veiculo.setVeiculoDetalheList(veiculoDetalheList);
                                        veiculo.setLocadora(locadora);
                                        veiculo.setCdServico(vehAvail.getVehAvailCore().getVehicle().getCode());
                                        veiculo.setNmServico(vehAvail.getVehAvailCore().getVehicle().getVehMakeModel().getName());
                                        veiculo.setDsParametro(vehAvail.getVehAvailCore().getVehicle().getCodeContext());
                                        veiculo.setTarifa(tarifa);
                                        veiculo.setDtServico(dtRetirada);
                                        veiculo.setMediaList(mediaList);
                                        veiculo.setStOperadora(Boolean.FALSE);
                                        veiculo.setTarifaOpcionalList(Arrays.asList(tarifa));
                                        
                                        veiculoList.add(veiculo);
                                    }
                                }
                            }
                            
                            /** Assemble Vehicle Search List */
                            veiculoPesquisaList = Arrays.asList(new WSVeiculoPesquisa(1, veiculoList, null));
                            
                        } else {
                            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleSearchVehiclesList", WSMensagemErroEnum.SDI, 
                                "Não foi possível obter as informações sobre os veículos. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                        }
                    }
                }
            } else {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleSearchVehiclesList", WSMensagemErroEnum.SDI, 
                    "Não foi possível obter a disponibilidade dos veículos. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleSearchVehiclesList", WSMensagemErroEnum.SDI, 
                    "Erro ao montar a lista de veículos disponíveis. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return veiculoPesquisaList;
    }

    private List<WSVeiculoLocal> assembleDestinationRental(WSIntegrador integrador, VehicleAvailVendorInfoType vehVendorAvailType) throws ErrorException {
        List<WSVeiculoLocal> veiculoLocalList = null;
        try {
            if(vehVendorAvailType != null && !Utils.isListNothing(vehVendorAvailType.getLocationDetails())){
                veiculoLocalList = new ArrayList();
                vehVendorAvailType.getLocationDetails().stream().map(localDetail -> {
                    /** Get the phone book tied to the rental companies */
                    String telefones = treatPhones(integrador, localDetail.getTelephone());
                    
                    /** Get the locations of the car rental companies (Pickup - Return) */
                    WSVeiculoLocal veiculoLocal = new WSVeiculoLocal();
                    veiculoLocal.setCdLocal(localDetail.getCode());
                    veiculoLocal.setNmLocal(localDetail.getName());
                    veiculoLocal.setDsTelefone(telefones);
                    
                    /** Enters the address data of the Landlord (Rental) */
                    setUpAddresses(integrador, veiculoLocal, localDetail.getAddress());
                    
                    return veiculoLocal;
                }).forEachOrdered(veiculoLocalList::add);
                
            } else {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleDestinationRental", WSMensagemErroEnum.SDI, 
                    "Não foi possível obter as informações sobre as lojas. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch (ErrorException ex) {
            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleDestinationRental", WSMensagemErroEnum.SDI, 
                    "Não foi possível montar as informações sobre logradouro das lojas. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return veiculoLocalList;
    }
    
    private List<WSVeiculoDetalhe> assembleDetailsVehicle(WSIntegrador integrador, VehicleAvailCoreType vehAvailCore) throws ErrorException {
        List<WSVeiculoDetalhe> veiculoDetalheList = null;
        try {
            if(vehAvailCore.getVehicle() != null){
                veiculoDetalheList = new ArrayList();
                
                /** Checks the code for the vehicle category */
                WSVeiculoDetalhe veiculoCategoria = new WSVeiculoDetalhe();
                veiculoCategoria.setDetalheEnum(WSVeiculoDetalheEnum.CATEGORIA);
                veiculoCategoria.setNmDetalhe(vehAvailCore.getVehicle().getCode() != null ? SupplierBase.loadingClassVehicle().get(vehAvailCore.getVehicle().getCode()) : "Não informada");
                veiculoDetalheList.add(veiculoCategoria);
                
                /** Checks for air conditioning */
                WSVeiculoDetalhe veiculoAr = new WSVeiculoDetalhe();
                veiculoAr.setDetalheEnum(WSVeiculoDetalheEnum.AR_CONDICIONADO);
                veiculoAr.setNmDetalhe(vehAvailCore.getVehicle().isAirConditionInd() ? "Ar condicionado" : "Sem ar condicionado");
                veiculoDetalheList.add(veiculoAr);
                                        
                /** Checks the vehicle's transmission type */
                WSVeiculoDetalhe veiculoTransmissao = new WSVeiculoDetalhe();
                veiculoTransmissao.setDetalheEnum(WSVeiculoDetalheEnum.TRANSMISSAO);
                veiculoTransmissao.setNmDetalhe(vehAvailCore.getVehicle().getTransmissionType().MANUAL.name().toUpperCase().equals("MANUAL") ? vehAvailCore.getVehicle().getTransmissionType().MANUAL.value() : vehAvailCore.getVehicle().getTransmissionType().AUTOMATIC.value());
                veiculoDetalheList.add(veiculoTransmissao);
                
                /** Checks the vehicle's passenger limit */
                WSVeiculoDetalhe veiculoQtdPass = new WSVeiculoDetalhe();
                veiculoQtdPass.setDetalheEnum(WSVeiculoDetalheEnum.QT_PASSAGEIRO);
                veiculoQtdPass.setNmDetalhe(vehAvailCore.getVehicle().getPassengerQuantity() != null ? vehAvailCore.getVehicle().getPassengerQuantity() : "Não informada");
                veiculoDetalheList.add(veiculoQtdPass);
                
                /** Checks the number of doors on the vehicle */
                WSVeiculoDetalhe veiculoQtdPortas = new WSVeiculoDetalhe();
                veiculoQtdPortas.setDetalheEnum(WSVeiculoDetalheEnum.QT_PORTAS);
                veiculoQtdPortas.setNmDetalhe(vehAvailCore.getVehicle().getVehType() != null && vehAvailCore.getVehicle().getVehType().getDoorCount() != null ? vehAvailCore.getVehicle().getVehType().getDoorCount() : "Não Informado");
                veiculoDetalheList.add(veiculoQtdPortas);
                
                /** Checks the quantity of baggege on the vehicle */
                WSVeiculoDetalhe veiculoQtdBagagem = new WSVeiculoDetalhe();
                veiculoQtdBagagem.setDetalheEnum(WSVeiculoDetalheEnum.QT_BAGAGEM);
                veiculoQtdBagagem.setNmDetalhe(vehAvailCore.getVehicle().getBaggageQuantity() != null ? vehAvailCore.getVehicle().getBaggageQuantity().toString() : "Não informada");
                veiculoDetalheList.add(veiculoQtdBagagem);
                
                /** Checks the vehicle's Mileage Limit */
                VehicleRentalRateType.RateDistance rateDistance = vehAvailCore.getRentalRate().stream().findFirst().get().getRateDistance().stream().findFirst().orElse(null);
                if(rateDistance != null){
                    WSVeiculoDetalhe veiculoKm = new WSVeiculoDetalhe();
                    veiculoKm.setDetalheEnum(WSVeiculoDetalheEnum.KILOMETRAGEM);
                    veiculoKm.setNmDetalhe(rateDistance.isUnlimited() ? "Unlimited" : rateDistance.getDistUnitName().KM.equals(DistanceUnitNameType.KM) && rateDistance.getQuantity() != null ? rateDistance.getQuantity().toString() : "Não informada");
                    veiculoDetalheList.add(veiculoKm);
                }
                
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleDetailsVehicle", WSMensagemErroEnum.SDI, 
                    "Não foi possível obter os detalhes para o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return veiculoDetalheList;
    }

    private String treatPhones(WSIntegrador integrador, List<VehicleLocationDetailsType.Telephone> telephones) {
        String telefones = null;
        try {
            List<VehicleLocationDetailsType.Telephone> phoneList = telephones.stream()
                    .filter(phone -> phone != null)
                    .collect(Collectors.toList());
            
            if(!Utils.isListNothing(phoneList)){
                /** Checks the values corresponding to the phone numbers of the rental companies */
                for(VehicleLocationDetailsType.Telephone phone : phoneList){
                    if(telefones != null){
                        telefones += " / " + phone.getPhoneNumber(); 
                    } else {
                        telefones = phone.getPhoneNumber();
                    }
                }
            }
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "treatPhones", WSMensagemErroEnum.SDI,
                    "Não foi possível os telefones fornecidos para a Locadora. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return telefones;
    }

    private void setUpAddresses(WSIntegrador integrador, WSVeiculoLocal veiculoLocal, List<AddressInfoType> addressList) {
        try {
            /** Checks the pickup and return address information */
            AddressInfoType addressLocal = addressList.stream()
                    .filter(address -> address != null)
                    .findFirst()
                    .orElse(null);
            
            if(addressLocal != null){
                int i = 0;
                /** Assemble the address and coordinate data to WSVeicleLocation */
                for(String address : addressLocal.getAddressLine()){
                    
                    /** Returns in the second element of the list (get(1)) the coordinate information of the street address */
                    if(i == 1){
                        String[] latitudeLongitude = address.split(", ");
                        veiculoLocal.setCdLatitude(latitudeLongitude[0]);
                        veiculoLocal.setCdLongitude(latitudeLongitude[1]);
                        i += latitudeLongitude.length;
                    } else {
                        veiculoLocal.setDsEndereco(address + addressLocal.getStreetNmbr() != null ? ", " + addressLocal.getStreetNmbr() : "");
                        i++;
                    }
                }
                
                veiculoLocal.setNmMunicipio(addressLocal.getCityName() + " - " + addressLocal.getStateProv() != null ? addressLocal.getStateProv().getStateCode() : "" + ", CEP:" + addressLocal.getPostalCode());
                veiculoLocal.setNmPais(addressLocal.getCounty() != null && addressLocal.getCounty().equals("BR") ? "BRASIL" : addressLocal.getCounty());
            }
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "setUpAddresses", WSMensagemErroEnum.SDI,
                        "Não foi possível obter as informações de logradouro da Locadora. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    private List<WSMedia> assembleMediaList(WSIntegrador integrador, VehicleAvailCoreType vehAvailCore) {
        List<WSMedia> mediaList = null;
        try {
            /** List populated with a WSMedia object because it returns only one parameter */
            mediaList = new ArrayList();
            if(vehAvailCore.getVehicle() != null && vehAvailCore.getVehicle().getPictureURL() != null) {
                mediaList = Arrays.asList(new WSMedia(WSMediaCategoriaEnum.VEICULO, vehAvailCore.getVehicle().getPictureURL()));
            }
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleMediaList", WSMensagemErroEnum.SDI,
                        "Não foi possível obter a lista de mídias sobre o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return mediaList;
    }

    private WSTarifa assembleRate(WSIntegrador integrador, VehicleAvailCoreType vehAvailCore, VehicleAvailAdditionalInfoType vehAvailInfo) {
        WSTarifa tarifa = null;
        try {
            if(!Utils.isListNothing(vehAvailCore.getTotalCharge())){
                String sgMoeda = null;
                Double vlNeto = 0.0d;
                
                /** Gets the value for the rental rate */
                for(TotalCharge charge : vehAvailCore.getTotalCharge()){
                    sgMoeda = charge.getCurrencyCode();
                    vlNeto = Utils.somar(vlNeto, charge.getEstimatedTotalAmount().doubleValue());
                }
                                
                /** Checks for service charges for the tariff */
                List<WSTarifaAdicional> tarifaAdicionalList = null;
                if(!Utils.isListNothing(vehAvailCore.getFees().getFee())){
                    String sgMoedaTaxa = null;
                    Double vlNetoTaxa = 0.0d;
                    
                    tarifaAdicionalList = new ArrayList();
                    for(VehicleChargePurposeType fee : vehAvailCore.getFees().getFee()){
                        if(fee.getAmount() != null && fee.getAmount().doubleValue() > 0.0){
                            /** Rate currency abbreviation */
                            sgMoedaTaxa = fee.getCurrencyCode();
                            
                            /**
                             * 1 - Vehicle rental
                             * 2 - Drop
                             * 3 - Discount
                             * 4 - Coverage
                             * 5 - Surcharge
                             * 6 - Fee
                             * 7 - Tax
                             * 8 - Additional Distance
                             * 9 - Additional Week
                             * 10 - Additional Day
                             * 11 - Additional Hour
                             * 12 - Additional Day
                             * 13 - Young driver
                             * 14 - Younger driver
                             * 15 - Senior
                             * 16 - Customer pickup
                             * 17 - Customer drop off
                             * 18 - Vehicle delivery
                             * 19 - Vehicle collection
                             * 20 - Fuel
                             * 21 - Equipment
                             * 22 - Prepay amount
                             * 23 - Pay on arrival amount
                             * 24 - Prepaid fuel
                             * 25 - Adjustment
                             * 26 - Mandatory charges total
                             * 27 - Subtotal
                             * 28 - Optional
                             * 29 - Contract fee
                             * 30 - Airport surcharge
                             * 31 - Air conditioning surcharge
                             * 32 - Registration fee
                             * 33 - Vehicle license fee
                             * 34 - Winter service charge
                             * 35 - Base rate
                             */
                            WSTarifaAdicional taxaAdicional = new WSTarifaAdicional(WSTarifaAdicionalTipoEnum.TAXA_SERVICO, fee.getDescription(), sgMoedaTaxa, fee.getAmount().doubleValue());
                            tarifaAdicionalList.add(taxaAdicional);
                            /** Performs the calculation of all returned fees */
                            vlNetoTaxa = Utils.somar(vlNetoTaxa, fee.getAmount().doubleValue());
                        }
                    }
                    /** Performs the calculation in order to subtract the fees from the total amount */
                    vlNeto = Utils.subtrair(vlNeto, vlNetoTaxa);
                }
                
                tarifa = new WSTarifa();
                tarifa.setSgMoeda(sgMoeda);
                tarifa.setSgMoedaNeto(sgMoeda);
                tarifa.setVlNeto(vlNeto);
                tarifa.setDsTarifa(descriptionRate(integrador, vehAvailInfo));
                tarifa.setTarifaAdicionalList(tarifaAdicionalList);
            }
            
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleRate", WSMensagemErroEnum.SDI,
                        "Não foi possível montar a tarifa para o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return tarifa;
    }

    private String descriptionRate(WSIntegrador integrador, VehicleAvailAdditionalInfoType vehAvailInfo){
        String description = "";
        try {
            if(vehAvailInfo != null && vehAvailInfo.getPricedCoverages() != null && !Utils.isListNothing(vehAvailInfo.getPricedCoverages().getPricedCoverage())){
                for(CoveragePricedType coverage : vehAvailInfo.getPricedCoverages().getPricedCoverage()){
                    if(coverage.isRequired()){
                        /** Assemble the fare description that is classified as required */
                        for(CoverageDetailsType detail : coverage.getCoverage().getDetails()){
                            if(detail.getCoverageTextType().equals(CoverageTextType.SUPPLEMENT)){
                                description += "<b>" + detail.getValue() + "</b> </br>";
                            } else if(detail.getCoverageTextType().equals(CoverageTextType.DESCRIPTION)){
                                description += detail.getValue() + "</br> </br>";
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "descriptionRate", WSMensagemErroEnum.SDI,
                        "Não foi possível verificar a descrição da tarifa. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return description;
    }

    private WSVeiculoLocadora assembleRentalCompany() {
        WSVeiculoLocadora locadora = new WSVeiculoLocadora();
        locadora.setCdLocadora("UN");
        locadora.setNmLocadora("UNIDAS");
        locadora.setTerminal(Boolean.FALSE);
        
        return locadora;
    }
    
    private WSDisponibilidadeVeiculoRS builderDisponibilidadeVeiculoRS(WSIntegrador integrador, List<WSVeiculoPesquisa> searchVehiclesList) {
        WSDisponibilidadeVeiculoRS disponibilidadeVeiculoRS = null;
        if(!Utils.isListNothing(searchVehiclesList)){
            disponibilidadeVeiculoRS = new WSDisponibilidadeVeiculoRS(searchVehiclesList, integrador, WSIntegracaoStatusEnum.OK);
        } else {
            disponibilidadeVeiculoRS = new WSDisponibilidadeVeiculoRS(null, integrador, WSIntegracaoStatusEnum.NEGADO);
        }
        
        return disponibilidadeVeiculoRS;
    }
}
