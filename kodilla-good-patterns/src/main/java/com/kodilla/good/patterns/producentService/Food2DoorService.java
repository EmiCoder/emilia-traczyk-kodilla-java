package com.kodilla.good.patterns.producentService;

public class Food2DoorService {

    ContractorsInformationService contractorsInformationService;
    OrderInformationService orderInformationService;
    OrderService orderService;

    public Food2DoorService(ContractorsInformationService contractorsInformationService,
                            OrderInformationService orderInformationService,
                            OrderService orderService) {
        this.contractorsInformationService = contractorsInformationService;
        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
    }

    public OrderDto process(Order order) {

        boolean possibleToOrder = orderService.orderPossible(contractorsInformationService.contractorsList(), order);

        if (possibleToOrder) {
            orderInformationService.inform(order.getUser());
            return new OrderDto(order.getUser(), true);
        }
        return new OrderDto(order.getUser(), false);
    }
}
