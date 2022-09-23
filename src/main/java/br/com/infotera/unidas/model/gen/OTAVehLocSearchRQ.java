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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOTA_VehLocSearchRQPOSSource" minOccurs="0"/&gt;
 *         &lt;element name="VehLocSearchCriterion" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RefPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ImportanceType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="EchoToken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReqRespVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "vehLocSearchCriterion"
})
@XmlRootElement(name = "OTA_VehLocSearchRQ")
public class OTAVehLocSearchRQ {

    @XmlElement(name = "POS")
    protected ArrayOfOTAVehLocSearchRQPOSSource pos;
    @XmlElement(name = "VehLocSearchCriterion")
    protected List<OTAVehLocSearchRQ.VehLocSearchCriterion> vehLocSearchCriterion;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Target")
    protected String target;
    @XmlAttribute(name = "SequenceNmbr")
    protected String sequenceNmbr;
    @XmlAttribute(name = "ReqRespVersion")
    protected String reqRespVersion;

    /**
     * Obtém o valor da propriedade pos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOTAVehLocSearchRQPOSSource }
     *     
     */
    public ArrayOfOTAVehLocSearchRQPOSSource getPOS() {
        return pos;
    }

    /**
     * Define o valor da propriedade pos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOTAVehLocSearchRQPOSSource }
     *     
     */
    public void setPOS(ArrayOfOTAVehLocSearchRQPOSSource value) {
        this.pos = value;
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
     * {@link OTAVehLocSearchRQ.VehLocSearchCriterion }
     * 
     * 
     */
    public List<OTAVehLocSearchRQ.VehLocSearchCriterion> getVehLocSearchCriterion() {
        if (vehLocSearchCriterion == null) {
            vehLocSearchCriterion = new ArrayList<OTAVehLocSearchRQ.VehLocSearchCriterion>();
        }
        return this.vehLocSearchCriterion;
    }

    /**
     * Obtém o valor da propriedade echoToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Define o valor da propriedade echoToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Obtém o valor da propriedade timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Define o valor da propriedade timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtém o valor da propriedade target.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Define o valor da propriedade target.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNmbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Define o valor da propriedade sequenceNmbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNmbr(String value) {
        this.sequenceNmbr = value;
    }

    /**
     * Obtém o valor da propriedade reqRespVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRespVersion() {
        return reqRespVersion;
    }

    /**
     * Define o valor da propriedade reqRespVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRespVersion(String value) {
        this.reqRespVersion = value;
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
     *         &lt;element name="RefPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ImportanceType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "refPoint"
    })
    public static class VehLocSearchCriterion {

        @XmlElement(name = "RefPoint")
        protected String refPoint;
        @XmlAttribute(name = "ExactMatch")
        protected String exactMatch;
        @XmlAttribute(name = "ImportanceType")
        protected String importanceType;

        /**
         * Obtém o valor da propriedade refPoint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPoint() {
            return refPoint;
        }

        /**
         * Define o valor da propriedade refPoint.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPoint(String value) {
            this.refPoint = value;
        }

        /**
         * Obtém o valor da propriedade exactMatch.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExactMatch() {
            return exactMatch;
        }

        /**
         * Define o valor da propriedade exactMatch.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExactMatch(String value) {
            this.exactMatch = value;
        }

        /**
         * Obtém o valor da propriedade importanceType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImportanceType() {
            return importanceType;
        }

        /**
         * Define o valor da propriedade importanceType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImportanceType(String value) {
            this.importanceType = value;
        }

    }

}
