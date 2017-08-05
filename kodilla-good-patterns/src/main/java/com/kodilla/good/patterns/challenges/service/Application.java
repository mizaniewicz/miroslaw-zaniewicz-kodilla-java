package com.kodilla.good.patterns.challenges.service;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(user -> System.out.println("Order confirmed"), (user, product) -> true, (user, product) -> true);
        productOrderService.process(orderRequest);
    }
}
