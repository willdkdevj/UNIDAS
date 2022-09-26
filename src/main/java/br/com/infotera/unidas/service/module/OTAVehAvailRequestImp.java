/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref;
import br.com.infotera.unidas.model.gen.opentravel.CompanyNameType;
import br.com.infotera.unidas.model.gen.opentravel.InventoryStatusType;
import br.com.infotera.unidas.model.gen.opentravel.OTAVehAvailRateRQ;
import br.com.infotera.unidas.model.gen.unidas.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.opentravel.PreferLevelType;
import br.com.infotera.unidas.model.gen.opentravel.SourceType;
import br.com.infotera.unidas.model.gen.opentravel.SourceType.RequestorID;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRQAdditionalInfoType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleAvailRQCoreType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.service.DisponibilidadeCarWS;
import br.com.infotera.unidas.service.interfaces.OTAVehAvailRequest;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author william
 */
@Service
public class OTAVehAvailRequestImp implements OTAVehAvailRequest {

    @Override
    public OtaVehAvailRate builderOTAVehAvailRateRequest(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        OtaVehAvailRate otaVehAvailRate = null;
        try{
            OTAVehAvailRateRQ oTAVehAvailRateRQ = new OTAVehAvailRateRQ();
            oTAVehAvailRateRQ.setPOS(setUpPos(disponibilidadeVeiculoRQ));
            oTAVehAvailRateRQ.setVehAvailRQCore(setUpVehAvailCore(disponibilidadeVeiculoRQ));
            oTAVehAvailRateRQ.setVehAvailRQInfo(setUpVehicleAvailInfo());
            
            otaVehAvailRate = new OtaVehAvailRate();
            otaVehAvailRate.setOTAVehAvailRateRQ(oTAVehAvailRateRQ);
            
        } catch(ErrorException ex){
            throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), DisponibilidadeCarWS.class, "builderOTAVehAvailRateRequest", WSMensagemErroEnum.SDI, 
                    "Erro ao ler Rates", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
     
        return otaVehAvailRate;
    }
    
