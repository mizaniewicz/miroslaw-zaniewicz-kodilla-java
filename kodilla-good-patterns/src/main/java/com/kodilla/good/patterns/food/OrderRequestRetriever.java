package com.kodilla.good.patterns.food;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Application.Company company) throws SupplierNotAvailableException {
        Supplier supplier;
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
            default:
                throw new SupplierNotAvailableException();
        }

        Product potatoes = new Product("potatoes", 25);
        return new OrderRequest(supplier, potatoes, 5);
    }
}
