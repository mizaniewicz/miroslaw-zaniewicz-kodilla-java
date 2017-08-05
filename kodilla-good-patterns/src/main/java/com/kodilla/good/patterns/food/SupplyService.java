package com.kodilla.good.patterns.food;

public class SupplyService {
    public boolean supply(OrderRequest orderRequest) {
        Supplier supplier = orderRequest.getSupplier();
        supplier.process(orderRequest.getProduct());
        System.out.println(orderRequest.toString());
        return true;
    }
}
