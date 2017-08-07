package com.kodilla.good.patterns.food;

public class GlutenFreeShop implements Supplier {
    private static final String NAME = "Gluten Free Shop";
    private static final String ADDRESS = "Wrocław";

    public String getName() {
        return NAME;
    }

    public String getAddress() {
        return ADDRESS;
    }

    @Override
    public OrderDTO process(OrderRequest orderRequest) {
        System.out.println("Gluten Free Shop");
        return new OrderDTO(orderRequest.getSupplier(), orderRequest.getProduct(), true);
    }

    @Override
    public String toString() {
        return getName() + " " + getAddress();
    }
}
