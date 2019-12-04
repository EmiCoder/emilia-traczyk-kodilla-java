package com.kodilla.good.patterns.producentService;

import com.kodilla.good.patterns.MainClass;

public class ContractorsService {

    AlternativeContractor alternativeContractor;
    OrderInformationService orderInformationService;
    OrderService orderService;

    public ContractorsService(
                              AlternativeContractor alternativeContractor,
                              OrderInformationService orderInformationService,
                              OrderService orderService) {
        this.alternativeContractor = alternativeContractor;
        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
    }


    public OrderDto process(Order order) {
        Contractor newContractor = alternativeContractor.createNewContractor();
        MainClass.contractorList.add(newContractor);
        boolean possibleToOrder = orderService.orderPossible(MainClass.contractorList, order);

        if (possibleToOrder) {
            orderInformationService.inform(order.getUser());
            return new OrderDto(order.getUser(), true);
        }
        return new OrderDto(order.getUser(), false);
    }
}
