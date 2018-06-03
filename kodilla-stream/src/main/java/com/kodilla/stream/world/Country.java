package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {


    private final String countryName;
    private final BigDecimal quantityPeople;


    public Country(String countryName, BigDecimal quantityPeople) {
        this.countryName = countryName;
        this.quantityPeople = quantityPeople;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getQuantityPeople() {
        return quantityPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName) && Objects.equals(quantityPeople, country.quantityPeople);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName, quantityPeople);
    }
}
