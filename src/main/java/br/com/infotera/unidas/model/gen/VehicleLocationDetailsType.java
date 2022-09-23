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
 * <p>Classe Java de VehicleLocationDetailsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationAdditionalDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AtAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ExtendedLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AssocAirportLocList"&gt;
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
@XmlType(name = "VehicleLocationDetailsType", propOrder = {
    "address",
    "telephone",
    "additionalInfo"
})
public class VehicleLocationDetailsType {

    @XmlElement(name = "Address")
    protected List<AddressInfoType> address;
    @XmlElement(name = "Telephone")
    protected List<VehicleLocationDetailsType.Telephone> telephone;
    @XmlElement(name = "AdditionalInfo")
    protected VehicleLocationAdditionalDetailsType additionalInfo;
    @XmlAttribute(name = "AtAirport")
    protected Boolean atAirport;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "ExtendedLocationCode")
    protected String extendedLocationCode;
    @XmlAttribute(name = "AssocAirportLocList")
    protected List<String> assocAirportLocList;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressInfoType }
     * 
     * 
     */
    public List<AddressInfoType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressInfoType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationDetailsType.Telephone }
     * 
     * 
     */
    public List<VehicleLocationDetailsType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<VehicleLocationDetailsType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * Obtém o valor da propriedade additionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType }
     *     
     */
    public VehicleLocationAdditionalDetailsType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Define o valor da propriedade additionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType }
     *     
     */
    public void setAdditionalInfo(VehicleLocationAdditionalDetailsType value) {
        this.additionalInfo = value;
    }

    /**
     * Obtém o valor da propriedade atAirport.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtAirport() {
        return atAirport;
    }

    /**
     * Define o valor da propriedade atAirport.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtAirport(Boolean value) {
        this.atAirport = value;
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
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the assocAirportLocList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assocAirportLocList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssocAirportLocList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssocAirportLocList() {
        if (assocAirportLocList == null) {
            assocAirportLocList = new ArrayList<String>();
        }
        return this.assocAirportLocList;
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
     *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumber;
        @XmlAttribute(name = "RPH")
        protected String rph;

        /**
         * Obtém o valor da propriedade phoneNumber.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Define o valor da propriedade phoneNumber.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

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
