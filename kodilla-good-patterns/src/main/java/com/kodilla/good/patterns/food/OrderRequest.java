package com.kodilla.good.patterns.food;

public class OrderRequest {
    private final Supplier supplier;
    private final Product product;
    private final int quantity;

    public OrderRequest(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double totalPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return "Your order from " + supplier + ", " + product + ", quantity=" + quantity + ", total price=" + totalPrice();
    }
}
