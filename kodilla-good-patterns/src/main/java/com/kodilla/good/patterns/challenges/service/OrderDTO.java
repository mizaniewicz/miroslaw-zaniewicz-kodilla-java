package com.kodilla.good.patterns.challenges.service;

public class OrderDTO {
    public User user;
    public boolean isBuyed;

    public OrderDTO(final User user, final boolean isBuyed) {
        this.user = user;
        this.isBuyed = isBuyed;
    }

    public User getUser() {
        return user;
    }

    public boolean isBuyed() {
        return isBuyed;
    }
}
