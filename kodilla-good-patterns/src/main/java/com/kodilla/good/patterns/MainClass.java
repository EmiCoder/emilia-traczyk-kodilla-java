package com.kodilla.good.patterns;

import com.kodilla.good.patterns.productOrderSerwis.*;

public class MainClass {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(
                                                        new MailService(), new OrderServiceHandler(), new OrderStore());

        productOrderService.process(order);



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
