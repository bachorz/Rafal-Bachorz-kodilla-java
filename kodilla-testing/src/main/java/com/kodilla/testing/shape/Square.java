package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    String shapeName;
    double field;

    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public void getShapeName() {
        System.out.println("square");
    }

    public double getField() {
        return 5.40;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shapeName, field);
    }
}
