package AviationCompany;

public class Arrival {

    public void arrivalPar(){

        Base base = new Base();

        FlightSearchParametersRetriever flightSearchParametersRetriever = new FlightSearchParametersRetriever();
        FlightSearchParameters flightSearchParameters = flightSearchParametersRetriever.retrieve();

        base.getList().stream()
                .filter(s -> s.getArrivalAirport() == flightSearchParameters.getArrival())
                .forEach(System.out::println);
    }
}
