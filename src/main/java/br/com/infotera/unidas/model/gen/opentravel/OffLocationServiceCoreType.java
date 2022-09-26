//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen.opentravel;

import br.com.infotera.unidas.model.gen.opentravel.OffLocationServiceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OffLocationServiceCoreType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OffLocationServiceCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
 *                 &lt;attribute name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceID_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffLocationServiceCoreType", propOrder = {
    "address"
})
@XmlSeeAlso({
    OffLocationServiceType.class
})
public class OffLocationServiceCoreType {

    @XmlElement(name = "Address")
    protected OffLocationServiceCoreType.Address address;
    @XmlAttribute(name = "Type", required = true)
    protected OffLocationServiceIDType type;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceCoreType.Address }
     *     
     */
    public OffLocationServiceCoreType.Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceCoreType.Address }
     *     
     */
    public void setAddress(OffLocationServiceCoreType.Address value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link OffLocationServiceIDType }
     *     
     */
    public OffLocationServiceIDType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link OffLocationServiceIDType }
     *     
     */
    public void setType(OffLocationServiceIDType value) {
        this.type = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
     *       &lt;attribute name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {

        @XmlAttribute(name = "SiteID")
        protected String siteID;
        @XmlAttribute(name = "SiteName")
        protected String siteName;

        /**
         * Obtém o valor da propriedade siteID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteID() {
            return siteID;
        }

        /**
         * Define o valor da propriedade siteID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteID(String value) {
            this.siteID = value;
        }

        /**
         * Obtém o valor da propriedade siteName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteName() {
            return siteName;
        }

        /**
         * Define o valor da propriedade siteName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteName(String value) {
            this.siteName = value;
        }

    }

}
