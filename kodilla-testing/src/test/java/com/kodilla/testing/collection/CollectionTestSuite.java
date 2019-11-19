package com.kodilla.testing.collection;

import com.codilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
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
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        //When
        ArrayList<Integer> evenNumbers = null;
        ArrayList<Integer> oddNumbers = exterminator.exterminate(evenNumbers);
        //Then
        System.out.println(oddNumbers);
    }
}
