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
 * <p>Classe Java de LocationDetailRequirementAddlDriverInfoType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementAddlDriverInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IncludedAuthorized"/&gt;
 *     &lt;enumeration value="AdditionalAuthorized"/&gt;
 *     &lt;enumeration value="Fees"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementAddlDriverInfoType")
@XmlEnum
public enum LocationDetailRequirementAddlDriverInfoType {

    @XmlEnumValue("IncludedAuthorized")
    INCLUDED_AUTHORIZED("IncludedAuthorized"),
    @XmlEnumValue("AdditionalAuthorized")
    ADDITIONAL_AUTHORIZED("AdditionalAuthorized"),
    @XmlEnumValue("Fees")
    FEES("Fees"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementAddlDriverInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementAddlDriverInfoType fromValue(String v) {
        for (LocationDetailRequirementAddlDriverInfoType c: LocationDetailRequirementAddlDriverInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
