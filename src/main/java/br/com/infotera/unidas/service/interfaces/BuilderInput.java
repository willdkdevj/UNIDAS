/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSTarifa;
import br.com.infotera.common.media.WSMedia;
import br.com.infotera.common.servico.WSVeiculoDetalhe;
import br.com.infotera.common.servico.WSVeiculoLocadora;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleChargePurposeType1;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalRateType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleType;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Interface with helper methods for assembling requests to the partner webservice
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface BuilderInput {
    
    List<WSVeiculoDetalhe> assembleDetailsVehicle(WSIntegrador integrador, VehicleType vehicle, List<VehicleRentalRateType.RateDistance> rateDistances) throws ErrorException;
    
    List<WSMedia> assembleMediaList(WSIntegrador integrador,  VehicleType vehicle);
    
    WSTarifa assembleRate(WSIntegrador integrador, List<?> totalCharges, ArrayOfVehicleChargePurposeType1 fees);
    
    WSVeiculoLocadora assembleRentalCompany();
}
