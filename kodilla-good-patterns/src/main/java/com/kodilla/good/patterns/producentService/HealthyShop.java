package com.kodilla.good.patterns.producentService;

public class HealthyShop implements Shop {
    @Override
    public void process(Order order) {
        System.out.println("Process method from " + this.getClass().getSimpleName() + "\n" +
                "Order by " + order.getUser().getNick() + "\n" +
                "Product: " + order.getProduct().getName());
    }
}
