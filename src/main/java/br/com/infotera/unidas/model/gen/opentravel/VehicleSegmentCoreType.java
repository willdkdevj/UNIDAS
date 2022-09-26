//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.VehicleRentalCoreType;
import br.com.infotera.unidas.model.gen.opentravel.CompanyNameType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleSegmentCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSegmentCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"&gt;
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType" minOccurs="0"/&gt;
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleType" minOccurs="0"/&gt;
 *         &lt;element name="RentalRate" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalRateType" minOccurs="0"/&gt;
 *         &lt;element name="PricedEquips" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleEquipmentPricedType" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleChargePurposeType1" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharge" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSegmentCoreType", propOrder = {
    "confID",
    "vendor",
    "vehRentalCore",
    "vehicle",
    "rentalRate",
    "pricedEquips",
    "fees",
    "totalCharge",
    "tpaExtensions"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.VehicleReservationType.VehSegmentCore.class
})
public class VehicleSegmentCoreType {

    @XmlElement(name = "ConfID")
    protected List<VehicleSegmentCoreType.ConfID> confID;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehRentalCore")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "Vehicle")
    protected VehicleType vehicle;
    @XmlElement(name = "RentalRate")
    protected VehicleRentalRateType rentalRate;
    @XmlElement(name = "PricedEquips")
    protected ArrayOfVehicleEquipmentPricedType pricedEquips;
    @XmlElement(name = "Fees")
    protected ArrayOfVehicleChargePurposeType1 fees;
    @XmlElement(name = "TotalCharge")
    protected VehicleSegmentCoreType.TotalCharge totalCharge;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "IndexNumber")
    protected BigInteger indexNumber;

    /**
     * Gets the value of the confID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleSegmentCoreType.ConfID }
     * 
     * 
     */
    public List<VehicleSegmentCoreType.ConfID> getConfID() {
        if (confID == null) {
            confID = new ArrayList<VehicleSegmentCoreType.ConfID>();
        }
        return this.confID;
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
     * Obtém o valor da propriedade vehRentalCore.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Define o valor da propriedade vehRentalCore.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Obtém o valor da propriedade vehicle.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Define o valor da propriedade vehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Obtém o valor da propriedade rentalRate.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalRateType }
     *     
     */
    public VehicleRentalRateType getRentalRate() {
        return rentalRate;
    }

    /**
     * Define o valor da propriedade rentalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalRateType }
     *     
     */
    public void setRentalRate(VehicleRentalRateType value) {
        this.rentalRate = value;
    }

    /**
     * Obtém o valor da propriedade pricedEquips.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public ArrayOfVehicleEquipmentPricedType getPricedEquips() {
        return pricedEquips;
    }

    /**
     * Define o valor da propriedade pricedEquips.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleEquipmentPricedType }
     *     
     */
    public void setPricedEquips(ArrayOfVehicleEquipmentPricedType value) {
        this.pricedEquips = value;
    }

    /**
     * Obtém o valor da propriedade fees.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public ArrayOfVehicleChargePurposeType1 getFees() {
        return fees;
    }

    /**
     * Define o valor da propriedade fees.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleChargePurposeType1 }
     *     
     */
    public void setFees(ArrayOfVehicleChargePurposeType1 value) {
        this.fees = value;
    }

    /**
     * Obtém o valor da propriedade totalCharge.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentCoreType.TotalCharge }
     *     
     */
    public VehicleSegmentCoreType.TotalCharge getTotalCharge() {
        return totalCharge;
    }

    /**
     * Define o valor da propriedade totalCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentCoreType.TotalCharge }
     *     
     */
    public void setTotalCharge(VehicleSegmentCoreType.TotalCharge value) {
        this.totalCharge = value;
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
     * Obtém o valor da propriedade indexNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndexNumber() {
        return indexNumber;
    }

    /**
     * Define o valor da propriedade indexNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndexNumber(BigInteger value) {
        this.indexNumber = value;
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
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ConfID
        extends UniqueIDType
    {

        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * Obtém o valor da propriedade status.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
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
     *       &lt;attribute name="RateTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="EstimatedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalCharge {

        @XmlAttribute(name = "RateTotalAmount")
        protected BigDecimal rateTotalAmount;
        @XmlAttribute(name = "EstimatedTotalAmount")
        protected BigDecimal estimatedTotalAmount;

        /**
         * Obtém o valor da propriedade rateTotalAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRateTotalAmount() {
            return rateTotalAmount;
        }

        /**
         * Define o valor da propriedade rateTotalAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRateTotalAmount(BigDecimal value) {
            this.rateTotalAmount = value;
        }

        /**
         * Obtém o valor da propriedade estimatedTotalAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedTotalAmount() {
            return estimatedTotalAmount;
        }

        /**
         * Define o valor da propriedade estimatedTotalAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedTotalAmount(BigDecimal value) {
            this.estimatedTotalAmount = value;
        }

    }

}
