package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.reserva.rqrs.WSReservarRQ;
import br.com.infotera.unidas.model.gen.opentravel.VehicleResRSCoreType;
import br.com.infotera.unidas.model.gen.unidas.OtaVehRes;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Interface with the methods for assembling requisitions OTAVehRes
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface OTAVehResRequest {
    
    OtaVehRes builderOTAVehResRequest(WSReservarRQ reservarRQ) throws ErrorException;
    
    List<VehicleResRSCoreType> checkResReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehResRSCore) throws ErrorException;

}
