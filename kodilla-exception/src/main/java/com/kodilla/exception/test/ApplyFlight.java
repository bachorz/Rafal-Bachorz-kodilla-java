package com.kodilla.exception.test;

public class ApplyFlight {

    public static void main(String[] args) {

        Flightfinder flightfinder = new Flightfinder();

        try {
            Flight flight = new Flight("New York", "Bydgoszcz");
            flightfinder.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Thank you for using our search engine");
        }
    }
}

