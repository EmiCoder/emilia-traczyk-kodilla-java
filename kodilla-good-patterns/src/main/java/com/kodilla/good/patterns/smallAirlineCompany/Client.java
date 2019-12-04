package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client=(Client) o;
        return getName().equals(client.getName()) &&
                getSearchedFlight().equals(client.getSearchedFlight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSearchedFlight());
    }
}
