//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo;
import br.com.infotera.unidas.model.gen.ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo;
import br.com.infotera.unidas.model.gen.ArrayOfVehicleLocationRequirementsTypeRequirementInfo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleLocationRequirementsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationRequirementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Age" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AgeSurcharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AgeInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalDriver" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AddlDriverInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentOptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="DebitCard" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="Cash" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Voucher" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BankAcct" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DirectBill" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LoyaltyRedemption" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MiscChargeOrder" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Deposit" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="PrePayment" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentOptionsInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequirementInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationRequirementsTypeRequirementInfo" minOccurs="0"/&gt;
 *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationRequirementsType", propOrder = {
    "age",
    "additionalDriver",
    "paymentOptions",
    "requirementInfos",
    "tpaExtensions"
})
public class VehicleLocationRequirementsType {

    @XmlElement(name = "Age")
    protected VehicleLocationRequirementsType.Age age;
    @XmlElement(name = "AdditionalDriver")
    protected VehicleLocationRequirementsType.AdditionalDriver additionalDriver;
    @XmlElement(name = "PaymentOptions")
    protected VehicleLocationRequirementsType.PaymentOptions paymentOptions;
    @XmlElement(name = "RequirementInfos")
    protected ArrayOfVehicleLocationRequirementsTypeRequirementInfo requirementInfos;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationRequirementsType.Age }
     *     
     */
    public VehicleLocationRequirementsType.Age getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationRequirementsType.Age }
     *     
     */
    public void setAge(VehicleLocationRequirementsType.Age value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade additionalDriver.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationRequirementsType.AdditionalDriver }
     *     
     */
    public VehicleLocationRequirementsType.AdditionalDriver getAdditionalDriver() {
        return additionalDriver;
    }

    /**
     * Define o valor da propriedade additionalDriver.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationRequirementsType.AdditionalDriver }
     *     
     */
    public void setAdditionalDriver(VehicleLocationRequirementsType.AdditionalDriver value) {
        this.additionalDriver = value;
    }

    /**
     * Obtém o valor da propriedade paymentOptions.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationRequirementsType.PaymentOptions }
     *     
     */
    public VehicleLocationRequirementsType.PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    /**
     * Define o valor da propriedade paymentOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationRequirementsType.PaymentOptions }
     *     
     */
    public void setPaymentOptions(VehicleLocationRequirementsType.PaymentOptions value) {
        this.paymentOptions = value;
    }

    /**
     * Obtém o valor da propriedade requirementInfos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocationRequirementsTypeRequirementInfo }
     *     
     */
    public ArrayOfVehicleLocationRequirementsTypeRequirementInfo getRequirementInfos() {
        return requirementInfos;
    }

    /**
     * Define o valor da propriedade requirementInfos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocationRequirementsTypeRequirementInfo }
     *     
     */
    public void setRequirementInfos(ArrayOfVehicleLocationRequirementsTypeRequirementInfo value) {
        this.requirementInfos = value;
    }

    /**
     * Obtém o valor da propriedade tpaExtensions.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Define o valor da propriedade tpaExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="AddlDriverInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addlDriverInfos"
    })
    public static class AdditionalDriver {

        @XmlElement(name = "AddlDriverInfos")
        protected ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo addlDriverInfos;

        /**
         * Obtém o valor da propriedade addlDriverInfos.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo }
         *     
         */
        public ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo getAddlDriverInfos() {
            return addlDriverInfos;
        }

        /**
         * Define o valor da propriedade addlDriverInfos.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo }
         *     
         */
        public void setAddlDriverInfos(ArrayOfVehicleLocationRequirementsTypeAdditionalDriverAddlDriverInfo value) {
            this.addlDriverInfos = value;
        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="AgeSurcharge" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AgeInfos" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ageSurcharge",
        "ageInfos"
    })
    public static class Age {

        @XmlElement(name = "AgeSurcharge")
        protected List<VehicleLocationRequirementsType.Age.AgeSurcharge> ageSurcharge;
        @XmlElement(name = "AgeInfos")
        protected ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo ageInfos;
        @XmlAttribute(name = "MinimumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minimumAge;
        @XmlAttribute(name = "MaximumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maximumAge;

        /**
         * Gets the value of the ageSurcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageSurcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgeSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationRequirementsType.Age.AgeSurcharge }
         * 
         * 
         */
        public List<VehicleLocationRequirementsType.Age.AgeSurcharge> getAgeSurcharge() {
            if (ageSurcharge == null) {
                ageSurcharge = new ArrayList<VehicleLocationRequirementsType.Age.AgeSurcharge>();
            }
            return this.ageSurcharge;
        }

        /**
         * Obtém o valor da propriedade ageInfos.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo }
         *     
         */
        public ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo getAgeInfos() {
            return ageInfos;
        }

        /**
         * Define o valor da propriedade ageInfos.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo }
         *     
         */
        public void setAgeInfos(ArrayOfVehicleLocationRequirementsTypeAgeAgeInfo value) {
            this.ageInfos = value;
        }

        /**
         * Obtém o valor da propriedade minimumAge.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * Define o valor da propriedade minimumAge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * Obtém o valor da propriedade maximumAge.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * Define o valor da propriedade maximumAge.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
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
         *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AgeSurcharge {

            @XmlAttribute(name = "Age")
            protected String age;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;

            /**
             * Obtém o valor da propriedade age.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAge() {
                return age;
            }

            /**
             * Define o valor da propriedade age.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAge(String value) {
                this.age = value;
            }

            /**
             * Obtém o valor da propriedade amount.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Define o valor da propriedade amount.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

        }

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
     *       &lt;sequence&gt;
     *         &lt;element name="CreditCard" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
     *         &lt;element name="DebitCard" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
     *         &lt;element name="Cash" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Voucher" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BankAcct" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DirectBill" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LoyaltyRedemption" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MiscChargeOrder" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Deposit" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
     *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
     *         &lt;element name="PrePayment" type="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardsInfoType" minOccurs="0"/&gt;
     *         &lt;element name="PaymentOptionsInfo" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditCard",
        "debitCard",
        "cash",
        "voucher",
        "bankAcct",
        "directBill",
        "loyaltyRedemption",
        "miscChargeOrder",
        "deposit",
        "guarantee",
        "prePayment",
        "paymentOptionsInfo"
    })
    public static class PaymentOptions {

        @XmlElement(name = "CreditCard")
        protected AcceptablePaymentCardsInfoType creditCard;
        @XmlElement(name = "DebitCard")
        protected AcceptablePaymentCardsInfoType debitCard;
        @XmlElement(name = "Cash")
        protected VehicleLocationRequirementsType.PaymentOptions.Cash cash;
        @XmlElement(name = "Voucher")
        protected VehicleLocationRequirementsType.PaymentOptions.Voucher voucher;
        @XmlElement(name = "BankAcct")
        protected VehicleLocationRequirementsType.PaymentOptions.BankAcct bankAcct;
        @XmlElement(name = "DirectBill")
        protected VehicleLocationRequirementsType.PaymentOptions.DirectBill directBill;
        @XmlElement(name = "LoyaltyRedemption")
        protected VehicleLocationRequirementsType.PaymentOptions.LoyaltyRedemption loyaltyRedemption;
        @XmlElement(name = "MiscChargeOrder")
        protected VehicleLocationRequirementsType.PaymentOptions.MiscChargeOrder miscChargeOrder;
        @XmlElement(name = "Deposit")
        protected AcceptablePaymentCardsInfoType deposit;
        @XmlElement(name = "Guarantee")
        protected AcceptablePaymentCardsInfoType guarantee;
        @XmlElement(name = "PrePayment")
        protected AcceptablePaymentCardsInfoType prePayment;
        @XmlElement(name = "PaymentOptionsInfo")
        protected FormattedTextType paymentOptionsInfo;

        /**
         * Obtém o valor da propriedade creditCard.
         * 
         * @return
         *     possible object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public AcceptablePaymentCardsInfoType getCreditCard() {
            return creditCard;
        }

        /**
         * Define o valor da propriedade creditCard.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public void setCreditCard(AcceptablePaymentCardsInfoType value) {
            this.creditCard = value;
        }

        /**
         * Obtém o valor da propriedade debitCard.
         * 
         * @return
         *     possible object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public AcceptablePaymentCardsInfoType getDebitCard() {
            return debitCard;
        }

        /**
         * Define o valor da propriedade debitCard.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public void setDebitCard(AcceptablePaymentCardsInfoType value) {
            this.debitCard = value;
        }

        /**
         * Obtém o valor da propriedade cash.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.Cash }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.Cash getCash() {
            return cash;
        }

        /**
         * Define o valor da propriedade cash.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.Cash }
         *     
         */
        public void setCash(VehicleLocationRequirementsType.PaymentOptions.Cash value) {
            this.cash = value;
        }

        /**
         * Obtém o valor da propriedade voucher.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.Voucher }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.Voucher getVoucher() {
            return voucher;
        }

        /**
         * Define o valor da propriedade voucher.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.Voucher }
         *     
         */
        public void setVoucher(VehicleLocationRequirementsType.PaymentOptions.Voucher value) {
            this.voucher = value;
        }

        /**
         * Obtém o valor da propriedade bankAcct.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.BankAcct }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.BankAcct getBankAcct() {
            return bankAcct;
        }

        /**
         * Define o valor da propriedade bankAcct.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.BankAcct }
         *     
         */
        public void setBankAcct(VehicleLocationRequirementsType.PaymentOptions.BankAcct value) {
            this.bankAcct = value;
        }

        /**
         * Obtém o valor da propriedade directBill.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.DirectBill }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.DirectBill getDirectBill() {
            return directBill;
        }

        /**
         * Define o valor da propriedade directBill.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.DirectBill }
         *     
         */
        public void setDirectBill(VehicleLocationRequirementsType.PaymentOptions.DirectBill value) {
            this.directBill = value;
        }

        /**
         * Obtém o valor da propriedade loyaltyRedemption.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.LoyaltyRedemption }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /**
         * Define o valor da propriedade loyaltyRedemption.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.LoyaltyRedemption }
         *     
         */
        public void setLoyaltyRedemption(VehicleLocationRequirementsType.PaymentOptions.LoyaltyRedemption value) {
            this.loyaltyRedemption = value;
        }

        /**
         * Obtém o valor da propriedade miscChargeOrder.
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.MiscChargeOrder }
         *     
         */
        public VehicleLocationRequirementsType.PaymentOptions.MiscChargeOrder getMiscChargeOrder() {
            return miscChargeOrder;
        }

        /**
         * Define o valor da propriedade miscChargeOrder.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationRequirementsType.PaymentOptions.MiscChargeOrder }
         *     
         */
        public void setMiscChargeOrder(VehicleLocationRequirementsType.PaymentOptions.MiscChargeOrder value) {
            this.miscChargeOrder = value;
        }

        /**
         * Obtém o valor da propriedade deposit.
         * 
         * @return
         *     possible object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public AcceptablePaymentCardsInfoType getDeposit() {
            return deposit;
        }

        /**
         * Define o valor da propriedade deposit.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public void setDeposit(AcceptablePaymentCardsInfoType value) {
            this.deposit = value;
        }

        /**
         * Obtém o valor da propriedade guarantee.
         * 
         * @return
         *     possible object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public AcceptablePaymentCardsInfoType getGuarantee() {
            return guarantee;
        }

        /**
         * Define o valor da propriedade guarantee.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public void setGuarantee(AcceptablePaymentCardsInfoType value) {
            this.guarantee = value;
        }

        /**
         * Obtém o valor da propriedade prePayment.
         * 
         * @return
         *     possible object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public AcceptablePaymentCardsInfoType getPrePayment() {
            return prePayment;
        }

        /**
         * Define o valor da propriedade prePayment.
         * 
         * @param value
         *     allowed object is
         *     {@link AcceptablePaymentCardsInfoType }
         *     
         */
        public void setPrePayment(AcceptablePaymentCardsInfoType value) {
            this.prePayment = value;
        }

        /**
         * Obtém o valor da propriedade paymentOptionsInfo.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextType }
         *     
         */
        public FormattedTextType getPaymentOptionsInfo() {
            return paymentOptionsInfo;
        }

        /**
         * Define o valor da propriedade paymentOptionsInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextType }
         *     
         */
        public void setPaymentOptionsInfo(FormattedTextType value) {
            this.paymentOptionsInfo = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class BankAcct {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class Cash {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class DirectBill {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class LoyaltyRedemption {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class MiscChargeOrder {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

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
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "info"
        })
        public static class Voucher {

            @XmlElement(name = "Info")
            protected FormattedTextType info;

            /**
             * Obtém o valor da propriedade info.
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getInfo() {
                return info;
            }

            /**
             * Define o valor da propriedade info.
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setInfo(FormattedTextType value) {
                this.info = value;
            }

        }

    }

}
