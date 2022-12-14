package br.com.infotera.unidas.controller;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSPreReservarRQ;
import br.com.infotera.common.WSPreReservarRS;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.common.reserva.rqrs.WSReservaRS;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.reserva.rqrs.WSReservarRS;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRQ;
import br.com.infotera.common.servico.rqrs.WSTarifarServicoRS;
import br.com.infotera.common.util.LogWS;
import br.com.infotera.unidas.service.CancelarCarWS;
import br.com.infotera.unidas.service.ConsultarCarWS;
import br.com.infotera.unidas.service.PreCancelarCarWS;
import br.com.infotera.unidas.service.PreReservarCarWS;
import br.com.infotera.unidas.service.ReservarCarWS;
import br.com.infotera.unidas.service.TarifarCarWS;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Class responsible for allocating the API Service methods to communicate with the Legacy System
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 * 
 * @see - preReservar - performs validation of the guests to be tied to the reservation
 * @see - reservar - analyzes the reservation status and applies the locator to it
 * @see - consultar - checks the reserve status and updates the status and policies for the reserve
 * @see - preCancelar - check the status of the reservation before proceeding with the cancellation
 * @see - cancelar - checks the status of the reservation to make the cancellation request
 * @see - pesquisaHotel - search the supplier for the hotel by its ID
 * @see - detalheHotel - fetches details about the hotel to apply to the data returned to the host system
 * @see - relatorio - checks the periodicity applied to fetch the reservations made at the service provider
 * 
 */
@RestController
public class ApiController {

    @Autowired
    private CancelarCarWS cancelarWS;
    @Autowired
    private ConsultarCarWS consultarWS;
    @Autowired
    private PreReservarCarWS preReservarWS;
    @Autowired
    private ReservarCarWS reservarWS;
    @Autowired
    private TarifarCarWS tarifarWS;
    @Autowired
    private PreCancelarCarWS preCancelarWS;
    @Autowired
    private Gson gson;

    private static Logger logger;
    static {
        try {
            logger = Logger.getLogger(ApiController.class.getName());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    @RequestMapping(value = "tarifar", method = RequestMethod.POST)
    public String tarifar(@RequestBody String jsonRQ) {
        WSTarifarServicoRS result = null;
        WSTarifarServicoRQ wsRQ = gson.fromJson(jsonRQ, WSTarifarServicoRQ.class);
        wsRQ.getIntegrador().setDsMetodo("tarifar");
        try {
            result = tarifarWS.rate(wsRQ);
        } catch (ErrorException ex) {
            result = new WSTarifarServicoRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSTarifarServicoRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "tarifar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false).getIntegrador());
        } finally {
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }

    @RequestMapping(value = "preReservar", method = RequestMethod.POST)
    public String preReservar(@RequestBody String jsonRQ) {
        WSPreReservarRS result = null;
        WSPreReservarRQ wsRQ = gson.fromJson(jsonRQ, WSPreReservarRQ.class);
        wsRQ.getIntegrador().setDsMetodo("preReservar");
        try {
            result = preReservarWS.preBooking(wsRQ);
        } catch (ErrorException ex) {
            result = new WSPreReservarRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSPreReservarRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "preReservar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
        } finally {
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }

    @RequestMapping(value = "reservar", method = RequestMethod.POST)
    public String reservar(@RequestBody String jsonRQ) {
        WSReservarRS result = null;
        WSReservarRQ wsRQ = gson.fromJson(jsonRQ, WSReservarRQ.class);
        wsRQ.getIntegrador().setDsMetodo("reservar");
        try {
            result = reservarWS.book(wsRQ);
        } catch (ErrorException ex) {
            result = new WSReservarRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSReservarRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "reservar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false).getIntegrador());
        } finally {
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }

    @RequestMapping(value = "consultar", method = RequestMethod.POST)
    public String consulta(@RequestBody String jsonRQ) {
        WSReservaRS result = null;
        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
        wsRQ.getIntegrador().setDsMetodo("consultar");
        try {
            result = consultarWS.check(wsRQ);
        } catch (ErrorException ex) {
            result = new WSReservaRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "consultar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false).getIntegrador());
        } finally {
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }

    @RequestMapping(value = "preCancelar", method = RequestMethod.POST)
    public String preCancelar(@RequestBody String jsonRQ) {
        WSReservaRS result = null;
        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
        wsRQ.getIntegrador().setDsMetodo("preCancelar");
        try {
            result = preCancelarWS.preCancel(wsRQ);
        } catch (ErrorException ex) {
            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "preCancelar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
        }
        return gson.toJson(result);
    }

    @RequestMapping(value = "cancelar", method = RequestMethod.POST)
    public String cancelar(@RequestBody String jsonRQ) {
        WSReservaRS result = null;
        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
        wsRQ.getIntegrador().setDsMetodo("cancelar");
        try {
            result = cancelarWS.cancel(wsRQ);
        } catch (ErrorException ex) {
            result = new WSReservaRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "cancelar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
        } finally {
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }
}
