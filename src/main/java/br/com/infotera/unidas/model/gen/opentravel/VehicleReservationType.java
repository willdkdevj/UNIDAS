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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehicleReservationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleReservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerPrimaryAdditionalType" minOccurs="0"/&gt;
 *         &lt;element name="VehSegmentCore" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType"&gt;
 *                 &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehSegmentInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentAdditionalInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="CreatorID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LastModifyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="LastModifierID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PurgeDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleReservationType", propOrder = {
    "customer",
    "vehSegmentCore",
    "vehSegmentInfo"
})
public class VehicleReservationType {

    @XmlElement(name = "Customer")
    protected CustomerPrimaryAdditionalType customer;
    @XmlElement(name = "VehSegmentCore")
    protected VehicleReservationType.VehSegmentCore vehSegmentCore;
    @XmlElement(name = "VehSegmentInfo")
    protected VehicleSegmentAdditionalInfoType vehSegmentInfo;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "PurgeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar purgeDate;
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public CustomerPrimaryAdditionalType getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalType }
     *     
     */
    public void setCustomer(CustomerPrimaryAdditionalType value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade vehSegmentCore.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public VehicleReservationType.VehSegmentCore getVehSegmentCore() {
        return vehSegmentCore;
    }

    /**
     * Define o valor da propriedade vehSegmentCore.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType.VehSegmentCore }
     *     
     */
    public void setVehSegmentCore(VehicleReservationType.VehSegmentCore value) {
        this.vehSegmentCore = value;
    }

    /**
     * Obtém o valor da propriedade vehSegmentInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentAdditionalInfoType }
     *     
     */
    public VehicleSegmentAdditionalInfoType getVehSegmentInfo() {
        return vehSegmentInfo;
    }

    /**
     * Define o valor da propriedade vehSegmentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentAdditionalInfoType }
     *     
     */
    public void setVehSegmentInfo(VehicleSegmentAdditionalInfoType value) {
        this.vehSegmentInfo = value;
    }

    /**
     * Obtém o valor da propriedade createDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Define o valor da propriedade createDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Obtém o valor da propriedade creatorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Define o valor da propriedade creatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * Obtém o valor da propriedade lastModifyDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * Define o valor da propriedade lastModifyDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * Obtém o valor da propriedade lastModifierID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * Define o valor da propriedade lastModifierID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * Obtém o valor da propriedade purgeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurgeDate() {
        return purgeDate;
    }

    /**
     * Define o valor da propriedade purgeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurgeDate(XMLGregorianCalendar value) {
        this.purgeDate = value;
    }

    /**
     * Obtém o valor da propriedade reservationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Define o valor da propriedade reservationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType"&gt;
     *       &lt;attribute name="OptionChangeAllowedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehSegmentCore
        extends VehicleSegmentCoreType
    {

        @XmlAttribute(name = "OptionChangeAllowedIndicator")
        protected Boolean optionChangeAllowedIndicator;

        /**
         * Obtém o valor da propriedade optionChangeAllowedIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOptionChangeAllowedIndicator() {
            return optionChangeAllowedIndicator;
        }

        /**
         * Define o valor da propriedade optionChangeAllowedIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOptionChangeAllowedIndicator(Boolean value) {
            this.optionChangeAllowedIndicator = value;
        }

    }

}
