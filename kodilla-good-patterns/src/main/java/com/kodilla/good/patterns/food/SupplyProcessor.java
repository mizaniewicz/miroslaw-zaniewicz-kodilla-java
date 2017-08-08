package com.kodilla.good.patterns.food;

public class SupplyProcessor {
    public OrderDTO supply(OrderRequest orderRequest) {
        Supplier supplier = orderRequest.getSupplier();
        supplier.process(orderRequest);
        System.out.println(orderRequest.toString());
        return new OrderDTO(orderRequest.getSupplier(), orderRequest.getProduct(), true);
    }
}
