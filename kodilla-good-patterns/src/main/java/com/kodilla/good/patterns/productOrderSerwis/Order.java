package com.kodilla.good.patterns.productOrderSerwis;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private User user;
    private LocalDate date;
    private LocalDate executionTime;
    private List<Product> listOfProducts;
    private int valueOfOrder;

    public Order(User user, LocalDate date, LocalDate executionTime, List<Product> listOfProducts) {
        this.user=user;
        this.date=date;
        this.executionTime=executionTime;
        this.listOfProducts=listOfProducts;
        this.valueOfOrder = countTheOrderValue();
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getExecutionTime() {
        return executionTime;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public int getValueOfOrder() {
        return valueOfOrder;
    }

    private int countTheOrderValue() {

        int orderValue = 0;
        for (Product product : this.listOfProducts) {
            orderValue += product.getAmount() * product.getPrice();
        }
        return orderValue;
    }
}
