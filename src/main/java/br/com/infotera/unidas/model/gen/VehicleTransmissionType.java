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
 * <p>Classe Java de VehicleTransmissionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTransmissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Manual"/&gt;
 *     &lt;enumeration value="Automatic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleTransmissionType")
@XmlEnum
public enum VehicleTransmissionType {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VehicleTransmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTransmissionType fromValue(String v) {
        for (VehicleTransmissionType c: VehicleTransmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
