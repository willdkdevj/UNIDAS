//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de ItemSearchCriterionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType"&gt;
 *                 &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephone" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RefPoint" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;attribute name="RefPointType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CodeRef" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
 *                 &lt;attribute name="VicinityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HotelRef" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *                 &lt;attribute name="LocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Radius" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MapArea" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ImportanceType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Mandatory"/&gt;
 *             &lt;enumeration value="High"/&gt;
 *             &lt;enumeration value="Medium"/&gt;
 *             &lt;enumeration value="Low"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Ranking" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchCriterionType", propOrder = {
    "position",
    "address",
    "telephone",
    "refPoint",
    "codeRef",
    "hotelRef",
    "radius",
    "mapArea"
})
public class ItemSearchCriterionType {

    @XmlElement(name = "Position")
    protected ItemSearchCriterionType.Position position;
    @XmlElement(name = "Address")
    protected ItemSearchCriterionType.Address address;
    @XmlElement(name = "Telephone")
    protected ItemSearchCriterionType.Telephone telephone;
    @XmlElement(name = "RefPoint")
    protected List<ItemSearchCriterionType.RefPoint> refPoint;
    @XmlElement(name = "CodeRef")
    protected ItemSearchCriterionType.CodeRef codeRef;
    @XmlElement(name = "HotelRef")
    protected List<ItemSearchCriterionType.HotelRef> hotelRef;
    @XmlElement(name = "Radius")
    protected ItemSearchCriterionType.Radius radius;
    @XmlElement(name = "MapArea")
    protected ItemSearchCriterionType.MapArea mapArea;
    @XmlAttribute(name = "ExactMatch")
    protected Boolean exactMatch;
    @XmlAttribute(name = "ImportanceType")
    protected String importanceType;
    @XmlAttribute(name = "Ranking")
    protected BigInteger ranking;

