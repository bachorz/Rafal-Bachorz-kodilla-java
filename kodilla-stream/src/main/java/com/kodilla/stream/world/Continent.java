package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final Country country;
    private final String continentName;
    private final List<Country> countries = new ArrayList<>();

    public Continent(Country country, String continentName) {
        this.country = country;
        this.continentName = continentName;
    }

    public Country getCountry() {
        return country;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountries(Country country) {
        countries.add(country);
    }


}






