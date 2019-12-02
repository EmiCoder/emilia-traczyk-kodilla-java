package com.kodilla.good.patterns.producentService;

public class Order {

    private User user;
    private String contractorName;
    private Product product;

    public Order(User user, String contractorName, Product product) {
        this.user = user;
        this.contractorName=contractorName;
        this.product = product;
    }

    public String getContractorName() {
        return contractorName;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}
