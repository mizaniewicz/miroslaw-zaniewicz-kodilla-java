package com.kodilla.stream.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAvarage(int[] numbers) {
        List list = IntStream.range(0, numbers.length)
                .mapToObj(n -> numbers[n])
                .collect(Collectors.toList());

        double avarage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println("Numbers list: " + list + " Numbers average: " + avarage);
        return avarage;
    }
}
