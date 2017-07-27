package com.kodilla.exception.challenge;

public class FirstChallenge {
    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation, division by zero.\n" + e);
        } finally {
            System.out.println("We are servants rather than masters in mathematics.");
        }
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        firstChallenge.divide(3, 0);
    }
}
