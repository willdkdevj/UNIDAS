//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VehiclePrefType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehiclePrefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehMakeModel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypePref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="ClassPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="AirConditionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="TransmissionPref" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *       &lt;attribute name="VendorCarType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VehicleQty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePrefType", propOrder = {
    "vehMakeModel"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.ArrayOfVehicleAvailRQCoreTypeVehPref.VehPref.class
})
public class VehiclePrefType
    extends VehicleCoreType
{

    @XmlElement(name = "VehMakeModel")
    protected VehiclePrefType.VehMakeModel vehMakeModel;
    @XmlAttribute(name = "TypePref")
    protected PreferLevelType typePref;
    @XmlAttribute(name = "ClassPref")
    protected PreferLevelType classPref;
    @XmlAttribute(name = "AirConditionPref")
    protected PreferLevelType airConditionPref;
    @XmlAttribute(name = "TransmissionPref")
    protected PreferLevelType transmissionPref;
    @XmlAttribute(name = "VendorCarType")
    protected String vendorCarType;
    @XmlAttribute(name = "VehicleQty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleQty;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Obtém o valor da propriedade vehMakeModel.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePrefType.VehMakeModel }
     *     
     */
    public VehiclePrefType.VehMakeModel getVehMakeModel() {
        return vehMakeModel;
    }

    /**
     * Define o valor da propriedade vehMakeModel.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePrefType.VehMakeModel }
     *     
     */
    public void setVehMakeModel(VehiclePrefType.VehMakeModel value) {
        this.vehMakeModel = value;
    }

    /**
     * Obtém o valor da propriedade typePref.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getTypePref() {
        return typePref;
    }

    /**
     * Define o valor da propriedade typePref.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setTypePref(PreferLevelType value) {
        this.typePref = value;
    }

    /**
     * Obtém o valor da propriedade classPref.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getClassPref() {
        return classPref;
    }

    /**
     * Define o valor da propriedade classPref.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setClassPref(PreferLevelType value) {
        this.classPref = value;
    }

    /**
     * Obtém o valor da propriedade airConditionPref.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getAirConditionPref() {
        return airConditionPref;
    }

    /**
     * Define o valor da propriedade airConditionPref.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setAirConditionPref(PreferLevelType value) {
        this.airConditionPref = value;
    }

    /**
     * Obtém o valor da propriedade transmissionPref.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getTransmissionPref() {
        return transmissionPref;
    }

    /**
     * Define o valor da propriedade transmissionPref.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setTransmissionPref(PreferLevelType value) {
        this.transmissionPref = value;
    }

    /**
     * Obtém o valor da propriedade vendorCarType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCarType() {
        return vendorCarType;
    }

    /**
     * Define o valor da propriedade vendorCarType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCarType(String value) {
        this.vendorCarType = value;
    }

    /**
     * Obtém o valor da propriedade vehicleQty.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleQty() {
        return vehicleQty;
    }

    /**
     * Define o valor da propriedade vehicleQty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleQty(BigInteger value) {
        this.vehicleQty = value;
    }

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

    /**
     * Obtém o valor da propriedade codeContext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Define o valor da propriedade codeContext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
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
     *       &lt;attribute name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehMakeModel {

        @XmlAttribute(name = "ModelYear")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar modelYear;

        /**
         * Obtém o valor da propriedade modelYear.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModelYear() {
            return modelYear;
        }

        /**
         * Define o valor da propriedade modelYear.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModelYear(XMLGregorianCalendar value) {
            this.modelYear = value;
        }

    }

}
