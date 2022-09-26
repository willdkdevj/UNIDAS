//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import java.math.BigDecimal;
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


/**
 * <p>Classe Java de VehicleReservationRQCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType" minOccurs="0"/&gt;
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" minOccurs="0"/&gt;
 *         &lt;element name="VehPref" type="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType" minOccurs="0"/&gt;
 *         &lt;element name="DriverType" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateQualifier" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType1" minOccurs="0"/&gt;
 *         &lt;element name="VehicleCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialEquipPrefs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SpecialEquipPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateDistance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *                 &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalCharge" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Queue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQCoreType", propOrder = {
    "uniqueID",
    "vehRentalCore",
    "customer",
    "vendorPref",
    "vehPref",
    "driverType",
    "rateQualifier",
    "fees",
    "vehicleCharges",
    "specialEquipPrefs",
    "rateDistance",
    "totalCharge",
    "queue",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.OTAVehResRQ.VehResRQCore.class
})
public class VehicleReservationRQCoreType {

    @XmlElement(name = "UniqueID")
    protected List<UniqueIDType> uniqueID;
    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "Customer")
    protected CustomerPrimaryAdditionalType customer;
    @XmlElement(name = "VendorPref")
    protected CompanyNamePrefType vendorPref;
    @XmlElement(name = "VehPref")
    protected VehiclePrefType vehPref;
    @XmlElement(name = "DriverType")
    protected List<VehicleReservationRQCoreType.DriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected RateQualifierType rateQualifier;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "VehicleCharges")
    protected ArrayOfVehicleChargePurposeType vehicleCharges;
    @XmlElement(name = "SpecialEquipPrefs")
    protected VehicleReservationRQCoreType.SpecialEquipPrefs specialEquipPrefs;
    @XmlElement(name = "RateDistance")
    protected List<VehicleReservationRQCoreType.RateDistance> rateDistance;
    @XmlElement(name = "TotalCharge")
    protected VehicleReservationRQCoreType.TotalCharge totalCharge;
    @XmlElement(name = "Queue")
    protected VehicleReservationRQCoreType.Queue queue;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the uniqueID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getUniqueID() {
        if (uniqueID == null) {
            uniqueID = new ArrayList<UniqueIDType>();
        }
        return this.uniqueID;
    }

    /**
     * Obtém o valor da propriedade vehRentalCore.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Define o valor da propriedade vehRentalCore.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public CustomerPrimaryAdditionalType getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public void setCustomer(CustomerPrimaryAdditionalType value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade vendorPref.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNamePrefType }
     *     
     */
    public CompanyNamePrefType getVendorPref() {
        return vendorPref;
    }

    /**
     * Define o valor da propriedade vendorPref.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNamePrefType }
     *     
     */
    public void setVendorPref(CompanyNamePrefType value) {
        this.vendorPref = value;
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
     * Gets the value of the driverType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQCoreType.DriverType }
     * 
     * 
     */
    public List<VehicleReservationRQCoreType.DriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<VehicleReservationRQCoreType.DriverType>();
        }
        return this.driverType;
    }

    /**
     * Obtém o valor da propriedade rateQualifier.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierType }
     *     
     */
    public RateQualifierType getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Define o valor da propriedade rateQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierType }
     *     
     */
    public void setRateQualifier(RateQualifierType value) {
        this.rateQualifier = value;
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
     * Obtém o valor da propriedade vehicleCharges.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public ArrayOfVehicleChargePurposeType getVehicleCharges() {
        return vehicleCharges;
    }

    /**
     * Define o valor da propriedade vehicleCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType }
     *     
     */
    public void setVehicleCharges(ArrayOfVehicleChargePurposeType value) {
        this.vehicleCharges = value;
    }

    /**
     * Obtém o valor da propriedade specialEquipPrefs.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreType.SpecialEquipPrefs }
     *     
     */
    public VehicleReservationRQCoreType.SpecialEquipPrefs getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Define o valor da propriedade specialEquipPrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreType.SpecialEquipPrefs }
     *     
     */
    public void setSpecialEquipPrefs(VehicleReservationRQCoreType.SpecialEquipPrefs value) {
        this.specialEquipPrefs = value;
    }

    /**
     * Gets the value of the rateDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQCoreType.RateDistance }
     * 
     * 
     */
    public List<VehicleReservationRQCoreType.RateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleReservationRQCoreType.RateDistance>();
        }
        return this.rateDistance;
    }

    /**
     * Obtém o valor da propriedade totalCharge.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreType.TotalCharge }
     *     
     */
    public VehicleReservationRQCoreType.TotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * Define o valor da propriedade totalCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreType.TotalCharge }
     *     
     */
    public void setTotalCharge(VehicleReservationRQCoreType.TotalCharge value) {
        this.totalCharge = value;
    }

    /**
     * Obtém o valor da propriedade queue.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQCoreType.Queue }
     *     
     */
    public VehicleReservationRQCoreType.Queue getQueue() {
        return queue;
    }

    /**
     * Define o valor da propriedade queue.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQCoreType.Queue }
     *     
     */
    public void setQueue(VehicleReservationRQCoreType.Queue value) {
        this.queue = value;
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DriverType {

        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Obtém o valor da propriedade age.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * Define o valor da propriedade age.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAge(BigInteger value) {
            this.age = value;
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

        /**
         * Obtém o valor da propriedade uri.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Define o valor da propriedade uri.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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
     *       &lt;attribute name="PseudoCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SystemCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QueueID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Queue {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "QueueNumber")
        protected String queueNumber;
        @XmlAttribute(name = "QueueCategory")
        protected String queueCategory;
        @XmlAttribute(name = "SystemCode")
        protected String systemCode;
        @XmlAttribute(name = "QueueID")
        protected String queueID;

        /**
         * Obtém o valor da propriedade pseudoCityCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Define o valor da propriedade pseudoCityCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * Obtém o valor da propriedade queueNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueNumber() {
            return queueNumber;
        }

        /**
         * Define o valor da propriedade queueNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueNumber(String value) {
            this.queueNumber = value;
        }

        /**
         * Obtém o valor da propriedade queueCategory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueCategory() {
            return queueCategory;
        }

        /**
         * Define o valor da propriedade queueCategory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueCategory(String value) {
            this.queueCategory = value;
        }

        /**
         * Obtém o valor da propriedade systemCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemCode() {
            return systemCode;
        }

        /**
         * Define o valor da propriedade systemCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemCode(String value) {
            this.systemCode = value;
        }

        /**
         * Obtém o valor da propriedade queueID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * Define o valor da propriedade queueID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
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
     *       &lt;attribute name="Unlimited" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
     *       &lt;attribute name="VehiclePeriodUnitName" type="{http://www.opentravel.org/OTA/2003/05}VehiclePeriodUnitNameType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateDistance {

        @XmlAttribute(name = "Unlimited", required = true)
        protected boolean unlimited;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "DistUnitName")
        protected DistanceUnitNameType distUnitName;
        @XmlAttribute(name = "VehiclePeriodUnitName")
        protected VehiclePeriodUnitNameType vehiclePeriodUnitName;

        /**
         * Obtém o valor da propriedade unlimited.
         * 
         */
        public boolean isUnlimited() {
            return unlimited;
        }

        /**
         * Define o valor da propriedade unlimited.
         * 
         */
        public void setUnlimited(boolean value) {
            this.unlimited = value;
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
         * Obtém o valor da propriedade distUnitName.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public DistanceUnitNameType getDistUnitName() {
            return distUnitName;
        }

        /**
         * Define o valor da propriedade distUnitName.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public void setDistUnitName(DistanceUnitNameType value) {
            this.distUnitName = value;
        }

        /**
         * Obtém o valor da propriedade vehiclePeriodUnitName.
         * 
         * @return
         *     possible object is
         *     {@link VehiclePeriodUnitNameType }
         *     
         */
        public VehiclePeriodUnitNameType getVehiclePeriodUnitName() {
            return vehiclePeriodUnitName;
        }

        /**
         * Define o valor da propriedade vehiclePeriodUnitName.
         * 
         * @param value
         *     allowed object is
         *     {@link VehiclePeriodUnitNameType }
         *     
         */
        public void setVehiclePeriodUnitName(VehiclePeriodUnitNameType value) {
            this.vehiclePeriodUnitName = value;
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
     *         &lt;element name="SpecialEquipPref" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialEquipPref",
        "charge"
    })
    public static class SpecialEquipPrefs {

        @XmlElement(name = "SpecialEquipPref")
        protected List<VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref> specialEquipPref;
        @XmlElement(name = "Charge")
        protected VehicleChargeType charge;

        /**
         * Gets the value of the specialEquipPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialEquipPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref }
         * 
         * 
         */
        public List<VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref> getSpecialEquipPref() {
            if (specialEquipPref == null) {
                specialEquipPref = new ArrayList<VehicleReservationRQCoreType.SpecialEquipPrefs.SpecialEquipPref>();
            }
            return this.specialEquipPref;
        }

        /**
         * Obtém o valor da propriedade charge.
         * 
         * @return
         *     possible object is
         *     {@link VehicleChargeType }
         *     
         */
        public VehicleChargeType getCharge() {
            return charge;
        }

        /**
         * Define o valor da propriedade charge.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleChargeType }
         *     
         */
        public void setCharge(VehicleChargeType value) {
            this.charge = value;
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
         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SpecialEquipPref {

            @XmlAttribute(name = "Quantity")
            protected String quantity;
            @XmlAttribute(name = "EquipType")
            protected String equipType;
            @XmlAttribute(name = "Action")
            protected ActionType action;

            /**
             * Obtém o valor da propriedade quantity.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuantity() {
                return quantity;
            }

            /**
             * Define o valor da propriedade quantity.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(String value) {
                this.quantity = value;
            }

            /**
             * Obtém o valor da propriedade equipType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEquipType() {
                return equipType;
            }

            /**
             * Define o valor da propriedade equipType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEquipType(String value) {
                this.equipType = value;
            }

            /**
             * Obtém o valor da propriedade action.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getAction() {
                return action;
            }

            /**
             * Define o valor da propriedade action.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setAction(ActionType value) {
                this.action = value;
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
     *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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

        @XmlAttribute(name = "RateTotalAmount")
        protected BigDecimal rateTotalAmount;
        @XmlAttribute(name = "EstimatedTotalAmount")
        protected BigDecimal estimatedTotalAmount;

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

    }

}
