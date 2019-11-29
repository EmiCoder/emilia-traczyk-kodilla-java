package com.kodilla.good.patterns.productOrderSerwis;

public class ProductOrderService {

    private InformationService orderInformation;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService orderInformation,
                               final OrderService orderServiceControl,
                               final OrderRepository orderRepository) {
        this.orderInformation=orderInformation;
        this.orderService= orderServiceControl;
        this.orderRepository=orderRepository;
    }

    public OrderDto process(Order order) {
        boolean ordered = orderService.order(order);

        if (ordered) {
            orderInformation.inform(order.getUser());
            orderRepository.createOrder(order.getUser(), order);
            return new OrderDto(order.getUser(), true);
        }
        return new OrderDto(order.getUser(), false);
    }

}
