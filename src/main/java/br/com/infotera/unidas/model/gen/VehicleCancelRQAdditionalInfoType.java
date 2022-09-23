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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleCancelRQAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleCancelRQAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustLoyalty" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
 *                 &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="RentalInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PickUpLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                   &lt;element name="ReturnLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCancelRQAdditionalInfoType", propOrder = {
    "custLoyalty",
    "telephone",
    "vendor",
    "rentalInfo",
    "tpaExtensions"
})
public class VehicleCancelRQAdditionalInfoType {

    @XmlElement(name = "CustLoyalty")
    protected VehicleCancelRQAdditionalInfoType.CustLoyalty custLoyalty;
    @XmlElement(name = "Telephone")
    protected VehicleCancelRQAdditionalInfoType.Telephone telephone;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "RentalInfo")
    protected VehicleCancelRQAdditionalInfoType.RentalInfo rentalInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade custLoyalty.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCancelRQAdditionalInfoType.CustLoyalty }
     *     
     */
    public VehicleCancelRQAdditionalInfoType.CustLoyalty getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * Define o valor da propriedade custLoyalty.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCancelRQAdditionalInfoType.CustLoyalty }
     *     
     */
    public void setCustLoyalty(VehicleCancelRQAdditionalInfoType.CustLoyalty value) {
        this.custLoyalty = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCancelRQAdditionalInfoType.Telephone }
     *     
     */
    public VehicleCancelRQAdditionalInfoType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCancelRQAdditionalInfoType.Telephone }
     *     
     */
    public void setTelephone(VehicleCancelRQAdditionalInfoType.Telephone value) {
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
     * Obtém o valor da propriedade rentalInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCancelRQAdditionalInfoType.RentalInfo }
     *     
     */
    public VehicleCancelRQAdditionalInfoType.RentalInfo getRentalInfo() {
        return rentalInfo;
    }

    /**
     * Define o valor da propriedade rentalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCancelRQAdditionalInfoType.RentalInfo }
     *     
     */
    public void setRentalInfo(VehicleCancelRQAdditionalInfoType.RentalInfo value) {
        this.rentalInfo = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
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
     *       &lt;attribute name="CustomerValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerType"
    })
    public static class CustLoyalty {

        @XmlElement(name = "CustomerType")
        protected String customerType;
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
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;

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
     *       &lt;sequence&gt;
     *         &lt;element name="PickUpLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *         &lt;element name="ReturnLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pickUpLocation",
        "returnLocation"
    })
    public static class RentalInfo {

        @XmlElement(name = "PickUpLocation")
        protected LocationType pickUpLocation;
        @XmlElement(name = "ReturnLocation")
        protected LocationType returnLocation;
        @XmlAttribute(name = "PickUpDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar pickUpDateTime;
        @XmlAttribute(name = "ReturnDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar returnDateTime;

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
         * Obtém o valor da propriedade returnDateTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getReturnDateTime() {
            return returnDateTime;
        }

        /**
         * Define o valor da propriedade returnDateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setReturnDateTime(XMLGregorianCalendar value) {
            this.returnDateTime = value;
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
