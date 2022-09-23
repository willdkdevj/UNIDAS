//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PaymentCardType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuerName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VendorCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SignatureOnFile" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MagneticStripe" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Track1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
 *                 &lt;attribute name="Track2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
 *                 &lt;attribute name="Track3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaskedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CardHolderRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExtendPaymentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CountryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExtendedPaymentQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CompanyCardReference" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardHolderName",
    "cardIssuerName",
    "address",
    "telephone",
    "email",
    "custLoyalty",
    "signatureOnFile",
    "magneticStripe"
})
public class PaymentCardType {

    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuerName")
    protected PaymentCardType.CardIssuerName cardIssuerName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Telephone")
    protected List<PaymentCardType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "CustLoyalty")
    protected List<PaymentCardType.CustLoyalty> custLoyalty;
    @XmlElement(name = "SignatureOnFile")
    protected PaymentCardType.SignatureOnFile signatureOnFile;
    @XmlElement(name = "MagneticStripe")
    protected PaymentCardType.MagneticStripe magneticStripe;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "CardType")
    protected String cardType;
    @XmlAttribute(name = "CardCode")
    protected String cardCode;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "SeriesCode")
    protected String seriesCode;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;
    @XmlAttribute(name = "MaskedCardNumber")
    protected String maskedCardNumber;
    @XmlAttribute(name = "CardHolderRPH")
    protected String cardHolderRPH;
    @XmlAttribute(name = "ExtendPaymentIndicator")
    protected Boolean extendPaymentIndicator;
    @XmlAttribute(name = "CountryOfIssue")
    protected String countryOfIssue;
    @XmlAttribute(name = "ExtendedPaymentQuantity")
    protected BigInteger extendedPaymentQuantity;
    @XmlAttribute(name = "SignatureOnFileIndicator")
    protected Boolean signatureOnFileIndicator;
    @XmlAttribute(name = "CompanyCardReference")
    protected String companyCardReference;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "EncryptionKey")
    protected String encryptionKey;

    /**
     * Obtém o valor da propriedade cardHolderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Define o valor da propriedade cardHolderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Obtém o valor da propriedade cardIssuerName.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public PaymentCardType.CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Define o valor da propriedade cardIssuerName.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public void setCardIssuerName(PaymentCardType.CardIssuerName value) {
        this.cardIssuerName = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType.Telephone }
     * 
     * 
     */
    public List<PaymentCardType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<PaymentCardType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType.CustLoyalty }
     * 
     * 
     */
    public List<PaymentCardType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<PaymentCardType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Obtém o valor da propriedade signatureOnFile.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public PaymentCardType.SignatureOnFile getSignatureOnFile() {
        return signatureOnFile;
    }

    /**
     * Define o valor da propriedade signatureOnFile.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.SignatureOnFile }
     *     
     */
    public void setSignatureOnFile(PaymentCardType.SignatureOnFile value) {
        this.signatureOnFile = value;
    }

    /**
     * Obtém o valor da propriedade magneticStripe.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.MagneticStripe }
     *     
     */
    public PaymentCardType.MagneticStripe getMagneticStripe() {
        return magneticStripe;
    }

    /**
     * Define o valor da propriedade magneticStripe.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.MagneticStripe }
     *     
     */
    public void setMagneticStripe(PaymentCardType.MagneticStripe value) {
        this.magneticStripe = value;
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
     * Obtém o valor da propriedade cardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Define o valor da propriedade cardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Obtém o valor da propriedade cardCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Define o valor da propriedade cardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Obtém o valor da propriedade cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define o valor da propriedade cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

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
     * Obtém o valor da propriedade effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define o valor da propriedade effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Obtém o valor da propriedade expireDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Define o valor da propriedade expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Obtém o valor da propriedade maskedCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Define o valor da propriedade maskedCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * Obtém o valor da propriedade cardHolderRPH.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /**
     * Define o valor da propriedade cardHolderRPH.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderRPH(String value) {
        this.cardHolderRPH = value;
    }

    /**
     * Obtém o valor da propriedade extendPaymentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendPaymentIndicator() {
        return extendPaymentIndicator;
    }

    /**
     * Define o valor da propriedade extendPaymentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendPaymentIndicator(Boolean value) {
        this.extendPaymentIndicator = value;
    }

    /**
     * Obtém o valor da propriedade countryOfIssue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Define o valor da propriedade countryOfIssue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

    /**
     * Obtém o valor da propriedade extendedPaymentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtendedPaymentQuantity() {
        return extendedPaymentQuantity;
    }

    /**
     * Define o valor da propriedade extendedPaymentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtendedPaymentQuantity(BigInteger value) {
        this.extendedPaymentQuantity = value;
    }

    /**
     * Obtém o valor da propriedade signatureOnFileIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureOnFileIndicator() {
        return signatureOnFileIndicator;
    }

    /**
     * Define o valor da propriedade signatureOnFileIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureOnFileIndicator(Boolean value) {
        this.signatureOnFileIndicator = value;
    }

    /**
     * Obtém o valor da propriedade companyCardReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCardReference() {
        return companyCardReference;
    }

    /**
     * Define o valor da propriedade companyCardReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCardReference(String value) {
        this.companyCardReference = value;
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
     * Obtém o valor da propriedade encryptionKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Define o valor da propriedade encryptionKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
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
     *       &lt;attribute name="BankID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CardIssuerName {

        @XmlAttribute(name = "BankID")
        protected String bankID;

        /**
         * Obtém o valor da propriedade bankID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * Define o valor da propriedade bankID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
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
     *       &lt;attribute name="ProgramID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="MembershipID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VendorCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="PrimaryLoyaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AllianceLoyaltyLevelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;

        /**
         * Obtém o valor da propriedade programID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Define o valor da propriedade programID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Obtém o valor da propriedade membershipID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Define o valor da propriedade membershipID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * Obtém o valor da propriedade travelSector.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Define o valor da propriedade travelSector.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
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
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Obtém o valor da propriedade primaryLoyaltyIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Define o valor da propriedade primaryLoyaltyIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Obtém o valor da propriedade allianceLoyaltyLevelName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Define o valor da propriedade allianceLoyaltyLevelName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Obtém o valor da propriedade customerType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Define o valor da propriedade customerType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Obtém o valor da propriedade customerValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Define o valor da propriedade customerValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
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
     *       &lt;attribute name="Track1" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
     *       &lt;attribute name="Track2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
     *       &lt;attribute name="Track3" type="{http://www.w3.org/2001/XMLSchema}base64Binary" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MagneticStripe {

        @XmlAttribute(name = "Track1")
        protected byte[] track1;
        @XmlAttribute(name = "Track2")
        protected byte[] track2;
        @XmlAttribute(name = "Track3")
        protected byte[] track3;

        /**
         * Obtém o valor da propriedade track1.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack1() {
            return track1;
        }

        /**
         * Define o valor da propriedade track1.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack1(byte[] value) {
            this.track1 = value;
        }

        /**
         * Obtém o valor da propriedade track2.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack2() {
            return track2;
        }

        /**
         * Define o valor da propriedade track2.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack2(byte[] value) {
            this.track2 = value;
        }

        /**
         * Obtém o valor da propriedade track3.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getTrack3() {
            return track3;
        }

        /**
         * Define o valor da propriedade track3.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setTrack3(byte[] value) {
            this.track3 = value;
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
     *       &lt;attribute name="SignatureOnFileIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureOnFile {

        @XmlAttribute(name = "SignatureOnFileIndicator")
        protected Boolean signatureOnFileIndicator;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;

        /**
         * Obtém o valor da propriedade signatureOnFileIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignatureOnFileIndicator() {
            return signatureOnFileIndicator;
        }

        /**
         * Define o valor da propriedade signatureOnFileIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignatureOnFileIndicator(Boolean value) {
            this.signatureOnFileIndicator = value;
        }

        /**
         * Obtém o valor da propriedade effectiveDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Define o valor da propriedade effectiveDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Obtém o valor da propriedade expireDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Define o valor da propriedade expireDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Obtém o valor da propriedade expireDateExclusiveIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Define o valor da propriedade expireDateExclusiveIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
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
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "RPH")
        protected String rph;

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

    }

}
