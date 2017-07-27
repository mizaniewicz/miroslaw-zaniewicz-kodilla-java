package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsList {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Paris", true);
        flightList.put("London", true);
        flightList.put("New York", false);
        flightList.put("Seattle", false);
        if (flightList.get(flight.getDepartureAirport()) == null) {
            throw new RouteNotFoundException();
        } else if (flightList.get(flight.getDepartureAirport())) {
            System.out.println("Flight is available");
        } else if (!flightList.get(flight.getDepartureAirport())){
            System.out.println("Flight is not available");
        }
    }
}
