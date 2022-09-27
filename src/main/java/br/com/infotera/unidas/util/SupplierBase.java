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
