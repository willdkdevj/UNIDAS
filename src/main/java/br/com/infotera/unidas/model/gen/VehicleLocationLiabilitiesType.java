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
 * <p>Classe Java de VehicleLocationLiabilitiesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationLiabilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coverages" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationLiabilitiesTypeCoverage" minOccurs="0"/&gt;
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
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
@XmlType(name = "VehicleLocationLiabilitiesType", propOrder = {
    "coverages",
    "info",
    "tpaExtensions"
})
public class VehicleLocationLiabilitiesType {

    @XmlElement(name = "Coverages")
    protected ArrayOfVehicleLocationLiabilitiesTypeCoverage coverages;
    @XmlElement(name = "Info")
    protected FormattedTextType info;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade coverages.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverage }
     *     
     */
    public ArrayOfVehicleLocationLiabilitiesTypeCoverage getCoverages() {
        return coverages;
    }

    /**
     * Define o valor da propriedade coverages.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverage }
     *     
     */
    public void setCoverages(ArrayOfVehicleLocationLiabilitiesTypeCoverage value) {
        this.coverages = value;
    }

    /**
     * Obtém o valor da propriedade info.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /**
     * Define o valor da propriedade info.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setInfo(FormattedTextType value) {
        this.info = value;
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
