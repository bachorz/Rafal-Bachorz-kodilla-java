package Food2Door;

public class FillTheOrder {

    public OrderCard completing () {

        OrderCard orderCard01 = new OrderCard("Apples", 3,
                new RecipientOfDelivery("Marian", "Kowalski", "Pokrecona 2, Blachownia"));

        return orderCard01;

    }
}

