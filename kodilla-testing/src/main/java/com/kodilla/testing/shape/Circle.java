package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    String shapeName;
    double field;

    public Circle(String shapeName, double field){
        this.shapeName = shapeName;
        this.field = field;
    }


    public void getShapeName() {
        System.out.println("circle");
    }


    public double getField(){
        return 3.66;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
