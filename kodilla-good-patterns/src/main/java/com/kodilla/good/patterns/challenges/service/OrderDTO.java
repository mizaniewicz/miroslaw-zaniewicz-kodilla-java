package com.kodilla.good.patterns.challenges.service;

public class OrderDTO {
    public User user;
    public boolean isBought;

    public OrderDTO(final User user, final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }
}
