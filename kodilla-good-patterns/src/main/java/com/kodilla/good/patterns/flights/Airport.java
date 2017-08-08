package com.kodilla.good.patterns.flights;

public class Airport {
    private final String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
