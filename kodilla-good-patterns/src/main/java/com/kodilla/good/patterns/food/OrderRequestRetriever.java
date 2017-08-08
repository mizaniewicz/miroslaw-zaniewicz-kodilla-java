package com.kodilla.good.patterns.food;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Application.Company company) {
        Supplier supplier = null;
        switch (company) {
            case ExtraFoodShop:
                supplier = new ExtraFoodShop();
                break;
            case HealthyShop:
                supplier = new HealthyShop();
                break;
            case GlutenFreeShop:
                supplier = new GlutenFreeShop();
                break;
        }

        Product potatoes = new Product("potatoes", 25);
        return new OrderRequest(supplier, potatoes, 5);
    }
}
