//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.ItemSearchCriterionType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleMatchedLocationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMatchedLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationDetail" type="{http://www.opentravel.org/OTA/2003/05}VehicleLocationDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="VehLocSearchCriterion" type="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AlternateLocInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMatchedLocationType", propOrder = {
    "locationDetail",
    "vehLocSearchCriterion"
})
public class VehicleMatchedLocationType {

    @XmlElement(name = "LocationDetail")
    protected VehicleLocationDetailsType locationDetail;
    @XmlElement(name = "VehLocSearchCriterion")
    protected List<ItemSearchCriterionType> vehLocSearchCriterion;
    @XmlAttribute(name = "AlternateLocInd")
    protected Boolean alternateLocInd;

    /**
     * Obtém o valor da propriedade locationDetail.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public VehicleLocationDetailsType getLocationDetail() {
        return locationDetail;
    }

    /**
     * Define o valor da propriedade locationDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationDetailsType }
     *     
     */
    public void setLocationDetail(VehicleLocationDetailsType value) {
        this.locationDetail = value;
    }

    /**
     * Gets the value of the vehLocSearchCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehLocSearchCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehLocSearchCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType }
     * 
     * 
     */
    public List<ItemSearchCriterionType> getVehLocSearchCriterion() {
        if (vehLocSearchCriterion == null) {
            vehLocSearchCriterion = new ArrayList<ItemSearchCriterionType>();
        }
        return this.vehLocSearchCriterion;
    }

    /**
     * Obtém o valor da propriedade alternateLocInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateLocInd() {
        return alternateLocInd;
    }

    /**
     * Define o valor da propriedade alternateLocInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateLocInd(Boolean value) {
        this.alternateLocInd = value;
    }

}
