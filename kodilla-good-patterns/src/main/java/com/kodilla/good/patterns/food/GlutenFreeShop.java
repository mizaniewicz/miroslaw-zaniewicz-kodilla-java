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
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Gluten Free Shop");
        return true;
    }

    @Override
    public String toString() {
        return getName() + " " + getAddress();
    }
}
