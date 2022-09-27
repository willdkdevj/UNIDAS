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
import br.com.infotera.unidas.service.ReservarCarWS;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ApiController {

//    @Autowired
//    private CancelarCarWS cancelarWS;
//    @Autowired
//    private ConsultarCarWS consultarWS;
//    @Autowired
//    private PreReservarCarWS preReservarWS;
    @Autowired
    private ReservarCarWS reservarWS;
    @Autowired
//    private TarifarCarWS tarifarWS;
//    @Autowired
//    private PreCancelarCarWS preCancelarWS;
//    @Autowired
    private Gson gson;
//
//    private static Logger logger;
//
//    static {
//        try {
//            logger = Logger.getLogger(ApiController.class.getName());
//        } catch (Exception e) {
//            e.printStackTrace(System.err);
//        }
//    }
//
//    @RequestMapping(value = "ola", method = RequestMethod.GET)
//    public String helloWorld() {
//        return "Hello World Amadeus Car";
//    }
//
//    @RequestMapping(value = "tarifar", method = RequestMethod.POST)
//    public String tarifar(@RequestBody String jsonRQ) {
//        WSTarifarServicoRS result = null;
//        WSTarifarServicoRQ wsRQ = gson.fromJson(jsonRQ, WSTarifarServicoRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("tarifar");
//        try {
//            result = tarifarWS.tarifar(wsRQ);
//        } catch (ErrorException ex) {
//            result = new WSTarifarServicoRS(null, ex.getIntegrador());
//        } catch (Exception ex) {
//            result = new WSTarifarServicoRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "tarifar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false).getIntegrador());
//        } finally {
//            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
//        }
//        return gson.toJson(result);
//    }
//
//    @RequestMapping(value = "preReservar", method = RequestMethod.POST)
//    public String preReservar(@RequestBody String jsonRQ) {
//        WSPreReservarRS result = null;
//        WSPreReservarRQ wsRQ = gson.fromJson(jsonRQ, WSPreReservarRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("preReservar");
//        try {
//            result = preReservarWS.preReservar(wsRQ);
//        } catch (ErrorException ex) {
//            result = new WSPreReservarRS(null, ex.getIntegrador());
//        } catch (Exception ex) {
//            result = new WSPreReservarRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "preReservar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
//        } finally {
//            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
//        }
//        return gson.toJson(result);
//    }

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

//    @RequestMapping(value = "confirmar", method = RequestMethod.POST)
//    public String confirmar(@RequestBody String jsonRQ) {
//        WSReservaRS result = null;
//        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("confirmar");
//        try {
//            result = confirmarWS.confirmar(wsRQ);
//        } catch (ErrorException ex) {
//            result = new WSReservaRS(null, ex.getIntegrador());
//        } catch (Exception ex) {
//            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "confirmar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex).getIntegrador());
//        } finally {
//            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
//        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates;
//    }
//
//    @RequestMapping(value = "consultar", method = RequestMethod.POST)
//    public String consulta(@RequestBody String jsonRQ) {
//        WSReservaRS result = null;
//        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("consultar");
//        try {
//            result = consultarWS.consulta(wsRQ);
//        } catch (ErrorException ex) {
//            result = new WSReservaRS(null, ex.getIntegrador());
//        } catch (Exception ex) {
//            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "consultar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false).getIntegrador());
//        } finally {
//            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
//        }
//        return gson.toJson(result);
//    }
//
//    @RequestMapping(value = "preCancelar", method = RequestMethod.POST)
//    public String preCancelar(@RequestBody String jsonRQ) {
//        WSReservaRS result = null;
//        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("preCancelar");
//        try {
//            result = preCancelarWS.preCancelar(wsRQ);
//        } catch (Exception ex) {
//            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "preCancelar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
//        }
//        return gson.toJson(result);
//    }
//
//    @RequestMapping(value = "cancelar", method = RequestMethod.POST)
//    public String cancelar(@RequestBody String jsonRQ) {
//        WSReservaRS result = null;
//        WSReservaRQ wsRQ = gson.fromJson(jsonRQ, WSReservaRQ.class);
//        wsRQ.getIntegrador().setDsMetodo("cancelar");
//        try {
//            result = cancelarWS.cancelar(wsRQ);
//        } catch (ErrorException ex) {
//            result = new WSReservaRS(null, ex.getIntegrador());
//        } catch (Exception ex) {
//            result = new WSReservaRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "cancelar", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
//        } finally {
//            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
//        }
//        return gson.toJson(result);
//    }


}
