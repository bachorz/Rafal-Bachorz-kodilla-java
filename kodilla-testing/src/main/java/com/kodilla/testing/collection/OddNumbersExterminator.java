package com.kodilla.testing.collection;


import java.util.*;

class OddNumbersExterminator {



    public ArrayList exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = null;
        even = new ArrayList<Integer>();

        for(Integer number: numbers ){
            if(number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }
}