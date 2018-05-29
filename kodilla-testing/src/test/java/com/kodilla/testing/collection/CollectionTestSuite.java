package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Integer> resultA = oddNumbersExterminator.exterminate(listA) ;
        //Then
        Assert.assertEquals(listA, resultA);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> listOfNumbers= new ArrayList<>();
        listOfNumbers.addAll(Arrays.asList(1, 4, 3, 5, 6, 15, 18));
        ArrayList<Integer> correctList = new ArrayList<>();
        correctList.addAll(Arrays.asList(4, 6, 18));

        //When
        List<Integer> resultB = oddNumbersExterminator.exterminate(listOfNumbers);
        System.out.println("The result of the extermination test: " + resultB);

        //Then
        Assert.assertEquals(correctList, resultB);
    }
}
