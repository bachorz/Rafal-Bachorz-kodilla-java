package com.kodilla.stream.world;

import java.math.BigDecimal;

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

}
