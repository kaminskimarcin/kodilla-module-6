package com.kodilla.good.patterns.challenges;

public class ServiceProccess {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService();

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();

        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        productOrderService.process(buyRequest);
    }
}
