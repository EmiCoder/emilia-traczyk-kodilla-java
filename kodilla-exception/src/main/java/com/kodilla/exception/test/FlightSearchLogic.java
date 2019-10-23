package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearchLogic {

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> mapOfAirports = prepareMapOfAirports();

        if (mapOfAirports.entrySet().stream()
                                    .filter(entry -> entry.getKey().equals(flight.getArrivalAirport()))
                                    .findAny().filter(x -> x.getValue()).isPresent()) {
            System.out.println("Yes, U can flight to " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport " + flight.getArrivalAirport() + " " +"doesn't work now");
        }
    }

    public static HashMap<String, Boolean> prepareMapOfAirports() {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put("Warsaw", true);
        map.put("Belgrad", false);
        map.put("Paris", true);
        map.put("London", false);
        map.put("NewYork", false);
        return map;
    }
}
