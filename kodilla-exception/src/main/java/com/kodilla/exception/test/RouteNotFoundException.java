package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{

    public RouteNotFoundException(String statement) {
        super(statement);
    }

}
