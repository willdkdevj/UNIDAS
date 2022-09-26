//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.09.21 às 12:52:49 PM BRT 
//


package br.com.infotera.unidas.model.gen;

import br.com.infotera.unidas.model.gen.opentravel.FormattedTextType;
import br.com.infotera.unidas.model.gen.opentravel.OperationSchedulesType;
import br.com.infotera.unidas.model.gen.opentravel.OnLocationServiceIDType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVehicleLocationServicesOfferedTypeOnLocationService complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVehicleLocationServicesOfferedTypeOnLocationService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnLocationService" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OnLocServiceDesc" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
 *                   &lt;element name="OnLocServiceCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OnLocationServiceID_Type" /&gt;
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
@XmlType(name = "ArrayOfVehicleLocationServicesOfferedTypeOnLocationService", propOrder = {
    "onLocationService"
})
public class ArrayOfVehicleLocationServicesOfferedTypeOnLocationService {

    @XmlElement(name = "OnLocationService")
    protected List<ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService> onLocationService;

    /**
     * Gets the value of the onLocationService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLocationService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLocationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService }
     * 
     * 
     */
    public List<ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService> getOnLocationService() {
        if (onLocationService == null) {
            onLocationService = new ArrayList<ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService>();
        }
        return this.onLocationService;
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
     *         &lt;element name="OnLocServiceDesc" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/&gt;
     *         &lt;element name="OnLocServiceCharges" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OnLocationServiceID_Type" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "onLocServiceDesc",
        "operationSchedules",
        "onLocServiceCharges"
    })
    public static class OnLocationService {

        @XmlElement(name = "OnLocServiceDesc")
        protected ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService.OnLocServiceDesc onLocServiceDesc;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;
        @XmlElement(name = "OnLocServiceCharges")
        protected ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge onLocServiceCharges;
        @XmlAttribute(name = "Type", required = true)
        protected OnLocationServiceIDType type;

        /**
         * Obtém o valor da propriedade onLocServiceDesc.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService.OnLocServiceDesc }
         *     
         */
        public ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService.OnLocServiceDesc getOnLocServiceDesc() {
            return onLocServiceDesc;
        }

        /**
         * Define o valor da propriedade onLocServiceDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService.OnLocServiceDesc }
         *     
         */
        public void setOnLocServiceDesc(ArrayOfVehicleLocationServicesOfferedTypeOnLocationService.OnLocationService.OnLocServiceDesc value) {
            this.onLocServiceDesc = value;
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
         * Obtém o valor da propriedade onLocServiceCharges.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge }
         *     
         */
        public ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge getOnLocServiceCharges() {
            return onLocServiceCharges;
        }

        /**
         * Define o valor da propriedade onLocServiceCharges.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge }
         *     
         */
        public void setOnLocServiceCharges(ArrayOfVehicleLocationServicesOfferedTypeOnLocationServiceOnLocServiceCharge value) {
            this.onLocServiceCharges = value;
        }

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link OnLocationServiceIDType }
         *     
         */
        public OnLocationServiceIDType getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link OnLocationServiceIDType }
         *     
         */
        public void setType(OnLocationServiceIDType value) {
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
        public static class OnLocServiceDesc
            extends FormattedTextType
        {


        }

    }

}
