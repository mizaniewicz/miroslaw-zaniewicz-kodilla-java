package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling("Wrong argument");
        }
        return "Done!";
    }

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String s = secondChallenge.probablyIWillThrowException(1, 1.5).toString();
            System.out.println(s);
        } catch (ExceptionHandling e) {
            System.out.println("Conditions are not fulfilled: x < 2 or x >= 1 or y != 1.5");
        }
    }
}
