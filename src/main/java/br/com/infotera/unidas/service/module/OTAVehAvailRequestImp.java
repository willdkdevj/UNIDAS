package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehAvailRateRQ;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.opentravel.PreferLevelType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRQAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRQCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRSCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import br.com.infotera.unidas.service.interfaces.OTAVehAvailRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class responsible for assembling the requisition to analyze the supplier's product availability (OTAVehAvailRate)
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class OTAVehAvailRequestImp implements OTAVehAvailRequest {

    @Autowired
    protected BuilderOTAVehRequest builderRequest;
    
    @Override
    public OtaVehAvailRate builderOTAVehAvailRateRequest(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        OtaVehAvailRate otaVehAvailRate = null;
        try{
            OTAVehAvailRateRQ oTAVehAvailRateRQ = new OTAVehAvailRateRQ();
            oTAVehAvailRateRQ.setPOS(builderRequest.setUpPos(disponibilidadeVeiculoRQ.getIntegrador()));
            oTAVehAvailRateRQ.setVehAvailRQCore(setUpVehAvailCore(disponibilidadeVeiculoRQ));
            oTAVehAvailRateRQ.setVehAvailRQInfo(setUpVehicleAvailInfo());
            
            otaVehAvailRate = new OtaVehAvailRate();
            otaVehAvailRate.setOTAVehAvailRateRQ(oTAVehAvailRateRQ);
            
        } catch(ErrorException ex){
            throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), OTAVehAvailRequestImp.class, "builderOTAVehAvailRateRequest", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao ler Rates", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
     
        return otaVehAvailRate;
    }
    
    @Override
    public void validateBusinessRules(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) {
        /** 
         * Checks if the stNationality parameter has the boolean value TRUE, 
         * otherwise it reports that the supplier has no international products 
         */
        if(!disponibilidadeVeiculoRQ.getStNacional()){
            try {
                throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), OTAVehAvailRequestImp.class, "validateBusinessRules", WSMensagemErroEnum.GENMETHOD,
                        "Este fornecedor não possui produtos internacionais. Por favor, revise a configuração sobre a nacionalidade (SgNacionalidade)", WSIntegracaoStatusEnum.NEGADO, null, false);
            } catch (ErrorException ex) {
                Logger.getLogger(OTAVehAvailRequestImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<VehicleAvailRSCoreType> checkAvailityReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehAvailRSCore) throws ErrorException {
        List<VehicleAvailRSCoreType> vehicleAvailCoreList = null;
        try {
            vehicleAvailCoreList = new ArrayList();
            for(Object obj : errorsOrSuccessOrVehAvailRSCore) {
                /** Checks if the VehicleAvailRSCoreType object was returned, which refers to the supplies available from the vendor */
                if(obj instanceof VehicleAvailRSCoreType){
                    VehicleAvailRSCoreType vehAvailCore = (VehicleAvailRSCoreType) obj;
                    vehicleAvailCoreList.add(vehAvailCore);
                }
            }
        } catch (Exception ex) {
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "checkAvailityReturn", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível montar a disponibilidade dos veículos do fornecedor. Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehicleAvailCoreList;
    }
    
    private OTAVehAvailRateRQ.VehAvailRQCore setUpVehAvailCore(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        OTAVehAvailRateRQ.VehAvailRQCore vehAvailCore = null;
        try {
            
            VehicleRentalCoreType vehicleRentalCoreType = builderRequest.setUpVehRentalCore(disponibilidadeVeiculoRQ.getIntegrador(), disponibilidadeVeiculoRQ.getDtRetirada(), disponibilidadeVeiculoRQ.getDtDevolucao(), disponibilidadeVeiculoRQ.getCdLocalRetirada(), disponibilidadeVeiculoRQ.getCdLocalDevolucao());
            
            VehicleAvailRQCoreType.RateQualifier rateQualifier = new VehicleAvailRQCoreType.RateQualifier();
            rateQualifier.setRateCategory("326708");
            
            vehAvailCore = new OTAVehAvailRateRQ.VehAvailRQCore();
            vehAvailCore.setVehRentalCore(vehicleRentalCoreType);
            vehAvailCore.getRateQualifier().add(rateQualifier);
            
        } catch(ErrorException ex){
            throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), OTAVehAvailRequestImp.class, "setUpVehAvailCore", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o VehAvailRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehAvailCore;
    }
    
    private VehicleAvailRQAdditionalInfoType setUpVehicleAvailInfo() {
        ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref coveragePref = new ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref();
        coveragePref.setPreferLevelField(PreferLevelType.ONLY);
        coveragePref.setCoverageType("30");
        
        ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref coveragePrefList = new ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref();
        coveragePrefList.getCoveragePref().add(coveragePref);
        
        VehicleAvailRQAdditionalInfoType infoAdditional = new VehicleAvailRQAdditionalInfoType();
        infoAdditional.setCoveragePrefs(coveragePrefList);
        
        return infoAdditional;
    }

    
}
