//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.DirectBillType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PaymentFormType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType" minOccurs="0"/&gt;
 *           &lt;element name="Cash" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="DirectBill" type="{http://www.opentravel.org/OTA/2003/05}DirectBillType" minOccurs="0"/&gt;
 *           &lt;element name="LoyaltyRedemption" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                             &lt;attribute name="Format"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Paper"/&gt;
 *                                   &lt;enumeration value="Electronic"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                             &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="PromotionVendorCode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="MiscChargeOrder" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="CheckInhibitorType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="CheckDigit"/&gt;
 *                         &lt;enumeration value="InterlineAgreement"/&gt;
 *                         &lt;enumeration value="Both"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="CouponRPHs"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType" minOccurs="0"/&gt;
 *           &lt;element name="Ticket" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                             &lt;attribute name="Coupons"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/attribute&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                   &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="CheckInhibitorType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="CheckDigit"/&gt;
 *                         &lt;enumeration value="InterlineAgreement"/&gt;
 *                         &lt;enumeration value="Both"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="CouponRPHs"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="ReroutingType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="voluntary"/&gt;
 *                         &lt;enumeration value="involuntary"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/attribute&gt;
 *                   &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="Voucher" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ShareSynchInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="ShareMarketInd"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Yes"/&gt;
 *             &lt;enumeration value="No"/&gt;
 *             &lt;enumeration value="Inherit"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="CostCenterID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PaymentTransactionTypeCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="charge"/&gt;
 *             &lt;enumeration value="reserve"/&gt;
 *             &lt;enumeration value="refund"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="GuaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GuaranteeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="GuaranteeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
    "bankAcct",
    "cash",
    "directBill",
    "loyaltyRedemption",
    "miscChargeOrder",
    "paymentCard",
    "ticket",
    "voucher"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.CustomerType.PaymentForm.class,
    PaymentDetailType.class
})
public class PaymentFormType {

