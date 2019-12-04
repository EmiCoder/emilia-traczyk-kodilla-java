package com.kodilla.good.patterns;

import com.kodilla.good.patterns.producentService.*;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static List<Contractor> contractorList = prepareBasicContractorsList();

    public static void main(String[] args) {

//        SmallAirportCompanyFrontDesk smallAirportCompanyFrontDesk = new SmallAirportCompanyFrontDesk(
//                                                            new SercherTheAvaibleFlight(), new ListOfAvaibleFlights());
//
//        smallAirportCompanyFrontDesk.process(new Client("Emilia", new Flight("Katowice", "Warszawa")));





        ContractorsService contractorsService = new ContractorsService(new GlutenFreeShop(),
                                                                       new MailService(),
                                                                       new OrderServiceHandler());

        contractorsService.process(new Order(
                                         new User("Emilia"),
                                        "GlutenFreeShop", new Product("GlutenFreeBread", 20)));




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

    public static List<Contractor> prepareBasicContractorsList() {
        List<Contractor> list = new ArrayList<>();
        list.add(new Contractor("ExtraFoodShop", new Product("Milk", 100)));
        list.add(new Contractor("SlowFood", new Product("Cheese", 250)));
        list.add(new Contractor("Health", new Product("Bread", 346)));
        list.add(new Contractor("Vital", new Product("Carrot", 345)));
        list.add(new Contractor("ExtraFoosShop", new Product("Natural Yogurt", 547 )));
        return list;
    }

}
