package AviationCompany;

import java.util.ArrayList;
import java.util.List;

public final class Base {

    final List<Flight> listOfflights = new ArrayList<>();

    public Base() {

        listOfflights.add(new Flight("Gdansk", "Wroclaw", "Warszawa", "Monday"));
        listOfflights.add(new Flight("Wroclaw", "Wroclaw", "non-stop flight", "Monday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw", "Krakow", "Tuesday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw", "non-stop flight", "Wednesday"));
        listOfflights.add(new Flight("Wroclaw", "Gdansk", "Krakow", "Wednesday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw", "Krakow", "Thursday"));
        listOfflights.add(new Flight("Gdansk", "Wroclaw", "Poznan", "Friday"));
        listOfflights.add(new Flight("Warszawa", "Wroclaw", "non-stop flight", "Saturday"));
        listOfflights.add(new Flight("Gdansk", "Warszawa", "non-stop flight", "Sunday"));
    }

    public List<Flight> getList() {
        return new ArrayList<>(listOfflights);
    }
}