    @XmlElement(name = "BankAcct")
    protected BankAcctType bankAcct;
    @XmlElement(name = "Cash")
    protected PaymentFormType.Cash cash;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "LoyaltyRedemption")
    protected PaymentFormType.LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected PaymentFormType.MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Ticket")
    protected PaymentFormType.Ticket ticket;
    @XmlElement(name = "Voucher")
    protected PaymentFormType.Voucher voucher;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PaymentTransactionTypeCode")
    protected String paymentTransactionTypeCode;
    @XmlAttribute(name = "GuaranteeIndicator")
    protected Boolean guaranteeIndicator;
    @XmlAttribute(name = "GuaranteeTypeCode")
    protected String guaranteeTypeCode;
    @XmlAttribute(name = "GuaranteeID")
    protected String guaranteeID;
    @XmlAttribute(name = "Remark")
    protected String remark;

    /**
     * Obtém o valor da propriedade bankAcct.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctType }
     *     
     */
    public BankAcctType getBankAcct() {
        return bankAcct;
    }

    /**
     * Define o valor da propriedade bankAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctType }
     *     
     */
    public void setBankAcct(BankAcctType value) {
        this.bankAcct = value;
    }

    /**
     * Obtém o valor da propriedade cash.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public PaymentFormType.Cash getCash() {
        return cash;
    }

    /**
     * Define o valor da propriedade cash.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public void setCash(PaymentFormType.Cash value) {
        this.cash = value;
    }

    /**
     * Obtém o valor da propriedade directBill.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Define o valor da propriedade directBill.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Obtém o valor da propriedade loyaltyRedemption.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public PaymentFormType.LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Define o valor da propriedade loyaltyRedemption.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(PaymentFormType.LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Obtém o valor da propriedade miscChargeOrder.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public PaymentFormType.MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Define o valor da propriedade miscChargeOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(PaymentFormType.MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * Obtém o valor da propriedade paymentCard.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Define o valor da propriedade paymentCard.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Obtém o valor da propriedade ticket.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public PaymentFormType.Ticket getTicket() {
        return ticket;
    }

    /**
     * Define o valor da propriedade ticket.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public void setTicket(PaymentFormType.Ticket value) {
        this.ticket = value;
    }

    /**
     * Obtém o valor da propriedade voucher.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public PaymentFormType.Voucher getVoucher() {
        return voucher;
    }

    /**
     * Define o valor da propriedade voucher.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public void setVoucher(PaymentFormType.Voucher value) {
        this.voucher = value;
    }

    /**
     * Obtém o valor da propriedade shareSynchInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Define o valor da propriedade shareSynchInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Obtém o valor da propriedade shareMarketInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Define o valor da propriedade shareMarketInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

    /**
     * Obtém o valor da propriedade costCenterID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * Define o valor da propriedade costCenterID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * Obtém o valor da propriedade rph.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Define o valor da propriedade rph.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Obtém o valor da propriedade paymentTransactionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /**
     * Define o valor da propriedade paymentTransactionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionTypeCode(String value) {
        this.paymentTransactionTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade guaranteeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * Define o valor da propriedade guaranteeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeIndicator(Boolean value) {
        this.guaranteeIndicator = value;
    }

    /**
     * Obtém o valor da propriedade guaranteeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * Define o valor da propriedade guaranteeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypeCode(String value) {
        this.guaranteeTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade guaranteeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeID() {
        return guaranteeID;
    }

    /**
     * Define o valor da propriedade guaranteeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeID(String value) {
        this.guaranteeID = value;
    }

    /**
     * Obtém o valor da propriedade remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define o valor da propriedade remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     *       &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator")
        protected Boolean cashIndicator;

        /**
         * Obtém o valor da propriedade cashIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCashIndicator() {
            return cashIndicator;
        }

        /**
         * Define o valor da propriedade cashIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCashIndicator(Boolean value) {
            this.cashIndicator = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="LoyaltyCertificate" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *                 &lt;attribute name="Format"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Paper"/&gt;
     *                       &lt;enumeration value="Electronic"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionVendorCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyaltyCertificate"
    })
    public static class LoyaltyRedemption {

        @XmlElement(name = "LoyaltyCertificate")
        protected List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> loyaltyCertificate;
        @XmlAttribute(name = "CertificateNumber")
        protected String certificateNumber;
        @XmlAttribute(name = "MemberNumber")
        protected String memberNumber;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;
        @XmlAttribute(name = "RedemptionQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger redemptionQuantity;

        /**
         * Gets the value of the loyaltyCertificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyCertificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
         * 
         * 
         */
        public List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> getLoyaltyCertificate() {
            if (loyaltyCertificate == null) {
                loyaltyCertificate = new ArrayList<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate>();
            }
            return this.loyaltyCertificate;
        }

        /**
         * Obtém o valor da propriedade certificateNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * Define o valor da propriedade certificateNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * Obtém o valor da propriedade memberNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberNumber() {
            return memberNumber;
        }

        /**
         * Define o valor da propriedade memberNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberNumber(String value) {
            this.memberNumber = value;
        }

        /**
         * Obtém o valor da propriedade programName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Define o valor da propriedade programName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Obtém o valor da propriedade promotionCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Define o valor da propriedade promotionCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

        /**
         * Obtém o valor da propriedade redemptionQuantity.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedemptionQuantity() {
            return redemptionQuantity;
        }

        /**
         * Define o valor da propriedade redemptionQuantity.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedemptionQuantity(BigInteger value) {
            this.redemptionQuantity = value;
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
         *       &lt;attribute name="ID_Context" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
         *       &lt;attribute name="Format"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Paper"/&gt;
         *             &lt;enumeration value="Electronic"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoyaltyCertificate {

            @XmlAttribute(name = "ID_Context")
            protected String idContext;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "Format")
            protected String format;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * Obtém o valor da propriedade idContext.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * Define o valor da propriedade idContext.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDContext(String value) {
                this.idContext = value;
            }

            /**
             * Obtém o valor da propriedade nmbrOfNights.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * Define o valor da propriedade nmbrOfNights.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * Obtém o valor da propriedade format.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Define o valor da propriedade format.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Obtém o valor da propriedade status.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Define o valor da propriedade status.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

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
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CheckInhibitorType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="CheckDigit"/&gt;
     *             &lt;enumeration value="InterlineAgreement"/&gt;
     *             &lt;enumeration value="Both"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CouponRPHs"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MiscChargeOrder {

        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;
        @XmlAttribute(name = "PaperMCO_ExistInd")
        protected Boolean paperMCOExistInd;

        /**
         * Obtém o valor da propriedade ticketNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Define o valor da propriedade ticketNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * Obtém o valor da propriedade originalTicketNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * Define o valor da propriedade originalTicketNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * Obtém o valor da propriedade originalIssuePlace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * Define o valor da propriedade originalIssuePlace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * Obtém o valor da propriedade originalIssueDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * Define o valor da propriedade originalIssueDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * Obtém o valor da propriedade originalIssueIATA.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * Define o valor da propriedade originalIssueIATA.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * Obtém o valor da propriedade originalPaymentForm.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * Define o valor da propriedade originalPaymentForm.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * Obtém o valor da propriedade checkInhibitorType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * Define o valor da propriedade checkInhibitorType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * Obtém o valor da propriedade paperMCOExistInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaperMCOExistInd() {
            return paperMCOExistInd;
        }

        /**
         * Define o valor da propriedade paperMCOExistInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaperMCOExistInd(Boolean value) {
            this.paperMCOExistInd = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="ConjunctionTicketNbr" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Coupons"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="OriginalIssueIATA" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OriginalPaymentForm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CheckInhibitorType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="CheckDigit"/&gt;
     *             &lt;enumeration value="InterlineAgreement"/&gt;
     *             &lt;enumeration value="Both"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="CouponRPHs"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ReroutingType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="voluntary"/&gt;
     *             &lt;enumeration value="involuntary"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="ReasonForReroute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conjunctionTicketNbr"
    })
    public static class Ticket {

        @XmlElement(name = "ConjunctionTicketNbr")
        protected List<PaymentFormType.Ticket.ConjunctionTicketNbr> conjunctionTicketNbr;
        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;
        @XmlAttribute(name = "ReroutingType")
        protected String reroutingType;
        @XmlAttribute(name = "ReasonForReroute")
        protected String reasonForReroute;

        /**
         * Gets the value of the conjunctionTicketNbr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conjunctionTicketNbr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConjunctionTicketNbr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
         * 
         * 
         */
        public List<PaymentFormType.Ticket.ConjunctionTicketNbr> getConjunctionTicketNbr() {
            if (conjunctionTicketNbr == null) {
                conjunctionTicketNbr = new ArrayList<PaymentFormType.Ticket.ConjunctionTicketNbr>();
            }
            return this.conjunctionTicketNbr;
        }

        /**
         * Obtém o valor da propriedade ticketNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Define o valor da propriedade ticketNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketNumber(String value) {
            this.ticketNumber = value;
        }

        /**
         * Obtém o valor da propriedade originalTicketNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * Define o valor da propriedade originalTicketNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * Obtém o valor da propriedade originalIssuePlace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * Define o valor da propriedade originalIssuePlace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * Obtém o valor da propriedade originalIssueDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * Define o valor da propriedade originalIssueDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * Obtém o valor da propriedade originalIssueIATA.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * Define o valor da propriedade originalIssueIATA.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * Obtém o valor da propriedade originalPaymentForm.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * Define o valor da propriedade originalPaymentForm.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * Obtém o valor da propriedade checkInhibitorType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * Define o valor da propriedade checkInhibitorType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }

        /**
         * Obtém o valor da propriedade reroutingType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReroutingType() {
            return reroutingType;
        }

        /**
         * Define o valor da propriedade reroutingType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReroutingType(String value) {
            this.reroutingType = value;
        }

        /**
         * Obtém o valor da propriedade reasonForReroute.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonForReroute() {
            return reasonForReroute;
        }

        /**
         * Define o valor da propriedade reasonForReroute.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonForReroute(String value) {
            this.reasonForReroute = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Coupons"&gt;
         *         &lt;simpleType&gt;
         *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ConjunctionTicketNbr {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Coupons")
            protected List<String> coupons;

            /**
             * Obtém o valor da propriedade value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define o valor da propriedade value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the coupons property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coupons property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoupons().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCoupons() {
                if (coupons == null) {
                    coupons = new ArrayList<String>();
                }
                return this.coupons;
            }

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
     *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SupplierIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Voucher {

        @XmlAttribute(name = "SeriesCode")
        protected String seriesCode;
        @XmlAttribute(name = "BillingNumber")
        protected String billingNumber;
        @XmlAttribute(name = "SupplierIdentifier")
        protected String supplierIdentifier;
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "ValueType")
        protected String valueType;
        @XmlAttribute(name = "ElectronicIndicator")
        protected Boolean electronicIndicator;

        /**
         * Obtém o valor da propriedade seriesCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeriesCode() {
            return seriesCode;
        }

        /**
         * Define o valor da propriedade seriesCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeriesCode(String value) {
            this.seriesCode = value;
        }

        /**
         * Obtém o valor da propriedade billingNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingNumber() {
            return billingNumber;
        }

        /**
         * Define o valor da propriedade billingNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingNumber(String value) {
            this.billingNumber = value;
        }

        /**
         * Obtém o valor da propriedade supplierIdentifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierIdentifier() {
            return supplierIdentifier;
        }

        /**
         * Define o valor da propriedade supplierIdentifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierIdentifier(String value) {
            this.supplierIdentifier = value;
        }

        /**
         * Obtém o valor da propriedade identifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Define o valor da propriedade identifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Obtém o valor da propriedade valueType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * Define o valor da propriedade valueType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

        /**
         * Obtém o valor da propriedade electronicIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isElectronicIndicator() {
            return electronicIndicator;
        }

        /**
         * Define o valor da propriedade electronicIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setElectronicIndicator(Boolean value) {
            this.electronicIndicator = value;
        }

    }

}
