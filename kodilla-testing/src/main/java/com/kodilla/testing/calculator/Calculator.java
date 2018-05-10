package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;
    private int sum;
    private int subtractResult;

    public int add(int a, int b) {
        return this.sum = a+b;
    }

    public int getSum() {
        return sum;
    }

    public int subtract(int a, int b) {
        return this.subtractResult = a-b;
    }

    public int getSubtractResult(){
        return subtractResult;
    }
}
