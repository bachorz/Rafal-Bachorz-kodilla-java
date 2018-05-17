package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> listA = new ArrayList<Integer>();

        ArrayList<Integer> resultA = oddNumbersExterminator.exterminate(listA) ;
        //Then
        Assert.assertEquals(listA, resultA);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> listOfNumbers= new ArrayList<Integer>();
        listOfNumbers.add(1);
        listOfNumbers.add(4);
        listOfNumbers.add(3);
        listOfNumbers.add(5);
        listOfNumbers.add(6);
        listOfNumbers.add(15);
        listOfNumbers.add(18);

        ArrayList<Integer> correctList = new ArrayList<>();
        correctList.add(4);
        correctList.add(6);
        correctList.add(18);

        ArrayList<Integer> resultB = oddNumbersExterminator.exterminate(listOfNumbers);
        System.out.println("The result of the extermination test: " + resultB);
        //Then
        Assert.assertEquals(correctList, resultB);
    }

}
