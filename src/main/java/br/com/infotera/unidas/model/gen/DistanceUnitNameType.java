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
 * <p>Classe Java de DistanceUnitNameType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnitNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Mile"/&gt;
 *     &lt;enumeration value="Km"/&gt;
 *     &lt;enumeration value="Block"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnitNameType")
@XmlEnum
public enum DistanceUnitNameType {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Km")
    KM("Km"),
    @XmlEnumValue("Block")
    BLOCK("Block");
    private final String value;

    DistanceUnitNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnitNameType fromValue(String v) {
        for (DistanceUnitNameType c: DistanceUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
