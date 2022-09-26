//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CoverageTextType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CoverageTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Supplement"/&gt;
 *     &lt;enumeration value="Description"/&gt;
 *     &lt;enumeration value="Limits"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoverageTextType")
@XmlEnum
public enum CoverageTextType {

    @XmlEnumValue("Supplement")
    SUPPLEMENT("Supplement"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("Limits")
    LIMITS("Limits");
    private final String value;

    CoverageTextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoverageTextType fromValue(String v) {
        for (CoverageTextType c: CoverageTextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
