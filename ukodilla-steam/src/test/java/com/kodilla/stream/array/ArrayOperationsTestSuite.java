package com.kodilla.stream.array;

import com.kodilla.steam.array.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        Main main = new Main();

        //When
        int[] number = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};

        //Then
        IntStream intStream = IntStream.of(number);
        OptionalDouble average = intStream.average();


        Assert.assertEquals(1.05, average.getAsDouble(),0.001 );



    }

}
