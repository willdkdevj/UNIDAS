//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Classe Java de VehicleAvailAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PricedCoverages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCoveragePricedType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMonetaryRuleType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ChargeablePeriod" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailAdditionalInfoType", propOrder = {
    "pricedCoverages",
    "paymentRules",
    "tpaExtensions"
})
public class VehicleAvailAdditionalInfoType {

    @XmlElement(name = "PricedCoverages")
    protected ArrayOfCoveragePricedType pricedCoverages;
    @XmlElement(name = "PaymentRules")
    protected ArrayOfMonetaryRuleType paymentRules;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ChargeablePeriod")
    protected Duration chargeablePeriod;

    /**
     * Obtém o valor da propriedade pricedCoverages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoveragePricedType }
     *     
     */
    public ArrayOfCoveragePricedType getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * Define o valor da propriedade pricedCoverages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoveragePricedType }
     *     
     */
    public void setPricedCoverages(ArrayOfCoveragePricedType value) {
        this.pricedCoverages = value;
    }

    /**
     * Obtém o valor da propriedade paymentRules.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMonetaryRuleType }
     *     
     */
    public ArrayOfMonetaryRuleType getPaymentRules() {
        return paymentRules;
    }

    /**
     * Define o valor da propriedade paymentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMonetaryRuleType }
     *     
     */
    public void setPaymentRules(ArrayOfMonetaryRuleType value) {
        this.paymentRules = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * Obtém o valor da propriedade chargeablePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChargeablePeriod() {
        return chargeablePeriod;
    }

    /**
     * Define o valor da propriedade chargeablePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChargeablePeriod(Duration value) {
        this.chargeablePeriod = value;
    }

}
