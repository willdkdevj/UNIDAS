//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.UniqueIDType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OffLocationServiceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TrackingID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SpecInstructions" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceType", propOrder = {
    "personName",
    "telephone",
    "trackingID"
})
public class OffLocationServiceType
    extends OffLocationServiceCoreType
{

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "Telephone")
    protected OffLocationServiceType.Telephone telephone;
    @XmlElement(name = "TrackingID")
    protected UniqueIDType trackingID;
    @XmlAttribute(name = "SpecInstructions")
    protected String specInstructions;

    /**
     * Obtém o valor da propriedade personName.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Define o valor da propriedade personName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceType.Telephone }
     *     
     */
    public OffLocationServiceType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceType.Telephone }
     *     
     */
    public void setTelephone(OffLocationServiceType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Obtém o valor da propriedade trackingID.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getTrackingID() {
        return trackingID;
    }

    /**
     * Define o valor da propriedade trackingID.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setTrackingID(UniqueIDType value) {
        this.trackingID = value;
    }

    /**
     * Obtém o valor da propriedade specInstructions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecInstructions() {
        return specInstructions;
    }

    /**
     * Define o valor da propriedade specInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecInstructions(String value) {
        this.specInstructions = value;
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


    }

}
