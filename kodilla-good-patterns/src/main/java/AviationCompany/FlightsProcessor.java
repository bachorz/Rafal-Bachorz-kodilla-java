package aviationCompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsProcessor {

    private List<Flight> flights;

    public FlightsProcessor(Base base) {
        this.flights = base.getFlights();
    }

    public List<Flight> flightsFrom(String departure) {
        return flights.stream()
                .filter(s -> s.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsTo(String arrival) {
        return flights.stream()
                .filter(s -> s.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> directFlight(String departure, String arrival){
        return flights.stream()
                .filter(s -> s.getDepartureAirport().equals(departure) && s.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> flightsWithStopover(String departure, String arrival) {

        List<List<Flight>> listWithStopover = new ArrayList<>();
        List<Flight> listFrom = flightsFrom(departure);
        List<Flight> listTo = flightsTo(arrival);

        for (Flight flightFrom : listFrom) {

            for (Flight flightTo : listTo) {
                if(flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport()) &&
                        flightFrom.getDepartureDay().equals(flightTo.getDepartureDay())) {
                   listWithStopover.add(Arrays.asList(flightFrom, flightTo));

                }
            }
        }
        return listWithStopover;
    }
}


