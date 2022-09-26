//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.OtaVehResResult;
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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OtaVehResResult" minOccurs="0"/&gt;
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
    "otaVehResResult"
})
@XmlRootElement(name = "OtaVehResResponse", namespace = "http://www.unidas.com.br/")
public class OtaVehResResponse {

    @XmlElement(name = "OtaVehResResult")
    protected OtaVehResResult otaVehResResult;

    /**
     * Obtém o valor da propriedade otaVehResResult.
     * 
     * @return
     *     possible object is
     *     {@link OtaVehResResult }
     *     
     */
    public OtaVehResResult getOtaVehResResult() {
        return otaVehResResult;
    }

    /**
     * Define o valor da propriedade otaVehResResult.
     * 
     * @param value
     *     allowed object is
     *     {@link OtaVehResResult }
     *     
     */
    public void setOtaVehResResult(OtaVehResResult value) {
        this.otaVehResResult = value;
    }

}
