//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.FormattedTextType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialEquipment" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EquipDesc" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                   &lt;element name="EquipCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment", propOrder = {
    "specialEquipment"
})
public class ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment {

    @XmlElement(name = "SpecialEquipment")
    protected List<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment.SpecialEquipment> specialEquipment;

    /**
     * Gets the value of the specialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment.SpecialEquipment }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment.SpecialEquipment> getSpecialEquipment() {
        if (specialEquipment == null) {
            specialEquipment = new ArrayList<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment.SpecialEquipment>();
        }
        return this.specialEquipment;
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
     *       &lt;sequence&gt;
     *         &lt;element name="EquipDesc" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *         &lt;element name="EquipCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "equipDesc",
        "equipCharges"
    })
    public static class SpecialEquipment {

        @XmlElement(name = "EquipDesc")
        protected FormattedTextType equipDesc;
        @XmlElement(name = "EquipCharges")
        protected ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge equipCharges;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Obtém o valor da propriedade equipDesc.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextType }
         *     
         */
        public FormattedTextType getEquipDesc() {
            return equipDesc;
        }

        /**
         * Define o valor da propriedade equipDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextType }
         *     
         */
        public void setEquipDesc(FormattedTextType value) {
            this.equipDesc = value;
        }

        /**
         * Obtém o valor da propriedade equipCharges.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge }
         *     
         */
        public ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge getEquipCharges() {
            return equipCharges;
        }

        /**
         * Define o valor da propriedade equipCharges.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge }
         *     
         */
        public void setEquipCharges(ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge value) {
            this.equipCharges = value;
        }

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
