package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) {
        Map<String, Boolean> findFlightMap = new HashMap<>();

        findFlightMap.put("Port lotniczy Wrocław-Strachowice", true);
        findFlightMap.put("Lotnisko Chopina w Warszawie", true);
        findFlightMap.put("Centralny port Komunikacyjny", true);

        FlightSearcher flightSearcher = new FlightSearcher();

        Flight flightStrachowiceToChopinaWarsaw = new Flight("Port lotniczy Wrocław-Strachowice", "Lotnisko Chopina w Warszawie");
        Flight flightWarsawToNorway = new Flight("Port lotniczy Wrocław - Strachowice", "Norway Airport");

        try {

            flightSearcher.findFlight(flightStrachowiceToChopinaWarsaw, findFlightMap);

        } catch (RouteNotFoundException e) {

            System.out.println("There is no this airport in our offer");

        }

        try {

            flightSearcher.findFlight(flightWarsawToNorway, findFlightMap);
        } catch (RouteNotFoundException e) {

            System.out.println("There is no this airport in our offer");

        }

    }
}
