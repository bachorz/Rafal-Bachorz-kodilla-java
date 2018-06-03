package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite implements ArrayOperations{

    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = i +1;
        }
        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.5, result, 0.0001);
    }
}
