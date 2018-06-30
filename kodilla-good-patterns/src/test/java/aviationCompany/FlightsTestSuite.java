package aviationCompany;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlightsTestSuite {

    @Before
    public void beforeEveryTest() {

        System.out.println("\nThe test has been finished");
    }

    @Test
    public void testFlightsFrom () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);

        //When
        List<Flight> result = flightsProcessor.flightsFrom(flightSearchParameters.getDeparture());

        System.out.println("ALL FLIGHTS FROM THE SELECTED AIRPORT");
        result.stream()
                .forEach(System.out::println);

        //Then
        assertEquals(6, result.size());
    }

    @Test
    public void testFlightsTo () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);

        //When
        List<Flight> result = flightsProcessor.flightsTo(flightSearchParameters.getArrival());

        System.out.println("ALL FLIGHTS TO THE SELECTED AIRPORT");
        result.stream()
                .forEach(System.out::println);

        //Then
        assertEquals(3, result.size());
    }

    @Test
    public void testDirectFlight () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);

        //When
        List<Flight> result = flightsProcessor.directFlight(flightSearchParameters.getDeparture(), flightSearchParameters.getArrival());

        System.out.println("ALL DIRECT FLIGHTS");
        result.stream()
                .forEach(System.out::println);

        //Then
        assertEquals(1, result.size());
    }

    @Test
    public void testFlightsWithStopover () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);

        //When
        List<String> result = flightsProcessor.flightsWithStopover(flightSearchParameters.getDeparture(), flightSearchParameters.getArrival());

        System.out.println("ALL FLIGHTS WITH STOPOVER");
        result.stream()
                .forEach(System.out::println);

        //Then
        assertEquals(2, result.size());
    }
}

