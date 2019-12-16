package com.kodilla.stream.array;

import com.kodilla.steam.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

       //Given
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};

        //When
        OptionalDouble average =  ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(1.05, average.getAsDouble() ,0.001 );
    }
}
