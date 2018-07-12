package com.kodilla.patterns.builder.bigMac;

public enum Sauces {

    STANDARD ("Standard"),
    BARBECUE ("Barbecue"),
    THOUSAND_ISLANDS ("1000 islands");

    private String sauceName ;

    Sauces(String sauceName) {
        this.sauceName = sauceName;
    }
}
