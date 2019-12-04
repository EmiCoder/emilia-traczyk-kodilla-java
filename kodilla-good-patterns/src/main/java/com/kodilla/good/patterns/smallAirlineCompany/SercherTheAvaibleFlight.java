package com.kodilla.good.patterns.smallAirlineCompany;

public class SercherTheAvaibleFlight implements ClientRequest {


    @Override
    public boolean avaibleFlight(Client client) {

        for (Flight fly : new FlightsList().getFlightList()) {
            if (fly.getStart().equals(client.getSearchedFlight().getStart())
                                        && fly.getEnd().equals(client.getSearchedFlight().getEnd())) {
                return true;
            }
        }
        return avaibleIndirectFlight(client.getSearchedFlight());
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
