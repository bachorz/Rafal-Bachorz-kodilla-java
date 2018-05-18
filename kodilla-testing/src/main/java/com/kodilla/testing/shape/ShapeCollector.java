package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeCollector(){
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
            return result;
    }

    public Shape getFigure(int n) {
        shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public void showFigures(){
        for(Shape figure: shapes)
        System.out.println(figure);
    }


}
