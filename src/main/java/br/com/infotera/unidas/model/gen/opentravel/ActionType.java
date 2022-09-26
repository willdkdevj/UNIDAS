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
 * <p>Classe Java de ActionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Add-Update"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Replace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {

    @XmlEnumValue("Add-Update")
    ADD_UPDATE("Add-Update"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
