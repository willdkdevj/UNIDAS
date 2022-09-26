//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleAvailVendorInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailVendorInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVendorMessageType" minOccurs="0"/&gt;
 *         &lt;element name="OffLocServices" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMonetaryRuleType" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TourInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType"&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailVendorInfoType", propOrder = {
    "vendorMessages",
    "offLocServices",
    "paymentRules",
    "locationDetails",
    "tourInfo",
    "tpaExtensions"
})
public class VehicleAvailVendorInfoType {

    @XmlElement(name = "VendorMessages")
    protected ArrayOfVendorMessageType vendorMessages;
    @XmlElement(name = "OffLocServices")
    protected List<OffLocationServicePricedType> offLocServices;
    @XmlElement(name = "PaymentRules")
    protected ArrayOfMonetaryRuleType paymentRules;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleAvailVendorInfoType.TourInfo tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade vendorMessages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVendorMessageType }
     *     
     */
    public ArrayOfVendorMessageType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Define o valor da propriedade vendorMessages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVendorMessageType }
     *     
     */
    public void setVendorMessages(ArrayOfVendorMessageType value) {
        this.vendorMessages = value;
    }

    /**
     * Gets the value of the offLocServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     * 
     * 
     */
    public List<OffLocationServicePricedType> getOffLocServices() {
        if (offLocServices == null) {
            offLocServices = new ArrayList<OffLocationServicePricedType>();
        }
        return this.offLocServices;
    }

    /**
     * Obtém o valor da propriedade paymentRules.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMonetaryRuleType }
     *     
     */
    public ArrayOfMonetaryRuleType getPaymentRules() {
        return paymentRules;
    }

    /**
     * Define o valor da propriedade paymentRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMonetaryRuleType }
     *     
     */
    public void setPaymentRules(ArrayOfMonetaryRuleType value) {
        this.paymentRules = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType }
     * 
     * 
     */
    public List<VehicleLocationDetailsType> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<VehicleLocationDetailsType>();
        }
        return this.locationDetails;
    }

    /**
     * Obtém o valor da propriedade tourInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailVendorInfoType.TourInfo }
     *     
     */
    public VehicleAvailVendorInfoType.TourInfo getTourInfo() {
        return tourInfo;
    }

    /**
     * Define o valor da propriedade tourInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailVendorInfoType.TourInfo }
     *     
     */
    public void setTourInfo(VehicleAvailVendorInfoType.TourInfo value) {
        this.tourInfo = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType"&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TourInfo
        extends VehicleTourInfoType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Obtém o valor da propriedade rph.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Define o valor da propriedade rph.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

    }

}
