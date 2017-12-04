package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearcher {
    public void findFlight(Flight flight, Map<String, Boolean> findFlight) throws RouteNotFoundException {


        if (findFlight.get(flight.getArrivalAirport()) != null) {
            if (findFlight.get(flight.getArrivalAirport())) {
                System.out.println("Your arrival airport is: " + flight.getArrivalAirport());
            }
        }  else {
            throw new RouteNotFoundException("Aiport not found");
        }
    }
}
