package com.kodilla.patterns2.observer.homework;

public class Task{

    private double moduleNumber;
    private String message;

    public Task(double moduleNumber, String message) {
        this.moduleNumber = moduleNumber;
        this.message = message;
    }

    public double getModuleNumber() {
        return moduleNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Task{" + "moduleNumber=" + moduleNumber + ", message='" + message + '\'' + '}';
    }
}
