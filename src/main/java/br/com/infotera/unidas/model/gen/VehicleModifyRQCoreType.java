//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

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
 * <p>Classe Java de VehicleModifyRQCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleModifyRQCoreType"&gt;
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
 *         &lt;element name="RateQualifier" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}VehicleModifyRQCoreTypeRateQualifierRatePeriod" /&gt;
 *                 &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="VendorRateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PromotionVendorCode"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateRestriction" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecialEquipPrefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref" minOccurs="0"/&gt;
 *         &lt;element name="VehicleCharge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargePurposeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleModifyRQCoreType", propOrder = {
    "uniqueID",
    "vehRentalCore",
    "customer",
    "vendorPref",
    "vehPref",
    "driverType",
    "rateQualifier",
    "rateRestriction",
    "specialEquipPrefs",
    "vehicleCharge",
    "totalCharge",
    "rateDistance",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.OTAVehModifyRQ.VehModifyRQCore.class
})
public class VehicleModifyRQCoreType {

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
    protected List<VehicleModifyRQCoreType.DriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected VehicleModifyRQCoreType.RateQualifier rateQualifier;
    @XmlElement(name = "RateRestriction")
    protected VehicleModifyRQCoreType.RateRestriction rateRestriction;
    @XmlElement(name = "SpecialEquipPrefs")
    protected ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref specialEquipPrefs;
    @XmlElement(name = "VehicleCharge")
    protected List<VehicleChargePurposeType> vehicleCharge;
    @XmlElement(name = "TotalCharge")
    protected VehicleModifyRQCoreType.TotalCharge totalCharge;
    @XmlElement(name = "RateDistance")
    protected List<VehicleModifyRQCoreType.RateDistance> rateDistance;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status")
    protected InventoryStatusType status;

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
     * {@link VehicleModifyRQCoreType.DriverType }
     * 
     * 
     */
    public List<VehicleModifyRQCoreType.DriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<VehicleModifyRQCoreType.DriverType>();
        }
        return this.driverType;
    }

    /**
     * Obtém o valor da propriedade rateQualifier.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModifyRQCoreType.RateQualifier }
     *     
     */
    public VehicleModifyRQCoreType.RateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Define o valor da propriedade rateQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModifyRQCoreType.RateQualifier }
     *     
     */
    public void setRateQualifier(VehicleModifyRQCoreType.RateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * Obtém o valor da propriedade rateRestriction.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModifyRQCoreType.RateRestriction }
     *     
     */
    public VehicleModifyRQCoreType.RateRestriction getRateRestriction() {
        return rateRestriction;
    }

    /**
     * Define o valor da propriedade rateRestriction.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModifyRQCoreType.RateRestriction }
     *     
     */
    public void setRateRestriction(VehicleModifyRQCoreType.RateRestriction value) {
        this.rateRestriction = value;
    }

    /**
     * Obtém o valor da propriedade specialEquipPrefs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref }
     *     
     */
    public ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Define o valor da propriedade specialEquipPrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref }
     *     
     */
    public void setSpecialEquipPrefs(ArrayOfVehicleModifyRQCoreTypeSpecialEquipPref value) {
        this.specialEquipPrefs = value;
    }

    /**
     * Gets the value of the vehicleCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleChargePurposeType }
     * 
     * 
     */
    public List<VehicleChargePurposeType> getVehicleCharge() {
        if (vehicleCharge == null) {
            vehicleCharge = new ArrayList<VehicleChargePurposeType>();
        }
        return this.vehicleCharge;
    }

    /**
     * Obtém o valor da propriedade totalCharge.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModifyRQCoreType.TotalCharge }
     *     
     */
    public VehicleModifyRQCoreType.TotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * Define o valor da propriedade totalCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModifyRQCoreType.TotalCharge }
     *     
     */
    public void setTotalCharge(VehicleModifyRQCoreType.TotalCharge value) {
        this.totalCharge = value;
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
     * {@link VehicleModifyRQCoreType.RateDistance }
     * 
     * 
     */
    public List<VehicleModifyRQCoreType.RateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleModifyRQCoreType.RateDistance>();
        }
        return this.rateDistance;
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
     *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}VehicleModifyRQCoreTypeRateQualifierRatePeriod" /&gt;
     *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="VendorRateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PromotionVendorCode"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class RateQualifier {

        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;
        @XmlAttribute(name = "RateCategory")
        protected String rateCategory;
        @XmlAttribute(name = "CorpDiscountNmbr")
        protected String corpDiscountNmbr;
        @XmlAttribute(name = "RateQualifier")
        protected String rateQualifier;
        @XmlAttribute(name = "RatePeriod")
        protected VehicleModifyRQCoreTypeRateQualifierRatePeriod ratePeriod;
        @XmlAttribute(name = "GuaranteedInd")
        protected Boolean guaranteedInd;
        @XmlAttribute(name = "VendorRateID")
        protected String vendorRateID;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;

        /**
         * Obtém o valor da propriedade travelPurpose.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * Define o valor da propriedade travelPurpose.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

        /**
         * Obtém o valor da propriedade rateCategory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateCategory() {
            return rateCategory;
        }

        /**
         * Define o valor da propriedade rateCategory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateCategory(String value) {
            this.rateCategory = value;
        }

        /**
         * Obtém o valor da propriedade corpDiscountNmbr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorpDiscountNmbr() {
            return corpDiscountNmbr;
        }

        /**
         * Define o valor da propriedade corpDiscountNmbr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorpDiscountNmbr(String value) {
            this.corpDiscountNmbr = value;
        }

        /**
         * Obtém o valor da propriedade rateQualifier.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateQualifier() {
            return rateQualifier;
        }

        /**
         * Define o valor da propriedade rateQualifier.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateQualifier(String value) {
            this.rateQualifier = value;
        }

        /**
         * Obtém o valor da propriedade ratePeriod.
         * 
         * @return
         *     possible object is
         *     {@link VehicleModifyRQCoreTypeRateQualifierRatePeriod }
         *     
         */
        public VehicleModifyRQCoreTypeRateQualifierRatePeriod getRatePeriod() {
            return ratePeriod;
        }

        /**
         * Define o valor da propriedade ratePeriod.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleModifyRQCoreTypeRateQualifierRatePeriod }
         *     
         */
        public void setRatePeriod(VehicleModifyRQCoreTypeRateQualifierRatePeriod value) {
            this.ratePeriod = value;
        }

        /**
         * Obtém o valor da propriedade guaranteedInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteedInd() {
            return guaranteedInd;
        }

        /**
         * Define o valor da propriedade guaranteedInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteedInd(Boolean value) {
            this.guaranteedInd = value;
        }

        /**
         * Obtém o valor da propriedade vendorRateID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorRateID() {
            return vendorRateID;
        }

        /**
         * Define o valor da propriedade vendorRateID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorRateID(String value) {
            this.vendorRateID = value;
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
     *       &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRestriction {

        @XmlAttribute(name = "CancellationPenaltyInd")
        protected Boolean cancellationPenaltyInd;
        @XmlAttribute(name = "ModificationPenaltyInd")
        protected Boolean modificationPenaltyInd;

        /**
         * Obtém o valor da propriedade cancellationPenaltyInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancellationPenaltyInd() {
            return cancellationPenaltyInd;
        }

        /**
         * Define o valor da propriedade cancellationPenaltyInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancellationPenaltyInd(Boolean value) {
            this.cancellationPenaltyInd = value;
        }

        /**
         * Obtém o valor da propriedade modificationPenaltyInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isModificationPenaltyInd() {
            return modificationPenaltyInd;
        }

        /**
         * Define o valor da propriedade modificationPenaltyInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setModificationPenaltyInd(Boolean value) {
            this.modificationPenaltyInd = value;
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
