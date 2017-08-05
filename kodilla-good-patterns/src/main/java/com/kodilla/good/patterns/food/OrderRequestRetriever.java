package com.kodilla.good.patterns.food;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        Product potatoes = new Product("potatoes", 25);
        return new OrderRequest(extraFoodShop, potatoes, 5);
    }
}
