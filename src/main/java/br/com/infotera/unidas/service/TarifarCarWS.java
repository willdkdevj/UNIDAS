/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRQ;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRS;
import org.springframework.stereotype.Service;


/**
 * Class to check rate change between availability and pre-booking process
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class TarifarCarWS {

    public WSTarifarServicoRS rate(WSTarifarServicoRQ tarifarServicoRQ) throws ErrorException {
        return new WSTarifarServicoRS(tarifarServicoRQ.getReservaServico(), tarifarServicoRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }

}
