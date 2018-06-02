package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class World {

    private final List<Continent> continents = new ArrayList<>();


    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public void sumOfCountries () {

       BigDecimal allPeople = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getQuantityPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
          }
}
