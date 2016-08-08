package com.mttnow.client;

import org.springframework.web.client.RestTemplate;

import com.mttnow.representation.AvailabilityJson;
import com.mttnow.wsdl.Availability;

public class ListFlights {

    public AvailabilityJson list(String origin, String destination, 
            String departureDate, String returnDate, String pax){
        
        RestTemplate restTemplate = new RestTemplate();
        
        StringBuilder url = new StringBuilder("http://private-72732-mockairline.apiary-mock.com/flights/");
        url.append(origin)
            .append("/").append(destination)
            .append("/").append(departureDate)
            .append("/").append(returnDate)
            .append("/").append(pax);
        
        Availability aval = restTemplate.getForObject(url.toString(), Availability.class);
        
        AvailabilityJson json = new AvailabilityJson(aval);
        
        return json;
        
    }

    
}
