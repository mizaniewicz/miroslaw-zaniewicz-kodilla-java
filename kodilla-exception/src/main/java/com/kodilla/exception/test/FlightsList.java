package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsList {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightList = new HashMap<>();
        flightList.put("Paris", true);
        flightList.put("London", true);
        flightList.put("New York", false);
        flightList.put("Seattle", false);
        if (!flightList.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        return flightList.get(flight.getDepartureAirport());
    }
}
