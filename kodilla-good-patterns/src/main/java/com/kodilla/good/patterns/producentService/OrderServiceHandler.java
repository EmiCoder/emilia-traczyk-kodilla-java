package com.kodilla.good.patterns.producentService;

public class OrderServiceHandler implements OrderService {

    @Override
    public boolean orderPossible(Order order) {
        System.out.println("Order by " + order.getUser().getNick() + " is possible to implemetation.");
        return true;
    }
}
