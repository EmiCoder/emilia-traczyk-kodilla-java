package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {

    List<Flight> flightList;

    public FlightsList() {
        this.flightList = prepareFlightList();
    }

    private List<Flight> prepareFlightList() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Wrocław", "Warszawa"));
        flightList.add(new Flight("Poznan", "Wroclaw"));
        flightList.add(new Flight("Krakow", "Gdansk"));
        flightList.add(new Flight("Warszawa", "Gdansk"));
        flightList.add(new Flight("Katowice", "Warszawa"));
        flightList.add(new Flight("Warszawa", "Berlin"));
        flightList.add(new Flight("Sucha Beskidzka", "Warszawa"));
        flightList.add(new Flight("Radom", "Krakow"));
        flightList.add(new Flight("Krakow", "Rzym"));
        return flightList;
    }

    public void addFlight(Flight fligh) {
        flightList.add(fligh);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
