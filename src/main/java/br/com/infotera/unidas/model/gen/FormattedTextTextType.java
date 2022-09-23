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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de FormattedTextTextType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormattedTextTextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Formatted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" /&gt;
 *       &lt;attribute name="TextFormat"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="PlainText"/&gt;
 *             &lt;enumeration value="HTML"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextTextType", propOrder = {
    "value"
})
@XmlSeeAlso({
    br.com.infotera.unidas.model.gen.ParagraphType.ListItem.class,
    CoverageDetailsType.class,
    br.com.infotera.unidas.model.gen.ArrayOfRateQualifierTypeRateComment.RateComment.class
})
public class FormattedTextTextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Formatted")
    protected Boolean formatted;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "TextFormat")
    protected String textFormat;

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
     * Obtém o valor da propriedade formatted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormatted() {
        return formatted;
    }

    /**
     * Define o valor da propriedade formatted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormatted(Boolean value) {
        this.formatted = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade textFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFormat() {
        return textFormat;
    }

    /**
     * Define o valor da propriedade textFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFormat(String value) {
        this.textFormat = value;
    }

}
