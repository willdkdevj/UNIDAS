//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.unidas;

import br.com.infotera.unidas.model.gen.opentravel.OtaVehAvailRateResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OtaVehAvailRateResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "otaVehAvailRateResult"
})
@XmlRootElement(name = "OtaVehAvailRateResponse", namespace = "http://www.unidas.com.br/")
public class OtaVehAvailRateResponse {

    @XmlElement(name = "OtaVehAvailRateResult", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected OtaVehAvailRateResult otaVehAvailRateResult;

    /**
     * Obtém o valor da propriedade otaVehAvailRateResult.
     * 
     * @return
     *     possible object is
     *     {@link OtaVehAvailRateResult }
     *     
     */
    public OtaVehAvailRateResult getOtaVehAvailRateResult() {
        return otaVehAvailRateResult;
    }

    /**
     * Define o valor da propriedade otaVehAvailRateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link OtaVehAvailRateResult }
     *     
     */
    public void setOtaVehAvailRateResult(OtaVehAvailRateResult value) {
        this.otaVehAvailRateResult = value;
    }

}
