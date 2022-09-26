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
 * <p>Classe Java de VehicleAvailRQCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRQCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType" minOccurs="0"/&gt;
 *         &lt;element name="VendorPrefs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNamePrefType"&gt;
 *                           &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LocationCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehPrefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleAvailRQCoreTypeVehPref" minOccurs="0"/&gt;
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
 *         &lt;element name="RateQualifier" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailRQCoreTypeRateQualifierRatePeriod" /&gt;
 *                 &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
 *         &lt;element name="RateRange" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SpecialEquipPrefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}InventoryStatusType" /&gt;
 *       &lt;attribute name="TargetSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailRQCoreType", propOrder = {
    "vehRentalCore",
    "vendorPrefs",
    "vehPrefs",
    "driverType",
    "rateQualifier",
    "rateRange",
    "specialEquipPrefs",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.OTAVehAvailRateRQ.VehAvailRQCore.class
})
public class VehicleAvailRQCoreType {

    public static DriverType DriverType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VendorPrefs")
    protected VehicleAvailRQCoreType.VendorPrefs vendorPrefs;
    @XmlElement(name = "VehPrefs")
    protected ArrayOfVehicleAvailRQCoreTypeVehPref vehPrefs;
    @XmlElement(name = "DriverType")
    protected List<VehicleAvailRQCoreType.DriverType> driverType;
    @XmlElement(name = "RateQualifier")
    protected List<VehicleAvailRQCoreType.RateQualifier> rateQualifier;
    @XmlElement(name = "RateRange")
    protected VehicleAvailRQCoreType.RateRange rateRange;
    @XmlElement(name = "SpecialEquipPrefs")
    protected ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref specialEquipPrefs;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Status")
    protected InventoryStatusType status;
    @XmlAttribute(name = "TargetSource")
    protected String targetSource;

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
     * Obtém o valor da propriedade vendorPrefs.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRQCoreType.VendorPrefs }
     *     
     */
    public VehicleAvailRQCoreType.VendorPrefs getVendorPrefs() {
        return vendorPrefs;
    }

    /**
     * Define o valor da propriedade vendorPrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRQCoreType.VendorPrefs }
     *     
     */
    public void setVendorPrefs(VehicleAvailRQCoreType.VendorPrefs value) {
        this.vendorPrefs = value;
    }

    /**
     * Obtém o valor da propriedade vehPrefs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeVehPref }
     *     
     */
    public ArrayOfVehicleAvailRQCoreTypeVehPref getVehPrefs() {
        return vehPrefs;
    }

    /**
     * Define o valor da propriedade vehPrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeVehPref }
     *     
     */
    public void setVehPrefs(ArrayOfVehicleAvailRQCoreTypeVehPref value) {
        this.vehPrefs = value;
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
     * {@link VehicleAvailRQCoreType.DriverType }
     * 
     * 
     */
    public List<VehicleAvailRQCoreType.DriverType> getDriverType() {
        if (driverType == null) {
            driverType = new ArrayList<VehicleAvailRQCoreType.DriverType>();
        }
        return this.driverType;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleAvailRQCoreType.RateQualifier }
     * 
     * 
     */
    public List<VehicleAvailRQCoreType.RateQualifier> getRateQualifier() {
        if (rateQualifier == null) {
            rateQualifier = new ArrayList<VehicleAvailRQCoreType.RateQualifier>();
        }
        return this.rateQualifier;
    }

    /**
     * Obtém o valor da propriedade rateRange.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRQCoreType.RateRange }
     *     
     */
    public VehicleAvailRQCoreType.RateRange getRateRange() {
        return rateRange;
    }

    /**
     * Define o valor da propriedade rateRange.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRQCoreType.RateRange }
     *     
     */
    public void setRateRange(VehicleAvailRQCoreType.RateRange value) {
        this.rateRange = value;
    }

    /**
     * Obtém o valor da propriedade specialEquipPrefs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref }
     *     
     */
    public ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref getSpecialEquipPrefs() {
        return specialEquipPrefs;
    }

    /**
     * Define o valor da propriedade specialEquipPrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref }
     *     
     */
    public void setSpecialEquipPrefs(ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref value) {
        this.specialEquipPrefs = value;
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
     * Obtém o valor da propriedade targetSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSource() {
        return targetSource;
    }

    /**
     * Define o valor da propriedade targetSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSource(String value) {
        this.targetSource = value;
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
     *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailRQCoreTypeRateQualifierRatePeriod" /&gt;
     *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        protected VehicleAvailRQCoreTypeRateQualifierRatePeriod ratePeriod;
        @XmlAttribute(name = "GuaranteedInd")
        protected Boolean guaranteedInd;
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
         *     {@link VehicleAvailRQCoreTypeRateQualifierRatePeriod }
         *     
         */
        public VehicleAvailRQCoreTypeRateQualifierRatePeriod getRatePeriod() {
            return ratePeriod;
        }

        /**
         * Define o valor da propriedade ratePeriod.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleAvailRQCoreTypeRateQualifierRatePeriod }
         *     
         */
        public void setRatePeriod(VehicleAvailRQCoreTypeRateQualifierRatePeriod value) {
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
     *       &lt;attribute name="MinRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="FixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="RateTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected TimeUnitType rateTimeUnit;

        /**
         * Obtém o valor da propriedade minRate.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * Define o valor da propriedade minRate.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * Obtém o valor da propriedade maxRate.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * Define o valor da propriedade maxRate.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * Obtém o valor da propriedade fixedRate.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * Define o valor da propriedade fixedRate.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * Obtém o valor da propriedade rateTimeUnit.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * Define o valor da propriedade rateTimeUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
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
     *         &lt;element name="VendorPref" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNamePrefType"&gt;
     *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ParticipationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LocationCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vendorPref"
    })
    public static class VendorPrefs {

        @XmlElement(name = "VendorPref")
        protected List<VehicleAvailRQCoreType.VendorPrefs.VendorPref> vendorPref;
        @XmlAttribute(name = "ParticipationLevelCode")
        protected String participationLevelCode;
        @XmlAttribute(name = "LocationCategory")
        protected String locationCategory;

        /**
         * Gets the value of the vendorPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleAvailRQCoreType.VendorPrefs.VendorPref }
         * 
         * 
         */
        public List<VehicleAvailRQCoreType.VendorPrefs.VendorPref> getVendorPref() {
            if (vendorPref == null) {
                vendorPref = new ArrayList<VehicleAvailRQCoreType.VendorPrefs.VendorPref>();
            }
            return this.vendorPref;
        }

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

        /**
         * Obtém o valor da propriedade locationCategory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCategory() {
            return locationCategory;
        }

        /**
         * Define o valor da propriedade locationCategory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCategory(String value) {
            this.locationCategory = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;CompanyNamePrefType"&gt;
         *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VendorPref
            extends CompanyNamePrefType
        {

            @XmlAttribute(name = "CorpDiscountNmbr")
            protected String corpDiscountNmbr;

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

        }

    }

}
