/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.WSDocumentoTipoEnum;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSPaxTipoEnum;
import br.com.infotera.common.util.Utils;
import java.util.Arrays;
import org.springframework.stereotype.Service;


@Service
public class PreReservarCarWS {

    public WSPreReservarRS preReservar(WSPreReservarRQ preReservarRQ) throws ErrorException {
        
        WSReservaServico reservaServico = applyCompulsoryCPF(preReservarRQ);
        
        return new WSPreReservarRS(new WSReserva(Arrays.asList(reservaServico)), preReservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }
    
    private WSReservaServico applyCompulsoryCPF(WSPreReservarRQ preReservarRQ) throws ErrorException{
        
        WSReservaServico reservaServico = preReservarRQ.getReserva().getReservaServicoList().stream()
                .findFirst()
                .orElseThrow(() -> new ErrorException(preReservarRQ.getIntegrador(), PreReservarCarWS.class, "applyCompulsoryCPF", WSMensagemErroEnum.SPR, 
                "Não foi possível a reserva do serviço (WSReservaServico). Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
        
        if (!Utils.isListNothing(reservaServico.getServico().getReservaNomeList())) {
            Boolean isFirst = true;
            for(WSReservaNome reservaNome : reservaServico.getServico().getReservaNomeList()) {
                if(isFirst){
                    reservaNome.setDocumento(new WSDocumento(WSDocumentoTipoEnum.CPF, Boolean.TRUE));
                    isFirst = false;
                }
            }
        } else {
            WSReservaNome reservaNomePadrao = new WSReservaNome();
            reservaNomePadrao.setPaxTipo(WSPaxTipoEnum.ADT);
            reservaNomePadrao.setQtIdade(30);
            reservaNomePadrao.setDocumento(new WSDocumento(WSDocumentoTipoEnum.CPF, Boolean.TRUE));
            reservaNomePadrao.setStPrincipal(Boolean.TRUE);
            reservaNomePadrao.setStSelecionado(Boolean.FALSE);
            reservaNomePadrao.setStAplicado(Boolean.FALSE);

            reservaServico.getServico().setReservaNomeList(Arrays.asList(reservaNomePadrao));
        }
        
        return reservaServico;
    }

}
