package com.kodilla.good.patterns.challenges;

public class Buy implements BuyingProcess {
    @Override
    public boolean buyingProduct(User user, Product product) {
        System.out.println("Buying product: " + product.getName() + " by " + user.getNickName() + " for price: " + product.getPrice());
        return true;
    }
}
