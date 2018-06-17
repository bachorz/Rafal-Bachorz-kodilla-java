package AviationCompany;

public class Stopover {

    public void stopoverPar(){

        Base base = new Base();

        FlightSearchParametersRetriever flightSearchParametersRetriever = new FlightSearchParametersRetriever();
        FlightSearchParameters flightSearchParameters = flightSearchParametersRetriever.retrieve();

        base.getList().stream()
                .filter(s -> s.getStopover() == flightSearchParameters.getStopover())
                .forEach(System.out::println);
    }
}
