package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SercherTheAvaibleFlight implements ClientRequest {


    @Override
    public boolean avaibleFlight(Client client) {

        if (new FlightsList().getFlightList().stream()
                .anyMatch(flight -> client.getSearchedFlight().getStart().equals(flight.getStart()) &&
                                    client.getSearchedFlight().getEnd().equals(flight.getEnd()))) {
            return true;
        } return avaibleIndirectFlight(client.getSearchedFlight());

    }

    private boolean avaibleIndirectFlight(Flight flight) {

        List<Flight> flights = new FlightsList().getFlightList();

        List<Flight> theSameStart = flights.stream()
                                            .filter(f -> flight.getStart().equals(f.getStart()))
                                            .collect(Collectors.toList());

        List<Flight> theSameEnd = flights.stream()
                                            .filter(f -> flight.getEnd().equals(f.getEnd()))
                                            .collect(Collectors.toList());

        Optional<Flight> connection = theSameStart.stream()
                                            .filter(start -> theSameEnd.stream().anyMatch(end -> end.getStart().equals(start.getEnd())))
                                                                        .findFirst();

        if (connection.isPresent()) {
            return true;
        } return false;
    }
}
