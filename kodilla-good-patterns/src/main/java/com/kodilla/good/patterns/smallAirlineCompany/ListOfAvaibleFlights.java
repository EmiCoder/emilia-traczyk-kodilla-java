package com.kodilla.good.patterns.smallAirlineCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListOfAvaibleFlights implements AvaibleFlight{

    @Override
    public List<Flight> avaibleFlightsList(Client client) {
        List<Flight> list = new ArrayList<>();
        List<Flight> avaibleFlightList = new FlightsList().getFlightList();
        String start = client.getSearchedFlight().getStart();
        String end = client.getSearchedFlight().getEnd();

        avaibleFlightList.stream()
                         .filter(fly -> {
                                    if (fly.getStart().equals(client.getSearchedFlight().getStart())
                                     && fly.getEnd().equals(client.getSearchedFlight().getEnd())) {
                                            list.add(fly);
                                            return true;
                                        }
                                    return false;
                          });


        List<Flight> flightsTheSameStart = avaibleFlightList.stream()
                                                                    .filter(flight -> flight.getStart().equals(start))
                                                                    .collect(Collectors.toList());

        List<Flight> flightsTheSameEnd = avaibleFlightList.stream()
                                                          .filter(flight -> flight.getEnd().equals(end))
                                                          .collect(Collectors.toList());


        Optional<Flight> firstConnection =
                flightsTheSameStart.stream()
                                   .filter(flight -> flightsTheSameEnd.stream()
                                                                      .anyMatch(fly -> fly.getStart().equals(flight.getEnd())))
                                                                      .findFirst();

        if (firstConnection.isPresent()) {
            Flight firstConnectedFlight = firstConnection.get();

            Optional<Flight> secondConnectedFlight =
                   flightsTheSameEnd.stream()
                                    .filter(flight -> flight.getStart().equals(firstConnectedFlight.getEnd()))
                                    .findFirst();

           list.add(firstConnectedFlight);
           list.add(secondConnectedFlight.get());
        }
        return list;
    }


}
