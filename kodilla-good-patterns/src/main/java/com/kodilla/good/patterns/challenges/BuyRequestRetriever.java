package com.kodilla.good.patterns.challenges;

public class BuyRequestRetriever {
    public BuyRequest retrieve(User user, Product product) {
        return new BuyRequest(user, product);
    }
}
