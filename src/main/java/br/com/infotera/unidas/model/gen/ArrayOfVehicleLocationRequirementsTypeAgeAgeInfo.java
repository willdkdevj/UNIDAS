//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.FormattedTextType;
import br.com.infotera.unidas.model.gen.opentravel.LocationDetailRequirementAgeInfoType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgeInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
 *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo", propOrder = {
    "ageInfo"
})
public class ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo {

    @XmlElement(name = "AgeInfo")
    protected List<ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo.AgeInfo> ageInfo;

    /**
     * Gets the value of the ageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo.AgeInfo }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo.AgeInfo> getAgeInfo() {
        if (ageInfo == null) {
            ageInfo = new ArrayList<ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo.AgeInfo>();
        }
        return this.ageInfo;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
     *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailRequirementAgeInfoType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgeInfo
        extends FormattedTextType
    {

        @XmlAttribute(name = "Type", required = true)
        protected LocationDetailRequirementAgeInfoType type;

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link LocationDetailRequirementAgeInfoType }
         *     
         */
        public LocationDetailRequirementAgeInfoType getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationDetailRequirementAgeInfoType }
         *     
         */
        public void setType(LocationDetailRequirementAgeInfoType value) {
            this.type = value;
        }

    }

}
