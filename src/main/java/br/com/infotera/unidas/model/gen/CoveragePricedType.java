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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CoveragePricedType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CoveragePricedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coverage" type="{http://www.opentravel.org/OTA/2003/05}CoverageType" minOccurs="0"/&gt;
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
 *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveragePricedType", propOrder = {
    "coverage",
    "charge",
    "deductible"
})
public class CoveragePricedType {

    @XmlElement(name = "Coverage")
    protected CoverageType coverage;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;
    @XmlElement(name = "Deductible")
    protected DeductibleType deductible;
    @XmlAttribute(name = "Required")
    protected Boolean required;

    /**
     * Obtém o valor da propriedade coverage.
     * 
     * @return
     *     possible object is
     *     {@link CoverageType }
     *     
     */
    public CoverageType getCoverage() {
        return coverage;
    }

    /**
     * Define o valor da propriedade coverage.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageType }
     *     
     */
    public void setCoverage(CoverageType value) {
        this.coverage = value;
    }

    /**
     * Obtém o valor da propriedade charge.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType }
     *     
     */
    public VehicleChargeType getCharge() {
        return charge;
    }

    /**
     * Define o valor da propriedade charge.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType }
     *     
     */
    public void setCharge(VehicleChargeType value) {
        this.charge = value;
    }

    /**
     * Obtém o valor da propriedade deductible.
     * 
     * @return
     *     possible object is
     *     {@link DeductibleType }
     *     
     */
    public DeductibleType getDeductible() {
        return deductible;
    }

    /**
     * Define o valor da propriedade deductible.
     * 
     * @param value
     *     allowed object is
     *     {@link DeductibleType }
     *     
     */
    public void setDeductible(DeductibleType value) {
        this.deductible = value;
    }

    /**
     * Obtém o valor da propriedade required.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Define o valor da propriedade required.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
