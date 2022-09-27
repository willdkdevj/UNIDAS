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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationLiabilitiesTypeCoverage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationLiabilitiesTypeCoverage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Coverage" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                   &lt;element name="CoverageFees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ArrayOfVehicleLocationLiabilitiesTypeCoverage", propOrder = {
    "coverage"
})
public class ArrayOfVehicleLocationLiabilitiesTypeCoverage {

    @XmlElement(name = "Coverage")
    protected List<ArrayOfVehicleLocationLiabilitiesTypeCoverage.Coverage> coverage;

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationLiabilitiesTypeCoverage.Coverage }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationLiabilitiesTypeCoverage.Coverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<ArrayOfVehicleLocationLiabilitiesTypeCoverage.Coverage>();
        }
        return this.coverage;
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
     *       &lt;sequence&gt;
     *         &lt;element name="CoverageInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *         &lt;element name="CoverageFees" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="RequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "coverageInfo",
        "coverageFees"
    })
    public static class Coverage {

        @XmlElement(name = "CoverageInfo")
        protected FormattedTextType coverageInfo;
        @XmlElement(name = "CoverageFees")
        protected ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee coverageFees;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "RequiredInd")
        protected Boolean requiredInd;

        /**
         * Obtém o valor da propriedade coverageInfo.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextType }
         *     
         */
        public FormattedTextType getCoverageInfo() {
            return coverageInfo;
        }

        /**
         * Define o valor da propriedade coverageInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextType }
         *     
         */
        public void setCoverageInfo(FormattedTextType value) {
            this.coverageInfo = value;
        }

        /**
         * Obtém o valor da propriedade coverageFees.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee }
         *     
         */
        public ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee getCoverageFees() {
            return coverageFees;
        }

        /**
         * Define o valor da propriedade coverageFees.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee }
         *     
         */
        public void setCoverageFees(ArrayOfVehicleLocationLiabilitiesTypeCoverageCoverageFee value) {
            this.coverageFees = value;
        }

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtém o valor da propriedade requiredInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredInd() {
            return requiredInd;
        }

        /**
         * Define o valor da propriedade requiredInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequiredInd(Boolean value) {
            this.requiredInd = value;
        }

    }

}
