package com.kodilla.good.patterns.food;

public class OrderDTO {
    public Supplier supplier;
    public Product product;
    public boolean isOrdered;

    public OrderDTO(final Supplier supplier, final Product product, final boolean isOrdered) {
        this.supplier = supplier;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
