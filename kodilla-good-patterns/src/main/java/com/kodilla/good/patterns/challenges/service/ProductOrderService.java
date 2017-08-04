package com.kodilla.good.patterns.challenges.service;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDTO process (final OrderRequest orderRequest) {
        boolean isBuyed = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isBuyed) {
            informationService.inform(orderRequest.getUser());
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            System.out.println(orderRequest.getProduct());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
