package com.kodilla.stream.world;

import java.math.BigDecimal;

public class TestMain {
    public static void main(String[] args) {
        World world = new World();
        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland", 21);
        Country germany = new Country("Germany", 221);
        europe.addCountry(poland);
        europe.addCountry(germany);
        world.addContinent(europe);

        System.out.println(world.getPeopleQuantity());
    }
}
