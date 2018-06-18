package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService{

    @Override
    public void inform(Client client, Product product) {

        System.out.println("Order: " + product.getProductName() + ", pieces: " + product.getQuantity() + " is waiting for shipment.");
    }
}
