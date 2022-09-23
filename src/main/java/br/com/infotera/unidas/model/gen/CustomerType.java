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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de CustomerType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PhoneUseType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;EmailType"&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *                   &lt;element name="AddresseeName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ValidationStatus"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="SystemValidated"/&gt;
 *                       &lt;enumeration value="UserValidated"/&gt;
 *                       &lt;enumeration value="NotChecked"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="URL" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;URL_Type"&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CitizenCountryName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PhysChallName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="PhysChallInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PetInfo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentForm" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AssociatedSupplier" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
 *                 &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RelatedTraveler" type="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                 &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmployeeInfo" type="{http://www.opentravel.org/OTA/2003/05}EmployeeInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmployerInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalLanguage" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Gender"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Male"/&gt;
 *             &lt;enumeration value="Female"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Deceased" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LockoutType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="VIP_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MaritalStatus"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Annulled"/&gt;
 *             &lt;enumeration value="Co-habitating"/&gt;
 *             &lt;enumeration value="Divorced"/&gt;
 *             &lt;enumeration value="Engaged"/&gt;
 *             &lt;enumeration value="Married"/&gt;
 *             &lt;enumeration value="Separated"/&gt;
 *             &lt;enumeration value="Single"/&gt;
 *             &lt;enumeration value="Widowed"/&gt;
 *             &lt;enumeration value="Unknown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="PreviouslyMarriedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChildQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "personName",
    "telephone",
    "email",
    "address",
    "url",
    "citizenCountryName",
    "physChallName",
    "petInfo",
    "paymentForm",
    "relatedTraveler",
    "contactPerson",
    "document",
    "custLoyalty",
    "employeeInfo",
    "employerInfo",
    "additionalLanguage",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.CustomerPrimaryAdditionalType.Primary.class,
    br.com.infotera.unidas.model.gen.CustomerPrimaryAdditionalType.Additional.class
})
public class CustomerType {

