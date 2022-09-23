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
 * <p>Classe Java de DirectBillType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DirectBillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
 *                 &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *       &lt;attribute name="DirectBill_ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BillingNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectBillType", propOrder = {
    "companyName",
    "address",
    "email",
    "telephone"
})
public class DirectBillType {

    @XmlElement(name = "CompanyName")
    protected DirectBillType.CompanyName companyName;
    @XmlElement(name = "Address")
    protected AddressInfoType address;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Telephone")
    protected DirectBillType.Telephone telephone;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "DirectBill_ID")
    protected String directBillID;
    @XmlAttribute(name = "BillingNumber")
    protected String billingNumber;

    /**
     * Obtém o valor da propriedade companyName.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType.CompanyName }
     *     
     */
    public DirectBillType.CompanyName getCompanyName() {
        return companyName;
    }

    /**
     * Define o valor da propriedade companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType.CompanyName }
     *     
     */
    public void setCompanyName(DirectBillType.CompanyName value) {
        this.companyName = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddress(AddressInfoType value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType.Telephone }
     *     
     */
    public DirectBillType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType.Telephone }
     *     
     */
    public void setTelephone(DirectBillType.Telephone value) {
        this.telephone = value;
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
     * Obtém o valor da propriedade directBillID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectBillID() {
        return directBillID;
    }

    /**
     * Define o valor da propriedade directBillID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectBillID(String value) {
        this.directBillID = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
     *       &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CompanyName
        extends CompanyNameType
    {

        @XmlAttribute(name = "ContactName")
        protected String contactName;

        /**
         * Obtém o valor da propriedade contactName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactName() {
            return contactName;
        }

        /**
         * Define o valor da propriedade contactName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactName(String value) {
            this.contactName = value;
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
