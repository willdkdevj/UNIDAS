//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

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
 * <p>Classe Java de DocumentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DocHolderFormattedName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *           &lt;element name="DocHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DocLimitations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalPersonNames" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfString" minOccurs="0"/&gt;
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
 *       &lt;attribute name="DocIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocIssueLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Gender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Male"/&gt;
 *             &lt;enumeration value="Female"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DocIssueStateProv" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocIssueCountry" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DocHolderNationality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HolderType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Infant"/&gt;
 *             &lt;enumeration value="HeadOfHousehold"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "docHolderFormattedName",
    "docHolderName",
    "docLimitations",
    "additionalPersonNames"
})
public class DocumentType {

    @XmlElement(name = "DocHolderFormattedName")
    protected PersonNameType docHolderFormattedName;
    @XmlElement(name = "DocHolderName")
    protected String docHolderName;
    @XmlElement(name = "DocLimitations")
    protected List<String> docLimitations;
    @XmlElement(name = "AdditionalPersonNames")
    protected ArrayOfString additionalPersonNames;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;
    @XmlAttribute(name = "DocIssueAuthority")
    protected String docIssueAuthority;
    @XmlAttribute(name = "DocIssueLocation")
    protected String docIssueLocation;
    @XmlAttribute(name = "DocID")
    protected String docID;
    @XmlAttribute(name = "DocType")
    protected String docType;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveIndicator")
    protected Boolean expireDateExclusiveIndicator;
    @XmlAttribute(name = "DocIssueStateProv")
    protected String docIssueStateProv;
    @XmlAttribute(name = "DocIssueCountry")
    protected String docIssueCountry;
    @XmlAttribute(name = "BirthCountry")
    protected String birthCountry;
    @XmlAttribute(name = "BirthPlace")
    protected String birthPlace;
    @XmlAttribute(name = "DocHolderNationality")
    protected String docHolderNationality;
    @XmlAttribute(name = "ContactName")
    protected String contactName;
    @XmlAttribute(name = "HolderType")
    protected String holderType;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "PostalCode")
    protected String postalCode;

    /**
     * Obtém o valor da propriedade docHolderFormattedName.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getDocHolderFormattedName() {
        return docHolderFormattedName;
    }

    /**
     * Define o valor da propriedade docHolderFormattedName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setDocHolderFormattedName(PersonNameType value) {
        this.docHolderFormattedName = value;
    }

    /**
     * Obtém o valor da propriedade docHolderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocHolderName() {
        return docHolderName;
    }

    /**
     * Define o valor da propriedade docHolderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocHolderName(String value) {
        this.docHolderName = value;
    }

    /**
     * Gets the value of the docLimitations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docLimitations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocLimitations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocLimitations() {
        if (docLimitations == null) {
            docLimitations = new ArrayList<String>();
        }
        return this.docLimitations;
    }

    /**
     * Obtém o valor da propriedade additionalPersonNames.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAdditionalPersonNames() {
        return additionalPersonNames;
    }

    /**
     * Define o valor da propriedade additionalPersonNames.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAdditionalPersonNames(ArrayOfString value) {
        this.additionalPersonNames = value;
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
     * Obtém o valor da propriedade docIssueAuthority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueAuthority() {
        return docIssueAuthority;
    }

    /**
     * Define o valor da propriedade docIssueAuthority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueAuthority(String value) {
        this.docIssueAuthority = value;
    }

    /**
     * Obtém o valor da propriedade docIssueLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueLocation() {
        return docIssueLocation;
    }

    /**
     * Define o valor da propriedade docIssueLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueLocation(String value) {
        this.docIssueLocation = value;
    }

    /**
     * Obtém o valor da propriedade docID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocID() {
        return docID;
    }

    /**
     * Define o valor da propriedade docID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocID(String value) {
        this.docID = value;
    }

    /**
     * Obtém o valor da propriedade docType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Define o valor da propriedade docType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Obtém o valor da propriedade gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define o valor da propriedade gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtém o valor da propriedade birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define o valor da propriedade birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
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

    /**
     * Obtém o valor da propriedade docIssueStateProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueStateProv() {
        return docIssueStateProv;
    }

    /**
     * Define o valor da propriedade docIssueStateProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueStateProv(String value) {
        this.docIssueStateProv = value;
    }

    /**
     * Obtém o valor da propriedade docIssueCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueCountry() {
        return docIssueCountry;
    }

    /**
     * Define o valor da propriedade docIssueCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueCountry(String value) {
        this.docIssueCountry = value;
    }

    /**
     * Obtém o valor da propriedade birthCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * Define o valor da propriedade birthCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * Obtém o valor da propriedade birthPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Define o valor da propriedade birthPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Obtém o valor da propriedade docHolderNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocHolderNationality() {
        return docHolderNationality;
    }

    /**
     * Define o valor da propriedade docHolderNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocHolderNationality(String value) {
        this.docHolderNationality = value;
    }

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

    /**
     * Obtém o valor da propriedade holderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderType() {
        return holderType;
    }

    /**
     * Define o valor da propriedade holderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderType(String value) {
        this.holderType = value;
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
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
