package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmac (){

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun with sesame")
                .sauce("Standard")
                .burgers(3)
                .ingredients("Cheese")
                .ingredients("Cucumber")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String howSauce = bigmac.getSauce();
        String howBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("Standard", howSauce);
        Assert.assertEquals("Bun with sesame", howBun);
        Assert.assertEquals(3,howManyBurgers);
    }
}
