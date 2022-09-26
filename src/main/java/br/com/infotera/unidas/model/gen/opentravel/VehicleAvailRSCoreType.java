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
 * <p>Classe Java de VehicleAvailRSCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleAvailRSCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType" minOccurs="0"/&gt;
 *         &lt;element name="VehVendorAvails" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleVendorAvailabilityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAvailRSCoreType", propOrder = {
    "vehRentalCore",
    "vehVendorAvails"
})
public class VehicleAvailRSCoreType {

    @XmlElement(name = "VehRentalCore", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VehVendorAvails", namespace = "http://www.opentravel.org/OTA/2003/05")
    protected ArrayOfVehicleVendorAvailabilityType vehVendorAvails;

    /**
     * Obtém o valor da propriedade vehRentalCore.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * Define o valor da propriedade vehRentalCore.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * Obtém o valor da propriedade vehVendorAvails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleVendorAvailabilityType }
     *     
     */
    public ArrayOfVehicleVendorAvailabilityType getVehVendorAvails() {
        return vehVendorAvails;
    }

    /**
     * Define o valor da propriedade vehVendorAvails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleVendorAvailabilityType }
     *     
     */
    public void setVehVendorAvails(ArrayOfVehicleVendorAvailabilityType value) {
        this.vehVendorAvails = value;
    }

}
