package com.kodilla.good.patterns.productOrderSerwis;

public class OrderServiceHandler implements OrderService {

    @Override
    public boolean order(Order order) {
        System.out.println("Order by: " + order.getUser().getName() + " " + order.getUser().getLastName() + "\n" +
                "Ordered: " + order.getDate() + "\n" +
                "Execution date: " + order.getExecutionTime() + "\n" +
                "Order value: " + order.getValueOfOrder() + "\n" +
                "Ordered products: ");
        for (Product product : order.getListOfProducts()) {
            System.out.println(product.getType());
        }
        return true;
    }
}
