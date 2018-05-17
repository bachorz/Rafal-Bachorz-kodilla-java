package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private Shape shape;
    int numberShape;

    private ArrayList<Shape> shapes = new ArrayList<>();

   public ShapeCollector(String getShapeName, double getField){
        this.shape = shape;
   }

    public void addFigure(Shape shape){
        ShapeCollector collector = new ShapeCollector();
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }

    public void getFigure(int numberShape){
        shapes.get(numberShape);
    }

    public void showFigures(){
        Shape collector = new Shape();
        shapes.show(shapes);
        
        //System.out.println(shape.show());
    }


}
