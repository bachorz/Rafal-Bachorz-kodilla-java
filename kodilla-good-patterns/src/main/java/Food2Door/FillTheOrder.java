package Food2Door;

import Food2Door.Manufacturer.Manufacturer;


public class FillTheOrder {

    public OrderCard completing () {

        OrderCard orderCard01 = new OrderCard(1, new Product("Apples", 1.0, 0, 5.2, 1.0),
                new Manufacturer("GlutenFreeShop"), new RecipientOfDelivery("Marian", "Kowalski", "Pokrecona 2, Blachownia"));

        return orderCard01;

    }
}

