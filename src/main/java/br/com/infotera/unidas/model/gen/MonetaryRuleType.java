//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de MonetaryRuleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MonetaryRuleType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="RuleType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryRuleType", propOrder = {
    "value"
})
public class MonetaryRuleType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "RuleType")
    protected String ruleType;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtém o valor da propriedade amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define o valor da propriedade amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtém o valor da propriedade ruleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Define o valor da propriedade ruleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * Obtém o valor da propriedade percent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Define o valor da propriedade percent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Obtém o valor da propriedade dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define o valor da propriedade dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Obtém o valor da propriedade paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define o valor da propriedade paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

}
