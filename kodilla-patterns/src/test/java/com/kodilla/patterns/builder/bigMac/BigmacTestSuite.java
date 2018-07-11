package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BigmacTestSuite {

    @Test
    public void testBigmac (){

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Options.BUN_WITH_SESAME)
                .sauce(Options.SAUCE_BARBECUE)
                .burgers(3)
                .ingredients(Options.INGREDIENTS_CHEESE)
                .ingredients(Options.INGREDIENTS_MUSHROOMS)
                .ingredients(Options.INGREDIENTS_ONION)
                .ingredients(Options.INGREDIENTS_LETTUCE)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String howSauce = bigmac.getSauce();
        String howBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(bigmac.getIngredients(), Arrays.asList("Cheese", "Mushrooms", "Onion", "Lettuce"));
        Assert.assertEquals("Barbecue", howSauce);
        Assert.assertEquals("Bun with sesame", howBun);
        Assert.assertEquals(3,howManyBurgers);
    }
}
