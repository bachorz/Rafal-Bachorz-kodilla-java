package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        World world = new World();

        Country poland = new Country("Poland", new BigDecimal("37000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country usa = new Country("USA", new BigDecimal("500000000"));
        Country china = new Country("China", new BigDecimal("2000000000"));
        Country india = new Country("India", new BigDecimal("1000000000"));
        Country russia = new Country("Russia", new BigDecimal("200000000"));
        Country france = new Country("France", new BigDecimal("65000000"));
        Country mexico = new Country("Mexico", new BigDecimal("100000000"));
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent america = new Continent("America");

        //When
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        europe.addCountries(poland);
        europe.addCountries(germany);
        europe.addCountries(russia);
        europe.addCountries(france);
        asia.addCountries(china);
        asia.addCountries(india);
        america.addCountries(usa);
        america.addCountries(mexico);

        //Then
        BigDecimal expectedSand = new BigDecimal("3982000000");
        Assert.assertEquals(expectedSand, world.getQuantityPeople());
    }
}
