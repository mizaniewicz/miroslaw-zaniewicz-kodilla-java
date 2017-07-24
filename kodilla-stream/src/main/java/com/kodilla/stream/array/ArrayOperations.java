package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAvarage(int[] numbers) {
//        List list = IntStream.range(0, numbers.length)
//                .mapToObj(n -> numbers[n])
//                .collect(Collectors.toList());

        IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        double avarage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println("Numbers average: " + avarage);
        return avarage;
    }
}
