package com.kodilla.good.patterns.challenges.service;

public interface ProductOrderRepository {
    public boolean createOrder(User user, Product product);
}
