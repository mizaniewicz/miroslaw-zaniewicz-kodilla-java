package com.kodilla.exception.challenge;

public class FirstChallenge {
    private double result;

    public double divide(double a, double b) {
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation, division by zero.\n" + e);
        } finally {
            System.out.println("We are servants rather than masters in mathematics.");
        }
        return result;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}
