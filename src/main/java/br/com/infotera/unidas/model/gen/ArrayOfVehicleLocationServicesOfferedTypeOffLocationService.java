//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.FormattedTextType;
import br.com.infotera.unidas.model.gen.opentravel.OffLocationServiceIDType;
import br.com.infotera.unidas.model.gen.opentravel.OperationSchedulesType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationServicesOfferedTypeOffLocationService complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationServicesOfferedTypeOffLocationService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffLocationService" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OffLocServiceDesc" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *                   &lt;element name="OffLocServiceCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OffLocationServiceID_Type" /&gt;
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
@XmlType(name = "ArrayOfVehicleLocationServicesOfferedTypeOffLocationService", propOrder = {
    "offLocationService"
})
public class ArrayOfVehicleLocationServicesOfferedTypeOffLocationService {

    @XmlElement(name = "OffLocationService")
    protected List<ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService> offLocationService;

    /**
     * Gets the value of the offLocationService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offLocationService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffLocationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService> getOffLocationService() {
        if (offLocationService == null) {
            offLocationService = new ArrayList<ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService>();
        }
        return this.offLocationService;
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
     *         &lt;element name="OffLocServiceDesc" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
     *         &lt;element name="OffLocServiceCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "offLocServiceDesc",
        "operationSchedules",
        "offLocServiceCharges"
    })
    public static class OffLocationService {

        @XmlElement(name = "OffLocServiceDesc")
        protected ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService.OffLocServiceDesc offLocServiceDesc;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;
        @XmlElement(name = "OffLocServiceCharges")
        protected ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge offLocServiceCharges;
        @XmlAttribute(name = "Type", required = true)
        protected OffLocationServiceIDType type;

        /**
         * Obtém o valor da propriedade offLocServiceDesc.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService.OffLocServiceDesc }
         *     
         */
        public ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService.OffLocServiceDesc getOffLocServiceDesc() {
            return offLocServiceDesc;
        }

        /**
         * Define o valor da propriedade offLocServiceDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService.OffLocServiceDesc }
         *     
         */
        public void setOffLocServiceDesc(ArrayOfVehicleLocationServicesOfferedTypeOffLocationService.OffLocationService.OffLocServiceDesc value) {
            this.offLocServiceDesc = value;
        }

        /**
         * Obtém o valor da propriedade operationSchedules.
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * Define o valor da propriedade operationSchedules.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
        }

        /**
         * Obtém o valor da propriedade offLocServiceCharges.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge }
         *     
         */
        public ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge getOffLocServiceCharges() {
            return offLocServiceCharges;
        }

        /**
         * Define o valor da propriedade offLocServiceCharges.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge }
         *     
         */
        public void setOffLocServiceCharges(ArrayOfVehicleLocationServicesOfferedTypeOffLocationServiceOffLocServiceCharge value) {
            this.offLocServiceCharges = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OffLocServiceDesc
            extends FormattedTextType
        {


        }

    }

}
