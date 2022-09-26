//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

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
 *         &lt;element name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VehAvailRQCore" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailRQCoreType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehAvailRQInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailRQAdditionalInfoType" minOccurs="0"/&gt;
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
 *       &lt;attribute name="MaxResponses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MaxPerVendorInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTA_VehAvailRateRQ", propOrder = {
    "primaryLangID",
    "pos",
    "customerID",
    "vehAvailRQCore",
    "vehAvailRQInfo"
})
@XmlRootElement(name = "OTA_VehAvailRateRQ", namespace = "http://www.opentravel.org/OTA/2003/05")
public class OTAVehAvailRateRQ {

    @XmlElement(name = "PrimaryLangID")
    protected String primaryLangID;
    @XmlElement(name = "POS", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected ArrayOfSourceType pos;
    @XmlElement(name = "CustomerID")
    protected List<UniqueIDType> customerID;
    @XmlElement(name = "VehAvailRQCore", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected OTAVehAvailRateRQ.VehAvailRQCore vehAvailRQCore;
    @XmlElement(name = "VehAvailRQInfo", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected VehicleAvailRQAdditionalInfoType vehAvailRQInfo;
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
    @XmlAttribute(name = "MaxResponses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxResponses;
    @XmlAttribute(name = "MaxPerVendorInd")
    protected Boolean maxPerVendorInd;

    /**
     * Obtém o valor da propriedade primaryLangID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Define o valor da propriedade primaryLangID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

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
     * Gets the value of the customerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIDType }
     * 
     * 
     */
    public List<UniqueIDType> getCustomerID() {
        if (customerID == null) {
            customerID = new ArrayList<UniqueIDType>();
        }
        return this.customerID;
    }

    /**
     * Obtém o valor da propriedade vehAvailRQCore.
     * 
     * @return
     *     possible object is
     *     {@link OTAVehAvailRateRQ.VehAvailRQCore }
     *     
     */
    public OTAVehAvailRateRQ.VehAvailRQCore getVehAvailRQCore() {
        return vehAvailRQCore;
    }

    /**
     * Define o valor da propriedade vehAvailRQCore.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAVehAvailRateRQ.VehAvailRQCore }
     *     
     */
    public void setVehAvailRQCore(OTAVehAvailRateRQ.VehAvailRQCore value) {
        this.vehAvailRQCore = value;
    }

    /**
     * Obtém o valor da propriedade vehAvailRQInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailRQAdditionalInfoType }
     *     
     */
    public VehicleAvailRQAdditionalInfoType getVehAvailRQInfo() {
        return vehAvailRQInfo;
    }

    /**
     * Define o valor da propriedade vehAvailRQInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailRQAdditionalInfoType }
     *     
     */
    public void setVehAvailRQInfo(VehicleAvailRQAdditionalInfoType value) {
        this.vehAvailRQInfo = value;
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
     * Obtém o valor da propriedade maxResponses.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxResponses() {
        return maxResponses;
    }

    /**
     * Define o valor da propriedade maxResponses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxResponses(BigInteger value) {
        this.maxResponses = value;
    }

    /**
     * Obtém o valor da propriedade maxPerVendorInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxPerVendorInd() {
        return maxPerVendorInd;
    }

    /**
     * Define o valor da propriedade maxPerVendorInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxPerVendorInd(Boolean value) {
        this.maxPerVendorInd = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailRQCoreType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehAvailRQCore
        extends VehicleAvailRQCoreType
    {


    }

}
