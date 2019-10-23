package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchLogic {

    public static void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> mapOfAirports = prepareMapOfAirports();

        boolean doesExistTheWorkingAirport = false;
        for (Map.Entry<String, Boolean> set : mapOfAirports.entrySet()) {
            if (set.getKey().equals(flight.getArrivalAirport())) {
                doesExistTheWorkingAirport = set.getValue();
            }
        }

        if (doesExistTheWorkingAirport) {
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
