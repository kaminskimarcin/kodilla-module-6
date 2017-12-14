package com.kodilla.good.patterns.challenges;

public class BuyRequestRetriever {
    public BuyRequest retrieve() {
        User markam = new User("Marcin", "Kamiński", "MarKam");
        Product car = new Product("Audi", "100000$");

        return new BuyRequest(markam, car);
    }
}
