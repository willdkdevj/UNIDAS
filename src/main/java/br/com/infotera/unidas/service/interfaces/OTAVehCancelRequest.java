package br.com.infotera.unidas.service.interfaces;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.reserva.rqrs.WSReservaRQ;
import br.com.infotera.unidas.model.gen.unidas.OtaVehCancel;
import br.com.infotera.unidas.model.gen.opentravel.VehicleCancelRSAdditionalInfoType;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Interface with the methods for assembling requisitions OTAVehCancel
 * 
 * @author William Dias
 * @version 1.0
 * @since Branch Master (20/09/2022)
 */
@Component
public interface OTAVehCancelRequest {
    
    OtaVehCancel builderOTAVehCancelRequest(WSReservaRQ reservaRQ) throws ErrorException;
    
    List<VehicleCancelRSAdditionalInfoType> checkCancelReturn(WSIntegrador integrador, List<Object> errorsOrSuccessOrVehCancelRSCore) throws ErrorException;
}
