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
 * <p>Classe Java de VehicleAvailRQCoreTypeRateQualifierRatePeriod.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleAvailRQCoreTypeRateQualifierRatePeriod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hourly"/&gt;
 *     &lt;enumeration value="Daily"/&gt;
 *     &lt;enumeration value="Weekly"/&gt;
 *     &lt;enumeration value="Monthly"/&gt;
 *     &lt;enumeration value="WeekendDay"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Package"/&gt;
 *     &lt;enumeration value="Bundle"/&gt;
 *     &lt;enumeration value="Total"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleAvailRQCoreTypeRateQualifierRatePeriod")
@XmlEnum
public enum VehicleAvailRQCoreTypeRateQualifierRatePeriod {

    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("WeekendDay")
    WEEKEND_DAY("WeekendDay"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Bundle")
    BUNDLE("Bundle"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    VehicleAvailRQCoreTypeRateQualifierRatePeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleAvailRQCoreTypeRateQualifierRatePeriod fromValue(String v) {
        for (VehicleAvailRQCoreTypeRateQualifierRatePeriod c: VehicleAvailRQCoreTypeRateQualifierRatePeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
