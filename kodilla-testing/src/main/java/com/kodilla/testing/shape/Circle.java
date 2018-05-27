package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double a;

    public Circle(double a){
        this.a = a;
    }


    public String getShapeName() {
        return "circle";
    }

    public double getField(){
        return Math.PI * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.a, a) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a);
    }
}
