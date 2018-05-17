package com.kodilla.testing.shape;

import java.lang.*;
import java.util.Objects;

public class Circle implements Shape{

    String shapeName;
    double field;

    public Circle(String shapeName, double field){
        this.shapeName = shapeName;
        this.field = field;
    }


    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
