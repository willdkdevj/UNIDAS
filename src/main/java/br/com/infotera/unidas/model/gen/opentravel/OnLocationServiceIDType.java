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
 * <p>Classe Java de OnLocationServiceID_Type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OnLocationServiceID_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ComputerDrivingDirections"/&gt;
 *     &lt;enumeration value="ExpressReturnService"/&gt;
 *     &lt;enumeration value="SpecialNeeds"/&gt;
 *     &lt;enumeration value="FrequentRenter"/&gt;
 *     &lt;enumeration value="Miscellaneous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnLocationServiceID_Type")
@XmlEnum
public enum OnLocationServiceIDType {

    @XmlEnumValue("ComputerDrivingDirections")
    COMPUTER_DRIVING_DIRECTIONS("ComputerDrivingDirections"),
    @XmlEnumValue("ExpressReturnService")
    EXPRESS_RETURN_SERVICE("ExpressReturnService"),
    @XmlEnumValue("SpecialNeeds")
    SPECIAL_NEEDS("SpecialNeeds"),
    @XmlEnumValue("FrequentRenter")
    FREQUENT_RENTER("FrequentRenter"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    OnLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnLocationServiceIDType fromValue(String v) {
        for (OnLocationServiceIDType c: OnLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
