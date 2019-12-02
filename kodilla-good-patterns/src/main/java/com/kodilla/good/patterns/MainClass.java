package com.kodilla.good.patterns;

import com.kodilla.good.patterns.smallAirlineCompany.*;

public class MainClass {

    public static void main(String[] args) {

        SmallAirportCompanyFrontDesk smallAirportCompanyFrontDesk = new SmallAirportCompanyFrontDesk(
                                                            new SercherTheAvaibleFlight(), new ListOfAvaibleFlights());

        smallAirportCompanyFrontDesk.process(new Client("Emilia", new Flight("Sucha Beskidzka", "Berlin")));





//        Food2DoorService food2DoorService = new Food2DoorService(
//                new ContractorList(new Contractor("GlutenFreeShop", new Product("Bread", 46))),
//                new MailService(),
//                new OrderServiceHandler());
//
//        Order order = new Order(new User("Emilia"), "GlutenFreeShop", new Product("Bread", 45));
//        System.out.println(food2DoorService.process(order).isOrdered());




//        OrderRetriever orderRetriever = new OrderRetriever();
//        Order order = orderRetriever.retrieve();
//        ProductOrderService productOrderService = new ProductOrderService(
//                                                        new MailService(), new OrderServiceHandler(), new OrderStore());
//
//        productOrderService.process(order);



//        String collect = Stream.of(new MovieStore().getMovies())
//                                        .map(Map::entrySet)
//                                        .flatMap(entries -> entries.stream())
//                                        .flatMap(stringListEntry -> stringListEntry.getValue().stream())
//                                        .map(String::toString)
//                                        .collect(Collectors.joining(", "));
//
//        System.out.println(collect);

    }

}
