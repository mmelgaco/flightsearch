//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.08.07 às 04:15:16 PM BRT 
//


package com.mttnow.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mttnow.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mttnow.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Availability }
     * 
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link Availability.Flight }
     * 
     */
    public Availability.Flight createAvailabilityFlight() {
        return new Availability.Flight();
    }

    /**
     * Create an instance of {@link Availability.Flight.Fares }
     * 
     */
    public Availability.Flight.Fares createAvailabilityFlightFares() {
        return new Availability.Flight.Fares();
    }

    /**
     * Create an instance of {@link Availability.Flight.Fares.Fare }
     * 
     */
    public Availability.Flight.Fares.Fare createAvailabilityFlightFaresFare() {
        return new Availability.Flight.Fares.Fare();
    }

}
