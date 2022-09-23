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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CoverageDetailsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CoverageDetailsType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;FormattedTextTextType"&gt;
 *       &lt;attribute name="CoverageTextType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CoverageTextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageDetailsType")
public class CoverageDetailsType
    extends FormattedTextTextType
{

    @XmlAttribute(name = "CoverageTextType", required = true)
    protected CoverageTextType coverageTextType;

    /**
     * Obtém o valor da propriedade coverageTextType.
     * 
     * @return
     *     possible object is
     *     {@link CoverageTextType }
     *     
     */
    public CoverageTextType getCoverageTextType() {
        return coverageTextType;
    }

    /**
     * Define o valor da propriedade coverageTextType.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageTextType }
     *     
     */
    public void setCoverageTextType(CoverageTextType value) {
        this.coverageTextType = value;
    }

}
