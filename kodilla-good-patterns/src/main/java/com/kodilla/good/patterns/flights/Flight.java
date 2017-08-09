package com.kodilla.good.patterns.flights;

public class Flight {
    private final int flightNumber;
    private final Airport departureAirport;
    private final Airport destinationAirport;

    public Flight(int flightNumber, Airport departureAirport, Airport destinationAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public String toString() {
        return departureAirport + " to " + destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != flight.flightNumber) return false;
        if (!departureAirport.equals(flight.departureAirport)) return false;
        return destinationAirport.equals(flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        int result = flightNumber;
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }
}
