package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String SHOPPING = "SHOPPING TASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Long journey", "New York", "Ship");
            case PAINTING:
                return new PaintingTask("Painting with coal", "Black", "Portrait");
            case SHOPPING:
                return new ShoppingTask("Big shopping", "All", 100.0);
            default:
                return null;
        }

    }
}
