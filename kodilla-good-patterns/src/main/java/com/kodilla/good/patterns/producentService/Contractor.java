package com.kodilla.good.patterns.producentService;

public class Contractor {

    private String name;
    private Product product;

    public Contractor(String name, Product product) {
        this.name=name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }
}
