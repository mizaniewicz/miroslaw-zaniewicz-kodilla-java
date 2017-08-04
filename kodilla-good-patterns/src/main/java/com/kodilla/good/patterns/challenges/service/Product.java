package com.kodilla.good.patterns.challenges.service;

public class Product {
    public String productName;
    public double productPrice;
    public int quantity;

    public Product(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalPrice() {
        return quantity * productPrice;
    }

    @Override
    public String toString() {
        return "Your order {" +
                "product name='" + productName + '\'' +
                ", product price=" + productPrice +
                ", quantity=" + quantity +
                ", total price=" + totalPrice() +
                '}';
    }
}
