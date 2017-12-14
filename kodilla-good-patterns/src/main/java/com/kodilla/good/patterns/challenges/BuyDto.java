package com.kodilla.good.patterns.challenges;

public class BuyDto {
    public User user;
    public Product product;
    public boolean isBought;

    public BuyDto(User user, Product product, boolean isBought) {
        this.user = user;
        this.product = product;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isBought() {
        return isBought;
    }
}
