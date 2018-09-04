package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaStrongDecorator extends AbstractPizzaOrderDecorator{

    public PizzaStrongDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(4.50));
    }

    @Override
    public String getIngredients () {
        return super.getIngredients() + " + mushrooms, pepper, pepperoni, onion, capers, salami";
    }
}
