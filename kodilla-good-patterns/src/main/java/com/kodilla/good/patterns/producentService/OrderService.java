package com.kodilla.good.patterns.producentService;

import java.util.List;

public interface OrderService {
    boolean orderPossible(List<Contractor> contractors, Order order);
}
