package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaVegeDecorator extends AbstractPizzaOrderDecorator {

    public PizzaVegeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(2.50));
    }

    @Override
    public String getIngredients () {
        return super.getIngredients() + " + mushrooms, onions, pepperoni, olives";
    }
}

