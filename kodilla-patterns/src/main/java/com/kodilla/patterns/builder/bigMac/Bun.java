package com.kodilla.patterns.builder.bigMac;

public enum Bun {

    BUN_WITH_SESAME ("Bun with sesame"),
    BUN_WITHOUT_SESAME ("Without Sesame");

    private String bunName ;

    Bun(String bunName) {
        this.bunName = bunName;
    }
}
