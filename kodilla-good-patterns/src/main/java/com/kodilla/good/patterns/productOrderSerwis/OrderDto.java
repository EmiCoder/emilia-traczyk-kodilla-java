package com.kodilla.good.patterns.productOrderSerwis;

public class OrderDto {
    private User user;
    private boolean ordered;

    public OrderDto(User user, boolean ordered) {
        this.user=user;
        this.ordered=ordered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
