package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mizan on 18.07.2017.
 */
public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator empty = new OddNumbersExterminator();
        //When
        ArrayList<Integer> n = new ArrayList<Integer>();
        System.out.println("Testing empty list");
        //Then
        Assert.assertTrue(empty.exterminate(n).size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorMixedList() {
        //Given
        OddNumbersExterminator mixed = new OddNumbersExterminator();
        //When
        ArrayList<Integer> m = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Testing mixed list");
        //Then
        Assert.assertTrue(mixed.exterminate(m).size() == 2);
    }
    @Test
    public void testOddNumbersExterminatorOddNumbersList() {
        //Given
        OddNumbersExterminator odd = new OddNumbersExterminator();
        //When
        ArrayList<Integer> o = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7));
        System.out.println("Testing odd list");
        //Then
        Assert.assertTrue(odd.exterminate(o).size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorEvenNumbersList() {
        //Given
        OddNumbersExterminator even = new OddNumbersExterminator();
        //When
        ArrayList<Integer> e = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));
        System.out.println("Testing even list");
        //Then
        Assert.assertTrue(even.exterminate(e).size() == 4);
    }
}
