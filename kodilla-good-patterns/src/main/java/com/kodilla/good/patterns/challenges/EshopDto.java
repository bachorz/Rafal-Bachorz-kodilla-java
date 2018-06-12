package com.kodilla.good.patterns.challenges;

public class EshopDto {

    public Client client;
    public boolean isBought;

    public EshopDto(Client client, boolean isBought) {
        this.client = client;
        this.isBought = isBought;
    }

    public Client getClient() {
        return client;
    }

    public boolean isBought() {
        return isBought;
    }
}
