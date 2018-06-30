package aviationCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsProcessor {

    private List<Flight> flights;

    public FlightsProcessor(Base base) {
        this.flights = base.getFlights();
    }

    public List<Flight> flightsFrom(String departure) {
        List<Flight> result = flights.stream()
                .filter(s -> s.getDepartureAirport().equals(departure)).collect(Collectors.toList());
        return result;
    }

    public List<Flight> flightsTo(String arrival) {
        List<Flight> result = flights.stream()
                .filter(s -> s.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        return result;
    }

    public List<Flight> directFlight(String departure, String arriva){
        List<Flight> result = flights.stream()
                .filter(s -> s.getDepartureAirport().equals(departure) && s.getArrivalAirport().equals(arriva))
                .collect(Collectors.toList());
        return result;
    }

    public List<String> flightsWithStopover(String departure, String arrival) {

        List<String> ListWithStopove = new ArrayList<>();
        List<Flight> ListFrom = flightsFrom(departure);
        List<Flight> ListTo = flightsTo(arrival);

        for (Flight flightFrom : ListFrom) {

            for (Flight flightTo : ListTo) {
                if(flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())){
                    if (flightFrom.getDepartureDay().equals(flightTo.getDepartureDay())) {
                        ListWithStopove.add("Flight: " + flightFrom.getDepartureAirport() + " - transfer: " + flightFrom.getArrivalAirport() + " - "
                                + flightTo.getArrivalAirport() + ", day: " + flightFrom.getDepartureDay());
                    }
                }
            }
        }
        return ListWithStopove;
    }
}


