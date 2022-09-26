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
 * <p>Classe Java de LocationDetailRequirementInfoType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailRequirementInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneWayRental"/&gt;
 *     &lt;enumeration value="Geographic"/&gt;
 *     &lt;enumeration value="DropOff"/&gt;
 *     &lt;enumeration value="License"/&gt;
 *     &lt;enumeration value="Insurance"/&gt;
 *     &lt;enumeration value="Eligibility"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailRequirementInfoType")
@XmlEnum
public enum LocationDetailRequirementInfoType {

    @XmlEnumValue("OneWayRental")
    ONE_WAY_RENTAL("OneWayRental"),
    @XmlEnumValue("Geographic")
    GEOGRAPHIC("Geographic"),
    @XmlEnumValue("DropOff")
    DROP_OFF("DropOff"),
    @XmlEnumValue("License")
    LICENSE("License"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("Eligibility")
    ELIGIBILITY("Eligibility"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    LocationDetailRequirementInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailRequirementInfoType fromValue(String v) {
        for (LocationDetailRequirementInfoType c: LocationDetailRequirementInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
