package com.kodilla.good.patterns.food;

public class HealthyShop implements Supplier {
    private static final String NAME = "Healthy Shop";
    private static final String ADDRESS = "Gdańsk";

    public String getName() {
        return NAME;
    }

    public String getAddress() {
        return ADDRESS;
    }

    @Override
    public OrderDTO process(OrderRequest orderRequest) {
        System.out.println("Healthy Shop");
        return new OrderDTO(orderRequest.getSupplier(), orderRequest.getProduct(), true);
    }

    @Override
    public String toString() {
        return getName() + " " + getAddress();
    }
}
