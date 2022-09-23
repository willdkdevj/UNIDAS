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
 * <p>Classe Java de ArrayOfVehicleAvailRQCoreTypeVehPref complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleAvailRQCoreTypeVehPref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehPref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType"&gt;
 *                 &lt;attribute name="UpSellInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ArrayOfVehicleAvailRQCoreTypeVehPref", propOrder = {
    "vehPref"
})
public class ArrayOfVehicleAvailRQCoreTypeVehPref {

    @XmlElement(name = "VehPref")
    protected List<ArrayOfVehicleAvailRQCoreTypeVehPref.VehPref> vehPref;

    /**
     * Gets the value of the vehPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleAvailRQCoreTypeVehPref.VehPref }
     * 
     * 
     */
    public List<ArrayOfVehicleAvailRQCoreTypeVehPref.VehPref> getVehPref() {
        if (vehPref == null) {
            vehPref = new ArrayList<ArrayOfVehicleAvailRQCoreTypeVehPref.VehPref>();
        }
        return this.vehPref;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehiclePrefType"&gt;
     *       &lt;attribute name="UpSellInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehPref
        extends VehiclePrefType
    {

        @XmlAttribute(name = "UpSellInd")
        protected Boolean upSellInd;

        /**
         * Obtém o valor da propriedade upSellInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUpSellInd() {
            return upSellInd;
        }

        /**
         * Define o valor da propriedade upSellInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUpSellInd(Boolean value) {
            this.upSellInd = value;
        }

    }

}
