package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderFactory questionsToOrder = new OrderFactory();
        OrderForm orderForm = questionsToOrder.createOrder();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new MaxShop(), new ConfirmOrder()) ;
        productOrderService.process(orderForm);
    }
}
