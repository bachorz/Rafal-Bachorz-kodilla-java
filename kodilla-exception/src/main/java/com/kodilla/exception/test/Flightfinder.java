package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flightfinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportCollection = new HashMap<>();
        airportCollection.put("Warsaw", true);
        airportCollection.put("London", true);
        airportCollection.put("Berlin", true);
        airportCollection.put("New York", false);
        airportCollection.put("Tokyo", true);
        airportCollection.put("Roma", false);
        airportCollection.put("Paris", true);

        Boolean departurePlace = airportCollection.get(flight.getDepartureAirport());
        Boolean destination = airportCollection.get(flight.getArrivalAirport());

        if((departurePlace != null) & (destination != null)) {
            if (departurePlace & destination) {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is possible");

            } else if ((departurePlace == true) & (destination == false)) {
                System.out.println("Find a different destination");
            } else if ((departurePlace == false) & (destination == true)) {
                System.out.println("Find a different place of departure");
            }else{
                System.out.println("Find a different destination and find a different place of departure");
            }
        } else {
            throw new RouteNotFoundException("An airport was selected that is not in the base.");
        }
    }
}
