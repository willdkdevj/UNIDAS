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
 * <p>Classe Java de PreferLevelType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Only"/&gt;
 *     &lt;enumeration value="Unacceptable"/&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="NoPreference"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferLevelType")
@XmlEnum
public enum PreferLevelType {

    @XmlEnumValue("Only")
    ONLY("Only"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("NoPreference")
    NO_PREFERENCE("NoPreference");
    private final String value;

    PreferLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferLevelType fromValue(String v) {
        for (PreferLevelType c: PreferLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
