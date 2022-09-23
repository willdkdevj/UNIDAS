//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VehicleLocationAdditionalFeesType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalFeesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Taxes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fees" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Surcharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surcharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MiscellaneousCharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MiscellaneousCharge" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "VehicleLocationAdditionalFeesType", propOrder = {
    "taxes",
    "fees",
    "surcharges",
    "miscellaneousCharges",
    "tpaExtensions"
})
public class VehicleLocationAdditionalFeesType {

    @XmlElement(name = "Taxes")
    protected VehicleLocationAdditionalFeesType.Taxes taxes;
    @XmlElement(name = "Fees")
    protected VehicleLocationAdditionalFeesType.Fees fees;
    @XmlElement(name = "Surcharges")
    protected VehicleLocationAdditionalFeesType.Surcharges surcharges;
    @XmlElement(name = "MiscellaneousCharges")
    protected VehicleLocationAdditionalFeesType.MiscellaneousCharges miscellaneousCharges;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Obtém o valor da propriedade taxes.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalFeesType.Taxes }
     *     
     */
    public VehicleLocationAdditionalFeesType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Define o valor da propriedade taxes.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalFeesType.Taxes }
     *     
     */
    public void setTaxes(VehicleLocationAdditionalFeesType.Taxes value) {
        this.taxes = value;
    }

    /**
     * Obtém o valor da propriedade fees.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalFeesType.Fees }
     *     
     */
    public VehicleLocationAdditionalFeesType.Fees getFees() {
        return fees;
    }

    /**
     * Define o valor da propriedade fees.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalFeesType.Fees }
     *     
     */
    public void setFees(VehicleLocationAdditionalFeesType.Fees value) {
        this.fees = value;
    }

    /**
     * Obtém o valor da propriedade surcharges.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalFeesType.Surcharges }
     *     
     */
    public VehicleLocationAdditionalFeesType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Define o valor da propriedade surcharges.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalFeesType.Surcharges }
     *     
     */
    public void setSurcharges(VehicleLocationAdditionalFeesType.Surcharges value) {
        this.surcharges = value;
    }

    /**
     * Obtém o valor da propriedade miscellaneousCharges.
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges }
     *     
     */
    public VehicleLocationAdditionalFeesType.MiscellaneousCharges getMiscellaneousCharges() {
        return miscellaneousCharges;
    }

    /**
     * Define o valor da propriedade miscellaneousCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges }
     *     
     */
    public void setMiscellaneousCharges(VehicleLocationAdditionalFeesType.MiscellaneousCharges value) {
        this.miscellaneousCharges = value;
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
     *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "fee",
        "info"
    })
    public static class Fees {

        @XmlElement(name = "Fee")
        protected List<VehicleLocationAdditionalFeesType.Fees.Fee> fee;
        @XmlElement(name = "Info")
        protected FormattedTextType info;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalFeesType.Fees.Fee }
         * 
         * 
         */
        public List<VehicleLocationAdditionalFeesType.Fees.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<VehicleLocationAdditionalFeesType.Fees.Fee>();
            }
            return this.fee;
        }

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


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
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
        public static class Fee
            extends VehicleChargeType
        {

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
     *         &lt;element name="MiscellaneousCharge" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "miscellaneousCharge",
        "info"
    })
    public static class MiscellaneousCharges {

        @XmlElement(name = "MiscellaneousCharge")
        protected List<VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge> miscellaneousCharge;
        @XmlElement(name = "Info")
        protected FormattedTextType info;

        /**
         * Gets the value of the miscellaneousCharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miscellaneousCharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiscellaneousCharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge }
         * 
         * 
         */
        public List<VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge> getMiscellaneousCharge() {
            if (miscellaneousCharge == null) {
                miscellaneousCharge = new ArrayList<VehicleLocationAdditionalFeesType.MiscellaneousCharges.MiscellaneousCharge>();
            }
            return this.miscellaneousCharge;
        }

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


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
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
        public static class MiscellaneousCharge
            extends VehicleChargeType
        {

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
     *         &lt;element name="Surcharge" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "surcharge",
        "info"
    })
    public static class Surcharges {

        @XmlElement(name = "Surcharge")
        protected List<VehicleLocationAdditionalFeesType.Surcharges.Surcharge> surcharge;
        @XmlElement(name = "Info")
        protected FormattedTextType info;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the surcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalFeesType.Surcharges.Surcharge }
         * 
         * 
         */
        public List<VehicleLocationAdditionalFeesType.Surcharges.Surcharge> getSurcharge() {
            if (surcharge == null) {
                surcharge = new ArrayList<VehicleLocationAdditionalFeesType.Surcharges.Surcharge>();
            }
            return this.surcharge;
        }

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

        /**
         * Obtém o valor da propriedade start.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Define o valor da propriedade start.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Obtém o valor da propriedade duration.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Define o valor da propriedade duration.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Obtém o valor da propriedade end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Define o valor da propriedade end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleChargeType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
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
        public static class Surcharge
            extends VehicleChargeType
        {

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
     *         &lt;element name="Tax" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="End" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax",
        "info"
    })
    public static class Taxes {

        @XmlElement(name = "Tax")
        protected List<VehicleLocationAdditionalFeesType.Taxes.Tax> tax;
        @XmlElement(name = "Info")
        protected FormattedTextType info;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalFeesType.Taxes.Tax }
         * 
         * 
         */
        public List<VehicleLocationAdditionalFeesType.Taxes.Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<VehicleLocationAdditionalFeesType.Taxes.Tax>();
            }
            return this.tax;
        }

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

        /**
         * Obtém o valor da propriedade start.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Define o valor da propriedade start.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Obtém o valor da propriedade duration.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Define o valor da propriedade duration.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Obtém o valor da propriedade end.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Define o valor da propriedade end.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
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
         *       &lt;attribute name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
        public static class Tax {

            @XmlElement(name = "Info")
            protected FormattedTextType info;
            @XmlAttribute(name = "TaxCode")
            protected String taxCode;
            @XmlAttribute(name = "Percentage")
            protected BigDecimal percentage;

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

            /**
             * Obtém o valor da propriedade taxCode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Define o valor da propriedade taxCode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Obtém o valor da propriedade percentage.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentage() {
                return percentage;
            }

            /**
             * Define o valor da propriedade percentage.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentage(BigDecimal value) {
                this.percentage = value;
            }

        }

    }

}
