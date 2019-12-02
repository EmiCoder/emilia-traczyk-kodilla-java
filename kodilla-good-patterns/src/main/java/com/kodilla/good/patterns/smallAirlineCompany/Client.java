package com.kodilla.good.patterns.smallAirlineCompany;

public class Client {

    private String name;
    private Flight searchedFlight;

    public Client(String name, Flight searchedFlight) {
        this.name=name;
        this.searchedFlight = searchedFlight;
    }

    public String getName() {
        return name;
    }

    public Flight getSearchedFlight() {
        return searchedFlight;
    }
}
