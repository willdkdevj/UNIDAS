//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.OffLocationServiceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OffLocationServicePricedType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServicePricedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffLocService" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceType" minOccurs="0"/&gt;
 *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServicePricedType", propOrder = {
    "offLocService",
    "charge"
})
public class OffLocationServicePricedType {

    @XmlElement(name = "OffLocService")
    protected OffLocationServiceType offLocService;
    @XmlElement(name = "Charge")
    protected VehicleChargeType charge;

    /**
     * Obtém o valor da propriedade offLocService.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceType }
     *     
     */
    public OffLocationServiceType getOffLocService() {
        return offLocService;
    }

    /**
     * Define o valor da propriedade offLocService.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceType }
     *     
     */
    public void setOffLocService(OffLocationServiceType value) {
        this.offLocService = value;
    }

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

}
