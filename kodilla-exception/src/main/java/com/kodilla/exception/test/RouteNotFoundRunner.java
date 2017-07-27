package com.kodilla.exception.test;

public class RouteNotFoundRunner {
    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Flight london = new Flight("Warsaw");

        try {
            flightsList.findFilght(london);
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport is not on the list.\n" + e);
        }

    }
}
