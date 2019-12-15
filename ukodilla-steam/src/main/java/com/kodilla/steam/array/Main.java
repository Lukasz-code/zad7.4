package com.kodilla.steam.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main implements ArrayOperations {

    public void getAverage(int[] numbers) {
        int[] number = new int[20];

        IntStream.range(0, number.length + 1)
                .forEach(x -> System.out.println("next number from array: " + x));

        OptionalDouble suma = IntStream.range(0, number.length + 1)
                .average();
        System.out.println("Average number from array: " + suma);


    }
}

