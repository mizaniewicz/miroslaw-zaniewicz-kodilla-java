package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (ArgumentNotFoundException e) {
            System.out.println("Conditions are not fulfilled: x < 2 or x >= 1 or y != 1.5\n" + e);
        }
    }
}
