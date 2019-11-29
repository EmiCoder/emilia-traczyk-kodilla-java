package com.kodilla.good.patterns.productOrderSerwis;

public interface OrderRepository {
    void createOrder(User user, Order order);
}
