package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.unidas.model.gen.opentravel.OtaVehRetRes;
import br.com.infotera.unidas.model.gen.opentravel.VehicleRetrieveResRSCoreType;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Interface with the methods for assembling requisitions OTAVehRetRes
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface OTAVehRetResRequest {
    
    OtaVehRetRes builderOTAVehRetResRequest(WSReservaRQ reservaRQ) throws ErrorException;
    
    List<VehicleRetrieveResRSCoreType> checkRetResReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehRetResRSCore) throws ErrorException;

}
