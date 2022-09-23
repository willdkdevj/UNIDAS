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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleEquipmentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Restriction" type="{http://www.opentravel.org/OTA/2003/05}EquipmentRestrictionType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEquipmentType", propOrder = {
    "description"
})
public class VehicleEquipmentType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "EquipType")
    protected String equipType;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "Restriction")
    protected EquipmentRestrictionType restriction;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade equipType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipType() {
        return equipType;
    }

    /**
     * Define o valor da propriedade equipType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipType(String value) {
        this.equipType = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade restriction.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentRestrictionType }
     *     
     */
    public EquipmentRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Define o valor da propriedade restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentRestrictionType }
     *     
     */
    public void setRestriction(EquipmentRestrictionType value) {
        this.restriction = value;
    }

}
