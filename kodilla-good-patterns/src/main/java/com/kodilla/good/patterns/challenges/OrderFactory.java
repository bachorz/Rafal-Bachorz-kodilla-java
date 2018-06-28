package com.kodilla.good.patterns.challenges;

public class OrderFactory {


    public String completing;

    public OrderForm createOrder () {

        Client client = new Client("Zenon", "Maliniak", "Kapusciana 6, Kacze Doly");
        Product product = new Product("Taboret", 3);

        return new OrderForm(client, product);
    }

}
