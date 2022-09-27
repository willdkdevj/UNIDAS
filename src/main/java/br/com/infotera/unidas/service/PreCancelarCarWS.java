package br.com.infotera.unidas.service;

import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import org.springframework.stereotype.Service;

/**
 * SpringBoot default configuration class
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class PreCancelarCarWS {

    public WSReservaRS preCancelar(WSReservaRQ reservaRQ) {
        return new WSReservaRS(reservaRQ.getReserva(), reservaRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
    }
}
