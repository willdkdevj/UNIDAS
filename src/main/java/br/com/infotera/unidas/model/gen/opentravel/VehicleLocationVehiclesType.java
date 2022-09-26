//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleLocationVehiclesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationVehiclesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationVehiclesTypeVehicleInfo" minOccurs="0"/&gt;
 *         &lt;element name="Vehicle" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *                 &lt;attribute name="DistancePerFuelUnit" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationVehiclesType", propOrder = {
    "vehicleInfos",
    "vehicle"
})
public class VehicleLocationVehiclesType {

    @XmlElement(name = "VehicleInfos")
    protected ArrayOfVehicleLocationVehiclesTypeVehicleInfo vehicleInfos;
    @XmlElement(name = "Vehicle")
    protected List<VehicleLocationVehiclesType.Vehicle> vehicle;

    /**
     * Obtém o valor da propriedade vehicleInfos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationVehiclesTypeVehicleInfo }
     *     
     */
    public ArrayOfVehicleLocationVehiclesTypeVehicleInfo getVehicleInfos() {
        return vehicleInfos;
    }

    /**
     * Define o valor da propriedade vehicleInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationVehiclesTypeVehicleInfo }
     *     
     */
    public void setVehicleInfos(ArrayOfVehicleLocationVehiclesTypeVehicleInfo value) {
        this.vehicleInfos = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationVehiclesType.Vehicle }
     * 
     * 
     */
    public List<VehicleLocationVehiclesType.Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<VehicleLocationVehiclesType.Vehicle>();
        }
        return this.vehicle;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
     *       &lt;attribute name="DistancePerFuelUnit" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Vehicle
        extends VehicleType
    {

        @XmlElement(name = "Text")
        protected List<FormattedTextType> text;
        @XmlAttribute(name = "IsConfirmableInd")
        protected Boolean isConfirmableInd;
        @XmlAttribute(name = "DistanceUnit")
        protected DistanceUnitNameType distanceUnit;
        @XmlAttribute(name = "DistancePerFuelUnit")
        protected BigInteger distancePerFuelUnit;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormattedTextType }
         * 
         * 
         */
        public List<FormattedTextType> getText() {
            if (text == null) {
                text = new ArrayList<FormattedTextType>();
            }
            return this.text;
        }

        /**
         * Obtém o valor da propriedade isConfirmableInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsConfirmableInd() {
            return isConfirmableInd;
        }

        /**
         * Define o valor da propriedade isConfirmableInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsConfirmableInd(Boolean value) {
            this.isConfirmableInd = value;
        }

        /**
         * Obtém o valor da propriedade distanceUnit.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public DistanceUnitNameType getDistanceUnit() {
            return distanceUnit;
        }

        /**
         * Define o valor da propriedade distanceUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitNameType }
         *     
         */
        public void setDistanceUnit(DistanceUnitNameType value) {
            this.distanceUnit = value;
        }

        /**
         * Obtém o valor da propriedade distancePerFuelUnit.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDistancePerFuelUnit() {
            return distancePerFuelUnit;
        }

        /**
         * Define o valor da propriedade distancePerFuelUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDistancePerFuelUnit(BigInteger value) {
            this.distancePerFuelUnit = value;
        }

    }

}
