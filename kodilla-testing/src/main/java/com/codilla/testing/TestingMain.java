package com.codilla.testing;

import com.codilla.testing.calculator.Calculator;
import com.codilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int result2 = calculator.add(20, 10);

        if (result2 == 30) {
            System.out.println("dodawanie działa");
            System.out.println("wynik dodawania = " + result2);
        } else {
            System.out.println("dodawanie nie działa");
        }
        int result3 = calculator.subtract(30, 20);

        if (result3 == 10) {
            System.out.println("odejmowanie działa");
            System.out.println("wynik odejmowania = " + result3);
        } else {
            System.out.println("odejmowanie nie działa");
        }
    }
}