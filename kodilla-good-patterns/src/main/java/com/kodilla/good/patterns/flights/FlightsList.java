package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FlightsList {
    private final HashMap<Integer, Flight> flightsList = new HashMap<>();

    public HashMap<Integer, Flight> getFlightsList() {
        return flightsList;
    }

    public void addFlight(Flight flight) {
        flightsList.put(flight.getFlightNumber(), flight);
    }

    public void removeFlight(Flight flight) {
        flightsList.remove(flight.getFlightNumber());
    }

    public String searchDepartures(Airport airport) {
        String departures = flightsList.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList())
                .toString();

        return departures;
    }

    public String searchArrivals(Airport airport) {
        String arrivals = flightsList.values().stream()
                .filter(flight -> flight.getDestinationAirport().equals(airport))
                .collect(Collectors.toList())
                .toString();

        return arrivals;
    }

    public String searchTransfer(Airport start, Airport middle, Airport end) {
        String searchTransfer1 = flightsList.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(start))
                .filter(flight -> flight.getDestinationAirport().equals(middle))
                .collect(Collectors.toList())
                .toString();
        String searchTransfer2 = flightsList.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(middle))
                .filter(flight -> flight.getDestinationAirport().equals(end))
                .collect(Collectors.toList())
                .toString();
        String transitFlights = searchTransfer1.concat(searchTransfer2);
        return transitFlights;
    }

    @Override
    public String toString() {
        return "FlightsList{" +
                "flightsList=" + flightsList +
                '}';
    }
}
