package com.kodilla.good.patterns;

import com.kodilla.good.patterns.producentService.*;

public class MainClass {

    public static void main(String[] args) {

        OrderProcessor orderProcessor= new OrderProcessor(
                                                    new MailService(),
                                                    new OrderServiceHandler());

        orderProcessor.process(new GlutenFreeShop(),
                                    new Order(new User("Franek"), new Product("Milk", 34)));



//        SmallAirportCompanyFrontDesk smallAirportCompanyFrontDesk = new SmallAirportCompanyFrontDesk(
//                                                            new SercherTheAvaibleFlight(), new ListOfAvaibleFlights());
//
//        smallAirportCompanyFrontDesk.process(new Client("Emilia", new Flight("Radom", "Rzym")));




//        ContractorsService contractorsService = new ContractorsService(new GlutenFreeShop(),
//                                                                       new MailService(),
//                                                                       new OrderServiceHandler());
//
//        contractorsService.process(new Order(
//                                         new User("Emilia"),
//                                        "GlutenFreeShop", new Product("GlutenFreeBread", 20)));
//



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
