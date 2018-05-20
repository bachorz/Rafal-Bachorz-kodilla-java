package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {

    private String shapeName;
    private double field = 6.20;

    public Triangle(String shapeName, double field){
    this.shapeName = shapeName;
    this.field = field;
    }


    public String getShapeName() {
        return "triangle";
    }

    public double getField(){
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
