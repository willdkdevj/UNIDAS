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
 * <p>Classe Java de LocationDetailVehicleInfoType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDetailVehicleInfoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GeneralInformation"/&gt;
 *     &lt;enumeration value="Disclaimer"/&gt;
 *     &lt;enumeration value="AdvancedBooking"/&gt;
 *     &lt;enumeration value="NonSmokingVehicles"/&gt;
 *     &lt;enumeration value="SpecialityVehicles"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationDetailVehicleInfoType")
@XmlEnum
public enum LocationDetailVehicleInfoType {

    @XmlEnumValue("GeneralInformation")
    GENERAL_INFORMATION("GeneralInformation"),
    @XmlEnumValue("Disclaimer")
    DISCLAIMER("Disclaimer"),
    @XmlEnumValue("AdvancedBooking")
    ADVANCED_BOOKING("AdvancedBooking"),
    @XmlEnumValue("NonSmokingVehicles")
    NON_SMOKING_VEHICLES("NonSmokingVehicles"),
    @XmlEnumValue("SpecialityVehicles")
    SPECIALITY_VEHICLES("SpecialityVehicles");
    private final String value;

    LocationDetailVehicleInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDetailVehicleInfoType fromValue(String v) {
        for (LocationDetailVehicleInfoType c: LocationDetailVehicleInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
