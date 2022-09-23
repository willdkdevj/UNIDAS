//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CommissionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CommissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CommissionableAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="TaxInclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrepaidAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FlatCommission" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CommissionPayableAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="StatusType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Full"/&gt;
 *             &lt;enumeration value="Partial"/&gt;
 *             &lt;enumeration value="Non-paying"/&gt;
 *             &lt;enumeration value="No-show"/&gt;
 *             &lt;enumeration value="Adjustment"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BillToID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaxCommissionUnitApplies" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="CapAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionType", propOrder = {
    "uniqueID",
    "commissionableAmount",
    "prepaidAmount",
    "flatCommission",
    "commissionPayableAmount",
    "comment"
})
public class CommissionType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "CommissionableAmount")
    protected CommissionType.CommissionableAmount commissionableAmount;
    @XmlElement(name = "PrepaidAmount")
    protected CommissionType.PrepaidAmount prepaidAmount;
    @XmlElement(name = "FlatCommission")
    protected CommissionType.FlatCommission flatCommission;
    @XmlElement(name = "CommissionPayableAmount")
    protected CommissionType.CommissionPayableAmount commissionPayableAmount;
    @XmlElement(name = "Comment")
    protected ParagraphType comment;
    @XmlAttribute(name = "StatusType")
    protected String statusType;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "ReasonCode")
    protected String reasonCode;
    @XmlAttribute(name = "BillToID")
    protected String billToID;
    @XmlAttribute(name = "Frequency")
    protected String frequency;
    @XmlAttribute(name = "MaxCommissionUnitApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxCommissionUnitApplies;
    @XmlAttribute(name = "CapAmount")
    protected BigDecimal capAmount;

    /**
     * Obtém o valor da propriedade uniqueID.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Define o valor da propriedade uniqueID.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Obtém o valor da propriedade commissionableAmount.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType.CommissionableAmount }
     *     
     */
    public CommissionType.CommissionableAmount getCommissionableAmount() {
        return commissionableAmount;
    }

    /**
     * Define o valor da propriedade commissionableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType.CommissionableAmount }
     *     
     */
    public void setCommissionableAmount(CommissionType.CommissionableAmount value) {
        this.commissionableAmount = value;
    }

    /**
     * Obtém o valor da propriedade prepaidAmount.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType.PrepaidAmount }
     *     
     */
    public CommissionType.PrepaidAmount getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Define o valor da propriedade prepaidAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType.PrepaidAmount }
     *     
     */
    public void setPrepaidAmount(CommissionType.PrepaidAmount value) {
        this.prepaidAmount = value;
    }

    /**
     * Obtém o valor da propriedade flatCommission.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType.FlatCommission }
     *     
     */
    public CommissionType.FlatCommission getFlatCommission() {
        return flatCommission;
    }

    /**
     * Define o valor da propriedade flatCommission.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType.FlatCommission }
     *     
     */
    public void setFlatCommission(CommissionType.FlatCommission value) {
        this.flatCommission = value;
    }

    /**
     * Obtém o valor da propriedade commissionPayableAmount.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType.CommissionPayableAmount }
     *     
     */
    public CommissionType.CommissionPayableAmount getCommissionPayableAmount() {
        return commissionPayableAmount;
    }

    /**
     * Define o valor da propriedade commissionPayableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType.CommissionPayableAmount }
     *     
     */
    public void setCommissionPayableAmount(CommissionType.CommissionPayableAmount value) {
        this.commissionPayableAmount = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setComment(ParagraphType value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade statusType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * Define o valor da propriedade statusType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusType(String value) {
        this.statusType = value;
    }

    /**
     * Obtém o valor da propriedade percent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Define o valor da propriedade percent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
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
     * Obtém o valor da propriedade decimalPlaces.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Define o valor da propriedade decimalPlaces.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Obtém o valor da propriedade reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define o valor da propriedade reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtém o valor da propriedade billToID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToID() {
        return billToID;
    }

    /**
     * Define o valor da propriedade billToID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToID(String value) {
        this.billToID = value;
    }

    /**
     * Obtém o valor da propriedade frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define o valor da propriedade frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Obtém o valor da propriedade maxCommissionUnitApplies.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxCommissionUnitApplies() {
        return maxCommissionUnitApplies;
    }

    /**
     * Define o valor da propriedade maxCommissionUnitApplies.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxCommissionUnitApplies(BigInteger value) {
        this.maxCommissionUnitApplies = value;
    }

    /**
     * Obtém o valor da propriedade capAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapAmount() {
        return capAmount;
    }

    /**
     * Define o valor da propriedade capAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapAmount(BigDecimal value) {
        this.capAmount = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="TaxInclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommissionableAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "TaxInclusiveIndicator")
        protected Boolean taxInclusiveIndicator;

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
         * Obtém o valor da propriedade taxInclusiveIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTaxInclusiveIndicator() {
            return taxInclusiveIndicator;
        }

        /**
         * Define o valor da propriedade taxInclusiveIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTaxInclusiveIndicator(Boolean value) {
            this.taxInclusiveIndicator = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CommissionPayableAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlatCommission {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrepaidAmount {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;

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

    }

}
