//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.opentravel.CompanyNameType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/&gt;
 *         &lt;element name="Location" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseFilter" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="LocationAddressPhoneIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="LocationInfoIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="VehiclesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="RequirementsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AdditionalFeesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="LiabilitiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ServicesOfferedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Keyword" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Target"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Test"/&gt;
 *             &lt;enumeration value="Production"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="TransactionStatusCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Start"/&gt;
 *             &lt;enumeration value="End"/&gt;
 *             &lt;enumeration value="Rollback"/&gt;
 *             &lt;enumeration value="InSeries"/&gt;
 *             &lt;enumeration value="Continuation"/&gt;
 *             &lt;enumeration value="Subsequent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RetransmissionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "location",
    "vendor",
    "responseFilter",
    "date",
    "keyword",
    "tpaExtensions"
})
@XmlRootElement(name = "OTA_VehLocDetailRQ")
public class OTAVehLocDetailRQ {

    @XmlElement(name = "POS")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "Location")
    protected OTAVehLocDetailRQ.Location location;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "ResponseFilter")
    protected OTAVehLocDetailRQ.ResponseFilter responseFilter;
    @XmlElement(name = "Date")
    protected OTAVehLocDetailRQ.Date date;
    @XmlElement(name = "Keyword")
    protected List<OTAVehLocDetailRQ.Keyword> keyword;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "ReqRespVersion")
    protected String reqRespVersion;

    /**
     * Obtém o valor da propriedade pos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getPOS() {
        return pos;
    }

    /**
     * Define o valor da propriedade pos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setPOS(ArrayOfSourceType value) {
        this.pos = value;
    }

    /**
     * Obtém o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehLocDetailRQ.Location }
     *     
     */
    public OTAVehLocDetailRQ.Location getLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehLocDetailRQ.Location }
     *     
     */
    public void setLocation(OTAVehLocDetailRQ.Location value) {
        this.location = value;
    }

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
     * Obtém o valor da propriedade responseFilter.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehLocDetailRQ.ResponseFilter }
     *     
     */
    public OTAVehLocDetailRQ.ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    /**
     * Define o valor da propriedade responseFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehLocDetailRQ.ResponseFilter }
     *     
     */
    public void setResponseFilter(OTAVehLocDetailRQ.ResponseFilter value) {
        this.responseFilter = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehLocDetailRQ.Date }
     *     
     */
    public OTAVehLocDetailRQ.Date getDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehLocDetailRQ.Date }
     *     
     */
    public void setDate(OTAVehLocDetailRQ.Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OTAVehLocDetailRQ.Keyword }
     * 
     * 
     */
    public List<OTAVehLocDetailRQ.Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<OTAVehLocDetailRQ.Keyword>();
        }
        return this.keyword;
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
     * Obtém o valor da propriedade echoToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Define o valor da propriedade echoToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Obtém o valor da propriedade timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define o valor da propriedade timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Obtém o valor da propriedade target.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Define o valor da propriedade target.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade transactionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Define o valor da propriedade transactionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNmbr.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Define o valor da propriedade sequenceNmbr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Obtém o valor da propriedade transactionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Define o valor da propriedade transactionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade retransmissionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Define o valor da propriedade retransmissionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade correlationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Define o valor da propriedade correlationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Obtém o valor da propriedade reqRespVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * Define o valor da propriedade reqRespVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
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
     *       &lt;attribute name="PickUpDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Date {

        @XmlAttribute(name = "PickUpDateTime")
        protected String pickUpDateTime;
        @XmlAttribute(name = "ReturnDateTime")
        protected String returnDateTime;

        /**
         * Obtém o valor da propriedade pickUpDateTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPickUpDateTime() {
            return pickUpDateTime;
        }

        /**
         * Define o valor da propriedade pickUpDateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPickUpDateTime(String value) {
            this.pickUpDateTime = value;
        }

        /**
         * Obtém o valor da propriedade returnDateTime.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnDateTime() {
            return returnDateTime;
        }

        /**
         * Define o valor da propriedade returnDateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnDateTime(String value) {
            this.returnDateTime = value;
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
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Keyword {

        @XmlAttribute(name = "Code")
        protected String code;

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
    public static class Location
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="LocationAddressPhoneIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="LocationInfoIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="VehiclesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RequirementsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AdditionalFeesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="LiabilitiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ServicesOfferedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseFilter {

        @XmlAttribute(name = "LocationAddressPhoneIndicator")
        protected Boolean locationAddressPhoneIndicator;
        @XmlAttribute(name = "LocationInfoIndicator")
        protected Boolean locationInfoIndicator;
        @XmlAttribute(name = "VehiclesIndicator")
        protected Boolean vehiclesIndicator;
        @XmlAttribute(name = "RequirementsIndicator")
        protected Boolean requirementsIndicator;
        @XmlAttribute(name = "AdditionalFeesIndicator")
        protected Boolean additionalFeesIndicator;
        @XmlAttribute(name = "LiabilitiesIndicator")
        protected Boolean liabilitiesIndicator;
        @XmlAttribute(name = "ServicesOfferedIndicator")
        protected Boolean servicesOfferedIndicator;

        /**
         * Obtém o valor da propriedade locationAddressPhoneIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLocationAddressPhoneIndicator() {
            return locationAddressPhoneIndicator;
        }

        /**
         * Define o valor da propriedade locationAddressPhoneIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLocationAddressPhoneIndicator(Boolean value) {
            this.locationAddressPhoneIndicator = value;
        }

        /**
         * Obtém o valor da propriedade locationInfoIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLocationInfoIndicator() {
            return locationInfoIndicator;
        }

        /**
         * Define o valor da propriedade locationInfoIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLocationInfoIndicator(Boolean value) {
            this.locationInfoIndicator = value;
        }

        /**
         * Obtém o valor da propriedade vehiclesIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVehiclesIndicator() {
            return vehiclesIndicator;
        }

        /**
         * Define o valor da propriedade vehiclesIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVehiclesIndicator(Boolean value) {
            this.vehiclesIndicator = value;
        }

        /**
         * Obtém o valor da propriedade requirementsIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequirementsIndicator() {
            return requirementsIndicator;
        }

        /**
         * Define o valor da propriedade requirementsIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequirementsIndicator(Boolean value) {
            this.requirementsIndicator = value;
        }

        /**
         * Obtém o valor da propriedade additionalFeesIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdditionalFeesIndicator() {
            return additionalFeesIndicator;
        }

        /**
         * Define o valor da propriedade additionalFeesIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdditionalFeesIndicator(Boolean value) {
            this.additionalFeesIndicator = value;
        }

        /**
         * Obtém o valor da propriedade liabilitiesIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLiabilitiesIndicator() {
            return liabilitiesIndicator;
        }

        /**
         * Define o valor da propriedade liabilitiesIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLiabilitiesIndicator(Boolean value) {
            this.liabilitiesIndicator = value;
        }

        /**
         * Obtém o valor da propriedade servicesOfferedIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isServicesOfferedIndicator() {
            return servicesOfferedIndicator;
        }

        /**
         * Define o valor da propriedade servicesOfferedIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setServicesOfferedIndicator(Boolean value) {
            this.servicesOfferedIndicator = value;
        }

    }

}
