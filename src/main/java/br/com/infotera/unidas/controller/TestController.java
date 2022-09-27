/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.controller;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSAmbienteEnum;
import br.com.infotera.common.enumerator.WSEmpresaEnum;
import br.com.infotera.common.enumerator.WSIntegradorEnum;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.service.DisponibilidadeCarWS;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author William Dias
 */
@RestController
public class TestController {
    
    @Autowired
    private DisponibilidadeCarWS disponibilidadeCarWS;
           
    @Value("${info.api.version}")
    private String version;
    
    @Value("${info.api.name}")
    private String name;
    
    @Value("${info.api.description}") 
    private String description;
    
    /**
     * 
     * @return Method used in order to validate the functioning of the API in production
     */
    @RequestMapping(value = "/ola", method = RequestMethod.GET)
    public String Hello() {
        
        return "<b><i>Hello " + name.toUpperCase() + "</i> - " + version + "</b> <br /><br />" + Utils.tiraAcentoRequest(description);
    }
    
    /**
     * 
     * @return Method used to make a call to the availability method to validate its communication
     */
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    @ResponseBody
    public String teste() {
        try {
            List<String> dsCredencialList = new ArrayList();  
            
            // Infotera
            dsCredencialList.add("8636");
            dsCredencialList.add("6979000196");
            dsCredencialList.add("326708");
            
            WSIntegrador integrador = new WSIntegrador(WSEmpresaEnum.INFOTERA.getId(), "", WSIntegradorEnum.INFOTRAVEL, "BRL", 30, WSAmbienteEnum.PRODUCAO, dsCredencialList);
            integrador.setSgNacionalidade("BR");
            
            // Periodo desejado
            Date dtRetirada = Utils.addDias(new Date(), 180);
            Date dtDevolucao = Utils.addDias(dtRetirada, 5);
            
            WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ = new WSDisponibilidadeVeiculoRQ();
            disponibilidadeVeiculoRQ.setCdLocalRetirada("GRU1");
            disponibilidadeVeiculoRQ.setCdLocalDevolucao("GRU1");
            disponibilidadeVeiculoRQ.setDtRetirada(dtRetirada);
            disponibilidadeVeiculoRQ.setDtDevolucao(dtDevolucao);
            disponibilidadeVeiculoRQ.setQtRaio(10);
            disponibilidadeVeiculoRQ.setStNacional(Boolean.TRUE);
            disponibilidadeVeiculoRQ.setIntegrador(integrador);
            // Realiza thread para buscar relação de hotéis
            WSDisponibilidadeVeiculoRS disponibilidade = disponibilidadeCarWS.availability(disponibilidadeVeiculoRQ);
            
            return disponibilidade != null ? Utils.getGson().toJson(disponibilidade) : "Erro ao obter disponibilidade de veículos";
            
        } catch(ErrorException ex) {
            return "Disponibilidade: Erro ao obter retorno do fornecedor";
        }
        
    }
}
