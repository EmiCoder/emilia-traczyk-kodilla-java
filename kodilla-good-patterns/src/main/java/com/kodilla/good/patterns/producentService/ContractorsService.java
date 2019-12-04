package com.kodilla.good.patterns.producentService;

import com.kodilla.good.patterns.MainClass;

public class ContractorsService {

    NewContractor newContractor;
    OrderInformationService orderInformationService;
    OrderService orderService;

    public ContractorsService(
                              NewContractor newContractor,
                              OrderInformationService orderInformationService,
                              OrderService orderService) {
        this.newContractor=newContractor;
        this.orderInformationService = orderInformationService;
        this.orderService = orderService;
    }


    public OrderDto process(Order order) {
        Contractor newContractor = this.newContractor.createNewContractor();
        MainClass.contractorList.add(newContractor);
        boolean possibleToOrder = orderService.orderPossible(MainClass.contractorList, order);

        if (possibleToOrder) {
            orderInformationService.inform(order.getUser());
            return new OrderDto(order.getUser(), true);
        }
        return new OrderDto(order.getUser(), false);
    }
}
