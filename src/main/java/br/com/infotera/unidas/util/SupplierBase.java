package br.com.infotera.unidas.util;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * Class that holds static data templates from the partner vendor
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public class SupplierBase {
    
    private static final Map<String, String> mapClassVehicle = new HashMap<>();
    private static final Map<String, String> mapAirportIATACodes = new HashMap<>();
    
    public SupplierBase() {
        loadingClassVehicle();
        loadingAirportIATACodes();
    }
    
    /**
     * Data Model - Webservice Unidas Rent a Car (2009) - Vehicle Classification according to SIPP code
     * @return 
     */
    public static Map<String, String> loadingClassVehicle(){
        mapClassVehicle.put("CDAR", "HATCH MÉDIO AT");
        mapClassVehicle.put("CDMR", "COMPACTO PLUS");
        mapClassVehicle.put("CXMR", "SEGURANCA COM AIRBAG");
        mapClassVehicle.put("CPMN", "MINIPICAPE");
        mapClassVehicle.put("ECMM", "HATCH COMPACTO 1.0");
        mapClassVehicle.put("ECMN", "ECONOMICO");
        mapClassVehicle.put("ECMR", "ECONOMICO COM AR");
        mapClassVehicle.put("EDMR", "HATCH MÉDIO 1.0");
        mapClassVehicle.put("EXMR", "SEDAN MÉDIO 1.0");
        mapClassVehicle.put("FFAR", "SUV 7 LUGARES");
        mapClassVehicle.put("FQMD", "PICAPE");
        mapClassVehicle.put("FVMR", "VAN");
        mapClassVehicle.put("ICAR", "SEDAN MÉDIO AT");
        mapClassVehicle.put("IDMR", "SEDAN MÉDIO 1.3");
        mapClassVehicle.put("IFAM", "SUV AT INTERMEDIÁRIO");
        mapClassVehicle.put("IFAR", "SUV AT");
        mapClassVehicle.put("IVMR", "MULTI VAN");
        mapClassVehicle.put("IWMR", "FAMILIAR");
        mapClassVehicle.put("IXMR", "ESPECIAL");
        mapClassVehicle.put("MKMR", "FURGÃO");
        mapClassVehicle.put("LDAR", "EXECUTIVO AUTOMATICO");
        mapClassVehicle.put("LXAR", "PREMIUM");
        mapClassVehicle.put("PDAR", "SEDAN EXECUTIVO AT");
        mapClassVehicle.put("PDMR", "EXECUTIVO");
        mapClassVehicle.put("PFAM", "SUV LUXO AT");
        mapClassVehicle.put("PPAR", "PICAPE LUXO AT C.DUPLA");
        mapClassVehicle.put("SDAR", "SEDAN MÉDIO AT PLUS");
        mapClassVehicle.put("XDAR", "BLINDADO");
        
        return mapClassVehicle;
    }
    
    
    /**
     * Data Model - Unidas Stores List - Production (2022) - Airport IATAs codes (Unidas)
     * @return 
     */
    public static Map<String, String> loadingAirportIATACodes(){
        mapAirportIATACodes.put("AJU", "AJU2"); // AEROPORTO DE ARACAJU     
        mapAirportIATACodes.put("BEL", "BEL2"); // AEROPORTO INTERNACIONAL DE BELEM   
        mapAirportIATACodes.put("BHZ", "BHZ3"); // AEROPORTO DE CONFINS       
        mapAirportIATACodes.put("BSB", "BSB2"); // AEROPORTO DE BRASILIA    
        mapAirportIATACodes.put("CGR", "CGR2"); // AEROPORTO DE CAMPO GRANDE
        mapAirportIATACodes.put("CKS", "CKS2"); // AEROPORTO DE CARAJAS 
        mapAirportIATACodes.put("CPQ", "CPQ2"); // AEROPORTO DE CAMPINAS      
        mapAirportIATACodes.put("CWB", "CWB2"); // AEROPORTO DE CURITIBA 
        mapAirportIATACodes.put("DOU", "DOU2"); // AEROPORTO DE DOURADOS   
        mapAirportIATACodes.put("FOR", "FOR2"); // AEROPORTO DE FORTALEZA        
        mapAirportIATACodes.put("GRU", "GRU1"); // AEROPORTO DE CUMBICA
        mapAirportIATACodes.put("GYN", "GYN2"); // AEROPORTO DE GOIÂNIA 
        mapAirportIATACodes.put("IGU", "IGU5"); // AEROPORTO DE FOZ DO IGUACU 
        mapAirportIATACodes.put("IMP", "IMP2"); // AEROPORTO DE INTERNACIONAL DE IMPERATRIZ
        mapAirportIATACodes.put("IPN", "IPN2"); // AEROPORTO USIMINAS
        mapAirportIATACodes.put("JOI", "JOI4"); // AEROPORTO DE JOINVILLE 
        mapAirportIATACodes.put("LDB", "LDB6"); // AEROPORTO DE LONDRINA
        mapAirportIATACodes.put("MCZ", "MCZ2"); // AEROPORTO DE MACEIÓ
        mapAirportIATACodes.put("MGF", "MGF2"); // AEROPORTO DE MARINGA
        mapAirportIATACodes.put("PMW", "PMW2"); // AEROPORTO DE PALMAS  
        mapAirportIATACodes.put("POA", "POA2"); // AEROPORTO DE PORTO ALEGRE  
        mapAirportIATACodes.put("PVH", "PVH2"); // AEROPORTO DE PORTO VELHO
        mapAirportIATACodes.put("REC", "REC2"); // AEROPORTO DE RECIFE
        mapAirportIATACodes.put("RIO", "RIO3"); // AEROPORTO DO GALEAO 
        mapAirportIATACodes.put("SAO", "SAO3"); // AEROPORTO DE CONGONHAS 
        mapAirportIATACodes.put("SSA", "SSA3"); // AEROPORTO  DE SALVADOR 
        mapAirportIATACodes.put("UDI", "UDI4"); // AEROPORTO DE UBERLANDIA 
        mapAirportIATACodes.put("VDC", "VDC2"); // AEROPORTO DE VITORIA DA CONQUISTA
        mapAirportIATACodes.put("VIX", "VIX2"); // AEROPORTO DE VITÓRIA
        mapAirportIATACodes.put("XPA", "XPA2"); // AEROPORTO DE CHAPECO 
        
        return mapAirportIATACodes;
    }
}
