//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.07 às 04:15:16 PM BRT 
//


package com.mttnow.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Flight" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FlightDesignator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="Fares"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Fare" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
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
@XmlType(name = "", propOrder = {
    "flight"
})
@XmlRootElement(name = "Availability")
public class Availability {

    @XmlElement(name = "Flight")
    protected List<Availability.Flight> flight;

    /**
     * Gets the value of the flight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Availability.Flight }
     * 
     * 
     */
    public List<Availability.Flight> getFlight() {
        if (flight == null) {
            flight = new ArrayList<Availability.Flight>();
        }
        return this.flight;
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
     *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FlightDesignator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OriginAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DestinationAirport" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="Fares"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Fare" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    @XmlType(name = "", propOrder = {
        "carrierCode",
        "flightDesignator",
        "originAirport",
        "destinationAirport",
        "departureDate",
        "arrivalDate",
        "fares"
    })
    public static class Flight {

        @XmlElement(name = "CarrierCode", required = true)
        protected String carrierCode;
        @XmlElement(name = "FlightDesignator", required = true)
        protected String flightDesignator;
        @XmlElement(name = "OriginAirport", required = true)
        protected String originAirport;
        @XmlElement(name = "DestinationAirport", required = true)
        protected String destinationAirport;
        @XmlElement(name = "DepartureDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar departureDate;
        @XmlElement(name = "ArrivalDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar arrivalDate;
        @XmlElement(name = "Fares", required = true)
        protected Availability.Flight.Fares fares;

        /**
         * Obtém o valor da propriedade carrierCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrierCode() {
            return carrierCode;
        }

        /**
         * Define o valor da propriedade carrierCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrierCode(String value) {
            this.carrierCode = value;
        }

        /**
         * Obtém o valor da propriedade flightDesignator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightDesignator() {
            return flightDesignator;
        }

        /**
         * Define o valor da propriedade flightDesignator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightDesignator(String value) {
            this.flightDesignator = value;
        }

        /**
         * Obtém o valor da propriedade originAirport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginAirport() {
            return originAirport;
        }

        /**
         * Define o valor da propriedade originAirport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginAirport(String value) {
            this.originAirport = value;
        }

        /**
         * Obtém o valor da propriedade destinationAirport.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationAirport() {
            return destinationAirport;
        }

        /**
         * Define o valor da propriedade destinationAirport.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationAirport(String value) {
            this.destinationAirport = value;
        }

        /**
         * Obtém o valor da propriedade departureDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Define o valor da propriedade departureDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        /**
         * Obtém o valor da propriedade arrivalDate.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalDate() {
            return arrivalDate;
        }

        /**
         * Define o valor da propriedade arrivalDate.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalDate(XMLGregorianCalendar value) {
            this.arrivalDate = value;
        }

        /**
         * Obtém o valor da propriedade fares.
         * 
         * @return
         *     possible object is
         *     {@link Availability.Flight.Fares }
         *     
         */
        public Availability.Flight.Fares getFares() {
            return fares;
        }

        /**
         * Define o valor da propriedade fares.
         * 
         * @param value
         *     allowed object is
         *     {@link Availability.Flight.Fares }
         *     
         */
        public void setFares(Availability.Flight.Fares value) {
            this.fares = value;
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
         *         &lt;element name="Fare" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
            "fare"
        })
        public static class Fares {

            @XmlElement(name = "Fare")
            protected List<Availability.Flight.Fares.Fare> fare;

            /**
             * Gets the value of the fare property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fare property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFare().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Availability.Flight.Fares.Fare }
             * 
             * 
             */
            public List<Availability.Flight.Fares.Fare> getFare() {
                if (fare == null) {
                    fare = new ArrayList<Availability.Flight.Fares.Fare>();
                }
                return this.fare;
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
             *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "basePrice",
                "fees",
                "tax"
            })
            public static class Fare {

                @XmlElement(name = "BasePrice", required = true)
                protected String basePrice;
                @XmlElement(name = "Fees", required = true)
                protected String fees;
                @XmlElement(name = "Tax", required = true)
                protected String tax;
                @XmlAttribute(name = "class")
                protected String clazz;

                /**
                 * Obtém o valor da propriedade basePrice.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBasePrice() {
                    return basePrice;
                }

                /**
                 * Define o valor da propriedade basePrice.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBasePrice(String value) {
                    this.basePrice = value;
                }

                /**
                 * Obtém o valor da propriedade fees.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFees() {
                    return fees;
                }

                /**
                 * Define o valor da propriedade fees.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFees(String value) {
                    this.fees = value;
                }

                /**
                 * Obtém o valor da propriedade tax.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTax() {
                    return tax;
                }

                /**
                 * Define o valor da propriedade tax.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTax(String value) {
                    this.tax = value;
                }

                /**
                 * Obtém o valor da propriedade clazz.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Define o valor da propriedade clazz.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
                }

            }

        }

    }

}
