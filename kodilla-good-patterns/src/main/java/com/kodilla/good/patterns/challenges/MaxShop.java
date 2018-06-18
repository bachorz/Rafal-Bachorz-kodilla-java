package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class MaxShop implements EshopService {

    Random generator = new Random();
    private boolean result;

    public boolean buy(Client client, Product product) {

        result = generator.nextBoolean();
        if (result) {
            System.out.println("We confirm the acceptance of orders for: " + product.getProductName()
                    + ", pieces: " + product.getQuantity() + ". Client: " + client.getName() + " " + client.getSurname());
        } else {
            System.out.println("Order: " + product.getProductName() + ", for " + client.getName() + " "
                    + client.getSurname() + " can not be processed, please choose another product.");
        }
        return result;
    }
}
