package com.kodilla.steam.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static OptionalDouble getAverage(int[] numbers) {

         IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(x -> System.out.println("numbers in Array: " + x));

        OptionalDouble averageNumber = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        System.out.println("Average number from array: " + averageNumber);
        return averageNumber;
    }
}
