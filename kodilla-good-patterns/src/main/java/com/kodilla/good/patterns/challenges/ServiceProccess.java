package com.kodilla.good.patterns.challenges;

public class ServiceProccess {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();

        User marcin = new User("Marcin", "Kamiński", "MarKam");

        Product car = new Product("Audi", "100000$");

        BuyRequest buyRequest = buyRequestRetriever.retrieve(marcin, car);

        productOrderService.process(buyRequest);
    }
}
