package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaServico;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.unidas.model.gen.opentravel.CustomerPrimaryAdditionalType;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehResRQ;
import br.com.infotera.unidas.model.gen.opentravel.VehiclePrefType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleResRSCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import br.com.infotera.unidas.service.interfaces.OTAVehResRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class responsible for assembling the requisition to make the reservation of the input (OTAVehRes)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
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

    @Override
    public List<VehicleResRSCoreType> checkResReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehResRSCore) throws ErrorException {
        List<VehicleResRSCoreType> vehicleResCoreList = null;
        try {
            vehicleResCoreList = new ArrayList();
            for(Object obj : errorsOrSuccessOrVehResRSCore) {
                /** Checks if the VehicleCancelRSCoreType object was returned, which refers to the status cancel of reservation in vendor */
                if(obj instanceof VehicleResRSCoreType){
                    VehicleResRSCoreType vehResCore = (VehicleResRSCoreType) obj;
                    vehicleResCoreList.add(vehResCore);
                }
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, OTAVehCancelRequestImp.class, "checkResReturn", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível montar o retorno para a reserva. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehicleResCoreList;
    }
    
    public OTAVehResRQ.VehResRQCore setUpVehResCore(WSReservarRQ reservarRQ) throws ErrorException {
        OTAVehResRQ.VehResRQCore vehResCore = null;
        try {
            WSReservaServico reservaServico = reservarRQ.getReserva().getReservaServicoList().stream()
                    .findFirst()
                    .orElseThrow(() -> new ErrorException(reservarRQ.getIntegrador(), OTAVehResRequestImp.class, "setUpVehResCore", WSMensagemErroEnum.SRE,
                            "Erro ao obter o serviço (WSReservaServico) - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false));
               
            WSVeiculo veiculo = (WSVeiculo) reservaServico.getServico();
            
            VehicleRentalCoreType vehicleRentalCoreType = builderRequest.setUpVehRentalCore(reservarRQ.getIntegrador(),
                    veiculo.getDtRetirada(),
                    veiculo.getDtDevolucao(),
                    veiculo.getLocalRetirada().getCdLocal(),
                    veiculo.getLocalDevolucao().getCdLocal());

            CustomerPrimaryAdditionalType customer = builderRequest.setUpCustomer(reservarRQ.getIntegrador(), 
                    reservarRQ.getReserva().getContato(), 
                    veiculo.getReservaNomeList(), 
                    veiculo.getInfoAdicionalList());
            
            VehiclePrefType vehPref = builderRequest.setUpVehPref(reservarRQ.getIntegrador(), veiculo);
            
            vehResCore = new OTAVehResRQ.VehResRQCore();
            vehResCore.setStatus("All");
            vehResCore.setVehRentalCore(vehicleRentalCoreType);
            vehResCore.setCustomer(customer);
            vehResCore.setVehPref(vehPref);
            
        } catch(ErrorException ex){
            throw new ErrorException(reservarRQ.getIntegrador(), OTAVehAvailRequestImp.class, "setUpVehResCore", WSMensagemErroEnum.GENMETHOD,
                    "Erro ao parametrizar o VehResRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }

        return vehResCore;
    }
}
