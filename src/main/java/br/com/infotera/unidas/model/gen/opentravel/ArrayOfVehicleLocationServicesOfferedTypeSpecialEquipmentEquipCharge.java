//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.VehicleChargeType;
import br.com.infotera.unidas.model.gen.opentravel.ArrayOfVehicleCoreType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vehicles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleCoreType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge", propOrder = {
    "equipCharge"
})
public class ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge {

    @XmlElement(name = "EquipCharge")
    protected List<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge.EquipCharge> equipCharge;

    /**
     * Gets the value of the equipCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge.EquipCharge }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge.EquipCharge> getEquipCharge() {
        if (equipCharge == null) {
            equipCharge = new ArrayList<ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipmentEquipCharge.EquipCharge>();
        }
        return this.equipCharge;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Vehicles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleCoreType" minOccurs="0"/&gt;
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
        "vehicles"
    })
    public static class EquipCharge
        extends VehicleChargeType
    {

        @XmlElement(name = "Vehicles")
        protected ArrayOfVehicleCoreType vehicles;

        /**
         * Obtém o valor da propriedade vehicles.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleCoreType }
         *     
         */
        public ArrayOfVehicleCoreType getVehicles() {
            return vehicles;
        }

        /**
         * Define o valor da propriedade vehicles.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleCoreType }
         *     
         */
        public void setVehicles(ArrayOfVehicleCoreType value) {
            this.vehicles = value;
        }

    }

}
