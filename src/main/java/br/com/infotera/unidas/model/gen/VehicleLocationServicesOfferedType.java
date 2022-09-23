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
 * <p>Classe Java de VehicleLocationServicesOfferedType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationServicesOfferedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnLocationServices" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOnLocationService" minOccurs="0"/&gt;
 *         &lt;element name="OffLocationServices" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOffLocationService" minOccurs="0"/&gt;
 *         &lt;element name="SpecialEquipments" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment" minOccurs="0"/&gt;
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
@XmlType(name = "VehicleLocationServicesOfferedType", propOrder = {
    "onLocationServices",
    "offLocationServices",
    "specialEquipments",
    "tpaExtensions"
})
public class VehicleLocationServicesOfferedType {

    @XmlElement(name = "OnLocationServices")
    protected ArrayOfVehicleLocationServicesOfferedTypeOnLocationService onLocationServices;
    @XmlElement(name = "OffLocationServices")
    protected ArrayOfVehicleLocationServicesOfferedTypeOffLocationService offLocationServices;
    @XmlElement(name = "SpecialEquipments")
    protected ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment specialEquipments;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade onLocationServices.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationService }
     *     
     */
    public ArrayOfVehicleLocationServicesOfferedTypeOnLocationService getOnLocationServices() {
        return onLocationServices;
    }

    /**
     * Define o valor da propriedade onLocationServices.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationService }
     *     
     */
    public void setOnLocationServices(ArrayOfVehicleLocationServicesOfferedTypeOnLocationService value) {
        this.onLocationServices = value;
    }

    /**
     * Obtém o valor da propriedade offLocationServices.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationService }
     *     
     */
    public ArrayOfVehicleLocationServicesOfferedTypeOffLocationService getOffLocationServices() {
        return offLocationServices;
    }

    /**
     * Define o valor da propriedade offLocationServices.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationService }
     *     
     */
    public void setOffLocationServices(ArrayOfVehicleLocationServicesOfferedTypeOffLocationService value) {
        this.offLocationServices = value;
    }

    /**
     * Obtém o valor da propriedade specialEquipments.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment }
     *     
     */
    public ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment getSpecialEquipments() {
        return specialEquipments;
    }

    /**
     * Define o valor da propriedade specialEquipments.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment }
     *     
     */
    public void setSpecialEquipments(ArrayOfVehicleLocationServicesOfferedTypeSpecialEquipment value) {
        this.specialEquipments = value;
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
