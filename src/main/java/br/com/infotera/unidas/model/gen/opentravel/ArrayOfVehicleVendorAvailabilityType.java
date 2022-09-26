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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleVendorAvailabilityType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleVendorAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehVendorAvail" type="{http://www.opentravel.org/OTA/2003/05}VehicleVendorAvailabilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleVendorAvailabilityType", propOrder = {
    "vehVendorAvail"
})
public class ArrayOfVehicleVendorAvailabilityType {

    @XmlElement(name = "VehVendorAvail")
    protected List<VehicleVendorAvailabilityType> vehVendorAvail;

    /**
     * Gets the value of the vehVendorAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehVendorAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehVendorAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleVendorAvailabilityType }
     * 
     * 
     */
    public List<VehicleVendorAvailabilityType> getVehVendorAvail() {
        if (vehVendorAvail == null) {
            vehVendorAvail = new ArrayList<VehicleVendorAvailabilityType>();
        }
        return this.vehVendorAvail;
    }

}
