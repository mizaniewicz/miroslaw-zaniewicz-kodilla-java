package com.kodilla.good.patterns.food;

public class Application {
    public enum Company {
        ExtraFoodShop, HealthyShop,GlutenFreeShop
    }

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(Company.ExtraFoodShop);
        SupplyProcessor supplyProcessor = new SupplyProcessor();
        supplyProcessor.supply(orderRequest);
    }
}
