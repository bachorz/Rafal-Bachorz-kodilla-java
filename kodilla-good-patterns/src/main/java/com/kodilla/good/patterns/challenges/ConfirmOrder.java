package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class ConfirmOrder implements EshopRepository{

    Random generator = new Random();
    private boolean result;

    public boolean createSale(Client client, Product product) {

        result = generator.nextBoolean();
        if (result){
            System.out.println("We confirm the shipment " + product.getProductName() + ", pieces: " + product.getQuantity() + " to the address: " +
                    client.getAddress());
        }else {
            System.out.println("Shipment of " + product.getProductName() + " to the address: " + client.getAddress()
                    + ", can not be realized. Please indicate the correct delivery address of the parcel.");
        }
        return result;
    }
}
