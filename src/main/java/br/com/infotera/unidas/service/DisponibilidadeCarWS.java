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
import br.com.infotera.unidas.model.gen.opentravel.InventoryStatusType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRSCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailVendorInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleLocationDetailsType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleVendorAvailabilityType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleVendorAvailabilityType.VehAvails.VehAvail;
import br.com.infotera.unidas.service.interfaces.BuilderInput;
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
    @Autowired
    private BuilderInput builderIn;

    public WSDisponibilidadeVeiculoRS availability(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        /** Checks vendor business rules */
        request.validateBusinessRules(disponibilidadeVeiculoRQ);
        /** Assemble requisition for call to analyze its availability */
        OtaVehAvailRate carAvailability = request.builderOTAVehAvailRateRequest(disponibilidadeVeiculoRQ);
        /** Get response object from the vendor according to parameters sent by the request */
        OtaVehAvailRateResponse  otaVehAvailRateResponse = unidasClient.callOTAVehAvailRate(disponibilidadeVeiculoRQ.getIntegrador(), carAvailability);
        /** Assembles list of research vehicles */
        List<WSVeiculoPesquisa> searchVehiclesList = assembleSearchVehiclesList(disponibilidadeVeiculoRQ, otaVehAvailRateResponse);

        return builderDisponibilidadeVeiculoRS(disponibilidadeVeiculoRQ.getIntegrador(), searchVehiclesList);
    }

    private List<WSVeiculoPesquisa> assembleSearchVehiclesList(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ, OtaVehAvailRateResponse otaVehAvailRateResponse) throws ErrorException {
        List<WSVeiculoPesquisa> veiculoPesquisaList = null;
        WSIntegrador integrador = disponibilidadeVeiculoRQ.getIntegrador();
        
        try {
            if(otaVehAvailRateResponse != null && otaVehAvailRateResponse.getOtaVehAvailRateResult() != null && !Utils.isListNothing(otaVehAvailRateResponse.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore())) {
                /** Converts to vehicleAvailCore list to get the vehicles available from the vendor */
                List<VehicleAvailRSCoreType> vehicleAvailCoreList = request.checkAvailityReturn(integrador, otaVehAvailRateResponse.getOtaVehAvailRateResult().getErrorsOrSuccessOrVehAvailRSCore());
                
                if(!Utils.isListNothing(vehicleAvailCoreList)){
                    for(VehicleAvailRSCoreType vehicleAvailCore : vehicleAvailCoreList){
                        /** Pick-up and return dates */
                        Date dtRetirada = vehicleAvailCore.getVehRentalCore().getPickUpDateTime().toGregorianCalendar().getTime();
                        Date dtDevolucao = vehicleAvailCore.getVehRentalCore().getReturnDateTime().toGregorianCalendar().getTime();
                        
                        /** Checks the list of available vehicles and their details */
                        if(vehicleAvailCore.getVehVendorAvails() != null && !Utils.isListNothing(vehicleAvailCore.getVehVendorAvails().getVehVendorAvail())){
                            
                            /** Checks the availability of the vehicles */
                            Integer ind = 0;
                            veiculoPesquisaList = new ArrayList();
                            List<WSVeiculo> veiculoList = null; 
                            for(VehicleVendorAvailabilityType vehVendorAvail : vehicleAvailCore.getVehVendorAvails().getVehVendorAvail()){
                                
                                /** Checks the vehicle pickup and return location */
                                List<WSVeiculoLocal> veiculoLocalList = assembleDestinationRental(integrador, 
                                        vehVendorAvail.getInfo());
                                
                                WSVeiculo veiculo = null;
                                for(VehAvail vehAvail : vehVendorAvail.getVehAvails().getVehAvail()){
                                    if(vehAvail.getVehAvailCore() != null && vehAvail.getVehAvailCore().getStatus().equals(InventoryStatusType.AVAILABLE)){
                                        /** Assemble list with details about the vehicle */
                                        List<WSVeiculoDetalhe> veiculoDetalheList = builderIn.assembleDetailsVehicle(integrador, 
                                                vehAvail.getVehAvailCore().getVehicle(), 
                                                vehAvail.getVehAvailCore().getRentalRate().stream().findFirst().get().getRateDistance());
                                        
                                        /** Assembles media list about the vehicle */
                                        List<WSMedia> mediaList = builderIn.assembleMediaList(integrador, 
                                                vehAvail.getVehAvailCore().getVehicle());        
                                        
                                        /** Sets up the rate and possible fees applied to the rental */
                                        WSTarifa tarifa = builderIn.assembleRate(integrador, 
                                                vehAvail.getVehAvailCore().getTotalCharge(), 
                                                vehAvail.getVehAvailCore().getFees());
                                        
                                        tarifa.setDsTarifa(descriptionRate(integrador, vehAvail.getVehAvailInfo()));
                                        
                                        /** Set up Rental Object UNIDAS */
                                        WSVeiculoLocadora locadora = builderIn.assembleRentalCompany();
                                        
                                        veiculo = new WSVeiculo();
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
                                        veiculo.setStDisponivel(Boolean.TRUE);
                                        veiculo.setTarifaOpcionalList(Arrays.asList(tarifa));
                                        
                                        veiculoList = Arrays.asList(veiculo);
                                        /** Assemble Vehicle Search List */
                                        veiculoPesquisaList.add(new WSVeiculoPesquisa(++ind, veiculoList, null));
                                    }
                                }
                            }
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
        } catch (ErrorException ex) {
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
                        veiculoLocal.setDsEndereco(address != null && addressLocal.getStreetNmbr() != null ? address + ", " + addressLocal.getStreetNmbr() : address);
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

    private String descriptionRate(WSIntegrador integrador, VehicleAvailAdditionalInfoType vehAvailInfo){
        String description = "";
        try {
            if(vehAvailInfo != null && vehAvailInfo.getPricedCoverages() != null && !Utils.isListNothing(vehAvailInfo.getPricedCoverages().getPricedCoverage())){
                for(CoveragePricedType coverage : vehAvailInfo.getPricedCoverages().getPricedCoverage()){
                    if(coverage.isRequired()){
                        /** Assemble the fare description that is classified as required */
                        for(CoverageDetailsType detail : coverage.getCoverage().getDetails()){
                            if(detail.getCoverageTextType().equals(CoverageTextType.SUPPLEMENT)){
                                description += detail.getValue() + "<br />";
                            } else if(detail.getCoverageTextType().equals(CoverageTextType.DESCRIPTION)){
                                description += detail.getValue() + "<br /> <br />";
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
