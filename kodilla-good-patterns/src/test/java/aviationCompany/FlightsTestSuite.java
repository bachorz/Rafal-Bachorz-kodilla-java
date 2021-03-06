package aviationCompany;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
        List<Flight> resultA = new ArrayList<>();
        resultA.add(new Flight("Gdansk", "Wroclaw", "Monday"));
        resultA.add(new Flight("Gdansk", "Wroclaw",  "Tuesday"));
        resultA.add(new Flight("Gdansk", "Krakow",  "Wednesday"));
        resultA.add(new Flight("Gdansk", "Wroclaw",  "Thursday"));
        resultA.add(new Flight("Gdansk", "Wroclaw",  "Friday"));
        resultA.add(new Flight("Gdansk", "Warszawa",  "Sunday"));

        //When
        List<Flight> resultB = flightsProcessor.flightsFrom(flightSearchParameters.getDeparture());

        System.out.println("ALL FLIGHTS FROM THE SELECTED AIRPORT");
        resultB.stream()
                .forEach(System.out::println);

        //Then
        Assert.assertEquals(resultA, resultB);
    }

    @Test
    public void testFlightsTo () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);
        List<Flight> resultA = new ArrayList<>();
        resultA.add(new Flight("Wroclaw", "Warszawa","Monday"));
        resultA.add(new Flight("Krakow", "Warszawa",  "Wednesday"));
        resultA.add(new Flight("Gdansk", "Warszawa",  "Sunday"));

        //When
        List<Flight> resultB = flightsProcessor.flightsTo(flightSearchParameters.getArrival());

        System.out.println("ALL FLIGHTS TO THE SELECTED AIRPORT");
        resultB.forEach(System.out::println);

        //Then
        Assert.assertEquals(resultA, resultB);
    }

    @Test
    public void testDirectFlight () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);
        List<Flight> resultA = new ArrayList<>();
        resultA.add(new Flight("Gdansk", "Warszawa",  "Sunday"));

        //When
        List<Flight> resultB = flightsProcessor.directFlight(flightSearchParameters.getDeparture(), flightSearchParameters.getArrival());

        System.out.println("ALL DIRECT FLIGHTS");
        resultB.forEach(System.out::println);

        //Then
        Assert.assertEquals(resultA, resultB);
    }

    @Test
    public void testFlightsWithStopover () {

        //Given
        Base base = new Base();
        FlightSearchParameters flightSearchParameters = new FlightSearchParameters("Gdansk", "Warszawa");
        FlightsProcessor flightsProcessor = new FlightsProcessor(base);
        List<List<Flight>> resultA = new ArrayList<>();
        List<Flight> flightsA = new ArrayList<>();
        List<Flight> flightsB = new ArrayList<>();
        flightsA.add(new Flight("Gdansk", "Wroclaw", "Monday"));
        flightsA.add(new Flight("Wroclaw", "Warszawa", "Monday"));
        flightsB.add(new Flight("Gdansk", "Krakow", "Wednesday"));
        flightsB.add(new Flight("Krakow", "Warszawa", "Wednesday"));

        resultA.add(flightsA);
        resultA.add(flightsB);

        //When
        List<List<Flight>> resultB = flightsProcessor.flightsWithStopover(flightSearchParameters.getDeparture(), flightSearchParameters.getArrival());

        System.out.println("ALL FLIGHTS WITH STOPOVER");
        resultB.forEach(System.out::println);

        //Then
        assertEquals(resultA, resultB);
    }
}

