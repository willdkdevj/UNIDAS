package br.com.infotera.unidas.service;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    protected ConsultarCarWS consultar;
    
    public WSReservaRS preCancel(WSReservaRQ reservaRQ) throws ErrorException {
        /** Queries the input to check its status */
        return consultar.check(reservaRQ, Boolean.TRUE);
    }
}
