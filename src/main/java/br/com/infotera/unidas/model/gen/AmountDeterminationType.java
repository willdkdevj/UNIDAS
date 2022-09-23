//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AmountDeterminationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountDeterminationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Inclusive"/&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="Cumulative"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountDeterminationType")
@XmlEnum
public enum AmountDeterminationType {

    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative");
    private final String value;

    AmountDeterminationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountDeterminationType fromValue(String v) {
        for (AmountDeterminationType c: AmountDeterminationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
