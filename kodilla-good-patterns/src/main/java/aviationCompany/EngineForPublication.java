package aviationCompany;

public class EngineForPublication {

    FlightsProcessor flightsProcessor = new FlightsProcessor();

    public void publication (){

        flightsProcessor.collectionOfResults().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .forEach(System.out::println);
    }
}
