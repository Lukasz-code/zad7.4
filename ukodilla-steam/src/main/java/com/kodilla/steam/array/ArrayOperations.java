package com.kodilla.steam.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

         IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(x -> System.out.println("numbers in Array: " + x));

        double averageNumber = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
        System.out.println("Average number from array: " + averageNumber);
        return averageNumber;
    }
}
