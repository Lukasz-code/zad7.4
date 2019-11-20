package com.codilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            Integer numersToCheck = numbers.get(i);
            if ((numersToCheck % 2) == 0) {
                evenNumbers.add(numersToCheck);
            }
        }
        return (evenNumbers);
    }
}
