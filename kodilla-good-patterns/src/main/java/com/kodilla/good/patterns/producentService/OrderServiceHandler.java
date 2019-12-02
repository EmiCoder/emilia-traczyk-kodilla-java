package com.kodilla.good.patterns.producentService;

import java.util.List;

public class OrderServiceHandler implements OrderService {

    @Override
    public boolean orderPossible(List<Contractor> contractors, Order order) {

        for (Contractor contractor : contractors) {
            if (contractor.getName().equals(order.getContractorName())) {
                if (contractor.getProduct().getName().equals(order.getProduct().getName()) &&
                        contractor.getProduct().getAmount() >= order.getProduct().getAmount()) {

                        System.out.println("Order by " + order.getUser().getNick() + " is possible to implemetation." + "\n" +
                                            "Contractor: " + contractor.getName() + "\n" +
                                            "Product name: " + order.getProduct().getName() + "\n" +
                                             "Product amount: " + order.getProduct().getAmount());
                        return true;
                }
            }
        }
        System.out.println("Order by " + order.getUser().getNick() + " is impossible to implemetation.");
        return false;
    }
}
