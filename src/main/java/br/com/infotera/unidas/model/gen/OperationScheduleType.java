//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OperationScheduleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OperationScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationTimes" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOperationScheduleTypeOperationTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationScheduleType", propOrder = {
    "operationTimes"
})
@XmlSeeAlso({
    OperationSchedulePlusChargeType.class
})
public class OperationScheduleType {

    @XmlElement(name = "OperationTimes")
    protected ArrayOfOperationScheduleTypeOperationTime operationTimes;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected String duration;
    @XmlAttribute(name = "End")
    protected String end;

    /**
     * Obtém o valor da propriedade operationTimes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationScheduleTypeOperationTime }
     *     
     */
    public ArrayOfOperationScheduleTypeOperationTime getOperationTimes() {
        return operationTimes;
    }

    /**
     * Define o valor da propriedade operationTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationScheduleTypeOperationTime }
     *     
     */
    public void setOperationTimes(ArrayOfOperationScheduleTypeOperationTime value) {
        this.operationTimes = value;
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

}
