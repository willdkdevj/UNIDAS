//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleCancelRSAdditionalInfoType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleCancelRSAdditionalInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehReservation" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType" minOccurs="0"/&gt;
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
@XmlType(name = "VehicleCancelRSAdditionalInfoType", propOrder = {
    "vehReservation",
    "tpaExtensions"
})
public class VehicleCancelRSAdditionalInfoType {

    @XmlElement(name = "VehReservation")
    protected VehicleReservationType vehReservation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

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

}
