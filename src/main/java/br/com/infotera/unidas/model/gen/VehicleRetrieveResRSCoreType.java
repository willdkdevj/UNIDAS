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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleRetrieveResRSCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleRetrieveResRSCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="VehResSummaries" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="VehReservation" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRetrieveResRSCoreType", propOrder = {
    "vehResSummaries",
    "vehReservation"
})
public class VehicleRetrieveResRSCoreType {

    @XmlElement(name = "VehResSummaries")
    protected VehicleRetrieveResRSCoreType.VehResSummaries vehResSummaries;
    @XmlElement(name = "VehReservation")
    protected VehicleReservationType vehReservation;

    /**
     * Obtém o valor da propriedade vehResSummaries.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRetrieveResRSCoreType.VehResSummaries }
     *     
     */
    public VehicleRetrieveResRSCoreType.VehResSummaries getVehResSummaries() {
        return vehResSummaries;
    }

    /**
     * Define o valor da propriedade vehResSummaries.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRetrieveResRSCoreType.VehResSummaries }
     *     
     */
    public void setVehResSummaries(VehicleRetrieveResRSCoreType.VehResSummaries value) {
        this.vehResSummaries = value;
    }

    /**
     * Obtém o valor da propriedade vehReservation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType }
     *     
     */
    public VehicleReservationType getVehReservation() {
        return vehReservation;
    }

    /**
     * Define o valor da propriedade vehReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType }
     *     
     */
    public void setVehReservation(VehicleReservationType value) {
        this.vehReservation = value;
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
     *         &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "vehResSummary"
    })
    public static class VehResSummaries {

        @XmlElement(name = "VehResSummary")
        protected List<VehicleReservationSummaryType> vehResSummary;

        /**
         * Gets the value of the vehResSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehResSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehResSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleReservationSummaryType }
         * 
         * 
         */
        public List<VehicleReservationSummaryType> getVehResSummary() {
            if (vehResSummary == null) {
                vehResSummary = new ArrayList<VehicleReservationSummaryType>();
            }
            return this.vehResSummary;
        }

    }

}
