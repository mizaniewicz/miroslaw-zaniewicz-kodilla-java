package com.kodilla.good.patterns.flights;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Airport warsaw = new Airport("Warsaw");
        Airport london = new Airport("London");
        Airport moscow = new Airport("Moscow");
        Airport paris = new Airport("Paris");
        Airport oslo = new Airport("Oslo");

        FlightsList flightsList = new FlightsList();
        flightsList.addFlight(new Flight(1, warsaw, london));
        flightsList.addFlight(new Flight(2, warsaw, moscow));
        flightsList.addFlight(new Flight(3, warsaw, paris));
        flightsList.addFlight(new Flight(4, london, warsaw));
        flightsList.addFlight(new Flight(5, london, moscow));
        flightsList.addFlight(new Flight(6, london, paris));
        flightsList.addFlight(new Flight(7, moscow, oslo));
        flightsList.addFlight(new Flight(8, moscow, warsaw));
        for (Map.Entry<Integer, Flight> flight: flightsList.getFlightsList().entrySet()) {
            System.out.println(flight.getValue());
        }
        System.out.println("Search departure");
        System.out.println(flightsList.searchDepartures(warsaw));
        System.out.println("Search arrivals");
        System.out.println(flightsList.searchArrivals(warsaw));
        System.out.println("Search transfer flight");
        System.out.println(flightsList.searchTransfer(london, moscow, oslo));
    }
}
