/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.unidas.model.gen.opentravel.CancelInfoRQType;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehCancel;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehCancelRQ;
import br.com.infotera.unidas.model.gen.opentravel.UniqueIDType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleCancelRSAdditionalInfoType;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import br.com.infotera.unidas.service.interfaces.OTAVehCancelRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class responsible for assembling the requisition to make the reservation of the input (OTAVehCancel)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class OTAVehCancelRequestImp implements OTAVehCancelRequest {

    @Autowired
    protected BuilderOTAVehRequest builderRequest;

    @Override
    public OtaVehCancel builderOTAVehCancelRequest(WSReservaRQ reservaRQ) throws ErrorException {
        OtaVehCancel cancel = null;
        try {
            OtaVehCancelRQ cancelRQ = new OtaVehCancelRQ();
            cancelRQ.setPOS(builderRequest.setUpPos(reservaRQ.getIntegrador()));
            cancelRQ.setVehCancelRQCore(setUpVehCancelRQCore(reservaRQ));
            
            cancel = new OtaVehCancel();
            cancel.setOtaVehCancelRQ(cancelRQ);
        } catch(ErrorException ex){
            throw new ErrorException(reservaRQ.getIntegrador(), OTAVehCancelRequestImp.class, "builderOTAVehCancelRequest", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o OTAVehRetResRequest a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return cancel;
    }
    
    private CancelInfoRQType setUpVehCancelRQCore(WSReservaRQ reservaRQ){
        CancelInfoRQType vehCancelRQCore = null;
        try {
            WSReservaServico reservaServico = reservaRQ.getReserva().getReservaServicoList().stream()
                    .findFirst()
                    .orElseThrow(() -> new ErrorException(reservaRQ.getIntegrador(), OTAVehCancelRequestImp.class, "setUpVehCancelRQCore", WSMensagemErroEnum.GENMETHOD,
                            "Erro ao obter a reserva do serviço - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
            
            if(reservaServico.getNrLocalizador() != null && !reservaServico.getNrLocalizador().equals("")){
                UniqueIDType uniqueID = new UniqueIDType();
                uniqueID.setType("14");
                uniqueID.setID(reservaServico.getNrLocalizador());
                
                vehCancelRQCore = new CancelInfoRQType();
                vehCancelRQCore.getUniqueID().add(uniqueID);
                
            } else {
                throw new ErrorException(reservaRQ.getIntegrador(), OTAVehCancelRequestImp.class, "setUpVehCancelRQCore", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao obter o localizador da reserva - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(reservaRQ.getIntegrador(), OTAVehCancelRequestImp.class, "setUpVehCancelRQCore", WSMensagemErroEnum.GENMETHOD,
                        "Erro ao parametrizar o VehCancelRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(OTAVehCancelRequestImp.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return vehCancelRQCore;
    }

    @Override
    public List<VehicleCancelRSAdditionalInfoType> checkCancelReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehCancelRSCore) throws ErrorException {
        List<VehicleCancelRSAdditionalInfoType> vehicleCancelCoreList = null;
        try {
            vehicleCancelCoreList = new ArrayList();
            for(Object obj : errorsOrSuccessOrVehCancelRSCore) {
                /** Checks if the VehicleCancelRSCoreType object was returned, which refers to the status cancel of reservation in vendor */
                if(obj instanceof VehicleCancelRSAdditionalInfoType){
                    VehicleCancelRSAdditionalInfoType vehCancelCore = (VehicleCancelRSAdditionalInfoType) obj;
                    vehicleCancelCoreList.add(vehCancelCore);
                }
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, OTAVehCancelRequestImp.class, "checkCancelReturn", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível montar o retorno do estado da reserva. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehicleCancelCoreList;
    }

    

}
