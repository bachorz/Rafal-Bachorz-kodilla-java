package aviationCompany;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightsProcessor {

    Base base = new Base();
    FlightSearchParametersRetriever flightSearchParametersRetriever = new FlightSearchParametersRetriever();
    FlightSearchParameters flightSearchParameters = flightSearchParametersRetriever.retrieve();

    public List<Flight> flightsFrom(){
        List<Flight> result =  base.getList().stream()
                .filter(s -> s.getDepartureAirport().equals(flightSearchParameters.getDeparture()))
                .collect(Collectors.toList());
        return result;
    }

    public List<Flight> flightsTo(){
        List<Flight> result =  base.getList().stream()
                .filter(s -> s.getArrivalAirport().equals(flightSearchParameters.getArrival()))
                .collect(Collectors.toList());
        return result;
    }
    public List<Flight> flightsWithStopover(){
        List<Flight> result = base.getList().stream()
                .filter(s -> s.getStopover().equals(flightSearchParameters.getStopover()))
                .collect(Collectors.toList());
        return result;
    }

    public List<Flight> flightsWithAllParameters(){
        List<Flight> result = base.getList().stream()
                .filter(s -> s.getDepartureAirport().equals(flightSearchParameters.getDeparture()))
                .filter(s -> s.getArrivalAirport().equals(flightSearchParameters.getArrival()))
                .filter(s -> s.getStopover().equals(flightSearchParameters.getStopover()))
                .collect(Collectors.toList());
        return result;
    }
    public Map<String, List<Flight>> collectionOfResults(){

        Map<String, List<Flight>> result = new HashMap<>();
        result.put("Flights from",flightsFrom());
        result.put("Flights to", flightsTo());
        result.put("Flights with Stopover", flightsWithStopover());
        result.put("Flights with all parameters", flightsWithAllParameters());

        return result;
    }
}
