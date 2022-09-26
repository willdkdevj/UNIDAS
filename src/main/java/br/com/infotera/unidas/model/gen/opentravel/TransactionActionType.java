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
 * <p>Classe Java de TransactionActionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Book"/&gt;
 *     &lt;enumeration value="Quote"/&gt;
 *     &lt;enumeration value="Hold"/&gt;
 *     &lt;enumeration value="Initiate"/&gt;
 *     &lt;enumeration value="Ignore"/&gt;
 *     &lt;enumeration value="Modify"/&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="CommitOverrideEdits"/&gt;
 *     &lt;enumeration value="VerifyPrice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionActionType")
@XmlEnum
public enum TransactionActionType {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice");
    private final String value;

    TransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionActionType fromValue(String v) {
        for (TransactionActionType c: TransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
