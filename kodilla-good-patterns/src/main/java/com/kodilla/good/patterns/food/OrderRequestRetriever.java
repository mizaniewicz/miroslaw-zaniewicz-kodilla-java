package com.kodilla.good.patterns.food;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Application.Company company) {
        if (company == Application.Company.ExtraFoodShop) {
            Supplier supplier = new ExtraFoodShop();
            Product potatoes = new Product("potatoes", 25);
            return new OrderRequest(supplier, potatoes, 5);
        }
        System.out.println("Wrong supplier");
        return null;
    }
}
