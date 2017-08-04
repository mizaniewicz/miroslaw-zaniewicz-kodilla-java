package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {
    public OrderRequest retrive() {
        User user = new User("1", "Jan", "Kowalski", "Wrocław");
        Product mobilePhone = new Product("Iphone 7", 900, 2);
        return new OrderRequest(user, mobilePhone);
    }
}