    @XmlElement(name = "PersonName")
    protected List<PersonNameType> personName;
    @XmlElement(name = "Telephone")
    protected List<CustomerType.Telephone> telephone;
    @XmlElement(name = "Email")
    protected List<CustomerType.Email> email;
    @XmlElement(name = "Address")
    protected List<CustomerType.Address> address;
    @XmlElement(name = "URL")
    protected List<CustomerType.URL> url;
    @XmlElement(name = "CitizenCountryName")
    protected List<CustomerType.CitizenCountryName> citizenCountryName;
    @XmlElement(name = "PhysChallName")
    protected List<CustomerType.PhysChallName> physChallName;
    @XmlElement(name = "PetInfo")
    protected List<String> petInfo;
    @XmlElement(name = "PaymentForm")
    protected List<CustomerType.PaymentForm> paymentForm;
    @XmlElement(name = "RelatedTraveler")
    protected List<RelatedTravelerType> relatedTraveler;
    @XmlElement(name = "ContactPerson")
    protected List<ContactPersonType> contactPerson;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "CustLoyalty")
    protected List<CustomerType.CustLoyalty> custLoyalty;
    @XmlElement(name = "EmployeeInfo")
    protected List<EmployeeInfoType> employeeInfo;
    @XmlElement(name = "EmployerInfo")
    protected CompanyNameType employerInfo;
    @XmlElement(name = "AdditionalLanguage")
    protected List<CustomerType.AdditionalLanguage> additionalLanguage;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "Deceased")
    protected Boolean deceased;
    @XmlAttribute(name = "LockoutType")
    protected String lockoutType;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "VIP_Indicator")
    protected Boolean vipIndicator;
    @XmlAttribute(name = "Text")
    protected String text;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "CustomerValue")
    protected String customerValue;
    @XmlAttribute(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlAttribute(name = "PreviouslyMarriedIndicator")
    protected Boolean previouslyMarriedIndicator;
    @XmlAttribute(name = "ChildQuantity")
    protected BigInteger childQuantity;

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
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
     * {@link CustomerType.Telephone }
     * 
     * 
     */
    public List<CustomerType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CustomerType.Telephone>();
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
     * {@link CustomerType.Email }
     * 
     * 
     */
    public List<CustomerType.Email> getEmail() {
        if (email == null) {
            email = new ArrayList<CustomerType.Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.Address }
     * 
     * 
     */
    public List<CustomerType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<CustomerType.Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.URL }
     * 
     * 
     */
    public List<CustomerType.URL> getURL() {
        if (url == null) {
            url = new ArrayList<CustomerType.URL>();
        }
        return this.url;
    }

    /**
     * Gets the value of the citizenCountryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenCountryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenCountryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.CitizenCountryName }
     * 
     * 
     */
    public List<CustomerType.CitizenCountryName> getCitizenCountryName() {
        if (citizenCountryName == null) {
            citizenCountryName = new ArrayList<CustomerType.CitizenCountryName>();
        }
        return this.citizenCountryName;
    }

    /**
     * Gets the value of the physChallName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physChallName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysChallName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.PhysChallName }
     * 
     * 
     */
    public List<CustomerType.PhysChallName> getPhysChallName() {
        if (physChallName == null) {
            physChallName = new ArrayList<CustomerType.PhysChallName>();
        }
        return this.physChallName;
    }

    /**
     * Gets the value of the petInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPetInfo() {
        if (petInfo == null) {
            petInfo = new ArrayList<String>();
        }
        return this.petInfo;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.PaymentForm }
     * 
     * 
     */
    public List<CustomerType.PaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<CustomerType.PaymentForm>();
        }
        return this.paymentForm;
    }

    /**
     * Gets the value of the relatedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTravelerType }
     * 
     * 
     */
    public List<RelatedTravelerType> getRelatedTraveler() {
        if (relatedTraveler == null) {
            relatedTraveler = new ArrayList<RelatedTravelerType>();
        }
        return this.relatedTraveler;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPersonType>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
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
     * {@link CustomerType.CustLoyalty }
     * 
     * 
     */
    public List<CustomerType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<CustomerType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * Gets the value of the employeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeInfoType }
     * 
     * 
     */
    public List<EmployeeInfoType> getEmployeeInfo() {
        if (employeeInfo == null) {
            employeeInfo = new ArrayList<EmployeeInfoType>();
        }
        return this.employeeInfo;
    }

    /**
     * Obtém o valor da propriedade employerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getEmployerInfo() {
        return employerInfo;
    }

    /**
     * Define o valor da propriedade employerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setEmployerInfo(CompanyNameType value) {
        this.employerInfo = value;
    }

    /**
     * Gets the value of the additionalLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType.AdditionalLanguage }
     * 
     * 
     */
    public List<CustomerType.AdditionalLanguage> getAdditionalLanguage() {
        if (additionalLanguage == null) {
            additionalLanguage = new ArrayList<CustomerType.AdditionalLanguage>();
        }
        return this.additionalLanguage;
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
     * Obtém o valor da propriedade deceased.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceased() {
        return deceased;
    }

    /**
     * Define o valor da propriedade deceased.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceased(Boolean value) {
        this.deceased = value;
    }

    /**
     * Obtém o valor da propriedade lockoutType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockoutType() {
        return lockoutType;
    }

    /**
     * Define o valor da propriedade lockoutType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockoutType(String value) {
        this.lockoutType = value;
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
     * Obtém o valor da propriedade vipIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIPIndicator() {
        return vipIndicator;
    }

    /**
     * Define o valor da propriedade vipIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIPIndicator(Boolean value) {
        this.vipIndicator = value;
    }

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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

    /**
     * Obtém o valor da propriedade maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define o valor da propriedade maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtém o valor da propriedade previouslyMarriedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviouslyMarriedIndicator() {
        return previouslyMarriedIndicator;
    }

    /**
     * Define o valor da propriedade previouslyMarriedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviouslyMarriedIndicator(Boolean value) {
        this.previouslyMarriedIndicator = value;
    }

    /**
     * Obtém o valor da propriedade childQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildQuantity() {
        return childQuantity;
    }

    /**
     * Define o valor da propriedade childQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildQuantity(BigInteger value) {
        this.childQuantity = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalLanguage {

        @XmlAttribute(name = "Code")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String code;

        /**
         * Obtém o valor da propriedade code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define o valor da propriedade code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressInfoType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CompanyName" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
     *         &lt;element name="AddresseeName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ValidationStatus"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="SystemValidated"/&gt;
     *             &lt;enumeration value="UserValidated"/&gt;
     *             &lt;enumeration value="NotChecked"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyName",
        "addresseeName"
    })
    public static class Address
        extends AddressInfoType
    {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlElement(name = "AddresseeName")
        protected PersonNameType addresseeName;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "ValidationStatus")
        protected String validationStatus;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * Obtém o valor da propriedade companyName.
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * Define o valor da propriedade companyName.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * Obtém o valor da propriedade addresseeName.
         * 
         * @return
         *     possible object is
         *     {@link PersonNameType }
         *     
         */
        public PersonNameType getAddresseeName() {
            return addresseeName;
        }

        /**
         * Define o valor da propriedade addresseeName.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonNameType }
         *     
         */
        public void setAddresseeName(PersonNameType value) {
            this.addresseeName = value;
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
         * Obtém o valor da propriedade validationStatus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidationStatus() {
            return validationStatus;
        }

        /**
         * Define o valor da propriedade validationStatus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidationStatus(String value) {
            this.validationStatus = value;
        }

        /**
         * Obtém o valor da propriedade transferAction.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Define o valor da propriedade transferAction.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * Obtém o valor da propriedade parentCompanyRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * Define o valor da propriedade parentCompanyRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CitizenCountryName {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Obtém o valor da propriedade code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define o valor da propriedade code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlAttribute(name = "Remark")
        protected String remark;

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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;EmailType"&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Email
        extends EmailType
    {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * Obtém o valor da propriedade transferAction.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Define o valor da propriedade transferAction.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * Obtém o valor da propriedade parentCompanyRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * Define o valor da propriedade parentCompanyRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AssociatedSupplier" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *       &lt;attribute name="DefaultInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associatedSupplier"
    })
    public static class PaymentForm
        extends PaymentFormType
    {

        @XmlElement(name = "AssociatedSupplier")
        protected CustomerType.PaymentForm.AssociatedSupplier associatedSupplier;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;

        /**
         * Obtém o valor da propriedade associatedSupplier.
         * 
         * @return
         *     possible object is
         *     {@link CustomerType.PaymentForm.AssociatedSupplier }
         *     
         */
        public CustomerType.PaymentForm.AssociatedSupplier getAssociatedSupplier() {
            return associatedSupplier;
        }

        /**
         * Define o valor da propriedade associatedSupplier.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerType.PaymentForm.AssociatedSupplier }
         *     
         */
        public void setAssociatedSupplier(CustomerType.PaymentForm.AssociatedSupplier value) {
            this.associatedSupplier = value;
        }

        /**
         * Obtém o valor da propriedade transferAction.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Define o valor da propriedade transferAction.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * Obtém o valor da propriedade defaultInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultInd() {
            return defaultInd;
        }

        /**
         * Define o valor da propriedade defaultInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
        }

        /**
         * Obtém o valor da propriedade parentCompanyRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * Define o valor da propriedade parentCompanyRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
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
         *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="TravelSector" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AssociatedSupplier {

            @XmlAttribute(name = "CompanyShortName")
            protected String companyShortName;
            @XmlAttribute(name = "TravelSector")
            protected String travelSector;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;

            /**
             * Obtém o valor da propriedade companyShortName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompanyShortName() {
                return companyShortName;
            }

            /**
             * Define o valor da propriedade companyShortName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompanyShortName(String value) {
                this.companyShortName = value;
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
             * Obtém o valor da propriedade code.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Define o valor da propriedade code.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Obtém o valor da propriedade codeContext.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeContext() {
                return codeContext;
            }

            /**
             * Define o valor da propriedade codeContext.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeContext(String value) {
                this.codeContext = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="PhysChallInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    public static class PhysChallName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PhysChallInd")
        protected Boolean physChallInd;

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
         * Obtém o valor da propriedade physChallInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPhysChallInd() {
            return physChallInd;
        }

        /**
         * Define o valor da propriedade physChallInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPhysChallInd(Boolean value) {
            this.physChallInd = value;
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
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ExpireDateExclusiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *       &lt;attribute name="ParentCompanyRef" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AreaCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PhoneUseType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;
        @XmlAttribute(name = "ParentCompanyRef")
        protected String parentCompanyRef;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;

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
         * Obtém o valor da propriedade transferAction.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Define o valor da propriedade transferAction.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

        /**
         * Obtém o valor da propriedade parentCompanyRef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCompanyRef() {
            return parentCompanyRef;
        }

        /**
         * Define o valor da propriedade parentCompanyRef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCompanyRef(String value) {
            this.parentCompanyRef = value;
        }

        /**
         * Obtém o valor da propriedade phoneNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Define o valor da propriedade phoneNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

        /**
         * Obtém o valor da propriedade areaCityCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * Define o valor da propriedade areaCityCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * Obtém o valor da propriedade phoneUseType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * Define o valor da propriedade phoneUseType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;URL_Type"&gt;
     *       &lt;attribute name="TransferAction" type="{http://www.opentravel.org/OTA/2003/05}TransferActionType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class URL
        extends URLType
    {

        @XmlAttribute(name = "TransferAction")
        protected TransferActionType transferAction;

        /**
         * Obtém o valor da propriedade transferAction.
         * 
         * @return
         *     possible object is
         *     {@link TransferActionType }
         *     
         */
        public TransferActionType getTransferAction() {
            return transferAction;
        }

        /**
         * Define o valor da propriedade transferAction.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferActionType }
         *     
         */
        public void setTransferAction(TransferActionType value) {
            this.transferAction = value;
        }

    }

}
