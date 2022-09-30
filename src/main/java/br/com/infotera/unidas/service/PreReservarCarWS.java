package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.WSDocumentoTipoEnum;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSPaxTipoEnum;
import br.com.infotera.common.util.Utils;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Class responsible for obtaining passenger data in order to secure the reservation of the vehicle (PreBooking)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class PreReservarCarWS {

    public WSPreReservarRS preBooking(WSPreReservarRQ preReservarRQ) throws ErrorException {
        /** Update the service reservation (WSVeiculo) in order to apply the passenger document requirement */
        WSReservaServico reservaServico = applyCompulsoryCPF(preReservarRQ);
        
        return new WSPreReservarRS(new WSReserva(Arrays.asList(reservaServico)), preReservarRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }
    
    private WSReservaServico applyCompulsoryCPF(WSPreReservarRQ preReservarRQ) throws ErrorException{
        /** Checks the existence of the service reservation presented by Infotravel */
        WSReservaServico reservaServico = preReservarRQ.getReserva().getReservaServicoList().stream()
                .findFirst()
                .orElseThrow(() -> new ErrorException(preReservarRQ.getIntegrador(), PreReservarCarWS.class, "applyCompulsoryCPF", WSMensagemErroEnum.SPR, 
                "Não foi possível a reserva do serviço (WSReservaServico). Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
        
        if (!Utils.isListNothing(reservaServico.getServico().getReservaNomeList())) {
            Boolean isFirst = Boolean.TRUE;
            for(WSReservaNome reservaNome : reservaServico.getServico().getReservaNomeList()) {
                if(isFirst){
                    reservaNome.setDocumento(new WSDocumento(WSDocumentoTipoEnum.CPF, Boolean.TRUE));
                    isFirst = Boolean.FALSE;
                }
            }
        } else {
            /** Created instance of Pax (Default) for the reservation */
            WSReservaNome reservaNomePadrao = new WSReservaNome();
            reservaNomePadrao.setPaxTipo(WSPaxTipoEnum.ADT);
            reservaNomePadrao.setQtIdade(30);
            reservaNomePadrao.setDocumento(new WSDocumento(WSDocumentoTipoEnum.CPF, Boolean.TRUE));
            reservaNomePadrao.setStPrincipal(Boolean.TRUE);
            reservaNomePadrao.setStSelecionado(Boolean.FALSE);
            reservaNomePadrao.setStAplicado(Boolean.FALSE);

            reservaServico.getServico().setReservaNomeList(Arrays.asList(reservaNomePadrao));
        }
        /** Inserted the list with customer implementation information (WSInfoAdicional) */
        reservaServico.getServico().setInfoAdicionalList(assembleInfoAdditionalList());
        
        return reservaServico;
    }
    
    private List<WSInfoAdicional> assembleInfoAdditionalList() {
        return Arrays.asList(new WSInfoAdicional("EMAIL", "Email", "Informar o email principal do condutor", null, null, Boolean.TRUE, "email"),
                             new WSInfoAdicional("CELULAR", "Celular", "Informar o celular principal do condutor", null, null, Boolean.TRUE, "55 99 99999999?9"));
    }

}
