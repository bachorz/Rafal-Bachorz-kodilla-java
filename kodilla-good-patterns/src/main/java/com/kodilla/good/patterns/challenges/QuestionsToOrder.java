package com.kodilla.good.patterns.challenges;

public class QuestionsToOrder {

    public OrderForm questions () {

        Client client = new Client("Zenon", "Maliniak", "Kapusciana 6, Kacze Doly");
        Product product = new Product("Taboret", 3);

        return new OrderForm(client, product);

    }
}
