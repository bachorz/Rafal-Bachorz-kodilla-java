package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double pi = 3.14;
    private double a;


    public Circle(double a){
        this.a = a;
    }


    public String getShapeName() {
        return "circle";
    }

    public double getField(){
        return pi * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.pi, pi) == 0 &&
                Double.compare(circle.a, a) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(pi, a);
    }
}
