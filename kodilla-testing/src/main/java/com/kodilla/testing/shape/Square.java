package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private String shapeName;
    private double a;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return a*a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, a);
    }
}
