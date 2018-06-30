package aviationCompany;

import java.util.ArrayList;
import java.util.List;

public final class Base {

    final List<Flight> listOfflights = new ArrayList<>();

    public Base() {

        listOfflights.add(new Flight("Gdansk", "Wroclaw", "Monday"));
        listOfflights.add(new Flight("Wroclaw", "Warszawa","Monday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw",  "Tuesday"));
        listOfflights.add(new Flight("Gdansk", "Krakow",  "Wednesday"));
        listOfflights.add(new Flight("Krakow", "Warszawa",  "Wednesday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw",  "Thursday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw",  "Friday"));
        listOfflights.add(new Flight("Warszawa", "Wroclaw",  "Saturday"));
        listOfflights.add(new Flight("Gdansk", "Warszawa",  "Sunday"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(listOfflights);
    }
}

