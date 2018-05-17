package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    int numberShape;

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public void getFigure(int numberShape){
        shapes.get(numberShape);
    }

    public void showFigures(){
        for(Shape figure: shapes)
        System.out.println(figure);
    }


}
