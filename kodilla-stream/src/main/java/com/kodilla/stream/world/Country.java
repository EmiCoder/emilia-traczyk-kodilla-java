package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;

    public Country (BigDecimal bigDecimal) {
        this.peopleQuantity = bigDecimal;
    }

    public BigDecimal getPeopleQuantity() {
        return this.peopleQuantity;
    }
}
