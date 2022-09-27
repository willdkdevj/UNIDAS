//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleChargeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxAmounts" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargeTypeTaxAmount" minOccurs="0"/&gt;
 *         &lt;element name="MinMax" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Calculation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UnitChargePer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="Applicability"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="FromPickupLocation"/&gt;
 *                       &lt;enumeration value="FromDropoffLocation"/&gt;
 *                       &lt;enumeration value="BeforePickup"/&gt;
 *                       &lt;enumeration value="AfterDropoff"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludedInRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IncludedInEstTotalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleChargeType", propOrder = {
    "taxAmounts",
    "minMax",
    "calculation"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.VehicleLocationAdditionalFeesType.Fees.Fee.class,
    br.com.infotera.unidas.model.gen.opentravel.VehicleLocationAdditionalFeesType.Surcharges.Surcharge.class,
    br.com.infotera.unidas.model.gen.opentravel.VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge.class,
    VehicleChargePurposeType.class,
    br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge.OnLocServiceCharge.class,
    br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge.OffLocServiceCharge.class,
    br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge.EquipCharge.class
})
public class VehicleChargeType {

    @XmlElement(name = "TaxAmounts")
    protected ArrayOfVehicleChargeTypeTaxAmount taxAmounts;
    @XmlElement(name = "MinMax")
    protected VehicleChargeType.MinMax minMax;
    @XmlElement(name = "Calculation")
    protected List<VehicleChargeType.Calculation> calculation;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "TaxInclusive")
    protected Boolean taxInclusive;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "IncludedInRate")
    protected Boolean includedInRate;
    @XmlAttribute(name = "IncludedInEstTotalInd")
    protected Boolean includedInEstTotalInd;

    /**
     * Obtém o valor da propriedade taxAmounts.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public ArrayOfVehicleChargeTypeTaxAmount getTaxAmounts() {
        return taxAmounts;
    }

    /**
     * Define o valor da propriedade taxAmounts.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargeTypeTaxAmount }
     *     
     */
    public void setTaxAmounts(ArrayOfVehicleChargeTypeTaxAmount value) {
        this.taxAmounts = value;
    }

    /**
     * Obtém o valor da propriedade minMax.
     * 
     * @return
     *     possible object is
     *     {@link VehicleChargeType.MinMax }
     *     
     */
    public VehicleChargeType.MinMax getMinMax() {
        return minMax;
    }

    /**
     * Define o valor da propriedade minMax.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleChargeType.MinMax }
     *     
     */
    public void setMinMax(VehicleChargeType.MinMax value) {
        this.minMax = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargeType.Calculation }
     * 
     * 
     */
    public List<VehicleChargeType.Calculation> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<VehicleChargeType.Calculation>();
        }
        return this.calculation;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define o valor da propriedade amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtém o valor da propriedade taxInclusive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Define o valor da propriedade taxInclusive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusive(Boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade guaranteedInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Define o valor da propriedade guaranteedInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * Obtém o valor da propriedade includedInRate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInRate() {
        return includedInRate;
    }

    /**
     * Define o valor da propriedade includedInRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInRate(Boolean value) {
        this.includedInRate = value;
    }

    /**
     * Obtém o valor da propriedade includedInEstTotalInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInEstTotalInd() {
        return includedInEstTotalInd;
    }

    /**
     * Define o valor da propriedade includedInEstTotalInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInEstTotalInd(Boolean value) {
        this.includedInEstTotalInd = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="UnitCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UnitChargePer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="Applicability"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="FromPickupLocation"/&gt;
     *             &lt;enumeration value="FromDropoffLocation"/&gt;
     *             &lt;enumeration value="BeforePickup"/&gt;
     *             &lt;enumeration value="AfterDropoff"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="MaxQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Calculation {

        @XmlAttribute(name = "UnitCharge")
        protected BigDecimal unitCharge;
        @XmlAttribute(name = "UnitChargePer", required = true)
        protected BigDecimal unitChargePer;
        @XmlAttribute(name = "UnitName")
        protected String unitName;
        @XmlAttribute(name = "Quantity")
        protected BigInteger quantity;
        @XmlAttribute(name = "Percentage")
        protected BigDecimal percentage;
        @XmlAttribute(name = "Applicability")
        protected String applicability;
        @XmlAttribute(name = "MaxQuantity")
        protected BigInteger maxQuantity;
        @XmlAttribute(name = "Total")
        protected BigDecimal total;

        /**
         * Obtém o valor da propriedade unitCharge.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitCharge() {
            return unitCharge;
        }

        /**
         * Define o valor da propriedade unitCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitCharge(BigDecimal value) {
            this.unitCharge = value;
        }

        /**
         * Obtém o valor da propriedade unitChargePer.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitChargePer() {
            return unitChargePer;
        }

        /**
         * Define o valor da propriedade unitChargePer.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitChargePer(BigDecimal value) {
            this.unitChargePer = value;
        }

        /**
         * Obtém o valor da propriedade unitName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitName() {
            return unitName;
        }

        /**
         * Define o valor da propriedade unitName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitName(String value) {
            this.unitName = value;
        }

        /**
         * Obtém o valor da propriedade quantity.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Define o valor da propriedade quantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Obtém o valor da propriedade percentage.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * Define o valor da propriedade percentage.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * Obtém o valor da propriedade applicability.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicability() {
            return applicability;
        }

        /**
         * Define o valor da propriedade applicability.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicability(String value) {
            this.applicability = value;
        }

        /**
         * Obtém o valor da propriedade maxQuantity.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxQuantity() {
            return maxQuantity;
        }

        /**
         * Define o valor da propriedade maxQuantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxQuantity(BigInteger value) {
            this.maxQuantity = value;
        }

        /**
         * Obtém o valor da propriedade total.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotal() {
            return total;
        }

        /**
         * Define o valor da propriedade total.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotal(BigDecimal value) {
            this.total = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="MaxCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MinCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MaxChargeDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinMax {

        @XmlAttribute(name = "MaxCharge")
        protected BigDecimal maxCharge;
        @XmlAttribute(name = "MinCharge")
        protected BigDecimal minCharge;
        @XmlAttribute(name = "MaxChargeDays")
        protected BigInteger maxChargeDays;

        /**
         * Obtém o valor da propriedade maxCharge.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxCharge() {
            return maxCharge;
        }

        /**
         * Define o valor da propriedade maxCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxCharge(BigDecimal value) {
            this.maxCharge = value;
        }

        /**
         * Obtém o valor da propriedade minCharge.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinCharge() {
            return minCharge;
        }

        /**
         * Define o valor da propriedade minCharge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinCharge(BigDecimal value) {
            this.minCharge = value;
        }

        /**
         * Obtém o valor da propriedade maxChargeDays.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxChargeDays() {
            return maxChargeDays;
        }

        /**
         * Define o valor da propriedade maxChargeDays.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxChargeDays(BigInteger value) {
            this.maxChargeDays = value;
        }

    }

}
