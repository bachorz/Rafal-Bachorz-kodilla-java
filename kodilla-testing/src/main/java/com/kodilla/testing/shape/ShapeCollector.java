package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private List<Shape> shapes = new ArrayList<>();


    public ShapeCollector(){
       }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public int getShapesQuantity(){
        return shapes.size();
    }

    public boolean removeFigure(Shape shape){

        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapes.size()) {
            shape = shapes.get(n);
        }
        return shape;
    }

    public void showFigures(){
        for(Shape figure: shapes) {
            System.out.println("The list of figures consists of: " + figure);
        }
    }

}
