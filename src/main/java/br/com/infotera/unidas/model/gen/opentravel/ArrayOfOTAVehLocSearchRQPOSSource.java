//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOTA_VehLocSearchRQPOSSource complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOTA_VehLocSearchRQPOSSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RequestorID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BookingChannel" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ArrayOfOTA_VehLocSearchRQPOSSource", propOrder = {
    "source"
})
public class ArrayOfOTAVehLocSearchRQPOSSource {

    @XmlElement(name = "Source")
    protected List<ArrayOfOTAVehLocSearchRQPOSSource.Source> source;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOTAVehLocSearchRQPOSSource.Source }
     * 
     * 
     */
    public List<ArrayOfOTAVehLocSearchRQPOSSource.Source> getSource() {
        if (source == null) {
            source = new ArrayList<ArrayOfOTAVehLocSearchRQPOSSource.Source>();
        }
        return this.source;
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
     *         &lt;element name="RequestorID" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BookingChannel" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @XmlType(name = "", propOrder = {
        "requestorID",
        "bookingChannel"
    })
    public static class Source {

        @XmlElement(name = "RequestorID")
        protected List<ArrayOfOTAVehLocSearchRQPOSSource.Source.RequestorID> requestorID;
        @XmlElement(name = "BookingChannel")
        protected List<ArrayOfOTAVehLocSearchRQPOSSource.Source.BookingChannel> bookingChannel;

        /**
         * Gets the value of the requestorID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestorID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestorID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOTAVehLocSearchRQPOSSource.Source.RequestorID }
         * 
         * 
         */
        public List<ArrayOfOTAVehLocSearchRQPOSSource.Source.RequestorID> getRequestorID() {
            if (requestorID == null) {
                requestorID = new ArrayList<ArrayOfOTAVehLocSearchRQPOSSource.Source.RequestorID>();
            }
            return this.requestorID;
        }

        /**
         * Gets the value of the bookingChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArrayOfOTAVehLocSearchRQPOSSource.Source.BookingChannel }
         * 
         * 
         */
        public List<ArrayOfOTAVehLocSearchRQPOSSource.Source.BookingChannel> getBookingChannel() {
            if (bookingChannel == null) {
                bookingChannel = new ArrayList<ArrayOfOTAVehLocSearchRQPOSSource.Source.BookingChannel>();
            }
            return this.bookingChannel;
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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BookingChannel {

            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "Primary")
            protected String primary;

            /**
             * Obtém o valor da propriedade type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define o valor da propriedade type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtém o valor da propriedade primary.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * Define o valor da propriedade primary.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
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
         *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RequestorID {

            @XmlAttribute(name = "URL")
            protected String url;
            @XmlAttribute(name = "Type")
            protected String type;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * Obtém o valor da propriedade url.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * Define o valor da propriedade url.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
            }

            /**
             * Obtém o valor da propriedade type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define o valor da propriedade type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtém o valor da propriedade id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Define o valor da propriedade id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

        }

    }

}
