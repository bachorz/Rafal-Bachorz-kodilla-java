package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BigmacTestSuite {

    @Test
    public void testBigmac (){

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.BUN_WITHOUT_SESAME)
                .sauce(Sauces.BARBECUE)
                .burgers(3)
                .ingredients(Ingredients.CHEESE)
                .ingredients(Ingredients.MUSHROOMS)
                .ingredients(Ingredients.ONION)
                .ingredients(Ingredients.LETTUCE)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        Sauces howSauce = bigmac.getSauce();
        Bun howBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();


        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(bigmac.getIngredients(), Arrays.asList(Ingredients.CHEESE, Ingredients.MUSHROOMS, Ingredients.ONION, Ingredients.LETTUCE));
        Assert.assertEquals(Sauces.BARBECUE, howSauce);
        Assert.assertEquals(Bun.BUN_WITHOUT_SESAME, howBun);
        Assert.assertEquals(3,howManyBurgers);
    }
}
