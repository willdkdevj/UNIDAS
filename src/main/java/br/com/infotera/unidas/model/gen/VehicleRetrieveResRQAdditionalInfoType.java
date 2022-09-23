//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleRetrieveResRQAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleRetrieveResRQAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickUpLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="VehPref" type="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SearchDateRange" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SearchQualifier"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="action"/&gt;
 *                       &lt;enumeration value="pickup"/&gt;
 *                       &lt;enumeration value="return"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRetrieveResRQAdditionalInfoType", propOrder = {
    "pickUpLocation",
    "returnLocation",
    "telephone",
    "vendor",
    "vehPref",
    "email",
    "remark",
    "searchDateRange",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.OTAVehRetResRQ.VehRetResRQInfo.class
})
public class VehicleRetrieveResRQAdditionalInfoType {

    @XmlElement(name = "PickUpLocation")
    protected LocationType pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected LocationType returnLocation;
    @XmlElement(name = "Telephone")
    protected VehicleRetrieveResRQAdditionalInfoType.Telephone telephone;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehPref")
    protected VehiclePrefType vehPref;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Remark")
    protected List<ParagraphType> remark;
    @XmlElement(name = "SearchDateRange")
    protected List<VehicleRetrieveResRQAdditionalInfoType.SearchDateRange> searchDateRange;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;

    /**
     * Obtém o valor da propriedade pickUpLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * Define o valor da propriedade pickUpLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPickUpLocation(LocationType value) {
        this.pickUpLocation = value;
    }

    /**
     * Obtém o valor da propriedade returnLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getReturnLocation() {
        return returnLocation;
    }

    /**
     * Define o valor da propriedade returnLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setReturnLocation(LocationType value) {
        this.returnLocation = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRetrieveResRQAdditionalInfoType.Telephone }
     *     
     */
    public VehicleRetrieveResRQAdditionalInfoType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRetrieveResRQAdditionalInfoType.Telephone }
     *     
     */
    public void setTelephone(VehicleRetrieveResRQAdditionalInfoType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Obtém o valor da propriedade vendor.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getVendor() {
        return vendor;
    }

    /**
     * Define o valor da propriedade vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setVendor(CompanyNameType value) {
        this.vendor = value;
    }

    /**
     * Obtém o valor da propriedade vehPref.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrefType }
     *     
     */
    public VehiclePrefType getVehPref() {
        return vehPref;
    }

    /**
     * Define o valor da propriedade vehPref.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrefType }
     *     
     */
    public void setVehPref(VehiclePrefType value) {
        this.vehPref = value;
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
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<ParagraphType>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the searchDateRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDateRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDateRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRetrieveResRQAdditionalInfoType.SearchDateRange }
     * 
     * 
     */
    public List<VehicleRetrieveResRQAdditionalInfoType.SearchDateRange> getSearchDateRange() {
        if (searchDateRange == null) {
            searchDateRange = new ArrayList<VehicleRetrieveResRQAdditionalInfoType.SearchDateRange>();
        }
        return this.searchDateRange;
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
     * Obtém o valor da propriedade pickUpDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpDateTime() {
        return pickUpDateTime;
    }

    /**
     * Define o valor da propriedade pickUpDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpDateTime(XMLGregorianCalendar value) {
        this.pickUpDateTime = value;
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
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SearchQualifier"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="action"/&gt;
     *             &lt;enumeration value="pickup"/&gt;
     *             &lt;enumeration value="return"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SearchDateRange {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "SearchQualifier")
        protected String searchQualifier;

        /**
         * Obtém o valor da propriedade start.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Define o valor da propriedade start.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Obtém o valor da propriedade duration.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Define o valor da propriedade duration.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Obtém o valor da propriedade end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Define o valor da propriedade end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Obtém o valor da propriedade searchQualifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchQualifier() {
            return searchQualifier;
        }

        /**
         * Define o valor da propriedade searchQualifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchQualifier(String value) {
            this.searchQualifier = value;
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


    }

}
