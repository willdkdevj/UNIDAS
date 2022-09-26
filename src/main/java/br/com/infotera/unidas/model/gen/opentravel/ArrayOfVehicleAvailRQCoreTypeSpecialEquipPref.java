//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialEquipPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
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
@XmlType(name = "ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref", propOrder = {
    "specialEquipPref"
})
public class ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref {

    @XmlElement(name = "SpecialEquipPref")
    protected List<ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref.SpecialEquipPref> specialEquipPref;

    /**
     * Gets the value of the specialEquipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEquipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref.SpecialEquipPref }
     * 
     * 
     */
    public List<ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref.SpecialEquipPref> getSpecialEquipPref() {
        if (specialEquipPref == null) {
            specialEquipPref = new ArrayList<ArrayOfVehicleAvailRQCoreTypeSpecialEquipPref.SpecialEquipPref>();
        }
        return this.specialEquipPref;
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
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EquipType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpecialEquipPref {

        @XmlAttribute(name = "Quantity")
        protected String quantity;
        @XmlAttribute(name = "EquipType")
        protected String equipType;
        @XmlAttribute(name = "Action")
        protected ActionType action;

        /**
         * Obtém o valor da propriedade quantity.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Define o valor da propriedade quantity.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
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
         * Obtém o valor da propriedade action.
         * 
         * @return
         *     possible object is
         *     {@link ActionType }
         *     
         */
        public ActionType getAction() {
            return action;
        }

        /**
         * Define o valor da propriedade action.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionType }
         *     
         */
        public void setAction(ActionType value) {
            this.action = value;
        }

    }

}
