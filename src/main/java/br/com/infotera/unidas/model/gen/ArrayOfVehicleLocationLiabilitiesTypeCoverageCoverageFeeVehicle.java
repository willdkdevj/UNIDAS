//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.IncludeExcludeType;
import br.com.infotera.unidas.model.gen.opentravel.VehicleType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vehicle" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
 *                 &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
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
@XmlType(name = "ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle", propOrder = {
    "vehicle"
})
public class ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle {

    @XmlElement(name = "Vehicle")
    protected List<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle.Vehicle> vehicle;

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle.Vehicle }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle.Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle.Vehicle>();
        }
        return this.vehicle;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType"&gt;
     *       &lt;attribute name="IncludeExclude" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vehicle
        extends VehicleType
    {

        @XmlAttribute(name = "IncludeExclude")
        protected IncludeExcludeType includeExclude;

        /**
         * Obtém o valor da propriedade includeExclude.
         * 
         * @return
         *     possible object is
         *     {@link IncludeExcludeType }
         *     
         */
        public IncludeExcludeType getIncludeExclude() {
            return includeExclude;
        }

        /**
         * Define o valor da propriedade includeExclude.
         * 
         * @param value
         *     allowed object is
         *     {@link IncludeExcludeType }
         *     
         */
        public void setIncludeExclude(IncludeExcludeType value) {
            this.includeExclude = value;
        }

    }

}
