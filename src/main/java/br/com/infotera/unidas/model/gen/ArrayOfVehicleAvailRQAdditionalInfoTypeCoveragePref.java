//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoveragePref" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="PreferLevelField" use="required" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CoverageType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref", propOrder = {
    "coveragePref"
})
public class ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref {

    @XmlElement(name = "CoveragePref")
    protected List<ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref> coveragePref;

    /**
     * Gets the value of the coveragePref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref }
     * 
     * 
     */
    public List<ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref> getCoveragePref() {
        if (coveragePref == null) {
            coveragePref = new ArrayList<ArrayOfVehicleAvailRQAdditionalInfoTypeCoveragePref.CoveragePref>();
        }
        return this.coveragePref;
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
     *       &lt;attribute name="PreferLevelField" use="required" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" /&gt;
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CoverageType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoveragePref {

        @XmlAttribute(name = "PreferLevelField", required = true)
        protected PreferLevelType preferLevelField;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CoverageType")
        protected String coverageType;

        /**
         * Obtém o valor da propriedade preferLevelField.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevelField() {
            return preferLevelField;
        }

        /**
         * Define o valor da propriedade preferLevelField.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevelField(PreferLevelType value) {
            this.preferLevelField = value;
        }

        /**
         * Obtém o valor da propriedade code.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Define o valor da propriedade code.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Obtém o valor da propriedade coverageType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoverageType() {
            return coverageType;
        }

        /**
         * Define o valor da propriedade coverageType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoverageType(String value) {
            this.coverageType = value;
        }

    }

}
