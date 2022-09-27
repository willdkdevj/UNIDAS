/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehResRQ;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehResRQ.VehResRQCore;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import br.com.infotera.unidas.service.interfaces.OTAVehResRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class responsible for assembling the requisition to make the reservation of the input (OTAVehRes)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Service
public class OTAVehResRequestImp implements OTAVehResRequest {

    @Autowired
    protected BuilderOTAVehRequest builderRequest;
    
    @Override
    public OtaVehRes builderOTAVehResRequest(WSReservarRQ reservarRQ) throws ErrorException {
        OtaVehRes otaVehRes = null;
        try{
            OTAVehResRQ oTAVehResRQ = new OTAVehResRQ();
            oTAVehResRQ.setPOS(builderRequest.setUpPos(reservarRQ.getIntegrador()));
            oTAVehResRQ.setVehResRQCore(setUpVehResCore(reservarRQ));
            
            otaVehRes = new OtaVehRes();
            otaVehRes.setOTAVehResRQ(oTAVehResRQ);
            
        } catch(ErrorException ex){
            throw new ErrorException(reservarRQ.getIntegrador(), OTAVehResRequestImp.class, "builderOTAVehAvailRateRequest", WSMensagemErroEnum.SRE, 
                    "Erro ao ler Rates", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
     
        return otaVehRes;
    }
    
    private OTAVehResRQ.VehResRQCore setUpVehResCore(WSReservarRQ reservarRQ) throws ErrorException {
        OTAVehResRQ.VehResRQCore vehResCore = null;
        try {
            WSReservaServico reservaServico = reservarRQ.getReserva().getReservaServicoList().stream()
                    .findFirst()
                    .orElseThrow(() -> new ErrorException(reservarRQ.getIntegrador(), OTAVehResRequestImp.class, "builderOTAVehAvailRateRequest", WSMensagemErroEnum.SRE,
                            "Erro ao obter o serviço (WSReservaServico) - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
            
            WSVeiculo veiculo = (WSVeiculo) reservaServico.getServico();
            VehicleRentalCoreType vehicleRentalCoreType = builderRequest.setUpVehRentalCore(reservarRQ.getIntegrador(), 
                                                                                            veiculo.getDtRetirada(), 
                                                                                            veiculo.getDtDevolucao(), 
                                                                                            veiculo.getLocalRetirada().getCdLocal(), 
                                                                                            veiculo.getLocalDevolucao().getCdLocal());
            
            vehResCore = new VehResRQCore();
            vehResCore.setVehRentalCore(vehicleRentalCoreType);
            
        } catch(ErrorException ex){
            throw new ErrorException(reservarRQ.getIntegrador(), OTAVehAvailRequestImp.class, "setUpVehResCore", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o VehResRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehResCore;
    }
}
