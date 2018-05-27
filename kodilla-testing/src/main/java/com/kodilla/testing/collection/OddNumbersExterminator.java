package com.kodilla.testing.collection;

import java.util.*;

class OddNumbersExterminator {

    ArrayList<Integer> even = null;

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        even = new ArrayList<>();
        for(Integer number: numbers ){
            if(number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }
}