    /**
     * Obtém o valor da propriedade position.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public ItemSearchCriterionType.Position getPosition() {
        return position;
    }

    /**
     * Define o valor da propriedade position.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Position }
     *     
     */
    public void setPosition(ItemSearchCriterionType.Position value) {
        this.position = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public ItemSearchCriterionType.Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Address }
     *     
     */
    public void setAddress(ItemSearchCriterionType.Address value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade telephone.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public ItemSearchCriterionType.Telephone getTelephone() {
        return telephone;
    }

    /**
     * Define o valor da propriedade telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Telephone }
     *     
     */
    public void setTelephone(ItemSearchCriterionType.Telephone value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the refPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.RefPoint }
     * 
     * 
     */
    public List<ItemSearchCriterionType.RefPoint> getRefPoint() {
        if (refPoint == null) {
            refPoint = new ArrayList<ItemSearchCriterionType.RefPoint>();
        }
        return this.refPoint;
    }

    /**
     * Obtém o valor da propriedade codeRef.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public ItemSearchCriterionType.CodeRef getCodeRef() {
        return codeRef;
    }

    /**
     * Define o valor da propriedade codeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.CodeRef }
     *     
     */
    public void setCodeRef(ItemSearchCriterionType.CodeRef value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the hotelRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemSearchCriterionType.HotelRef }
     * 
     * 
     */
    public List<ItemSearchCriterionType.HotelRef> getHotelRef() {
        if (hotelRef == null) {
            hotelRef = new ArrayList<ItemSearchCriterionType.HotelRef>();
        }
        return this.hotelRef;
    }

    /**
     * Obtém o valor da propriedade radius.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public ItemSearchCriterionType.Radius getRadius() {
        return radius;
    }

    /**
     * Define o valor da propriedade radius.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.Radius }
     *     
     */
    public void setRadius(ItemSearchCriterionType.Radius value) {
        this.radius = value;
    }

    /**
     * Obtém o valor da propriedade mapArea.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchCriterionType.MapArea }
     *     
     */
    public ItemSearchCriterionType.MapArea getMapArea() {
        return mapArea;
    }

    /**
     * Define o valor da propriedade mapArea.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchCriterionType.MapArea }
     *     
     */
    public void setMapArea(ItemSearchCriterionType.MapArea value) {
        this.mapArea = value;
    }

    /**
     * Obtém o valor da propriedade exactMatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Define o valor da propriedade exactMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactMatch(Boolean value) {
        this.exactMatch = value;
    }

    /**
     * Obtém o valor da propriedade importanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceType() {
        return importanceType;
    }

    /**
     * Define o valor da propriedade importanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportanceType(String value) {
        this.importanceType = value;
    }

    /**
     * Obtém o valor da propriedade ranking.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * Define o valor da propriedade ranking.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
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
     *       &lt;attribute name="SameCountryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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

        @XmlAttribute(name = "SameCountryInd")
        protected Boolean sameCountryInd;

        /**
         * Obtém o valor da propriedade sameCountryInd.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSameCountryInd() {
            return sameCountryInd;
        }

        /**
         * Define o valor da propriedade sameCountryInd.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSameCountryInd(Boolean value) {
            this.sameCountryInd = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05&gt;LocationType"&gt;
     *       &lt;attribute name="VicinityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CodeRef
        extends LocationType
    {

        @XmlAttribute(name = "VicinityCode")
        protected String vicinityCode;

        /**
         * Obtém o valor da propriedade vicinityCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVicinityCode() {
            return vicinityCode;
        }

        /**
         * Define o valor da propriedade vicinityCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVicinityCode(String value) {
            this.vicinityCode = value;
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
     *       &lt;attribute name="ChainCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCityCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="HotelCodeContext" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ChainName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SegmentCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="PropertyClassCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ArchitecturalStyleCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SupplierIntegrationLevel" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
     *       &lt;attribute name="LocationCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ExtendedCitySearchIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "SegmentCategoryCode")
        protected String segmentCategoryCode;
        @XmlAttribute(name = "PropertyClassCode")
        protected String propertyClassCode;
        @XmlAttribute(name = "ArchitecturalStyleCode")
        protected String architecturalStyleCode;
        @XmlAttribute(name = "SupplierIntegrationLevel")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger supplierIntegrationLevel;
        @XmlAttribute(name = "LocationCategoryCode")
        protected String locationCategoryCode;
        @XmlAttribute(name = "ExtendedCitySearchIndicator")
        protected Boolean extendedCitySearchIndicator;

        /**
         * Obtém o valor da propriedade chainCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Define o valor da propriedade chainCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Obtém o valor da propriedade brandCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * Define o valor da propriedade brandCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * Obtém o valor da propriedade hotelCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Define o valor da propriedade hotelCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Obtém o valor da propriedade hotelCityCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Define o valor da propriedade hotelCityCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Obtém o valor da propriedade hotelName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Define o valor da propriedade hotelName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * Obtém o valor da propriedade hotelCodeContext.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * Define o valor da propriedade hotelCodeContext.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * Obtém o valor da propriedade chainName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * Define o valor da propriedade chainName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * Obtém o valor da propriedade brandName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * Define o valor da propriedade brandName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * Obtém o valor da propriedade segmentCategoryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentCategoryCode() {
            return segmentCategoryCode;
        }

        /**
         * Define o valor da propriedade segmentCategoryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentCategoryCode(String value) {
            this.segmentCategoryCode = value;
        }

        /**
         * Obtém o valor da propriedade propertyClassCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyClassCode() {
            return propertyClassCode;
        }

        /**
         * Define o valor da propriedade propertyClassCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyClassCode(String value) {
            this.propertyClassCode = value;
        }

        /**
         * Obtém o valor da propriedade architecturalStyleCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArchitecturalStyleCode() {
            return architecturalStyleCode;
        }

        /**
         * Define o valor da propriedade architecturalStyleCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArchitecturalStyleCode(String value) {
            this.architecturalStyleCode = value;
        }

        /**
         * Obtém o valor da propriedade supplierIntegrationLevel.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSupplierIntegrationLevel() {
            return supplierIntegrationLevel;
        }

        /**
         * Define o valor da propriedade supplierIntegrationLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSupplierIntegrationLevel(BigInteger value) {
            this.supplierIntegrationLevel = value;
        }

        /**
         * Obtém o valor da propriedade locationCategoryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationCategoryCode() {
            return locationCategoryCode;
        }

        /**
         * Define o valor da propriedade locationCategoryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationCategoryCode(String value) {
            this.locationCategoryCode = value;
        }

        /**
         * Obtém o valor da propriedade extendedCitySearchIndicator.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExtendedCitySearchIndicator() {
            return extendedCitySearchIndicator;
        }

        /**
         * Define o valor da propriedade extendedCitySearchIndicator.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExtendedCitySearchIndicator(Boolean value) {
            this.extendedCitySearchIndicator = value;
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
     *       &lt;attribute name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MapArea {

        @XmlAttribute(name = "NorthLatitude")
        protected String northLatitude;
        @XmlAttribute(name = "SouthLatitude")
        protected String southLatitude;
        @XmlAttribute(name = "EastLongitude")
        protected String eastLongitude;
        @XmlAttribute(name = "WestLongitude")
        protected String westLongitude;

        /**
         * Obtém o valor da propriedade northLatitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNorthLatitude() {
            return northLatitude;
        }

        /**
         * Define o valor da propriedade northLatitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNorthLatitude(String value) {
            this.northLatitude = value;
        }

        /**
         * Obtém o valor da propriedade southLatitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSouthLatitude() {
            return southLatitude;
        }

        /**
         * Define o valor da propriedade southLatitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSouthLatitude(String value) {
            this.southLatitude = value;
        }

        /**
         * Obtém o valor da propriedade eastLongitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEastLongitude() {
            return eastLongitude;
        }

        /**
         * Define o valor da propriedade eastLongitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEastLongitude(String value) {
            this.eastLongitude = value;
        }

        /**
         * Obtém o valor da propriedade westLongitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWestLongitude() {
            return westLongitude;
        }

        /**
         * Define o valor da propriedade westLongitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWestLongitude(String value) {
            this.westLongitude = value;
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
     *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Altitude" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="AltitudeUnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;

        /**
         * Obtém o valor da propriedade latitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Define o valor da propriedade latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Obtém o valor da propriedade longitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Define o valor da propriedade longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Obtém o valor da propriedade altitude.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Define o valor da propriedade altitude.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Obtém o valor da propriedade altitudeUnitOfMeasureCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Define o valor da propriedade altitudeUnitOfMeasureCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
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
     *       &lt;attribute name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DistanceMeasure" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="DistanceMax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Radius {

        @XmlAttribute(name = "Distance")
        protected String distance;
        @XmlAttribute(name = "DistanceMeasure")
        protected String distanceMeasure;
        @XmlAttribute(name = "Direction")
        protected String direction;
        @XmlAttribute(name = "DistanceMax")
        protected String distanceMax;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Obtém o valor da propriedade distance.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistance() {
            return distance;
        }

        /**
         * Define o valor da propriedade distance.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistance(String value) {
            this.distance = value;
        }

        /**
         * Obtém o valor da propriedade distanceMeasure.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMeasure() {
            return distanceMeasure;
        }

        /**
         * Define o valor da propriedade distanceMeasure.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMeasure(String value) {
            this.distanceMeasure = value;
        }

        /**
         * Obtém o valor da propriedade direction.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * Define o valor da propriedade direction.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * Obtém o valor da propriedade distanceMax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMax() {
            return distanceMax;
        }

        /**
         * Define o valor da propriedade distanceMax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMax(String value) {
            this.distanceMax = value;
        }

        /**
         * Obtém o valor da propriedade unitOfMeasureCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Define o valor da propriedade unitOfMeasureCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="StateProv" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;attribute name="RefPointType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RefPoint {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "StateProv")
        protected String stateProv;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "RefPointType")
        protected String refPointType;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "CityName")
        protected String cityName;

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade stateProv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProv() {
            return stateProv;
        }

        /**
         * Define o valor da propriedade stateProv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProv(String value) {
            this.stateProv = value;
        }

        /**
         * Obtém o valor da propriedade countryCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Define o valor da propriedade countryCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Obtém o valor da propriedade uri.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Define o valor da propriedade uri.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Obtém o valor da propriedade refPointType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefPointType() {
            return refPointType;
        }

        /**
         * Define o valor da propriedade refPointType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefPointType(String value) {
            this.refPointType = value;
        }

        /**
         * Obtém o valor da propriedade name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define o valor da propriedade name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtém o valor da propriedade cityName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * Define o valor da propriedade cityName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityName(String value) {
            this.cityName = value;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {


    }

}
