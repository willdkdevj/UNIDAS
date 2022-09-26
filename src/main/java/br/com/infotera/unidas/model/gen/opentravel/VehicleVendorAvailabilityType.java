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
 * <p>Classe Java de VehicleVendorAvailabilityType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleVendorAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="VehAvails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VehAvail" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType" minOccurs="0"/&gt;
 *                             &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/&gt;
 *                             &lt;element name="AdvanceBooking" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
 *                                     &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                                     &lt;attribute name="OffsetDropTime"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="BeforeArrival"/&gt;
 *                                           &lt;enumeration value="AfterBooking"/&gt;
 *                                           &lt;enumeration value="AfterConfirmation"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                     &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierTypeRatePeriod" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailVendorInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleVendorAvailabilityType", propOrder = {
    "vendor",
    "vehAvails",
    "info"
})
public class VehicleVendorAvailabilityType {

    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehAvails")
    protected VehicleVendorAvailabilityType.VehAvails vehAvails;
    @XmlElement(name = "Info")
    protected VehicleAvailVendorInfoType info;

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
     * Obtém o valor da propriedade vehAvails.
     * 
     * @return
     *     possible object is
     *     {@link VehicleVendorAvailabilityType.VehAvails }
     *     
     */
    public VehicleVendorAvailabilityType.VehAvails getVehAvails() {
        return vehAvails;
    }

    /**
     * Define o valor da propriedade vehAvails.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleVendorAvailabilityType.VehAvails }
     *     
     */
    public void setVehAvails(VehicleVendorAvailabilityType.VehAvails value) {
        this.vehAvails = value;
    }

    /**
     * Obtém o valor da propriedade info.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailVendorInfoType }
     *     
     */
    public VehicleAvailVendorInfoType getInfo() {
        return info;
    }

    /**
     * Define o valor da propriedade info.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailVendorInfoType }
     *     
     */
    public void setInfo(VehicleAvailVendorInfoType value) {
        this.info = value;
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
     *         &lt;element name="VehAvail" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType" minOccurs="0"/&gt;
     *                   &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/&gt;
     *                   &lt;element name="AdvanceBooking" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="OffsetTimeUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" /&gt;
     *                           &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *                           &lt;attribute name="OffsetDropTime"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="BeforeArrival"/&gt;
     *                                 &lt;enumeration value="AfterBooking"/&gt;
     *                                 &lt;enumeration value="AfterConfirmation"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                           &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierTypeRatePeriod" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehAvail"
    })
    public static class VehAvails {

        @XmlElement(name = "VehAvail")
        protected List<VehicleVendorAvailabilityType.VehAvails.VehAvail> vehAvail;
        @XmlAttribute(name = "RateCategory")
        protected String rateCategory;
        @XmlAttribute(name = "RatePeriod")
        protected RateQualifierTypeRatePeriod ratePeriod;

        /**
         * Gets the value of the vehAvail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehAvail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehAvail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleVendorAvailabilityType.VehAvails.VehAvail }
         * 
         * 
         */
        public List<VehicleVendorAvailabilityType.VehAvails.VehAvail> getVehAvail() {
            if (vehAvail == null) {
                vehAvail = new ArrayList<VehicleVendorAvailabilityType.VehAvails.VehAvail>();
            }
            return this.vehAvail;
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
         * Obtém o valor da propriedade ratePeriod.
         * 
         * @return
         *     possible object is
         *     {@link RateQualifierTypeRatePeriod }
         *     
         */
        public RateQualifierTypeRatePeriod getRatePeriod() {
            return ratePeriod;
        }

        /**
         * Define o valor da propriedade ratePeriod.
         * 
         * @param value
         *     allowed object is
         *     {@link RateQualifierTypeRatePeriod }
         *     
         */
        public void setRatePeriod(RateQualifierTypeRatePeriod value) {
            this.ratePeriod = value;
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
         *         &lt;element name="VehAvailCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType" minOccurs="0"/&gt;
         *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/&gt;
         *         &lt;element name="AdvanceBooking" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
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
         *                 &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        @XmlType(name = "", propOrder = {
            "vehAvailCore",
            "vehAvailInfo",
            "advanceBooking"
        })
        public static class VehAvail {

            @XmlElement(name = "VehAvailCore")
            protected VehicleAvailCoreType vehAvailCore;
            @XmlElement(name = "VehAvailInfo")
            protected VehicleAvailAdditionalInfoType vehAvailInfo;
            @XmlElement(name = "AdvanceBooking")
            protected VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking advanceBooking;

            /**
             * Obtém o valor da propriedade vehAvailCore.
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailCoreType }
             *     
             */
            public VehicleAvailCoreType getVehAvailCore() {
                return vehAvailCore;
            }

            /**
             * Define o valor da propriedade vehAvailCore.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailCoreType }
             *     
             */
            public void setVehAvailCore(VehicleAvailCoreType value) {
                this.vehAvailCore = value;
            }

            /**
             * Obtém o valor da propriedade vehAvailInfo.
             * 
             * @return
             *     possible object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public VehicleAvailAdditionalInfoType getVehAvailInfo() {
                return vehAvailInfo;
            }

            /**
             * Define o valor da propriedade vehAvailInfo.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleAvailAdditionalInfoType }
             *     
             */
            public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
                this.vehAvailInfo = value;
            }

            /**
             * Obtém o valor da propriedade advanceBooking.
             * 
             * @return
             *     possible object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
             *     
             */
            public VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking getAdvanceBooking() {
                return advanceBooking;
            }

            /**
             * Define o valor da propriedade advanceBooking.
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking }
             *     
             */
            public void setAdvanceBooking(VehicleVendorAvailabilityType.VehAvails.VehAvail.AdvanceBooking value) {
                this.advanceBooking = value;
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
             *       &lt;attribute name="RulesApplyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AdvanceBooking {

                @XmlAttribute(name = "AbsoluteDeadline")
                protected String absoluteDeadline;
                @XmlAttribute(name = "OffsetTimeUnit")
                protected TimeUnitType offsetTimeUnit;
                @XmlAttribute(name = "OffsetUnitMultiplier")
                protected BigInteger offsetUnitMultiplier;
                @XmlAttribute(name = "OffsetDropTime")
                protected String offsetDropTime;
                @XmlAttribute(name = "RulesApplyInd")
                protected Boolean rulesApplyInd;

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

                /**
                 * Obtém o valor da propriedade rulesApplyInd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRulesApplyInd() {
                    return rulesApplyInd;
                }

                /**
                 * Define o valor da propriedade rulesApplyInd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRulesApplyInd(Boolean value) {
                    this.rulesApplyInd = value;
                }

            }

        }

    }

}
