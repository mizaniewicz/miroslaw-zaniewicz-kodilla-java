package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

//    public Set<> getPeopleQuantity() {
//        return continents.stream()
//                .map(continent -> continent.getCountries())
//                .collect(Collectors.toSet());
//    }
}
