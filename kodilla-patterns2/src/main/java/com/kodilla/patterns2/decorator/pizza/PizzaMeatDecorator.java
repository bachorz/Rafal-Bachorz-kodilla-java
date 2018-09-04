package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMeatDecorator extends AbstractPizzaOrderDecorator{

    public PizzaMeatDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getIngredients () {
        return super.getIngredients() + " + beef, salami, portobello mushrooms, red onions";
    }
}
