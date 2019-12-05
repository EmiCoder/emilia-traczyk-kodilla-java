package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.ArrayList;
import java.util.List;

public class ListOfAvaibleFlights implements AvaibleFlight{

    @Override
    public List<Flight> avaibleFlightsList(Client client) {
        List<Flight> list = new ArrayList<>();

        new FlightsList().getFlightList().stream()
                .filter(fly -> {
                    if (fly.getStart().equals(client.getSearchedFlight().getStart())
                            && fly.getEnd().equals(client.getSearchedFlight().getEnd())) {
                        list.add(fly);
                        return true;
                    }
                    return false;
                });




        for (Flight indirectionFly : new FlightsList().getFlightList()) {
            if (client.getSearchedFlight().getEnd().equals(indirectionFly.getEnd())) {
                for (Flight f : new FlightsList().getFlightList()) {
                    if (f.getStart().equals(client.getSearchedFlight().getStart())
                            && f.getEnd().equals(indirectionFly.getStart())) {
                        list.add(new Flight(client.getSearchedFlight().getStart(), f.getEnd()));
                        list.add(new Flight(f.getEnd(), client.getSearchedFlight().getEnd()));
                    }
                }
            }
        }
        return list;
    }


}
