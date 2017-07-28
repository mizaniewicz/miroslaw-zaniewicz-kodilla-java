package com.kodilla.exception.test;

public class RouteNotFoundRunner {
    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Flight warsaw = new Flight("Warsaw");

        try {
            boolean flightCheck = flightsList.findFight(warsaw);
            if (flightCheck == true) {
                System.out.println("Flight is available");
            } else {
                System.out.println("Flight is not available");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Your airport is not on the list.\n" + e);
        }

    }
}
