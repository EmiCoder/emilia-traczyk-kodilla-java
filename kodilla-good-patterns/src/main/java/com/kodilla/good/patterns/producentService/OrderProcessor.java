package com.kodilla.good.patterns.producentService;

public class OrderProcessor {

    OrderInformationService orderInformationService;
    OrderService orderService;

    public OrderProcessor(
                              OrderInformationService orderInformationService,
                              OrderService orderService) {
        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
    }


    public OrderDto process(Shop shop, Order order) {
        boolean possibleToOrder = orderService.orderPossible(order);
        if (possibleToOrder) {
            shop.process(order);
            orderInformationService.inform(order.getUser());
            return new OrderDto(order.getUser(), true);
        }
        return new OrderDto(order.getUser(), false);
    }
}
