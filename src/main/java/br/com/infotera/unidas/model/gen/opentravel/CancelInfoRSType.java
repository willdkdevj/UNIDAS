//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.ArrayOfCancelRuleType;
import br.com.infotera.unidas.model.gen.opentravel.UniqueIDType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CancelInfoRSType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CancelInfoRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfCancelRuleType" minOccurs="0"/&gt;
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInfoRSType", propOrder = {
    "cancelRules",
    "uniqueID"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.opentravel.OtaVehCancelResult.VehCancelRSCore.class
})
public class CancelInfoRSType {

    @XmlElement(name = "CancelRules")
    protected ArrayOfCancelRuleType cancelRules;
    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;

    /**
     * Obtém o valor da propriedade cancelRules.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelRuleType }
     *     
     */
    public ArrayOfCancelRuleType getCancelRules() {
        return cancelRules;
    }

    /**
     * Define o valor da propriedade cancelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelRuleType }
     *     
     */
    public void setCancelRules(ArrayOfCancelRuleType value) {
        this.cancelRules = value;
    }

    /**
     * Obtém o valor da propriedade uniqueID.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * Define o valor da propriedade uniqueID.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

}
