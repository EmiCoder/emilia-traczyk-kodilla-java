package com.kodilla.good.patterns.smallAirlineCompany;

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

        for (Flight fly : new FlightsList().getFlightList()) {
            if (flight.getEnd().equals(fly.getEnd())) {
                for (Flight f : new FlightsList().getFlightList()) {
                    if (f.getStart().equals(flight.getStart()) && f.getEnd().equals(fly.getStart())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
