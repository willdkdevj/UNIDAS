//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehMakeModel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="VehIdentity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BaggageQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OdometerUnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType", propOrder = {
    "vehMakeModel",
    "pictureURL",
    "vehIdentity"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.VehicleLocationVehiclesType.Vehicle.class,
    br.com.infotera.unidas.model.gen.ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle.Vehicle.class
})
public class VehicleType
    extends VehicleCoreType
{

    @XmlElement(name = "VehMakeModel")
    protected VehicleType.VehMakeModel vehMakeModel;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String pictureURL;
    @XmlElement(name = "VehIdentity")
    protected VehicleType.VehIdentity vehIdentity;
    @XmlAttribute(name = "PassengerQuantity")
    protected String passengerQuantity;
    @XmlAttribute(name = "BaggageQuantity")
    protected BigInteger baggageQuantity;
    @XmlAttribute(name = "VendorCarType")
    protected String vendorCarType;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "UnitOfMeasureQuantity")
    protected BigDecimal unitOfMeasureQuantity;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "OdometerUnitOfMeasure")
    protected DistanceUnitNameType odometerUnitOfMeasure;

    /**
     * Obtém o valor da propriedade vehMakeModel.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType.VehMakeModel }
     *     
     */
    public VehicleType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * Define o valor da propriedade vehMakeModel.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType.VehMakeModel }
     *     
     */
    public void setVehMakeModel(VehicleType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * Obtém o valor da propriedade pictureURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Define o valor da propriedade pictureURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Obtém o valor da propriedade vehIdentity.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType.VehIdentity }
     *     
     */
    public VehicleType.VehIdentity getVehIdentity() {
        return vehIdentity;
    }

    /**
     * Define o valor da propriedade vehIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType.VehIdentity }
     *     
     */
    public void setVehIdentity(VehicleType.VehIdentity value) {
        this.vehIdentity = value;
    }

    /**
     * Obtém o valor da propriedade passengerQuantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Define o valor da propriedade passengerQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerQuantity(String value) {
        this.passengerQuantity = value;
    }

    /**
     * Obtém o valor da propriedade baggageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * Define o valor da propriedade baggageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageQuantity(BigInteger value) {
        this.baggageQuantity = value;
    }

    /**
     * Obtém o valor da propriedade vendorCarType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCarType() {
        return vendorCarType;
    }

    /**
     * Define o valor da propriedade vendorCarType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCarType(String value) {
        this.vendorCarType = value;
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
     * Obtém o valor da propriedade unitOfMeasureQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * Define o valor da propriedade unitOfMeasureQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitOfMeasureQuantity(BigDecimal value) {
        this.unitOfMeasureQuantity = value;
    }

    /**
     * Obtém o valor da propriedade unitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Define o valor da propriedade unitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Obtém o valor da propriedade unitOfMeasureCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Define o valor da propriedade unitOfMeasureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

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
     * Obtém o valor da propriedade odometerUnitOfMeasure.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public DistanceUnitNameType getOdometerUnitOfMeasure() {
        return odometerUnitOfMeasure;
    }

    /**
     * Define o valor da propriedade odometerUnitOfMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitNameType }
     *     
     */
    public void setOdometerUnitOfMeasure(DistanceUnitNameType value) {
        this.odometerUnitOfMeasure = value;
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
     *       &lt;attribute name="VehicleAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="LicensePlateNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="StateProvCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VehicleID_Number" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="VehicleColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehIdentity {

        @XmlAttribute(name = "VehicleAssetNumber")
        protected String vehicleAssetNumber;
        @XmlAttribute(name = "LicensePlateNumber")
        protected String licensePlateNumber;
        @XmlAttribute(name = "StateProvCode")
        protected String stateProvCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "VehicleID_Number")
        protected String vehicleIDNumber;
        @XmlAttribute(name = "VehicleColor")
        protected String vehicleColor;

        /**
         * Obtém o valor da propriedade vehicleAssetNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleAssetNumber() {
            return vehicleAssetNumber;
        }

        /**
         * Define o valor da propriedade vehicleAssetNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleAssetNumber(String value) {
            this.vehicleAssetNumber = value;
        }

        /**
         * Obtém o valor da propriedade licensePlateNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicensePlateNumber() {
            return licensePlateNumber;
        }

        /**
         * Define o valor da propriedade licensePlateNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicensePlateNumber(String value) {
            this.licensePlateNumber = value;
        }

        /**
         * Obtém o valor da propriedade stateProvCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * Define o valor da propriedade stateProvCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * Obtém o valor da propriedade countryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Define o valor da propriedade countryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Obtém o valor da propriedade vehicleIDNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleIDNumber() {
            return vehicleIDNumber;
        }

        /**
         * Define o valor da propriedade vehicleIDNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleIDNumber(String value) {
            this.vehicleIDNumber = value;
        }

        /**
         * Obtém o valor da propriedade vehicleColor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleColor() {
            return vehicleColor;
        }

        /**
         * Define o valor da propriedade vehicleColor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleColor(String value) {
            this.vehicleColor = value;
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
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehMakeModel {

        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "ModelYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar modelYear;

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
         * Obtém o valor da propriedade modelYear.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModelYear() {
            return modelYear;
        }

        /**
         * Define o valor da propriedade modelYear.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModelYear(XMLGregorianCalendar value) {
            this.modelYear = value;
        }

    }

}
