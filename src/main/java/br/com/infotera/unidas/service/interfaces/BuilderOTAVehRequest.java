/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author William Dias
 */
@Component
public interface BuilderOTAVehRequest {
    
    ArrayOfSourceType setUpPos(WSIntegrador integrador) throws ErrorException;
    
    VehicleRentalCoreType setUpVehRentalCore(WSIntegrador integrador, Date dtRetirada, Date dtDevolucao, String cdRetirada, String cdDevolucao) throws ErrorException;
}
