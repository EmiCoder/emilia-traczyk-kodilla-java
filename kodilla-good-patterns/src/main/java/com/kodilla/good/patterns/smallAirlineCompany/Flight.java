package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight=(Flight) o;
        return getStart().equals(flight.getStart()) &&
                getEnd().equals(flight.getEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getEnd());
    }
}

