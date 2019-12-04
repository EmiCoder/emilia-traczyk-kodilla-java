package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.List;
import java.util.stream.IntStream;

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
                                "Serching flight: " + client.getSearchedFlight().getStart() + " - "
                                                    + client.getSearchedFlight().getEnd() + "\n" +
                                "Avaible connection: ");

            IntStream.range(0, flights.size()).forEach(a -> {
                                                            if (a != flights.size() - 1) {
                                                                System.out.print(flights.get(a).getStart() + " - " +
                                                                                 flights.get(a).getEnd() + ", ");
                                                            } else {
                                                                System.out.print(flights.get(a).getStart() + " - " +
                                                                                 flights.get(a).getEnd());
                                                            }
                                                        });

        } else {
            System.out.println("No avaible connection");
        }
    }
}
