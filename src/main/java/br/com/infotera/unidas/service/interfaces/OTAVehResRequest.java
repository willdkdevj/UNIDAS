/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import org.springframework.stereotype.Component;

/**
 * Interface with the methods for assembling requisitions OTAVehRes
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface OTAVehResRequest {
    
    OtaVehRes builderOTAVehResRequest(WSReservarRQ reservarRQ) throws ErrorException;
}
