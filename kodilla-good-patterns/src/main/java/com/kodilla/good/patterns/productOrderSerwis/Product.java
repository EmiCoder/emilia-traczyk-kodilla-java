package com.kodilla.good.patterns.productOrderSerwis;

public class Product {

    private Type type;
    private int price;
    private int amount;

    public Product(Type type, int price, int amount) {
        this.type=type;
        this.price=price;
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
