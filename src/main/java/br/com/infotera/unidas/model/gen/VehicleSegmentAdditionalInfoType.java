//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleSegmentAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSegmentAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfMonetaryRuleType" minOccurs="0"/&gt;
 *         &lt;element name="RentalPaymentAmount" type="{http://www.opentravel.org/OTA/2003/05}PaymentDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricedCoverages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCoveragePricedType" minOccurs="0"/&gt;
 *         &lt;element name="PricedOffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServicePricedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfFormattedTextType" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TourInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleTourInfoType" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="WrittenConfInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentAdditionalInfoType", propOrder = {
    "paymentRules",
    "rentalPaymentAmount",
    "pricedCoverages",
    "pricedOffLocService",
    "vendorMessages",
    "locationDetails",
    "tourInfo",
    "tpaExtensions",
    "remark"
})
public class VehicleSegmentAdditionalInfoType {

    @XmlElement(name = "PaymentRules")
    protected ArrayOfMonetaryRuleType paymentRules;
    @XmlElement(name = "RentalPaymentAmount")
    protected List<PaymentDetailType> rentalPaymentAmount;
    @XmlElement(name = "PricedCoverages")
    protected ArrayOfCoveragePricedType pricedCoverages;
    @XmlElement(name = "PricedOffLocService")
    protected List<OffLocationServicePricedType> pricedOffLocService;
    @XmlElement(name = "VendorMessages")
    protected ArrayOfFormattedTextType vendorMessages;
    @XmlElement(name = "LocationDetails")
    protected List<VehicleLocationDetailsType> locationDetails;
    @XmlElement(name = "TourInfo")
    protected VehicleTourInfoType tourInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "Remark")
    protected List<ParagraphType> remark;
    @XmlAttribute(name = "WrittenConfInd")
    protected Boolean writtenConfInd;

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
     * Gets the value of the rentalPaymentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalPaymentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalPaymentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailType }
     * 
     * 
     */
    public List<PaymentDetailType> getRentalPaymentAmount() {
        if (rentalPaymentAmount == null) {
            rentalPaymentAmount = new ArrayList<PaymentDetailType>();
        }
        return this.rentalPaymentAmount;
    }

    /**
     * Obtém o valor da propriedade pricedCoverages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoveragePricedType }
     *     
     */
    public ArrayOfCoveragePricedType getPricedCoverages() {
        return pricedCoverages;
    }

    /**
     * Define o valor da propriedade pricedCoverages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoveragePricedType }
     *     
     */
    public void setPricedCoverages(ArrayOfCoveragePricedType value) {
        this.pricedCoverages = value;
    }

    /**
     * Gets the value of the pricedOffLocService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedOffLocService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedOffLocService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffLocationServicePricedType }
     * 
     * 
     */
    public List<OffLocationServicePricedType> getPricedOffLocService() {
        if (pricedOffLocService == null) {
            pricedOffLocService = new ArrayList<OffLocationServicePricedType>();
        }
        return this.pricedOffLocService;
    }

    /**
     * Obtém o valor da propriedade vendorMessages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public ArrayOfFormattedTextType getVendorMessages() {
        return vendorMessages;
    }

    /**
     * Define o valor da propriedade vendorMessages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormattedTextType }
     *     
     */
    public void setVendorMessages(ArrayOfFormattedTextType value) {
        this.vendorMessages = value;
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
     * Obtém o valor da propriedade writtenConfInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrittenConfInd() {
        return writtenConfInd;
    }

    /**
     * Define o valor da propriedade writtenConfInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrittenConfInd(Boolean value) {
        this.writtenConfInd = value;
    }

}
