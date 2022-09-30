package br.com.infotera.unidas.service.module;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSContato;
import br.com.infotera.common.WSInfoAdicional;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.WSReservaNome;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSSexoEnum;
import br.com.infotera.common.servico.WSVeiculo;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.model.gen.opentravel.*;
import br.com.infotera.unidas.model.gen.opentravel.CustomerPrimaryAdditionalType.Primary;
import br.com.infotera.unidas.model.gen.opentravel.CustomerType.Email;
import br.com.infotera.unidas.model.gen.opentravel.CustomerType.Telephone;
import br.com.infotera.unidas.service.interfaces.BuilderOTAVehRequest;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            
//            SourceType.BookingChannel bookingChannel = setUpBookingChannel(integrador);
//            source.setBookingChannel(bookingChannel);
            
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
            pickupLocation.setLocationCode(cdRetirada.length() < 4 ? cdRetirada.concat("1") : cdRetirada);
            vehicleRentalCoreType.getPickUpLocation().add(pickupLocation);
            
            VehicleRentalCoreType.ReturnLocation returnLocation = new VehicleRentalCoreType.ReturnLocation();
            returnLocation.setLocationCode(cdDevolucao.length() < 4 ? cdDevolucao.concat("1") : cdDevolucao);
            vehicleRentalCoreType.setReturnLocation(returnLocation);
            
        } catch(Exception ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpVehRentalCore", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar o RentalCoreType a fim de realizar a requisição - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return vehicleRentalCoreType;    
            
    }
    
    @Override
    public CustomerPrimaryAdditionalType setUpCustomer(WSIntegrador integrador, WSContato contato, List<WSReservaNome> reservaNomeList, List<WSInfoAdicional> infoAdicionalList) {
        Primary primary = new Primary();
        primary.getPersonName().add(assemblePerson(integrador, reservaNomeList));
        primary.getDocument().add(assembleDocumentType(integrador, reservaNomeList));
        primary.getEmail().add(getEmail(integrador, infoAdicionalList));
        primary.getTelephone().add(getTelephone(integrador, infoAdicionalList));
        
        CustomerPrimaryAdditionalType customer = new CustomerPrimaryAdditionalType();
        customer.setPrimary(primary);
        
        return customer; 
    }
 
    @Override
    public VehiclePrefType setUpVehPref(WSIntegrador integrador, WSVeiculo veiculo) {
        VehiclePrefType vehPref = new VehiclePrefType();
        vehPref.setCode(veiculo.getCdServico());
        vehPref.setCodeContext(veiculo.getDsParametro());
            
        return vehPref;
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
            companyNameType.setCode("26");
            companyNameType.setCodeContext("Internal Code");
            
            bookingChannel.setCompanyName(companyNameType);

        } catch(Exception ex){
            throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "setUpBookingChannel", WSMensagemErroEnum.GENMETHOD, 
                    "Erro ao parametrizar BookingChannel - Verifique os dados da Agência", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return bookingChannel;
    }

    private DocumentType assembleDocumentType(WSIntegrador integrador, List<WSReservaNome> reservaNomeList){
        DocumentType document = null;
        try {
            if(!Utils.isListNothing(reservaNomeList)){
                for(WSReservaNome reservaNome : reservaNomeList) {
                    document = new DocumentType();
                    document.setDocType(reservaNome.getDocumento().getDocumentoTipo().getNmTipo());
                    document.setDocID(reservaNome.getDocumento().getNrDocumento());
                }
            } else {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "assembleDocumentType", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível localizar o cadastro do documento do passageiro principal - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "assembleDocumentType", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível montar a requisição devido a problema do cadastro do documento do passageiro - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(BuilderOTAVehRequestImp.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return document;
    }
    
    private PersonNameType assemblePerson(WSIntegrador integrador, List<WSReservaNome> reservaNomeList){
        PersonNameType person = null;
        try {
            if(!Utils.isListNothing(reservaNomeList)){
                for(WSReservaNome reservaNome : reservaNomeList) {
                    person = new PersonNameType();
                    person.getNamePrefix().add(reservaNome.getSexo().equals(WSSexoEnum.MASCULINO) ? "Mr." : "Ms.");
                    person.getGivenName().add(reservaNome.getNmNome());
                    person.setSurname(reservaNome.getNmSobrenome());
                }
                
            } else {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "assemblePerson", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi possível localizar o passageiro principal da reserva - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            }
        } catch(ErrorException ex){
            try {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "assemblePerson", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível montar a requisição devido a problema do cadastro do passageiro principal - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
            } catch (ErrorException ex1) {
                Logger.getLogger(BuilderOTAVehRequestImp.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return person;
    }
    
    private CustomerType.Telephone getTelephone(WSIntegrador integrador, List<WSInfoAdicional> infoAdicionalList){
        CustomerType.Telephone telefone = null;
        if(!Utils.isListNothing(infoAdicionalList)){
            String dsTelefone = infoAdicionalList.get(1).getDsTexto();
            telefone = new Telephone();
            telefone.setPhoneUseType("Voice");
            telefone.setAreaCityCode(dsTelefone.substring(0, 2));
            telefone.setPhoneNumber(dsTelefone.substring(2, dsTelefone.length()));

        } else {
            try {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "getTelephone", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível obter o telefone do passageiro - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            } catch (ErrorException ex) {
                Logger.getLogger(BuilderOTAVehRequestImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return telefone; 
    }

    private CustomerType.Email getEmail(WSIntegrador integrador, List<WSInfoAdicional> infoAdicionalList){
        CustomerType.Email email = null;
        if(!Utils.isListNothing(infoAdicionalList)){
            String dsEmail = infoAdicionalList.get(0).getDsTexto();
            
            email = new Email();
            email.setValue(dsEmail);
        } else {
            try {
                throw new ErrorException(integrador, OTAVehAvailRequestImp.class, "getEmail", WSMensagemErroEnum.GENMETHOD,
                        "Não foi possível obter o endereço eletrônico (e-mail) do passageiro - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
            } catch (ErrorException ex) {
                Logger.getLogger(BuilderOTAVehRequestImp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return email; 
    }
}
