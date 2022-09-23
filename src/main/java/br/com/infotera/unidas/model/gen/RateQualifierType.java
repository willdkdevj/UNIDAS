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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RateQualifierType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RateQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateComments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfRateQualifierTypeRateComment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TravelPurpose" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateQualifier" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RatePeriod" type="{http://www.opentravel.org/OTA/2003/05}RateQualifierTypeRatePeriod" /&gt;
 *       &lt;attribute name="GuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateAuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorRateID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionVendorCode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "RateQualifierType", propOrder = {
    "promoDesc",
    "rateComments"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.VehicleRentalRateType.RateQualifier.class
})
public class RateQualifierType {

    @XmlElement(name = "PromoDesc")
    protected String promoDesc;
    @XmlElement(name = "RateComments")
    protected ArrayOfRateQualifierTypeRateComment rateComments;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "CorpDiscountNmbr")
    protected String corpDiscountNmbr;
    @XmlAttribute(name = "RateQualifier")
    protected String rateQualifier;
    @XmlAttribute(name = "RatePeriod")
    protected RateQualifierTypeRatePeriod ratePeriod;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "ArriveByFlight")
    protected Boolean arriveByFlight;
    @XmlAttribute(name = "RateAuthorizationCode")
    protected String rateAuthorizationCode;
    @XmlAttribute(name = "VendorRateID")
    protected String vendorRateID;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "PromotionVendorCode")
    protected List<String> promotionVendorCode;

    /**
     * Obtém o valor da propriedade promoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /**
     * Define o valor da propriedade promoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

    /**
     * Obtém o valor da propriedade rateComments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRateQualifierTypeRateComment }
     *     
     */
    public ArrayOfRateQualifierTypeRateComment getRateComments() {
        return rateComments;
    }

    /**
     * Define o valor da propriedade rateComments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRateQualifierTypeRateComment }
     *     
     */
    public void setRateComments(ArrayOfRateQualifierTypeRateComment value) {
        this.rateComments = value;
    }

    /**
     * Obtém o valor da propriedade travelPurpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * Define o valor da propriedade travelPurpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
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
     * Obtém o valor da propriedade corpDiscountNmbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpDiscountNmbr() {
        return corpDiscountNmbr;
    }

    /**
     * Define o valor da propriedade corpDiscountNmbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpDiscountNmbr(String value) {
        this.corpDiscountNmbr = value;
    }

    /**
     * Obtém o valor da propriedade rateQualifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Define o valor da propriedade rateQualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateQualifier(String value) {
        this.rateQualifier = value;
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
     * Obtém o valor da propriedade guaranteedInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Define o valor da propriedade guaranteedInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

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
     * Obtém o valor da propriedade rateAuthorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAuthorizationCode() {
        return rateAuthorizationCode;
    }

    /**
     * Define o valor da propriedade rateAuthorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAuthorizationCode(String value) {
        this.rateAuthorizationCode = value;
    }

    /**
     * Obtém o valor da propriedade vendorRateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorRateID() {
        return vendorRateID;
    }

    /**
     * Define o valor da propriedade vendorRateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorRateID(String value) {
        this.vendorRateID = value;
    }

    /**
     * Obtém o valor da propriedade promotionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Define o valor da propriedade promotionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
    }

}
