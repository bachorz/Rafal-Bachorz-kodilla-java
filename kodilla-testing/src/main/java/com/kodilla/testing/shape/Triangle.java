package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {

    private double a;
    private double h;
    private double i = 0.5;

    public Triangle(double a, double h){
    this.a = a;
    this.h = h;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField(){
        return i*(a*h);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.h, h) == 0 &&
                Double.compare(triangle.i, i) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, h, i);
    }
}
