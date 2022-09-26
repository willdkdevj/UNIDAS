//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.EmailType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WrittenConfInstType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WrittenConfInstType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementalData" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LanguageID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AddresseeName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ConfirmInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrittenConfInstType", propOrder = {
    "supplementalData",
    "email"
})
public class WrittenConfInstType {

    @XmlElement(name = "SupplementalData")
    protected ParagraphType supplementalData;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlAttribute(name = "LanguageID")
    protected String languageID;
    @XmlAttribute(name = "AddresseeName")
    protected String addresseeName;
    @XmlAttribute(name = "Address")
    protected String address;
    @XmlAttribute(name = "Telephone")
    protected String telephone;
    @XmlAttribute(name = "ConfirmInd")
    protected Boolean confirmInd;

    /**
     * Obtém o valor da propriedade supplementalData.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getSupplementalData() {
        return supplementalData;
    }

    /**
     * Define o valor da propriedade supplementalData.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setSupplementalData(ParagraphType value) {
        this.supplementalData = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Define o valor da propriedade languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Obtém o valor da propriedade addresseeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * Define o valor da propriedade addresseeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresseeName(String value) {
        this.addresseeName = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtém o valor da propriedade confirmInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmInd() {
        return confirmInd;
    }

    /**
     * Define o valor da propriedade confirmInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmInd(Boolean value) {
        this.confirmInd = value;
    }

}
