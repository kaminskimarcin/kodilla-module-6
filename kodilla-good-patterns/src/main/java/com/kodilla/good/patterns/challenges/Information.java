package com.kodilla.good.patterns.challenges;

public class Information implements InformationService {

    @Override
    public void sendInformation(User user, Product product) {
        System.out.println("The purchase of product: " + product.getName() + " completed.");
    }
}
