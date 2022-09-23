//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleRentalRateType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleRentalRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="VehicleCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType" minOccurs="0"/&gt;
 *         &lt;element name="RateQualifier" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType"&gt;
 *                 &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CustLoyaltyRPH"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateRestrictions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="OneWayPolicy"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="OneWayAllowed"/&gt;
 *                       &lt;enumeration value="OneWayNotAllowed"/&gt;
 *                       &lt;enumeration value="RestrictedOneWay"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="CancellationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ModificationPenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RateGuarantee" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                 &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="OffsetDropTime"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="BeforeArrival"/&gt;
 *                       &lt;enumeration value="AfterBooking"/&gt;
 *                       &lt;enumeration value="AfterConfirmation"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PickupReturnRule" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
 *                 &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RuleType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="EarliestPickup"/&gt;
 *                       &lt;enumeration value="LatestPickup"/&gt;
 *                       &lt;enumeration value="LatestReturn"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "VehicleRentalRateType", propOrder = {
    "rateDistance",
    "vehicleCharges",
    "rateQualifier",
    "rateRestrictions",
    "rateGuarantee",
    "pickupReturnRule"
})
public class VehicleRentalRateType {

    @XmlElement(name = "RateDistance")
    protected List<VehicleRentalRateType.RateDistance> rateDistance;
    @XmlElement(name = "VehicleCharges")
    protected ArrayOfVehicleChargePurposeType vehicleCharges;
    @XmlElement(name = "RateQualifier")
    protected VehicleRentalRateType.RateQualifier rateQualifier;
    @XmlElement(name = "RateRestrictions")
    protected VehicleRentalRateType.RateRestrictions rateRestrictions;
    @XmlElement(name = "RateGuarantee")
    protected VehicleRentalRateType.RateGuarantee rateGuarantee;
    @XmlElement(name = "PickupReturnRule")
    protected List<VehicleRentalRateType.PickupReturnRule> pickupReturnRule;

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
     * {@link VehicleRentalRateType.RateDistance }
     * 
     * 
     */
    public List<VehicleRentalRateType.RateDistance> getRateDistance() {
        if (rateDistance == null) {
            rateDistance = new ArrayList<VehicleRentalRateType.RateDistance>();
        }
        return this.rateDistance;
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
     * Obtém o valor da propriedade rateQualifier.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateQualifier }
     *     
     */
    public VehicleRentalRateType.RateQualifier getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Define o valor da propriedade rateQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateQualifier }
     *     
     */
    public void setRateQualifier(VehicleRentalRateType.RateQualifier value) {
        this.rateQualifier = value;
    }

    /**
     * Obtém o valor da propriedade rateRestrictions.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateRestrictions }
     *     
     */
    public VehicleRentalRateType.RateRestrictions getRateRestrictions() {
        return rateRestrictions;
    }

    /**
     * Define o valor da propriedade rateRestrictions.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateRestrictions }
     *     
     */
    public void setRateRestrictions(VehicleRentalRateType.RateRestrictions value) {
        this.rateRestrictions = value;
    }

    /**
     * Obtém o valor da propriedade rateGuarantee.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType.RateGuarantee }
     *     
     */
    public VehicleRentalRateType.RateGuarantee getRateGuarantee() {
        return rateGuarantee;
    }

    /**
     * Define o valor da propriedade rateGuarantee.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType.RateGuarantee }
     *     
     */
    public void setRateGuarantee(VehicleRentalRateType.RateGuarantee value) {
        this.rateGuarantee = value;
    }

    /**
     * Gets the value of the pickupReturnRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupReturnRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupReturnRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRentalRateType.PickupReturnRule }
     * 
     * 
     */
    public List<VehicleRentalRateType.PickupReturnRule> getPickupReturnRule() {
        if (pickupReturnRule == null) {
            pickupReturnRule = new ArrayList<VehicleRentalRateType.PickupReturnRule>();
        }
        return this.pickupReturnRule;
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
     *       &lt;attribute name="DayOfWeek" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" /&gt;
     *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RuleType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="EarliestPickup"/&gt;
     *             &lt;enumeration value="LatestPickup"/&gt;
     *             &lt;enumeration value="LatestReturn"/&gt;
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
    public static class PickupReturnRule {

        @XmlAttribute(name = "DayOfWeek")
        protected DayOfWeekType dayOfWeek;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "RuleType")
        protected String ruleType;

        /**
         * Obtém o valor da propriedade dayOfWeek.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekType }
         *     
         */
        public DayOfWeekType getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Define o valor da propriedade dayOfWeek.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekType }
         *     
         */
        public void setDayOfWeek(DayOfWeekType value) {
            this.dayOfWeek = value;
        }

        /**
         * Obtém o valor da propriedade time.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Define o valor da propriedade time.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Obtém o valor da propriedade ruleType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleType() {
            return ruleType;
        }

        /**
         * Define o valor da propriedade ruleType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleType(String value) {
            this.ruleType = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="OffsetDropTime"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="BeforeArrival"/&gt;
     *             &lt;enumeration value="AfterBooking"/&gt;
     *             &lt;enumeration value="AfterConfirmation"/&gt;
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
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class RateGuarantee {

        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected TimeUnitType offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected BigInteger offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        protected String offsetDropTime;

        /**
         * Obtém o valor da propriedade description.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * Define o valor da propriedade description.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * Obtém o valor da propriedade absoluteDeadline.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * Define o valor da propriedade absoluteDeadline.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * Obtém o valor da propriedade offsetTimeUnit.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * Define o valor da propriedade offsetTimeUnit.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setOffsetTimeUnit(TimeUnitType value) {
            this.offsetTimeUnit = value;
        }

        /**
         * Obtém o valor da propriedade offsetUnitMultiplier.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * Define o valor da propriedade offsetUnitMultiplier.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffsetUnitMultiplier(BigInteger value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * Obtém o valor da propriedade offsetDropTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * Define o valor da propriedade offsetDropTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RateQualifierType"&gt;
     *       &lt;attribute name="TourInfoRPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CustLoyaltyRPH"&gt;
     *         &lt;simpleType&gt;
     *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateQualifier
        extends RateQualifierType
    {

        @XmlAttribute(name = "TourInfoRPH")
        protected String tourInfoRPH;
        @XmlAttribute(name = "CustLoyaltyRPH")
        protected List<String> custLoyaltyRPH;

        /**
         * Obtém o valor da propriedade tourInfoRPH.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTourInfoRPH() {
            return tourInfoRPH;
        }

        /**
         * Define o valor da propriedade tourInfoRPH.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTourInfoRPH(String value) {
            this.tourInfoRPH = value;
        }

        /**
         * Gets the value of the custLoyaltyRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custLoyaltyRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustLoyaltyRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCustLoyaltyRPH() {
            if (custLoyaltyRPH == null) {
                custLoyaltyRPH = new ArrayList<String>();
            }
            return this.custLoyaltyRPH;
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
     *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MinimumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaximumDayInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AdvancedBookingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RestrictedMileageInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CorporateRateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="GuaranteeReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="MaximumVehiclesAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="OvernightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="OneWayPolicy"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="OneWayAllowed"/&gt;
     *             &lt;enumeration value="OneWayNotAllowed"/&gt;
     *             &lt;enumeration value="RestrictedOneWay"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
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
    public static class RateRestrictions {

        @XmlAttribute(name = "ArriveByFlight")
        protected Boolean arriveByFlight;
        @XmlAttribute(name = "MinimumDayInd")
        protected Boolean minimumDayInd;
        @XmlAttribute(name = "MaximumDayInd")
        protected Boolean maximumDayInd;
        @XmlAttribute(name = "AdvancedBookingInd")
        protected Boolean advancedBookingInd;
        @XmlAttribute(name = "RestrictedMileageInd")
        protected Boolean restrictedMileageInd;
        @XmlAttribute(name = "CorporateRateInd")
        protected Boolean corporateRateInd;
        @XmlAttribute(name = "GuaranteeReqInd")
        protected Boolean guaranteeReqInd;
        @XmlAttribute(name = "MaximumVehiclesAllowed")
        protected BigInteger maximumVehiclesAllowed;
        @XmlAttribute(name = "OvernightInd")
        protected Boolean overnightInd;
        @XmlAttribute(name = "OneWayPolicy")
        protected String oneWayPolicy;
        @XmlAttribute(name = "CancellationPenaltyInd")
        protected Boolean cancellationPenaltyInd;
        @XmlAttribute(name = "ModificationPenaltyInd")
        protected Boolean modificationPenaltyInd;

        /**
         * Obtém o valor da propriedade arriveByFlight.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isArriveByFlight() {
            return arriveByFlight;
        }

        /**
         * Define o valor da propriedade arriveByFlight.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setArriveByFlight(Boolean value) {
            this.arriveByFlight = value;
        }

        /**
         * Obtém o valor da propriedade minimumDayInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMinimumDayInd() {
            return minimumDayInd;
        }

        /**
         * Define o valor da propriedade minimumDayInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMinimumDayInd(Boolean value) {
            this.minimumDayInd = value;
        }

        /**
         * Obtém o valor da propriedade maximumDayInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMaximumDayInd() {
            return maximumDayInd;
        }

        /**
         * Define o valor da propriedade maximumDayInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMaximumDayInd(Boolean value) {
            this.maximumDayInd = value;
        }

        /**
         * Obtém o valor da propriedade advancedBookingInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdvancedBookingInd() {
            return advancedBookingInd;
        }

        /**
         * Define o valor da propriedade advancedBookingInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdvancedBookingInd(Boolean value) {
            this.advancedBookingInd = value;
        }

        /**
         * Obtém o valor da propriedade restrictedMileageInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRestrictedMileageInd() {
            return restrictedMileageInd;
        }

        /**
         * Define o valor da propriedade restrictedMileageInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRestrictedMileageInd(Boolean value) {
            this.restrictedMileageInd = value;
        }

        /**
         * Obtém o valor da propriedade corporateRateInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCorporateRateInd() {
            return corporateRateInd;
        }

        /**
         * Define o valor da propriedade corporateRateInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCorporateRateInd(Boolean value) {
            this.corporateRateInd = value;
        }

        /**
         * Obtém o valor da propriedade guaranteeReqInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeReqInd() {
            return guaranteeReqInd;
        }

        /**
         * Define o valor da propriedade guaranteeReqInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeReqInd(Boolean value) {
            this.guaranteeReqInd = value;
        }

        /**
         * Obtém o valor da propriedade maximumVehiclesAllowed.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumVehiclesAllowed() {
            return maximumVehiclesAllowed;
        }

        /**
         * Define o valor da propriedade maximumVehiclesAllowed.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumVehiclesAllowed(BigInteger value) {
            this.maximumVehiclesAllowed = value;
        }

        /**
         * Obtém o valor da propriedade overnightInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOvernightInd() {
            return overnightInd;
        }

        /**
         * Define o valor da propriedade overnightInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOvernightInd(Boolean value) {
            this.overnightInd = value;
        }

        /**
         * Obtém o valor da propriedade oneWayPolicy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOneWayPolicy() {
            return oneWayPolicy;
        }

        /**
         * Define o valor da propriedade oneWayPolicy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOneWayPolicy(String value) {
            this.oneWayPolicy = value;
        }

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

}
