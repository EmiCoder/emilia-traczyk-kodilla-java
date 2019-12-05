package com.kodilla.good.patterns.producentService;

public class Order {

    private User user;
    private String contractorName;
    private Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
