package com.mttnow.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mttnow.client.ListFlights;
import com.mttnow.representation.AvailabilityJson;

@RestController
public class HelloController {
    
    @RequestMapping(value="/{origin}/{destination}/{departureDate}/{returnDate}/{pax}")
    public AvailabilityJson listFlights(@PathVariable String origin, 
            @PathVariable String destination, @PathVariable String departureDate,
            @PathVariable String returnDate, @PathVariable String pax) {
        
        return new ListFlights().list(origin, destination, departureDate, returnDate, pax);
        
    }
    
}
