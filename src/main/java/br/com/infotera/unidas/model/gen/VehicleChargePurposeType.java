//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleChargePurposeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargePurposeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *       &lt;attribute name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargePurposeType")
public class VehicleChargePurposeType
    extends VehicleChargeType
{

    @XmlAttribute(name = "Purpose")
    protected String purpose;
    @XmlAttribute(name = "RateConvertInd")
    protected Boolean rateConvertInd;
    @XmlAttribute(name = "RequiredInd")
    protected Boolean requiredInd;

    /**
     * Obtém o valor da propriedade purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define o valor da propriedade purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtém o valor da propriedade rateConvertInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateConvertInd() {
        return rateConvertInd;
    }

    /**
     * Define o valor da propriedade rateConvertInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateConvertInd(Boolean value) {
        this.rateConvertInd = value;
    }

    /**
     * Obtém o valor da propriedade requiredInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredInd() {
        return requiredInd;
    }

    /**
     * Define o valor da propriedade requiredInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredInd(Boolean value) {
        this.requiredInd = value;
    }

}
