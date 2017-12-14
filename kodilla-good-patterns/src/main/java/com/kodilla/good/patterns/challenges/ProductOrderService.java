package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private BuyingProcess buyingProcess;

    public ProductOrderService() {
        this.informationService = new Information();
        this.buyingProcess = new Buy();
    }

    public BuyDto process(BuyRequest buyRequest) {
        boolean isBought = buyingProcess.buyingProduct(buyRequest.getUser(), buyRequest.getProduct());

        if (isBought) {
            informationService.sendInformation(buyRequest.getUser(), buyRequest.getProduct());
            return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), true);
        }
        return new BuyDto(buyRequest.getUser(), buyRequest.getProduct(), true);
    }
}
