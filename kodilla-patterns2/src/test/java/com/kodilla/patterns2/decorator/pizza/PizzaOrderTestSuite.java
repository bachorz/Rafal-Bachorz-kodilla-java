package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaMeatDecorator (){

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMeatDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getCost();
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals(new BigDecimal(18), price);
        assertEquals("Order pizza - dough and tomato sauce with cheese " +
                "+ beef, salami, portobello mushrooms, red onions", ingredients);
    }

    @Test
    public void testPizzaStrongDecorator () {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaStrongDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getCost();
        String ingredients = pizzaOrder.getIngredients();


        //Then
        assertEquals(new BigDecimal(19.50), price);
        assertEquals("Order pizza - dough and tomato sauce with cheese " +
                "+ mushrooms, pepper, pepperoni, onion, capers, salami", ingredients);
    }

    @Test
    public void testPizzaVegeAndMeatDecorator () {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaVegeDecorator(pizzaOrder);
        pizzaOrder = new PizzaMeatDecorator(pizzaOrder);

        //When
        BigDecimal price = pizzaOrder.getCost();
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals(new BigDecimal(20.50), price);
        assertEquals("Order pizza - dough and tomato sauce with cheese " +
                "+ mushrooms, onions, pepperoni, olives + beef, salami, portobello mushrooms, red onions", ingredients);
    }
}
