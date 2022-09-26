//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FormattedTextSubSectionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FormattedTextSubSectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paragraph" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="SubSectionNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextSubSectionType", propOrder = {
    "paragraph"
})
public class FormattedTextSubSectionType {

    @XmlElement(name = "Paragraph")
    protected List<ParagraphType> paragraph;
    @XmlAttribute(name = "SubTitle")
    protected String subTitle;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "SubSectionNumber")
    protected BigInteger subSectionNumber;

    /**
     * Gets the value of the paragraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getParagraph() {
        if (paragraph == null) {
            paragraph = new ArrayList<ParagraphType>();
        }
        return this.paragraph;
    }

    /**
     * Obtém o valor da propriedade subTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Define o valor da propriedade subTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Obtém o valor da propriedade subCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Define o valor da propriedade subCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Obtém o valor da propriedade subSectionNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubSectionNumber() {
        return subSectionNumber;
    }

    /**
     * Define o valor da propriedade subSectionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubSectionNumber(BigInteger value) {
        this.subSectionNumber = value;
    }

}
