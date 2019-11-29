package com.kodilla.good.patterns.productOrderSerwis;

public class OrderStore implements OrderRepository {

    @Override
    public void createOrder(User user, Order order) {
        System.out.println("Zamówinie " + user.getName() + " " + user.getLastName() + "\n" +
                            "Order date " + order.getDate() + "\n" +"Execition time " + order.getExecutionTime());
        }

}
