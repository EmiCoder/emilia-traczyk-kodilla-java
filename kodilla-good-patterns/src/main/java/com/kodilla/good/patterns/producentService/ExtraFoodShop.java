package com.kodilla.good.patterns.producentService;

public class ExtraFoodShop implements Shop {
    @Override
    public void process(Order order) {
        System.out.println("process method from " + this.getClass().getSimpleName() + "\n" +
                "Order by " + order.getUser().getNick() + "\n" +
                "Product: " + order.getProduct().getName());
    }
}
