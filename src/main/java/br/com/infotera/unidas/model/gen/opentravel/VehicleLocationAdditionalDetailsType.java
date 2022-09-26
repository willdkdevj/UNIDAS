//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleLocationAdditionalDetailsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehRentLocInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ParkLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/&gt;
 *         &lt;element name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/&gt;
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *         &lt;element name="Shuttle" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OneWayDropLocations" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsType", propOrder = {
    "vehRentLocInfos",
    "parkLocation",
    "counterLocation",
    "operationSchedules",
    "shuttle",
    "oneWayDropLocations",
    "tpaExtensions"
})
public class VehicleLocationAdditionalDetailsType {

    @XmlElement(name = "VehRentLocInfos")
    protected ArrayOfVehicleLocationInformationType vehRentLocInfos;
    @XmlElement(name = "ParkLocation")
    protected VehicleWhereAtFacilityType parkLocation;
    @XmlElement(name = "CounterLocation")
    protected VehicleWhereAtFacilityType counterLocation;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;
    @XmlElement(name = "Shuttle")
    protected VehicleLocationAdditionalDetailsType.Shuttle shuttle;
    @XmlElement(name = "OneWayDropLocations")
    protected ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation oneWayDropLocations;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade vehRentLocInfos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public ArrayOfVehicleLocationInformationType getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * Define o valor da propriedade vehRentLocInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationInformationType }
     *     
     */
    public void setVehRentLocInfos(ArrayOfVehicleLocationInformationType value) {
        this.vehRentLocInfos = value;
    }

    /**
     * Obtém o valor da propriedade parkLocation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * Define o valor da propriedade parkLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * Obtém o valor da propriedade counterLocation.
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * Define o valor da propriedade counterLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * Obtém o valor da propriedade operationSchedules.
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * Define o valor da propriedade operationSchedules.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * Obtém o valor da propriedade shuttle.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public VehicleLocationAdditionalDetailsType.Shuttle getShuttle() {
        return shuttle;
    }

    /**
     * Define o valor da propriedade shuttle.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public void setShuttle(VehicleLocationAdditionalDetailsType.Shuttle value) {
        this.shuttle = value;
    }

    /**
     * Obtém o valor da propriedade oneWayDropLocations.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * Define o valor da propriedade oneWayDropLocations.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation }
     *     
     */
    public void setOneWayDropLocations(ArrayOfVehicleLocationAdditionalDetailsTypeOneWayDropLocation value) {
        this.oneWayDropLocations = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *         &lt;element name="ShuttleInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo" minOccurs="0"/&gt;
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
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
        "shuttleInfos",
        "operationSchedules"
    })
    public static class Shuttle {

        @XmlElement(name = "ShuttleInfos")
        protected ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo shuttleInfos;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;

        /**
         * Obtém o valor da propriedade shuttleInfos.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         *     
         */
        public ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo getShuttleInfos() {
            return shuttleInfos;
        }

        /**
         * Define o valor da propriedade shuttleInfos.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo }
         *     
         */
        public void setShuttleInfos(ArrayOfVehicleLocationAdditionalDetailsTypeShuttleShuttleInfo value) {
            this.shuttleInfos = value;
        }

        /**
         * Obtém o valor da propriedade operationSchedules.
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * Define o valor da propriedade operationSchedules.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

    }

}
