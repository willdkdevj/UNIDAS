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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleReservationRQAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationRQAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialReqPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleSpecialReqPrefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CoveragePrefs" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref" minOccurs="0"/&gt;
 *         &lt;element name="OffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleArrivalDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="RentalPaymentPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
 *                 &lt;attribute name="Type"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="guarantee"/&gt;
 *                       &lt;enumeration value="payment"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Reference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/&gt;
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LuggageQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="PassengerQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="GasPrePay" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationRQAdditionalInfoType", propOrder = {
    "specialReqPref",
    "coveragePrefs",
    "offLocService",
    "arrivalDetails",
    "rentalPaymentPref",
    "reference",
    "tourInfo",
    "writtenConfInst",
    "remark",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.OTAVehResRQ.VehResRQInfo.class
})
public class VehicleReservationRQAdditionalInfoType {

    @XmlElement(name = "SpecialReqPref")
    protected List<VehicleSpecialReqPrefType> specialReqPref;
    @XmlElement(name = "CoveragePrefs")
    protected ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref coveragePrefs;
    @XmlElement(name = "OffLocService")
    protected List<OffLocationServiceType> offLocService;
    @XmlElement(name = "ArrivalDetails")
    protected VehicleArrivalDetailsType arrivalDetails;
    @XmlElement(name = "RentalPaymentPref")
    protected List<VehicleReservationRQAdditionalInfoType.RentalPaymentPref> rentalPaymentPref;
    @XmlElement(name = "Reference")
    protected VehicleReservationRQAdditionalInfoType.Reference reference;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;
    @XmlElement(name = "Remark")
    protected List<ParagraphType> remark;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "LuggageQty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger luggageQty;
    @XmlAttribute(name = "PassengerQty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger passengerQty;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;
    @XmlAttribute(name = "GasPrePay")
    protected Boolean gasPrePay;

    /**
     * Gets the value of the specialReqPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialReqPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialReqPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSpecialReqPrefType }
     * 
     * 
     */
    public List<VehicleSpecialReqPrefType> getSpecialReqPref() {
        if (specialReqPref == null) {
            specialReqPref = new ArrayList<VehicleSpecialReqPrefType>();
        }
        return this.specialReqPref;
    }

    /**
     * Obtém o valor da propriedade coveragePrefs.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref }
     *     
     */
    public ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref getCoveragePrefs() {
        return coveragePrefs;
    }

    /**
     * Define o valor da propriedade coveragePrefs.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref }
     *     
     */
    public void setCoveragePrefs(ArrayOfVehicleReservationRQAdditionalInfoTypeCoveragePref value) {
        this.coveragePrefs = value;
    }

    /**
     * Gets the value of the offLocService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServiceType }
     * 
     * 
     */
    public List<OffLocationServiceType> getOffLocService() {
        if (offLocService == null) {
            offLocService = new ArrayList<OffLocationServiceType>();
        }
        return this.offLocService;
    }

    /**
     * Obtém o valor da propriedade arrivalDetails.
     * 
     * @return
     *     possible object is
     *     {@link VehicleArrivalDetailsType }
     *     
     */
    public VehicleArrivalDetailsType getArrivalDetails() {
        return arrivalDetails;
    }

    /**
     * Define o valor da propriedade arrivalDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleArrivalDetailsType }
     *     
     */
    public void setArrivalDetails(VehicleArrivalDetailsType value) {
        this.arrivalDetails = value;
    }

    /**
     * Gets the value of the rentalPaymentPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPaymentPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPaymentPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservationRQAdditionalInfoType.RentalPaymentPref }
     * 
     * 
     */
    public List<VehicleReservationRQAdditionalInfoType.RentalPaymentPref> getRentalPaymentPref() {
        if (rentalPaymentPref == null) {
            rentalPaymentPref = new ArrayList<VehicleReservationRQAdditionalInfoType.RentalPaymentPref>();
        }
        return this.rentalPaymentPref;
    }

    /**
     * Obtém o valor da propriedade reference.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationRQAdditionalInfoType.Reference }
     *     
     */
    public VehicleReservationRQAdditionalInfoType.Reference getReference() {
        return reference;
    }

    /**
     * Define o valor da propriedade reference.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationRQAdditionalInfoType.Reference }
     *     
     */
    public void setReference(VehicleReservationRQAdditionalInfoType.Reference value) {
        this.reference = value;
    }

    /**
     * Obtém o valor da propriedade tourInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public VehicleTourInfoType getTourInfo() {
        return tourInfo;
    }

    /**
     * Define o valor da propriedade tourInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTourInfoType }
     *     
     */
    public void setTourInfo(VehicleTourInfoType value) {
        this.tourInfo = value;
    }

    /**
     * Obtém o valor da propriedade writtenConfInst.
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * Define o valor da propriedade writtenConfInst.
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<ParagraphType>();
        }
        return this.remark;
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
     * Obtém o valor da propriedade luggageQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLuggageQty() {
        return luggageQty;
    }

    /**
     * Define o valor da propriedade luggageQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLuggageQty(BigInteger value) {
        this.luggageQty = value;
    }

    /**
     * Obtém o valor da propriedade passengerQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerQty() {
        return passengerQty;
    }

    /**
     * Define o valor da propriedade passengerQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerQty(BigInteger value) {
        this.passengerQty = value;
    }

    /**
     * Obtém o valor da propriedade smokingAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Define o valor da propriedade smokingAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

    /**
     * Obtém o valor da propriedade gasPrePay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGasPrePay() {
        return gasPrePay;
    }

    /**
     * Define o valor da propriedade gasPrePay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGasPrePay(Boolean value) {
        this.gasPrePay = value;
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
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

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

        /**
         * Obtém o valor da propriedade amount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Define o valor da propriedade amount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

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
         * Obtém o valor da propriedade decimalPlaces.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Define o valor da propriedade decimalPlaces.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType"&gt;
     *       &lt;attribute name="Type"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="guarantee"/&gt;
     *             &lt;enumeration value="payment"/&gt;
     *           &lt;/restriction&gt;
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
    public static class RentalPaymentPref
        extends PaymentDetailType
    {

        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
