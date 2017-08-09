package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {
        Airport warsaw = new Airport("Warsaw");
        Airport london = new Airport("London");
        Airport moscow = new Airport("Moscow");
        Airport paris = new Airport("Paris");
        Airport oslo = new Airport("Oslo");

        FlightSearchService flightSearchService = new FlightSearchService();
        flightSearchService.addFlight(new Flight(1, warsaw, london));
        flightSearchService.addFlight(new Flight(2, warsaw, moscow));
        flightSearchService.addFlight(new Flight(3, warsaw, paris));
        flightSearchService.addFlight(new Flight(4, london, warsaw));
        flightSearchService.addFlight(new Flight(5, london, moscow));
        flightSearchService.addFlight(new Flight(6, london, paris));
        flightSearchService.addFlight(new Flight(7, moscow, oslo));
        flightSearchService.addFlight(new Flight(8, moscow, warsaw));

        System.out.println("Search departure");
        System.out.println(flightSearchService.searchDepartures(warsaw));
        System.out.println("Search arrivals");
        System.out.println(flightSearchService.searchArrivals(warsaw));
        System.out.println("Search transfer flight");
        System.out.println(flightSearchService.searchTransfer(london, moscow, oslo));
    }
}
