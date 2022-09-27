/*
 * DOCUMENTAÇÃO DO FORNECEDOR: https://www.dotwconnect.com/interface/pt/documentation
 */
package br.com.infotera.unidas.util;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author William Dias
 */
@Component
public class SupplierBase {
    
    private static final Map<String, String> mapClassVehicle = new HashMap<>();
    
    public SupplierBase() {
        loadingClassVehicle();
    }
    
    /**
     * Modelo de Dados - Webservice Unidas Rent a Car (2009) - Classificação de Veiculos conforme código SIPP
     * @return 
     */
    public static Map<String, String> loadingClassVehicle(){
        mapClassVehicle.put("ECMN", "ECONOMICO");
        mapClassVehicle.put("ECMR", "ECONOMICO COM AR");
        mapClassVehicle.put("CDMR", "COMPACTO PLUS");
        mapClassVehicle.put("CXMR", "SEGURANCA COM AIRBAG");
        mapClassVehicle.put("IWMR", "FAMILIAR");
        mapClassVehicle.put("IXMR", "ESPECIAL");
        mapClassVehicle.put("PDMR", "EXECUTIVO");
        mapClassVehicle.put("LDAR", "EXECUTIVO AUTOMATICO");
        mapClassVehicle.put("LXAR", "PREMIUM");
        mapClassVehicle.put("XDAR", "BLINDADO");
        mapClassVehicle.put("CPMN", "MINIPICAPE");
        mapClassVehicle.put("IVMR", "MULTI VAN");
        mapClassVehicle.put("FQMD", "PICAPE");
        mapClassVehicle.put("FVMR", "VAN");
        
        return mapClassVehicle;
    }
   
}
