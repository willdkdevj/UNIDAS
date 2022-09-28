/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehRetResRQ;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehRetResRQ.VehRetResRQCore;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehRetRes;
import br.com.infotera.unidas.model.gen.opentravel.UniqueIDType;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import br.com.infotera.unidas.service.interfaces.OTAVehRetResRequest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for assembling the requisition to make the reservation of the input (OTAVehRetRes)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class OTAVehRetResRequestImp implements OTAVehRetResRequest {

    @Autowired
    protected BuilderOTAVehRequest builderRequest;

    @Override
    public OtaVehRetRes builderOTAVehRetResRequest(WSReservaRQ reservaRQ) throws ErrorException {
        OtaVehRetRes vehRet = null;
        try {
            OTAVehRetResRQ resRQ = new OTAVehRetResRQ();
            resRQ.setPOS(builderRequest.setUpPos(reservaRQ.getIntegrador()));
            resRQ.setVehRetResRQCore(setUpVehRetResRQCore(reservaRQ));
            
            vehRet = new OtaVehRetRes();
            vehRet.setOTAVehRetResRQ(resRQ);
            
        } catch(Exception ex){
            throw new ErrorException(reservaRQ.getIntegrador(), OTAVehRetResRequestImp.class, "builderOTAVehRetResRequest", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o OTAVehRetResRequest a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehRet;
    }
    
    private OTAVehRetResRQ.VehRetResRQCore setUpVehRetResRQCore(WSReservaRQ reservaRQ){
        OTAVehRetResRQ.VehRetResRQCore vehRetResCore = null;
        try {
            WSReservaServico reservaServico = reservaRQ.getReserva().getReservaServicoList().stream()
                    .findFirst()
                    .orElseThrow(() -> new ErrorException(reservaRQ.getIntegrador(), OTAVehRetResRequestImp.class, "setUpVehRetResRQCore", WSMensagemErroEnum.GENMETHOD,
                            "Erro ao obter a reserva do serviço - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
            
            if(reservaServico.getNrLocalizador() != null && !reservaServico.getNrLocalizador().equals("")){
                UniqueIDType uniqueID = new UniqueIDType();
                uniqueID.setType("14");
                uniqueID.setID(reservaServico.getNrLocalizador());
                
                vehRetResCore = new VehRetResRQCore();
                vehRetResCore.getUniqueID().add(uniqueID);
                
            } else {
                throw new ErrorException(reservaRQ.getIntegrador(), OTAVehRetResRequestImp.class, "setUpVehRetResRQCore", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao obter o localizador da reserva - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(reservaRQ.getIntegrador(), OTAVehRetResRequestImp.class, "setUpVehRetResRQCore", WSMensagemErroEnum.GENMETHOD,
                        "Erro ao parametrizar o VehRetResRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(OTAVehRetResRequestImp.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return vehRetResCore;
    }

}
