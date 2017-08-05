package com.kodilla.good.patterns.food;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        SupplyService supplyService = new SupplyService();
        supplyService.supply(orderRequest);
    }
}
