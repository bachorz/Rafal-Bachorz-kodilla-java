package com.kodilla.patterns.builder.bigMac;

public enum Ingredients {

    ONION ("Onion"),
    MUSHROOMS("Mushrooms"),
    PEPPER ("Pepper"),
    SALAMI ("Salami"),
    CUCUMBER ("Cucumber"),
    CHEESE ("Cheese"),
    LETTUCE ("Lettuce"),
    SHRIMP ("Shrimp");

    private String ingredientName ;

    Ingredients(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}

