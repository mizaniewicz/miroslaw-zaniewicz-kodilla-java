package com.kodilla.testing.collection;

import java.util.ArrayList;

/**
 * Created by mizan on 18.07.2017.
 */
public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number: numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