    @Override
    public void validateBusinessRules(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) {
        /** Verifica se o parâmetro stNacionalidade consta com o valor booleano como TRUE, caso contrário é reportado que o fornecedor não possui produtos internacionais */
        if(!disponibilidadeVeiculoRQ.getStNacional()){
            try {
                throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), DisponibilidadeCarWS.class, "validateBusinessRules", WSMensagemErroEnum.SDI,
                        "Este fornecedor não possui produtos internacionais. Por favor, revise a configuração sobre a nacionalidade (SgNacionalidade)", WSIntegracaoStatusEnum.NEGADO, null, false);
            } catch (ErrorException ex) {
                Logger.getLogger(OTAVehAvailRequestImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private ArrayOfSourceType setUpPos(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        ArrayOfSourceType sourcesType = null;
        try {
            /** Credenciais do usuário na plataforma do fornecedor */
            List<String> credenciais = disponibilidadeVeiculoRQ.getIntegrador().getDsCredencialList();
            /** Contato da Agência cadastrado no Integrador */
//            WSContato contato = disponibilidadeVeiculoRQ.getIntegrador().getTransContato();
            
            SourceType source = new SourceType();
            /** Conforme a documentação, a Unidas deve orientar o parametro a ser informado */
//            source.setPseudoCityCode("");
            /** Código padrão ISO para identificação de país */
            source.setISOCountry("55");
            /** Código de validação que o fornecedor atribui a todos os parceiros */
//            source.setAgentDutyCode(credenciais.get(2));
            
            SourceType.RequestorID requestorID = setUpRequestor(disponibilidadeVeiculoRQ.getIntegrador());
            source.setRequestorID(requestorID);

//            SourceType.BookingChannel bookingChannel = setUpBookingChannel(disponibilidadeVeiculoRQ.getIntegrador());
//            source.setBookingChannel(bookingChannel);
            
            sourcesType = new ArrayOfSourceType();
            sourcesType.getSource().add(source);
            
        } catch(ErrorException ex){
            throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), DisponibilidadeCarWS.class, "setUpPos", WSMensagemErroEnum.SDI, 
                    "Erro ao parametrizar o POS a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return sourcesType;
    }

    private OTAVehAvailRateRQ.VehAvailRQCore setUpVehAvailCore(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
        OTAVehAvailRateRQ.VehAvailRQCore vehAvailCore = null;
        try {
//            BigInteger qtdDias = BigInteger.probablePrime(Utils.diferencaEmDias(disponibilidadeVeiculoRQ.getDtRetirada(), disponibilidadeVeiculoRQ.getDtDevolucao()), new Random());
            
            VehicleRentalCoreType vehicleRentalCoreType = new VehicleRentalCoreType();
            vehicleRentalCoreType.setPickUpDateTime(Utils.convertStringDateToXmlGregorianCalendar(disponibilidadeVeiculoRQ.getDtRetirada(), Boolean.FALSE));
            vehicleRentalCoreType.setReturnDateTime(Utils.convertStringDateToXmlGregorianCalendar(disponibilidadeVeiculoRQ.getDtDevolucao(), Boolean.FALSE));
//            vehicleRentalCoreType.setMultiIslandRentalDays(qtdDias);
            
            VehicleRentalCoreType.PickUpLocation pickupLocation = new VehicleRentalCoreType.PickUpLocation();
            pickupLocation.setLocationCode(disponibilidadeVeiculoRQ.getCdLocalRetirada());
            vehicleRentalCoreType.getPickUpLocation().add(pickupLocation);
            
            VehicleRentalCoreType.ReturnLocation returnLocation = new VehicleRentalCoreType.ReturnLocation();
            returnLocation.setLocationCode(disponibilidadeVeiculoRQ.getCdLocalDevolucao());
            vehicleRentalCoreType.setReturnLocation(returnLocation);
            
//            VehicleAvailRQCoreType.DriverType driver = VehicleAvailRQCoreType.DriverType();
//            driver.setCodeContext("UNIDAS");
            
            VehicleAvailRQCoreType.RateQualifier rateQualifier = new VehicleAvailRQCoreType.RateQualifier();
            rateQualifier.setRateCategory(disponibilidadeVeiculoRQ.getIntegrador().getDsCredencialList().get(2));
            
            vehAvailCore = new OTAVehAvailRateRQ.VehAvailRQCore();
//            vehAvailCore.setStatus(InventoryStatusType.AVAILABLE);
            vehAvailCore.setVehRentalCore(vehicleRentalCoreType);
            vehAvailCore.getRateQualifier().add(rateQualifier);
            
//            vehAvailCore.getDriverType().add(driver);
            
        } catch(Exception ex){
            throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), DisponibilidadeCarWS.class, "setUpVehAvailCore", WSMensagemErroEnum.SDI, 
                    "Erro ao parametrizar o VehAvailRQCore a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehAvailCore;
    }

    private SourceType.RequestorID setUpRequestor(WSIntegrador integrador) throws ErrorException {
        SourceType.RequestorID requestorID = null;
        try {
            
            /** 1 - Customer; 2 - CRO (Customer Reservations Office); 3 - Corporation Representative; 4 - Company; 5 - Travel Agency */
//            requestorID.setType("5"); 
            /** Código do vendedor */
//            requestorID.setID(credenciais.get(3));

            CompanyNameType companyNameType = new CompanyNameType();
            companyNameType.setCodeContext("");
//            companyNameType.setCode(contato.getDocumento().getNrDocumento());
            
//            companyNameType.setCompanyShortName(contato.getNome());
            requestorID = new RequestorID();
            requestorID.setCompanyName(companyNameType);

        } catch(Exception ex){
            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "setUpRequestor", WSMensagemErroEnum.SDI, 
                    "Erro ao parametrizar RequestorID - Verifique os dados da Agência", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        return requestorID;
    }

    private SourceType.BookingChannel setUpBookingChannel(WSIntegrador integrador) throws ErrorException {
        SourceType.BookingChannel bookingChannel = null;
        try {
            bookingChannel = new SourceType.BookingChannel();
            /** 
             * 1 - Global Distribution System (GDS)
             * 2 - Alternative Distribuition System (ADS) 
             * 3 - Sales and Catering System (SCS) 
             * 4 - Property Management System (PMS)
             * 5 - Central Reservation System (CRS)
             * 6 - Tour Operator System (TOS)
             * 7 - Internet */
            bookingChannel.setType("TOS");

            CompanyNameType companyNameType = new CompanyNameType();
//            companyNameType.setCode(contato.getDocumento().getNrDocumento());
//            companyNameType.setCompanyShortName(contato.getNome());
            /** Indica o tipo de código que será utilizado */
            companyNameType.setCodeContext("26");
            
            bookingChannel.setCompanyName(companyNameType);

        } catch(Exception ex){
            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "setUpBookingChannel", WSMensagemErroEnum.SDI, 
                    "Erro ao parametrizar BookingChannel - Verifique os dados da Agência", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return bookingChannel;
    }

    private VehicleAvailRQAdditionalInfoType setUpVehicleAvailInfo() {
        CoveragePref coveragePref = new CoveragePref();
        coveragePref.setPreferLevelField(PreferLevelType.ONLY);
        coveragePref.setCoverageType("30");
        
        ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref coveragePrefList = new ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref();
        coveragePrefList.getCoveragePref().add(coveragePref);
        
        VehicleAvailRQAdditionalInfoType infoAdditional = new VehicleAvailRQAdditionalInfoType();
        infoAdditional.setCoveragePrefs(coveragePrefList);
        
        return infoAdditional;
    }

    
}
