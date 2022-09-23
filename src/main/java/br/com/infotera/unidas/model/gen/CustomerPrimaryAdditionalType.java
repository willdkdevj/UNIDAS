//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomerPrimaryAdditionalType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerPrimaryAdditionalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Primary" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomerID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Additional" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType"&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorpDiscountName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="QualificationMethod"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="RT_AirlineTicket"/&gt;
 *                       &lt;enumeration value="CreditCard"/&gt;
 *                       &lt;enumeration value="PassportAndReturnTkt"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPrimaryAdditionalType", propOrder = {
    "primary",
    "additional"
})
public class CustomerPrimaryAdditionalType {

    @XmlElement(name = "Primary")
    protected CustomerPrimaryAdditionalType.Primary primary;
    @XmlElement(name = "Additional")
    protected List<CustomerPrimaryAdditionalType.Additional> additional;

    /**
     * Obtém o valor da propriedade primary.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryAdditionalType.Primary }
     *     
     */
    public CustomerPrimaryAdditionalType.Primary getPrimary() {
        return primary;
    }

    /**
     * Define o valor da propriedade primary.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryAdditionalType.Primary }
     *     
     */
    public void setPrimary(CustomerPrimaryAdditionalType.Primary value) {
        this.primary = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPrimaryAdditionalType.Additional }
     * 
     * 
     */
    public List<CustomerPrimaryAdditionalType.Additional> getAdditional() {
        if (additional == null) {
            additional = new ArrayList<CustomerPrimaryAdditionalType.Additional>();
        }
        return this.additional;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType"&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorpDiscountName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="QualificationMethod"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="RT_AirlineTicket"/&gt;
     *             &lt;enumeration value="CreditCard"/&gt;
     *             &lt;enumeration value="PassportAndReturnTkt"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Additional
        extends CustomerType
    {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "CorpDiscountName")
        protected String corpDiscountName;
        @XmlAttribute(name = "CorpDiscountNmbr")
        protected String corpDiscountNmbr;
        @XmlAttribute(name = "QualificationMethod")
        protected String qualificationMethod;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Obtém o valor da propriedade start.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Define o valor da propriedade start.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Obtém o valor da propriedade duration.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Define o valor da propriedade duration.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Obtém o valor da propriedade end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Define o valor da propriedade end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Obtém o valor da propriedade corpDiscountName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorpDiscountName() {
            return corpDiscountName;
        }

        /**
         * Define o valor da propriedade corpDiscountName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorpDiscountName(String value) {
            this.corpDiscountName = value;
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
         * Obtém o valor da propriedade qualificationMethod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualificationMethod() {
            return qualificationMethod;
        }

        /**
         * Define o valor da propriedade qualificationMethod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualificationMethod(String value) {
            this.qualificationMethod = value;
        }

        /**
         * Obtém o valor da propriedade age.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * Define o valor da propriedade age.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAge(BigInteger value) {
            this.age = value;
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
         * Obtém o valor da propriedade uri.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Define o valor da propriedade uri.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CustomerID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerID"
    })
    public static class Primary
        extends CustomerType
    {

        @XmlElement(name = "CustomerID")
        protected UniqueIDType customerID;

        /**
         * Obtém o valor da propriedade customerID.
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getCustomerID() {
            return customerID;
        }

        /**
         * Define o valor da propriedade customerID.
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setCustomerID(UniqueIDType value) {
            this.customerID = value;
        }

    }

}
