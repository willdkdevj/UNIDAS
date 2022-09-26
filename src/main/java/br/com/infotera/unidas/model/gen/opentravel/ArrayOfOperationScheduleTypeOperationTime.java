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
 * <p>Classe Java de ArrayOfOperationScheduleTypeOperationTime complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperationScheduleTypeOperationTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationTime" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "ArrayOfOperationScheduleTypeOperationTime", propOrder = {
    "operationTime"
})
public class ArrayOfOperationScheduleTypeOperationTime {

    @XmlElement(name = "OperationTime")
    protected List<ArrayOfOperationScheduleTypeOperationTime.OperationTime> operationTime;

    /**
     * Gets the value of the operationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOperationScheduleTypeOperationTime.OperationTime }
     * 
     * 
     */
    public List<ArrayOfOperationScheduleTypeOperationTime.OperationTime> getOperationTime() {
        if (operationTime == null) {
            operationTime = new ArrayList<ArrayOfOperationScheduleTypeOperationTime.OperationTime>();
        }
        return this.operationTime;
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
     *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AdditionalOperationInfoCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Text" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OperationTime {

        @XmlAttribute(name = "Mon")
        protected Boolean mon;
        @XmlAttribute(name = "Tue")
        protected Boolean tue;
        @XmlAttribute(name = "Weds")
        protected Boolean weds;
        @XmlAttribute(name = "Thur")
        protected Boolean thur;
        @XmlAttribute(name = "Fri")
        protected Boolean fri;
        @XmlAttribute(name = "Sat")
        protected Boolean sat;
        @XmlAttribute(name = "Sun")
        protected Boolean sun;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "AdditionalOperationInfoCode")
        protected String additionalOperationInfoCode;
        @XmlAttribute(name = "Frequency")
        protected String frequency;
        @XmlAttribute(name = "Text")
        protected String text;

        /**
         * Obtém o valor da propriedade mon.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMon() {
            return mon;
        }

        /**
         * Define o valor da propriedade mon.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMon(Boolean value) {
            this.mon = value;
        }

        /**
         * Obtém o valor da propriedade tue.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTue() {
            return tue;
        }

        /**
         * Define o valor da propriedade tue.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTue(Boolean value) {
            this.tue = value;
        }

        /**
         * Obtém o valor da propriedade weds.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeds() {
            return weds;
        }

        /**
         * Define o valor da propriedade weds.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeds(Boolean value) {
            this.weds = value;
        }

        /**
         * Obtém o valor da propriedade thur.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isThur() {
            return thur;
        }

        /**
         * Define o valor da propriedade thur.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setThur(Boolean value) {
            this.thur = value;
        }

        /**
         * Obtém o valor da propriedade fri.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFri() {
            return fri;
        }

        /**
         * Define o valor da propriedade fri.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFri(Boolean value) {
            this.fri = value;
        }

        /**
         * Obtém o valor da propriedade sat.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSat() {
            return sat;
        }

        /**
         * Define o valor da propriedade sat.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSat(Boolean value) {
            this.sat = value;
        }

        /**
         * Obtém o valor da propriedade sun.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSun() {
            return sun;
        }

        /**
         * Define o valor da propriedade sun.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSun(Boolean value) {
            this.sun = value;
        }

        /**
         * Obtém o valor da propriedade start.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Define o valor da propriedade start.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Obtém o valor da propriedade duration.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Define o valor da propriedade duration.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Obtém o valor da propriedade end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Define o valor da propriedade end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Obtém o valor da propriedade additionalOperationInfoCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalOperationInfoCode() {
            return additionalOperationInfoCode;
        }

        /**
         * Define o valor da propriedade additionalOperationInfoCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalOperationInfoCode(String value) {
            this.additionalOperationInfoCode = value;
        }

        /**
         * Obtém o valor da propriedade frequency.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrequency() {
            return frequency;
        }

        /**
         * Define o valor da propriedade frequency.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrequency(String value) {
            this.frequency = value;
        }

        /**
         * Obtém o valor da propriedade text.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Define o valor da propriedade text.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
