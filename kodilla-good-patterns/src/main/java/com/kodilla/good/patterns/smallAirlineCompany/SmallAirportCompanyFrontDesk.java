package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.List;

public class SmallAirportCompanyFrontDesk {

    private ClientRequest clientRequest;
    private AvaibleFlight avaibleFlights;

    public SmallAirportCompanyFrontDesk(ClientRequest clientRequest, AvaibleFlight avaibleFlights) {
        this.clientRequest = clientRequest;
        this.avaibleFlights = avaibleFlights;
    }

    public void process(Client client) {
        boolean avaibleFlight = clientRequest.avaibleFlight(client);
        if (avaibleFlight) {
            List<Flight> flights = avaibleFlights.avaibleFlightsList(client);
            System.out.print("Client: " + client.getName() + "\n" +
                                "Avaible connection: ");
            for (Flight flight : flights) {
                System.out.print(flight.getStart() + " - " + flight.getEnd() + ",");
            }
        } else {
            System.out.println("No avaible connection");
        }
    }
}
