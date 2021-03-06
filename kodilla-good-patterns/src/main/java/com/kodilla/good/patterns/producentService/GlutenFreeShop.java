package com.kodilla.good.patterns.producentService;

public class GlutenFreeShop implements Shop {
    @Override
    public void process(Order order) {
        System.out.println("Process method from " + this.getClass().getSimpleName() + "\n" +
                            "Product: " + order.getProduct().getName() + " - " + order.getProduct().getAmount());
    }
}
