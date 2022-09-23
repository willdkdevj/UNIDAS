/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.WSDocumentoTipoEnum;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSPaxTipoEnum;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRQ;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PreReservarCarWS {

//    @Autowired
//    private TarifarCarWS tarifar;
//
//    public WSPreReservarRS preReservar(WSPreReservarRQ preReservarRQ) throws ErrorException {
//
//        WSTarifarServicoRQ tarifarServicoRQ = new WSTarifarServicoRQ(preReservarRQ.getIntegrador(), preReservarRQ.getReserva().getReservaServicoList().get(0));
//        WSTarifarServicoRS tarifarServicoRS = tarifar.tarifar(tarifarServicoRQ);
//
//        obrigarCPFMovida(tarifarServicoRS);
//        return new WSPreReservarRS(new WSReserva(tarifarServicoRS.getReservaServico()), preReservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
//
//    private void obrigarCPFMovida(WSTarifarServicoRS tarifarServicoRS) {
//        WSReservaServico reservaServico = tarifarServicoRS.getReservaServico();
//        // TKT 30008 - Envia o DOC (CPF) caso seja especifado na reserva (Movida Exige) será analisada a descrição do serviço - Verificar o retorno de WSLocadora no objeto de retorno (RS)
//        if (reservaServico.getServico().getReservaNomeList() != null && !reservaServico.getServico().getReservaNomeList().isEmpty()) {
//            if (reservaServico.getServico().getReservaNomeList().get(0).getDocumento() == null) {
//                reservaServico.getServico().getReservaNomeList().get(0).setDocumento(new WSDocumento(null, false));
//            } else {
//                reservaServico.getServico().getReservaNomeList().get(0).getDocumento().setStObrigatorio(false);
//            }
//            if (reservaServico.getServico().getNmServico().contains("MOVIDA")) {
//                reservaServico.getServico().getReservaNomeList().get(0).getDocumento().setStObrigatorio(true);
//                reservaServico.getServico().getReservaNomeList().get(0).getDocumento().setDocumentoTipo(WSDocumentoTipoEnum.CPF);
//            }
//        } else {
//            WSReservaNome reservaNomePadrao = new WSReservaNome();
//            reservaNomePadrao.setPaxTipo(WSPaxTipoEnum.ADT);
//            reservaNomePadrao.setQtIdade(30);
//            reservaNomePadrao.setDocumento(new WSDocumento(null, false));
//            reservaNomePadrao.setStPrincipal(false);
//            reservaNomePadrao.setStSelecionado(false);
//            reservaNomePadrao.setStAplicado(false);
//
//            reservaServico.getServico().setReservaNomeList(Arrays.asList(reservaNomePadrao));
//        }
//
//    }

}
