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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleRentalCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickUpLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnLocation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="StartChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="StopChargesDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="OneWayIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MultiIslandRentalDays" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="DistUnitName" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCoreType", propOrder = {
    "pickUpLocation",
    "returnLocation"
})
public class VehicleRentalCoreType {

    @XmlElement(name = "PickUpLocation")
    protected List<VehicleRentalCoreType.PickUpLocation> pickUpLocation;
    @XmlElement(name = "ReturnLocation")
    protected VehicleRentalCoreType.ReturnLocation returnLocation;
    @XmlAttribute(name = "PickUpDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickUpDateTime;
    @XmlAttribute(name = "ReturnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTime;
    @XmlAttribute(name = "StartChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startChargesDateTime;
    @XmlAttribute(name = "StopChargesDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stopChargesDateTime;
    @XmlAttribute(name = "OneWayIndicator")
    protected Boolean oneWayIndicator;
    @XmlAttribute(name = "MultiIslandRentalDays")
    protected BigInteger multiIslandRentalDays;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "DistUnitName")
    protected DistanceUnitNameType distUnitName;

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickUpLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickUpLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalCoreType.PickUpLocation }
     * 
     * 
     */
    public List<VehicleRentalCoreType.PickUpLocation> getPickUpLocation() {
        if (pickUpLocation == null) {
            pickUpLocation = new ArrayList<VehicleRentalCoreType.PickUpLocation>();
        }
        return this.pickUpLocation;
    }

    /**
     * Obtém o valor da propriedade returnLocation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public VehicleRentalCoreType.ReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * Define o valor da propriedade returnLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType.ReturnLocation }
     *     
     */
    public void setReturnLocation(VehicleRentalCoreType.ReturnLocation value) {
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

    /**
     * Obtém o valor da propriedade startChargesDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartChargesDateTime() {
        return startChargesDateTime;
    }

    /**
     * Define o valor da propriedade startChargesDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartChargesDateTime(XMLGregorianCalendar value) {
        this.startChargesDateTime = value;
    }

    /**
     * Obtém o valor da propriedade stopChargesDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStopChargesDateTime() {
        return stopChargesDateTime;
    }

    /**
     * Define o valor da propriedade stopChargesDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStopChargesDateTime(XMLGregorianCalendar value) {
        this.stopChargesDateTime = value;
    }

    /**
     * Obtém o valor da propriedade oneWayIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneWayIndicator() {
        return oneWayIndicator;
    }

    /**
     * Define o valor da propriedade oneWayIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneWayIndicator(Boolean value) {
        this.oneWayIndicator = value;
    }

    /**
     * Obtém o valor da propriedade multiIslandRentalDays.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiIslandRentalDays() {
        return multiIslandRentalDays;
    }

    /**
     * Define o valor da propriedade multiIslandRentalDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiIslandRentalDays(BigInteger value) {
        this.multiIslandRentalDays = value;
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
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PickUpLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

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
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnLocation
        extends LocationType
    {

        @XmlAttribute(name = "ExtendedLocationCode")
        protected String extendedLocationCode;
        @XmlAttribute(name = "CounterLocation")
        protected String counterLocation;

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

    }

}
