package br.com.infotera.unidas.controller;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegradorLog;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRS;
import br.com.infotera.common.util.LogWS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.service.DisponibilidadeCarWS;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class DisponibilidadeController {

    @Autowired
    private DisponibilidadeCarWS disponibilidadeWS;
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

    @RequestMapping(value = "disponibilidadeVeiculo", method = RequestMethod.POST)
    public String disponibilidade(@RequestBody String jsonRQ) {
        WSDisponibilidadeVeiculoRS result = null;
        WSDisponibilidadeVeiculoRQ wsRQ = gson.fromJson(jsonRQ, WSDisponibilidadeVeiculoRQ.class);
        wsRQ.getIntegrador().setDsMetodo("disponibilidade");
        Long tempoInicio = System.currentTimeMillis();
        try {
            result = disponibilidadeWS.availability(wsRQ);
        } catch (ErrorException ex) {
            result = new WSDisponibilidadeVeiculoRS(null, ex.getIntegrador());
        } catch (Exception ex) {
            result = new WSDisponibilidadeVeiculoRS(null, new ErrorException(wsRQ.getIntegrador(), ApiController.class, "disponibilidade", WSMensagemErroEnum.GENNULO, "", WSIntegracaoStatusEnum.NEGADO, ex, false).getIntegrador());
        } finally {
            if (result.getIntegrador() != null && result.getIntegrador().getIntegradorLogList() != null && !result.getIntegrador().getIntegradorLogList().isEmpty()) {
                for (WSIntegradorLog log : result.getIntegrador().getIntegradorLogList()) {
                    log.setSsTempo(Long.valueOf("0"));
                }
                result.getIntegrador().getIntegradorLogList().get(0).setSsTempo(Utils.tempoExecucaoSeg(tempoInicio));
            }
            LogWS.gerarLog(result.getIntegrador(), jsonRQ, result);
        }
        return gson.toJson(result);
    }

}
