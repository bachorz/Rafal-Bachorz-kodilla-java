package com.kodilla.testing.shape;

import java.lang.*;
import java.util.Objects;

class Triangle implements Shape {

    String shapeName;
    double field;

    public Triangle(String shapeName, double field){
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
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
