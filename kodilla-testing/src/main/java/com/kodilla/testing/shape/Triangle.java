package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {

    String shapeName;
    double field;

    public Triangle(String shapeName, double field){
    this.shapeName = shapeName;
    this.field = field;
    }


    public void getShapeName() {
        System.out.println("triangle");
    }

    public double getField(){
        return 2.30;
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
