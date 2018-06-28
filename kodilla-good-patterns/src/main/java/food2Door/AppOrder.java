package food2Door;

import food2Door.informationService.InformationService;
import food2Door.informationService.MailService;

import java.util.List;
import java.util.Map;

public class AppOrder {

    public static void main(String[] args) {

        OrdersFactory ordersFactory = new OrdersFactory();
        List<OrderCard> result = ordersFactory.getOrders();

        OrderService orderService = new OrderService(new MailService());
        Map<OrderCard, InformationService> order = orderService.orderProcessor(result);

        System.out.println(order.entrySet());

    }
}
