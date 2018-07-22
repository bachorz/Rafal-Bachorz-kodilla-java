package food2Door;

import food2Door.informationService.MailService;
import food2Door.manufacturer.Manufacturers;

import java.util.List;
import java.util.Map;

public class AppOrder {

    public static void main(String[] args) {

        OrdersFactory ordersFactory = new OrdersFactory();
        List<OrderCard> orders = ordersFactory.getOrders();

        Manufacturers manufacturers = new Manufacturers();

        OrderService orderService = new OrderService(new MailService(), manufacturers);
        Map<OrderCard, String> results = orderService.orderProcessor(orders);

        for(Map.Entry<OrderCard, String> entry : results.entrySet()) {
            System.out.println(entry);
        }
    }
}
