/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import org.springframework.stereotype.Service;


@Service
public class PreReservarCarWS {

    public WSPreReservarRS preReservar(WSPreReservarRQ preReservarRQ) throws ErrorException {

        return new WSPreReservarRS(preReservarRQ.getReserva(), preReservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

}
