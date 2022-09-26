//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptablePaymentCard" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UsagePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                 &lt;attribute name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard", propOrder = {
    "acceptablePaymentCard"
})
public class ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard {

    @XmlElement(name = "AcceptablePaymentCard")
    protected List<ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard.AcceptablePaymentCard> acceptablePaymentCard;

    /**
     * Gets the value of the acceptablePaymentCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptablePaymentCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptablePaymentCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard.AcceptablePaymentCard }
     * 
     * 
     */
    public List<ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard.AcceptablePaymentCard> getAcceptablePaymentCard() {
        if (acceptablePaymentCard == null) {
            acceptablePaymentCard = new ArrayList<ArrayOfAcceptablePaymentCardsInfoTypeAcceptablePaymentCard.AcceptablePaymentCard>();
        }
        return this.acceptablePaymentCard;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UsagePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *       &lt;attribute name="UsageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcceptablePaymentCard {

        @XmlAttribute(name = "CardType")
        protected String cardType;
        @XmlAttribute(name = "CardName")
        protected String cardName;
        @XmlAttribute(name = "UsagePercentage")
        protected BigDecimal usagePercentage;
        @XmlAttribute(name = "UsageAmount")
        protected BigDecimal usageAmount;

        /**
         * Obtém o valor da propriedade cardType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardType() {
            return cardType;
        }

        /**
         * Define o valor da propriedade cardType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardType(String value) {
            this.cardType = value;
        }

        /**
         * Obtém o valor da propriedade cardName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardName() {
            return cardName;
        }

        /**
         * Define o valor da propriedade cardName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardName(String value) {
            this.cardName = value;
        }

        /**
         * Obtém o valor da propriedade usagePercentage.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUsagePercentage() {
            return usagePercentage;
        }

        /**
         * Define o valor da propriedade usagePercentage.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUsagePercentage(BigDecimal value) {
            this.usagePercentage = value;
        }

        /**
         * Obtém o valor da propriedade usageAmount.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUsageAmount() {
            return usageAmount;
        }

        /**
         * Define o valor da propriedade usageAmount.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUsageAmount(BigDecimal value) {
            this.usageAmount = value;
        }

    }

}
