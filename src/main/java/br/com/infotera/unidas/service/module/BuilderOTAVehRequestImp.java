/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.opentravel.CompanyNameType;
import br.com.infotera.unidas.model.gen.opentravel.SourceType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * Helper class that contains the methods that return objects common to requests made to the partner webservice
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class BuilderOTAVehRequestImp implements BuilderOTAVehRequest {

    @Override
    public ArrayOfSourceType setUpPos(WSIntegrador integrador) throws ErrorException {
        ArrayOfSourceType sourcesType = null;
        try {
            SourceType source = new SourceType();
            source.setISOCountry("55");
            
            SourceType.RequestorID requestorID = setUpRequestor(integrador);
            source.setRequestorID(requestorID);

            sourcesType = new ArrayOfSourceType();
            sourcesType.getSource().add(source);
            
        } catch(ErrorException ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpPos", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o POS a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return sourcesType;
    }

    @Override
    public VehicleRentalCoreType setUpVehRentalCore(WSIntegrador integrador, Date dtRetirada, Date dtDevolucao, String cdRetirada, String cdDevolucao) throws ErrorException {
        VehicleRentalCoreType vehicleRentalCoreType = null; 
        try {
            vehicleRentalCoreType = new VehicleRentalCoreType();
            vehicleRentalCoreType.setPickUpDateTime(Utils.convertStringDateToXmlGregorianCalendar(dtRetirada, Boolean.FALSE));
            vehicleRentalCoreType.setReturnDateTime(Utils.convertStringDateToXmlGregorianCalendar(dtDevolucao, Boolean.FALSE));
            
            VehicleRentalCoreType.PickUpLocation pickupLocation = new VehicleRentalCoreType.PickUpLocation();
            pickupLocation.setLocationCode(cdRetirada);
            vehicleRentalCoreType.getPickUpLocation().add(pickupLocation);
            
            VehicleRentalCoreType.ReturnLocation returnLocation = new VehicleRentalCoreType.ReturnLocation();
            returnLocation.setLocationCode(cdDevolucao);
            vehicleRentalCoreType.setReturnLocation(returnLocation);
            
        } catch(Exception ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpPos", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o RentalCoreType a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehicleRentalCoreType;    
            
    }
 
    private SourceType.RequestorID setUpRequestor(WSIntegrador integrador) throws ErrorException {
        SourceType.RequestorID requestorID = null;
        try {
            CompanyNameType companyNameType = new CompanyNameType();
            companyNameType.setCodeContext("");

            requestorID = new SourceType.RequestorID();
            requestorID.setCompanyName(companyNameType);

        } catch(Exception ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpRequestor", WSMensagemErroEnum.GENMETHOD, 
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
            companyNameType.setCodeContext("26");
            
            bookingChannel.setCompanyName(companyNameType);

        } catch(Exception ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpBookingChannel", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar BookingChannel - Verifique os dados da Agência", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return bookingChannel;
    }

    
}
