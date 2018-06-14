package Food2Door;

import Food2Door.InformationService.MailService;
import Food2Door.InformationService.TransferOfOrder;
import Food2Door.Manufacturer.GlutenFreeShop;

public class AppOrder {

    public static void main(String[] args){

        FillTheOrder fillTheOrder= new FillTheOrder();
        OrderCard orderCard = fillTheOrder.completing();

        OrderProcessor orderProcessor  = new OrderProcessor( new MailService(), new GlutenFreeShop(), new TransferOfOrder());
        orderProcessor.process(orderCard);
    }
}
