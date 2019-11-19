package com.codilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

       ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer numbersToCheck = numbers.get(i);
            if (numbersToCheck % 2 == 0) {
                evenNumbers.add(numbersToCheck);
            }
        }
        return (evenNumbers);
    }
}
