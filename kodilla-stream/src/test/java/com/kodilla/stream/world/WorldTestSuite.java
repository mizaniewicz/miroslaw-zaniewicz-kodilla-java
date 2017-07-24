package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("82000000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country korea = new Country("Korea", new BigDecimal("51000000"));
        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(japan);
        asia.addCountry(korea);
        world.addContinent(europe);
        world.addContinent(asia);
        BigDecimal worldPopulation = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(2, world.getContinents().size());
        System.out.println("Number of continents: Test OK");
        Assert.assertEquals(2, europe.getCountries().size());
        System.out.println("Number of countries (Europe): Test OK");
        Assert.assertEquals(2, asia.getCountries().size());
        System.out.println("Number of countries (Asia): Test OK");
        Assert.assertEquals(new BigDecimal("298000000"), worldPopulation);
        System.out.println("World population: Test OK");
    }
}
