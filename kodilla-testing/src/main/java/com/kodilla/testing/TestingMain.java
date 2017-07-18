package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

/**
 * Created by mizan on 18.07.2017.
 */
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //testing calculator
        Calculator calculator = new Calculator();

        int addResult = calculator.add(2, 3);

        if (addResult == (2 + 3)) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding ERROR!");
        }
        int subtractResult = calculator.sutract(5, 2);
        if (subtractResult == (5 - 2)) {
            System.out.println("Subtracting test OK");
        } else {
            System.out.println("Subtracting ERROR!");
        }
    }
}
