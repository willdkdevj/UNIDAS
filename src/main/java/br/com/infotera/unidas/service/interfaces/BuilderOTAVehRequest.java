/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSContato;
import br.com.infotera.common.WSInfoAdicional;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaNome;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.opentravel.CustomerPrimaryAdditionalType;
import br.com.infotera.unidas.model.gen.opentravel.VehiclePrefType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import java.util.Date;
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
public interface BuilderOTAVehRequest {
    
    ArrayOfSourceType setUpPos(WSIntegrador integrador) throws ErrorException;

    VehicleRentalCoreType setUpVehRentalCore(WSIntegrador integrador, Date dtRetirada, Date dtDevolucao, String cdRetirada, String cdDevolucao) throws ErrorException;
    
    CustomerPrimaryAdditionalType setUpCustomer(WSIntegrador integrador, WSContato contato, List<WSReservaNome> reservaNomeList, List<WSInfoAdicional> infoAdicionalList);
    
    VehiclePrefType setUpVehPref(WSIntegrador integrador, WSVeiculo veiculo);
}
