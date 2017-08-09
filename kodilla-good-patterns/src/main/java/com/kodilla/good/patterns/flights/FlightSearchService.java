package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchService {
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

    public List<Flight> searchTransfer(Airport start, Airport middle, Airport end) {
        List<Flight> transferFlight = new ArrayList<>();

        Flight searchTransfer1 = flightsList.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(start))
                .filter(flight -> flight.getDestinationAirport().equals(middle))
                .findAny().get();
        Flight searchTransfer2 = flightsList.values().stream()
                .filter(flight -> flight.getDepartureAirport().equals(middle))
                .filter(flight -> flight.getDestinationAirport().equals(end))
                .findAny().get();

        transferFlight.add(searchTransfer1);
        transferFlight.add(searchTransfer2);
        return transferFlight;
    }

    @Override
    public String toString() {
        return "FlightSearchService{" +
                "flightsList=" + flightsList +
                '}';
    }
}
