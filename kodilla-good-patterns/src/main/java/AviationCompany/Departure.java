package AviationCompany;

public class Departure {

    public void departurePar(){

        Base base = new Base();

        FlightSearchParametersRetriever flightSearchParametersRetriever = new FlightSearchParametersRetriever();
        FlightSearchParameters flightSearchParameters = flightSearchParametersRetriever.retrieve();

        base.getList().stream()
                .filter(s -> s.getDepartureAirport() == flightSearchParameters.getDeparture())
                .forEach(System.out::println);
    }
}
