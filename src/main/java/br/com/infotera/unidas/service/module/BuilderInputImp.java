/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSTarifa;
import br.com.infotera.common.WSTarifaAdicional;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMediaCategoriaEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSTarifaAdicionalTipoEnum;
import br.com.infotera.common.enumerator.WSVeiculoDetalheEnum;
import br.com.infotera.common.media.WSMedia;
import br.com.infotera.common.servico.WSVeiculoDetalhe;
import br.com.infotera.common.servico.WSVeiculoLocadora;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleChargePurposeType1;
import br.com.infotera.unidas.model.gen.opentravel.DistanceUnitNameType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleChargePurposeType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalRateType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalRateType.RateDistance;
import br.com.infotera.unidas.model.gen.opentravel.VehicleReservationType.VehSegmentCore;
import br.com.infotera.unidas.model.gen.opentravel.VehicleType;
import br.com.infotera.unidas.service.DisponibilidadeCarWS;
import br.com.infotera.unidas.service.interfaces.BuilderInput;
import br.com.infotera.unidas.util.SupplierBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 * Helper class that contains the methods that return objects common to requests made to the partner webservice
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class BuilderInputImp implements BuilderInput {

    @Override
    public List<WSMedia> assembleMediaList(WSIntegrador integrador, VehicleType vehicle) {
        List<WSMedia> mediaList = null;
        try {
            /** List populated with a WSMedia object because it returns only one parameter */
            mediaList = new ArrayList();
            if(vehicle != null && vehicle.getPictureURL() != null) {
                mediaList = Arrays.asList(new WSMedia(WSMediaCategoriaEnum.VEICULO, vehicle.getPictureURL()));
            }
        } catch (Exception ex) {
            try {
                throw new ErrorException(integrador, BuilderInputImp.class, "assembleMediaList", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível obter a lista de mídias sobre o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return mediaList;
    }

    @Override
    public WSVeiculoLocadora assembleRentalCompany() {
        WSVeiculoLocadora locadora = new WSVeiculoLocadora();
        locadora.setCdLocadora("UN");
        locadora.setNmLocadora("UNIDAS");
        locadora.setTerminal(Boolean.FALSE);
        
        return locadora;
    }

    @Override
    public List<WSVeiculoDetalhe> assembleDetailsVehicle(WSIntegrador integrador, VehicleType vehicle, List<RateDistance> rateDistances) throws ErrorException {
        List<WSVeiculoDetalhe> veiculoDetalheList = null;
        try {
            if(vehicle != null){
                veiculoDetalheList = new ArrayList();
                
                /** Checks the code for the vehicle category */
                WSVeiculoDetalhe veiculoCategoria = new WSVeiculoDetalhe();
                veiculoCategoria.setDetalheEnum(WSVeiculoDetalheEnum.CATEGORIA);
                veiculoCategoria.setNmDetalhe(vehicle.getCode() != null ? SupplierBase.loadingClassVehicle().get(vehicle.getCode()) : "Não informada");
                veiculoDetalheList.add(veiculoCategoria);
                
                /** Checks for air conditioning */
                WSVeiculoDetalhe veiculoAr = new WSVeiculoDetalhe();
                veiculoAr.setDetalheEnum(WSVeiculoDetalheEnum.AR_CONDICIONADO);
                veiculoAr.setNmDetalhe(vehicle.isAirConditionInd() ? "Ar condicionado" : "Sem ar condicionado");
                veiculoDetalheList.add(veiculoAr);
                                        
                /** Checks the vehicle's transmission type */
                WSVeiculoDetalhe veiculoTransmissao = new WSVeiculoDetalhe();
                veiculoTransmissao.setDetalheEnum(WSVeiculoDetalheEnum.TRANSMISSAO);
                veiculoTransmissao.setNmDetalhe(vehicle.getTransmissionType().MANUAL.name().toUpperCase().equals("MANUAL") ? vehicle.getTransmissionType().MANUAL.value() : vehicle.getTransmissionType().AUTOMATIC.value());
                veiculoDetalheList.add(veiculoTransmissao);
                
                /** Checks the vehicle's passenger limit */
                WSVeiculoDetalhe veiculoQtdPass = new WSVeiculoDetalhe();
                veiculoQtdPass.setDetalheEnum(WSVeiculoDetalheEnum.QT_PASSAGEIRO);
                veiculoQtdPass.setNmDetalhe(vehicle.getPassengerQuantity() != null ? vehicle.getPassengerQuantity() : "Não informada");
                veiculoDetalheList.add(veiculoQtdPass);
                
                /** Checks the number of doors on the vehicle */
                WSVeiculoDetalhe veiculoQtdPortas = new WSVeiculoDetalhe();
                veiculoQtdPortas.setDetalheEnum(WSVeiculoDetalheEnum.QT_PORTAS);
                veiculoQtdPortas.setNmDetalhe(vehicle.getVehType() != null && vehicle.getVehType().getDoorCount() != null ? vehicle.getVehType().getDoorCount() : "Não Informado");
                veiculoDetalheList.add(veiculoQtdPortas);
                
                /** Checks the quantity of baggege on the vehicle */
                WSVeiculoDetalhe veiculoQtdBagagem = new WSVeiculoDetalhe();
                veiculoQtdBagagem.setDetalheEnum(WSVeiculoDetalheEnum.QT_BAGAGEM);
                veiculoQtdBagagem.setNmDetalhe(vehicle.getBaggageQuantity() != null ? vehicle.getBaggageQuantity().toString() : "Não informada");
                veiculoDetalheList.add(veiculoQtdBagagem);
                
                /** Checks the vehicle's Mileage Limit */
                VehicleRentalRateType.RateDistance rateDistance = rateDistances.stream().findFirst().orElse(null);
                if(rateDistance != null){
                    WSVeiculoDetalhe veiculoKm = new WSVeiculoDetalhe();
                    veiculoKm.setDetalheEnum(WSVeiculoDetalheEnum.KILOMETRAGEM);
                    veiculoKm.setNmDetalhe(rateDistance.isUnlimited() ? "Unlimited" : rateDistance.getDistUnitName().KM.equals(DistanceUnitNameType.KM) && rateDistance.getQuantity() != null ? rateDistance.getQuantity().toString() : "Não informada");
                    veiculoDetalheList.add(veiculoKm);
                }
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, BuilderInputImp.class, "assembleDetailsVehicle", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível obter os detalhes para o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return veiculoDetalheList;
    }

    @Override
    public WSTarifa assembleRate(WSIntegrador integrador, List<?> totalCharges, ArrayOfVehicleChargePurposeType1 fees) {
        WSTarifa tarifa = null;
        
        try {
            if(!Utils.isListNothing(totalCharges)){
                String sgMoeda = null;
                Double vlNeto = 0.0d;
                
                VehicleAvailCoreType.TotalCharge vehAvailTotalCharge = null;
                VehSegmentCore.TotalCharge vehRetrieveTotalCharge = null;
                if(!Utils.isListNothing(totalCharges)){
                    for(Object obj : totalCharges){
                        if(obj instanceof VehicleAvailCoreType.TotalCharge){
                            vehAvailTotalCharge = (VehicleAvailCoreType.TotalCharge) obj;

                            /** Gets the value for the rental rate */
                            sgMoeda = vehAvailTotalCharge.getCurrencyCode();
                            vlNeto = Utils.somar(vlNeto, vehAvailTotalCharge.getEstimatedTotalAmount().doubleValue());
                        
                        } else if(obj instanceof VehSegmentCore.TotalCharge){
                            vehRetrieveTotalCharge = (VehSegmentCore.TotalCharge) obj;

                            /** Gets the value for the rental rate */
                            sgMoeda = integrador.getSgMoeda() != null ? integrador.getSgMoeda() : "BRL";
                            vlNeto = Utils.somar(vlNeto, vehRetrieveTotalCharge.getEstimatedTotalAmount().doubleValue());
                        }
                    }
                } else {
                    throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleRate", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível determinar o objeto de Tarifa. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
                }
                
                /** Checks for service charges for the tariff */
                List<WSTarifaAdicional> tarifaAdicionalList = null;
                if(!Utils.isListNothing(fees.getFee())){
                    String sgMoedaTaxa = null;
                    Double vlNetoTaxa = 0.0d;
                    
                    tarifaAdicionalList = new ArrayList();
                    for(VehicleChargePurposeType fee : fees.getFee()){
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
                tarifa.setTarifaAdicionalList(tarifaAdicionalList);
            }
            
        } catch (ErrorException ex) {
            try {
                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "assembleRate", WSMensagemErroEnum.SDI,
                        "Não foi possível montar a tarifa para o veículo. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(DisponibilidadeCarWS.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return tarifa;
    }
    
}
