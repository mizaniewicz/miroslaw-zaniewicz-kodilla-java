package com.kodilla.good.patterns.food;

public class ExtraFoodShop implements Supplier {
    private static final String NAME = "Extra Food Shop";
    private static final String ADDRESS = "Warszawa";

    public String getName() {
        return NAME;
    }

    public String getAddress() {
        return ADDRESS;
    }

    @Override
    public boolean process(Product product) {
        System.out.println("Extra Food Shop");
        return true;
    }

    @Override
    public String toString() {
        return getName() + " " + getAddress();
    }
}
