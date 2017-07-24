package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAvarage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println("Numbers average: " + average);
        return average;
    }
}
