package com.kodilla.stream.world;

import org.junit.Test;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        World world = new World();

        world.addContinent(new Continent(new Country("Poland", "37000000"), "Europe"));
    }
}
