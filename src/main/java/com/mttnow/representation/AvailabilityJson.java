package com.mttnow.representation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.StringUtils;
import org.joda.time.Duration;

import com.mttnow.wsdl.Availability;

public class AvailabilityJson {

    protected List<AvailabilityJson.Availability2> availability;
    
    public AvailabilityJson(Availability availability) {
        super();
        
        this.availability = availability.getFlight().stream()
                .map(flight -> new AvailabilityJson.Availability2(flight))
                .collect(Collectors.toList());        
        
    }
    
    public List<AvailabilityJson.Availability2> getAvailability() {
        return availability;
    }

    public void setAvailability(List<AvailabilityJson.Availability2> availability) {
        this.availability = availability;
    }

    public static class Availability2 {
        
        public Availability2(Availability.Flight flight){
            setFlight(new AvailabilityJson.Availability2.Flight(flight));
            
        }
        
        protected AvailabilityJson.Availability2.Flight flight;    
        
        public AvailabilityJson.Availability2.Flight getFlight() {
            return flight;
        }

        public void setFlight(AvailabilityJson.Availability2.Flight flight) {
            this.flight = flight;
        }

        public static class Flight {
            
            protected String operator;
            protected String flightNumber;
            protected String departsFrom;
            protected String arrivesAt;
            protected DateTime departsOn;
            protected DateTime arrivesOn;
            private String flightTime;//TODO
            private FarePrices farePrices;
            
            public Flight(Availability.Flight flightXml){
                super();
                this.operator = flightXml.getCarrierCode();
                this.flightNumber = flightXml.getFlightDesignator();
                this.departsFrom = flightXml.getOriginAirport();
                this.arrivesAt = flightXml.getDestinationAirport();
                this.departsOn = new DateTime(flightXml.getDepartureDate());
                this.arrivesOn = new DateTime(flightXml.getArrivalDate());
                this.farePrices = new FarePrices(flightXml.getFares());
                
                Duration duration = new Duration(new org.joda.time.DateTime(flightXml.getDepartureDate().toGregorianCalendar()), new  org.joda.time.DateTime(flightXml.getArrivalDate().toGregorianCalendar()));
                this.flightTime = StringUtils.leftPad(String.valueOf(duration.getStandardHours()), 2, '0') + ":" + StringUtils.leftPad(String.valueOf(Math.round(duration.getStandardMinutes() % 60)), 2, '0');
                
            }
   
            public static class DateTime {
                
                public DateTime(XMLGregorianCalendar originDate){
                    this.date = new SimpleDateFormat("dd-MM-yyyy").format(originDate.toGregorianCalendar().getTime());
                    this.time = new SimpleDateFormat("hh:mma").format(originDate.toGregorianCalendar().getTime());
                }
                
                private String date;
                private String time;
                
                public String getTime() {
                    return time;
                }
                public void setTime(String time) {
                    this.time = time;
                }
                public String getDate() {
                    return date;
                }
                public void setDate(String date) {
                    this.date = date;
                }
                
            }
            
            public static class FarePrices {
                
                private Price first;
                private Price business;
                private Price economy;
                
                public FarePrices(Availability.Flight.Fares fares){
                    for (Availability.Flight.Fares.Fare fare : fares.getFare()) {
                        if("FIF".equals(fare.getClazz())){
                            this.first = new Price(fare);
                        }else if("CIF".equals(fare.getClazz())){
                            this.business = new Price(fare);
                        }else if("YIF".equals(fare.getClazz())){
                            this.economy = new Price(fare);
                        }
                    }
                }
                
                public Price getFirst() {
                    return first;
                }

                public void setFirst(Price first) {
                    this.first = first;
                }

                public Price getBusiness() {
                    return business;
                }

                public void setBusiness(Price business) {
                    this.business = business;
                }

                public Price getEconomy() {
                    return economy;
                }

                public void setEconomy(Price economy) {
                    this.economy = economy;
                }

                public static class Price {
                    
                    private Currency ticket;
                    private Currency bookingFee;
                    private Currency tax;
                    
                    public Price(Availability.Flight.Fares.Fare fare){
                        this.ticket = new Currency(fare.getBasePrice());
                        this.bookingFee = new Currency(fare.getFees());
                        this.tax = new Currency(fare.getTax());
                    }
                    
                    public Currency getTicket() {
                        return ticket;
                    }

                    public void setTicket(Currency ticket) {
                        this.ticket = ticket;
                    }

                    public Currency getBookingFee() {
                        return bookingFee;
                    }

                    public void setBookingFee(Currency bookingFee) {
                        this.bookingFee = bookingFee;
                    }

                    public Currency getTax() {
                        return tax;
                    }

                    public void setTax(Currency tax) {
                        this.tax = tax;
                    }

                    public static class Currency {
                        
                        private String currency;
                        private BigDecimal amount;
                        
                        public Currency(String value){
                            String[] splitted = value.split(" ");
                            this.currency = splitted[0];
                            this.amount = new BigDecimal(splitted[1]).setScale(2, RoundingMode.UNNECESSARY);
                        }

                        public String getCurrency() {
                            return currency;
                        }

                        public void setCurrency(String currency) {
                            this.currency = currency;
                        }

                        public BigDecimal getAmount() {
                            return amount;
                        }

                        public void setAmount(BigDecimal amount) {
                            this.amount = amount;
                        }
                        

                    }
                }

            }
    
            public FarePrices getFarePrices() {
                return farePrices;
            }

            public void setFarePrices(FarePrices farePrices) {
                this.farePrices = farePrices;
            }

            public String getOperator() {
                return operator;
            }

            public void setOperator(String operator) {
                this.operator = operator;
            }

            public String getFlightNumber() {
                return flightNumber;
            }

            public void setFlightNumber(String flightNumber) {
                this.flightNumber = flightNumber;
            }

            public String getDepartsFrom() {
                return departsFrom;
            }

            public void setDepartsFrom(String departsFrom) {
                this.departsFrom = departsFrom;
            }

            public String getArrivesAt() {
                return arrivesAt;
            }

            public void setArrivesAt(String arrivesAt) {
                this.arrivesAt = arrivesAt;
            }

            public DateTime getDepartsOn() {
                return departsOn;
            }

            public void setDepartsOn(DateTime departsOn) {
                this.departsOn = departsOn;
            }

            public DateTime getArrivesOn() {
                return arrivesOn;
            }

            public void setArrivesOn(DateTime arrivesOn) {
                this.arrivesOn = arrivesOn;
            }

            public String getFlightTime() {
                return flightTime;
            }

            public void setFlightTime(String flightTime) {
                this.flightTime = flightTime;
            }
    
        }
    }
}
