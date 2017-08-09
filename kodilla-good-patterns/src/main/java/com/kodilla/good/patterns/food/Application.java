package com.kodilla.good.patterns.food;

public class Application {
    public enum Company {
        ExtraFoodShop, HealthyShop,GlutenFreeShop
    }

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = null;
        try {
            orderRequest = orderRequestRetriever.retrieve(Company.HealthyShop);
        } catch (SupplierNotAvailableException e) {
            System.out.println("Supplier not available");
            e.printStackTrace();
        }
        SupplyProcessor supplyProcessor = new SupplyProcessor();
        supplyProcessor.supply(orderRequest);
    }
}
