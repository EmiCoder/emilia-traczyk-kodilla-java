package com.kodilla.good.patterns.smallAirlineCompany;

public class Flight {

    private String start;
    private String end;

    public Flight(String startOfFlight, String endOfFlight) {
        this.start=startOfFlight;
        this.end=endOfFlight;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}

