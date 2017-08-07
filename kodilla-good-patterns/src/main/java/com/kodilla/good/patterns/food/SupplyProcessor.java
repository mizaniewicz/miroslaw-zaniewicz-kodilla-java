package com.kodilla.good.patterns.food;

public class SupplyProcessor {
    public boolean supply(OrderRequest orderRequest) {
        Supplier supplier = orderRequest.getSupplier();
        supplier.process(orderRequest);
        System.out.println(orderRequest.toString());
        return true;
    }
}
