//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.VehicleChargeType;
import br.com.infotera.unidas.model.gen.opentravel.DeductibleType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoverageFee" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
 *                   &lt;element name="Vehicles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle" minOccurs="0"/&gt;
 *                   &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee", propOrder = {
    "coverageFee"
})
public class ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee {

    @XmlElement(name = "CoverageFee")
    protected List<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee.CoverageFee> coverageFee;

    /**
     * Gets the value of the coverageFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverageFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverageFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee.CoverageFee }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee.CoverageFee> getCoverageFee() {
        if (coverageFee == null) {
            coverageFee = new ArrayList<ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee.CoverageFee>();
        }
        return this.coverageFee;
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
     *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
     *         &lt;element name="Vehicles" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle" minOccurs="0"/&gt;
     *         &lt;element name="Deductible" type="{http://www.opentravel.org/OTA/2003/05}DeductibleType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "charge",
        "vehicles",
        "deductible"
    })
    public static class CoverageFee {

        @XmlElement(name = "Charge")
        protected VehicleChargeType charge;
        @XmlElement(name = "Vehicles")
        protected ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle vehicles;
        @XmlElement(name = "Deductible")
        protected DeductibleType deductible;

        /**
         * Obtém o valor da propriedade charge.
         * 
         * @return
         *     possible object is
         *     {@link VehicleChargeType }
         *     
         */
        public VehicleChargeType getCharge() {
            return charge;
        }

        /**
         * Define o valor da propriedade charge.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleChargeType }
         *     
         */
        public void setCharge(VehicleChargeType value) {
            this.charge = value;
        }

        /**
         * Obtém o valor da propriedade vehicles.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle }
         *     
         */
        public ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle getVehicles() {
            return vehicles;
        }

        /**
         * Define o valor da propriedade vehicles.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle }
         *     
         */
        public void setVehicles(ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFeeVehicle value) {
            this.vehicles = value;
        }

        /**
         * Obtém o valor da propriedade deductible.
         * 
         * @return
         *     possible object is
         *     {@link DeductibleType }
         *     
         */
        public DeductibleType getDeductible() {
            return deductible;
        }

        /**
         * Define o valor da propriedade deductible.
         * 
         * @param value
         *     allowed object is
         *     {@link DeductibleType }
         *     
         */
        public void setDeductible(DeductibleType value) {
            this.deductible = value;
        }

    }

}
