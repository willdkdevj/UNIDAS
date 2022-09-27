/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import org.springframework.stereotype.Component;

/**
 * Interface with the methods for assembling requisitions OTAVehAvailRate
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface OTAVehAvailRequest {
    
    OtaVehAvailRate builderOTAVehAvailRateRequest(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException;
    
    void validateBusinessRules(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ);
}
