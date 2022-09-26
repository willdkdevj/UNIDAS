//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AirConditionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TransmissionType" type="{http://www.opentravel.org/OTA/2003/05}VehicleTransmissionType" /&gt;
 *       &lt;attribute name="FuelType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
 *             &lt;enumeration value="Diesel"/&gt;
 *             &lt;enumeration value="Hybrid"/&gt;
 *             &lt;enumeration value="Electric"/&gt;
 *             &lt;enumeration value="LPG_CompressedGas"/&gt;
 *             &lt;enumeration value="Hydrogen"/&gt;
 *             &lt;enumeration value="MultiFuel"/&gt;
 *             &lt;enumeration value="Petrol"/&gt;
 *             &lt;enumeration value="Ethanol"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DriveType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="AWD"/&gt;
 *             &lt;enumeration value="4WD"/&gt;
 *             &lt;enumeration value="Unspecified"/&gt;
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
@XmlType(name = "VehicleCoreType", propOrder = {
    "vehType",
    "vehClass"
})
@XmlSeeAlso({
    VehiclePrefType.class,
    VehicleType.class
})
public class VehicleCoreType {

    @XmlElement(name = "VehType")
    protected VehicleCoreType.VehType vehType;
    @XmlElement(name = "VehClass")
    protected VehicleCoreType.VehClass vehClass;
    @XmlAttribute(name = "AirConditionInd")
    protected Boolean airConditionInd;
    @XmlAttribute(name = "TransmissionType")
    protected VehicleTransmissionType transmissionType;
    @XmlAttribute(name = "FuelType")
    protected String fuelType;
    @XmlAttribute(name = "DriveType")
    protected String driveType;

    /**
     * Obtém o valor da propriedade vehType.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public VehicleCoreType.VehType getVehType() {
        return vehType;
    }

    /**
     * Define o valor da propriedade vehType.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehType }
     *     
     */
    public void setVehType(VehicleCoreType.VehType value) {
        this.vehType = value;
    }

    /**
     * Obtém o valor da propriedade vehClass.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public VehicleCoreType.VehClass getVehClass() {
        return vehClass;
    }

    /**
     * Define o valor da propriedade vehClass.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCoreType.VehClass }
     *     
     */
    public void setVehClass(VehicleCoreType.VehClass value) {
        this.vehClass = value;
    }

    /**
     * Obtém o valor da propriedade airConditionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditionInd() {
        return airConditionInd;
    }

    /**
     * Define o valor da propriedade airConditionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditionInd(Boolean value) {
        this.airConditionInd = value;
    }

    /**
     * Obtém o valor da propriedade transmissionType.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public VehicleTransmissionType getTransmissionType() {
        return transmissionType;
    }

    /**
     * Define o valor da propriedade transmissionType.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTransmissionType }
     *     
     */
    public void setTransmissionType(VehicleTransmissionType value) {
        this.transmissionType = value;
    }

    /**
     * Obtém o valor da propriedade fuelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Define o valor da propriedade fuelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Obtém o valor da propriedade driveType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Define o valor da propriedade driveType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
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
     *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehClass {

        @XmlAttribute(name = "Size")
        protected String size;

        /**
         * Obtém o valor da propriedade size.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSize() {
            return size;
        }

        /**
         * Define o valor da propriedade size.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSize(String value) {
            this.size = value;
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
     *       &lt;attribute name="VehicleCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DoorCount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehType {

        @XmlAttribute(name = "VehicleCategory")
        protected String vehicleCategory;
        @XmlAttribute(name = "DoorCount")
        protected String doorCount;

        /**
         * Obtém o valor da propriedade vehicleCategory.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleCategory() {
            return vehicleCategory;
        }

        /**
         * Define o valor da propriedade vehicleCategory.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleCategory(String value) {
            this.vehicleCategory = value;
        }

        /**
         * Obtém o valor da propriedade doorCount.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoorCount() {
            return doorCount;
        }

        /**
         * Define o valor da propriedade doorCount.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoorCount(String value) {
            this.doorCount = value;
        }

    }

}
