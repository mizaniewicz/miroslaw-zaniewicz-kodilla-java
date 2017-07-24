package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Give
        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 12;
        numbers[2] = 15;
        numbers[3] = 18;
        numbers[4] = 122;
        numbers[5] = 22;
        numbers[6] = 23;
        numbers[7] = 37;
        numbers[8] = 45;
        numbers[9] = 61;
        numbers[10] = 116;
        numbers[11] = 126;
        numbers[12] = 612;
        numbers[13] = 81;
        numbers[14] = 86;
        numbers[15] = 583;
        numbers[16] = 826;
        numbers[17] = 963;
        numbers[18] = 831;
        numbers[19] = 550;
        //When
        double avarage  = ArrayOperations.getAvarage(numbers);
        //Then
        Assert.assertEquals(256.7, avarage, 0.001);
    }
}
