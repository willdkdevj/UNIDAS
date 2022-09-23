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
 * <p>Classe Java de OffLocationServiceID_Type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocationServiceID_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CustPickUp"/&gt;
 *     &lt;enumeration value="VehDelivery"/&gt;
 *     &lt;enumeration value="CustDropOff"/&gt;
 *     &lt;enumeration value="VehCollection"/&gt;
 *     &lt;enumeration value="Exchange"/&gt;
 *     &lt;enumeration value="RepairLocation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OffLocationServiceID_Type")
@XmlEnum
public enum OffLocationServiceIDType {

    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection"),
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),
    @XmlEnumValue("RepairLocation")
    REPAIR_LOCATION("RepairLocation");
    private final String value;

    OffLocationServiceIDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffLocationServiceIDType fromValue(String v) {
        for (OffLocationServiceIDType c: OffLocationServiceIDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
