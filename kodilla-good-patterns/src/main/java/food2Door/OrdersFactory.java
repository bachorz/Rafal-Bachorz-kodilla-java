package food2Door;

import java.util.*;

public class OrdersFactory {


    public List<OrderCard> getOrders (){


        List<OrderCard> listOfOrders = new ArrayList<>();


        listOfOrders.add(new OrderCard("Apples", 3, new RecipientOfDelivery("Janusz", "Kowalski", "Ptysiowa 13, Kacze Doly")));

        listOfOrders.add(new OrderCard("Orange juice", 8, new RecipientOfDelivery("Janusz", "Kowalski", "Ptysiowa 13, Kacze Doly")));

        listOfOrders.add(new OrderCard("Mineral water", 2, new RecipientOfDelivery("Zenon", "Maliniak", "Jakas 2, Chrzaszczyzewoszyce")));

        return listOfOrders;
    }
}




