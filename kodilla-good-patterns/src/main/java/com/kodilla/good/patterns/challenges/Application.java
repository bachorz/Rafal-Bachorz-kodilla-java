package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        QuestionsToOrder questionsToOrder = new QuestionsToOrder();
        OrderForm orderForm = questionsToOrder.questions();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new EshopService(), new EshopRepository()) ;
        productOrderService.process(orderForm);
    }
}
