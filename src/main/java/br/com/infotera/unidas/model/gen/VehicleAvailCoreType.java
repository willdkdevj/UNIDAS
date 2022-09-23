//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigDecimal;
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
 * <p>Classe Java de VehicleAvailCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" minOccurs="0"/&gt;
 *         &lt;element name="RentalRate" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalRateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PricedEquips" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleEquipmentPricedType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType1" minOccurs="0"/&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vendor" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
 *                 &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VendorLocation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocInfo"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="WalkToCar"/&gt;
 *                       &lt;enumeration value="ShuttleToCar"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DropOffLocation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
 *       &lt;attribute name="IsAlternateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailCoreType", propOrder = {
    "vehicle",
    "rentalRate",
    "totalCharge",
    "pricedEquips",
    "fees",
    "reference",
    "vendor",
    "vendorLocation",
    "dropOffLocation",
    "tpaExtensions"
})
public class VehicleAvailCoreType {

    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "RentalRate")
    protected List<VehicleRentalRateType> rentalRate;
    @XmlElement(name = "TotalCharge")
    protected List<VehicleAvailCoreType.TotalCharge> totalCharge;
    @XmlElement(name = "PricedEquips")
    protected ArrayOfVehicleEquipmentPricedType pricedEquips;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "Reference")
    protected VehicleAvailCoreType.Reference reference;
    @XmlElement(name = "Vendor")
    protected VehicleAvailCoreType.Vendor vendor;
    @XmlElement(name = "VendorLocation")
    protected VehicleAvailCoreType.VendorLocation vendorLocation;
    @XmlElement(name = "DropOffLocation")
    protected VehicleAvailCoreType.DropOffLocation dropOffLocation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status", required = true)
    protected InventoryStatusType status;
    @XmlAttribute(name = "IsAlternateInd")
    protected Boolean isAlternateInd;

    /**
     * Obtém o valor da propriedade vehicle.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Define o valor da propriedade vehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the rentalRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType }
     * 
     * 
     */
    public List<VehicleRentalRateType> getRentalRate() {
        if (rentalRate == null) {
            rentalRate = new ArrayList<VehicleRentalRateType>();
        }
        return this.rentalRate;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailCoreType.TotalCharge }
     * 
     * 
     */
    public List<VehicleAvailCoreType.TotalCharge> getTotalCharge() {
        if (totalCharge == null) {
            totalCharge = new ArrayList<VehicleAvailCoreType.TotalCharge>();
        }
        return this.totalCharge;
    }

    /**
     * Obtém o valor da propriedade pricedEquips.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public ArrayOfVehicleEquipmentPricedType getPricedEquips() {
        return pricedEquips;
    }

    /**
     * Define o valor da propriedade pricedEquips.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public void setPricedEquips(ArrayOfVehicleEquipmentPricedType value) {
        this.pricedEquips = value;
    }

    /**
     * Obtém o valor da propriedade fees.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public ArrayOfVehicleChargePurposeType1 getFees() {
        return fees;
    }

    /**
     * Define o valor da propriedade fees.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public void setFees(ArrayOfVehicleChargePurposeType1 value) {
        this.fees = value;
    }

    /**
     * Obtém o valor da propriedade reference.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType.Reference }
     *     
     */
    public VehicleAvailCoreType.Reference getReference() {
        return reference;
    }

    /**
     * Define o valor da propriedade reference.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType.Reference }
     *     
     */
    public void setReference(VehicleAvailCoreType.Reference value) {
        this.reference = value;
    }

    /**
     * Obtém o valor da propriedade vendor.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType.Vendor }
     *     
     */
    public VehicleAvailCoreType.Vendor getVendor() {
        return vendor;
    }

    /**
     * Define o valor da propriedade vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType.Vendor }
     *     
     */
    public void setVendor(VehicleAvailCoreType.Vendor value) {
        this.vendor = value;
    }

    /**
     * Obtém o valor da propriedade vendorLocation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType.VendorLocation }
     *     
     */
    public VehicleAvailCoreType.VendorLocation getVendorLocation() {
        return vendorLocation;
    }

    /**
     * Define o valor da propriedade vendorLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType.VendorLocation }
     *     
     */
    public void setVendorLocation(VehicleAvailCoreType.VendorLocation value) {
        this.vendorLocation = value;
    }

    /**
     * Obtém o valor da propriedade dropOffLocation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailCoreType.DropOffLocation }
     *     
     */
    public VehicleAvailCoreType.DropOffLocation getDropOffLocation() {
        return dropOffLocation;
    }

    /**
     * Define o valor da propriedade dropOffLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailCoreType.DropOffLocation }
     *     
     */
    public void setDropOffLocation(VehicleAvailCoreType.DropOffLocation value) {
        this.dropOffLocation = value;
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
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStatusType }
     *     
     */
    public InventoryStatusType getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStatusType }
     *     
     */
    public void setStatus(InventoryStatusType value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade isAlternateInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternateInd() {
        return isAlternateInd;
    }

    /**
     * Define o valor da propriedade isAlternateInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternateInd(Boolean value) {
        this.isAlternateInd = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DropOffLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Obtém o valor da propriedade extendedLocationCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Define o valor da propriedade extendedLocationCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Obtém o valor da propriedade counterLocation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Define o valor da propriedade counterLocation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

        /**
         * Obtém o valor da propriedade name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define o valor da propriedade name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
     *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Reference
        extends UniqueIDType
    {

        @XmlAttribute(name = "DateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;

        /**
         * Obtém o valor da propriedade dateTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Define o valor da propriedade dateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
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
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="RateConvertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalCharge {

        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "RateTotalAmount")
        protected BigDecimal rateTotalAmount;
        @XmlAttribute(name = "EstimatedTotalAmount")
        protected BigDecimal estimatedTotalAmount;
        @XmlAttribute(name = "RateConvertInd")
        protected Boolean rateConvertInd;

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
         * Obtém o valor da propriedade rateTotalAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateTotalAmount() {
            return rateTotalAmount;
        }

        /**
         * Define o valor da propriedade rateTotalAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateTotalAmount(BigDecimal value) {
            this.rateTotalAmount = value;
        }

        /**
         * Obtém o valor da propriedade estimatedTotalAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedTotalAmount() {
            return estimatedTotalAmount;
        }

        /**
         * Define o valor da propriedade estimatedTotalAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedTotalAmount(BigDecimal value) {
            this.estimatedTotalAmount = value;
        }

        /**
         * Obtém o valor da propriedade rateConvertInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRateConvertInd() {
            return rateConvertInd;
        }

        /**
         * Define o valor da propriedade rateConvertInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRateConvertInd(Boolean value) {
            this.rateConvertInd = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNameType"&gt;
     *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vendor
        extends CompanyNameType
    {

        @XmlAttribute(name = "ParticipationLevelCode")
        protected String participationLevelCode;

        /**
         * Obtém o valor da propriedade participationLevelCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipationLevelCode() {
            return participationLevelCode;
        }

        /**
         * Define o valor da propriedade participationLevelCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipationLevelCode(String value) {
            this.participationLevelCode = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CounterLocInfo"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="WalkToCar"/&gt;
     *             &lt;enumeration value="ShuttleToCar"/&gt;
     *           &lt;/restriction&gt;
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
    @XmlType(name = "")
    public static class VendorLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "CounterLocInfo")
        protected String counterLocInfo;

        /**
         * Obtém o valor da propriedade extendedLocationCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedLocationCode() {
            return extendedLocationCode;
        }

        /**
         * Define o valor da propriedade extendedLocationCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedLocationCode(String value) {
            this.extendedLocationCode = value;
        }

        /**
         * Obtém o valor da propriedade counterLocation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocation() {
            return counterLocation;
        }

        /**
         * Define o valor da propriedade counterLocation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocation(String value) {
            this.counterLocation = value;
        }

        /**
         * Obtém o valor da propriedade name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define o valor da propriedade name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtém o valor da propriedade counterLocInfo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounterLocInfo() {
            return counterLocInfo;
        }

        /**
         * Define o valor da propriedade counterLocInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounterLocInfo(String value) {
            this.counterLocInfo = value;
        }

    }

}
