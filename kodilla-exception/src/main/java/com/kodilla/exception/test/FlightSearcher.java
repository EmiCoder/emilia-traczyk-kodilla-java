package com.kodilla.exception.test;

public class FlightSearcher {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Paris", "Tokio");
        Flight flight2 = new Flight("Paris", "Warsaw");
        Flight flight3 = new Flight("Paris", "London");
        checkTheFlight(flight1);
        checkTheFlight(flight2);
        checkTheFlight(flight3);
    }

    public static void checkTheFlight (Flight flight) {
        try {
            FlightSearchLogic.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Catched RouteNotFoundException");
            System.out.println("Message from RouteNotFoundException is: "+ e.getMessage());
        } finally {
            System.out.println("Done :)" + "\n");
        }
    }
}
