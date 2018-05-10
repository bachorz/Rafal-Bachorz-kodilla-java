package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

        public static void main(String[] args){
            Calculator calculator = new Calculator();

            int finishedAdd = calculator.add(5, 6);
            int addTest = calculator.getSum();
            if (finishedAdd == addTest) {
                System.out.println("Test add OK");
            } else {
                System.out.println("Add error!");
            }
            int subtractResult = calculator.subtract(7,3);
            int subtractTest = calculator.getSubtractResult();

            if (subtractResult == subtractTest) {
                System.out.println("Test subtract OK");
            } else {
                System.out.println("Subtract error!");
            }

        }
    }
