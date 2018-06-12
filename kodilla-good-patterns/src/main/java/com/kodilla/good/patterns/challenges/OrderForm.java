package com.kodilla.good.patterns.challenges;

public class OrderForm {

    private Client client;
    private Product product;

    public OrderForm(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }
}
