package com.kodilla.good.patterns.challenges;

public class EshopService {

    public boolean buy(Client client, Product product) {
        System.out.println(product.getProductName() + " in a quantity of " + product.getQuantity() + " pieces was bought by " + client.getName() + " " + client.getSurname());

        return true;
    }
}

