package com.kodilla.good.patterns.productOrderSerwis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {

    public Order retrieve () {
        User user = new User("Marcin", "Nowak");
        LocalDate date = LocalDate.of(2015, 02, 10);
        LocalDate executionDate = LocalDate.of(2015, 02, 12);
        List<Product> list = new ArrayList<>();
        list.add(new Product(Type.ELECTRONICS,45,4));
        list.add(new Product(Type.TOYS,34, 3));
        list.add(new Product(Type.FOOD, 10, 3));
        return new Order(user, date, executionDate, list);
    }
}
