package Food2Door.InformationService;

import Food2Door.Manufacturer.ProductInStock;
import Food2Door.OrderCard;

public class MailService implements InformationService {


    public void inform(OrderCard orderCard, ProductInStock productInStock){

        // System.out.println("Food2Door here," + product.getProductName() + " was sent today by " + manufacturer.getManufacturerName() + ". To pay: " + product.getToPay());
    }

    public void informNegativ(){

        System.out.println("Food2Door here, announces the  refused to process the order for the , please change the product");

    }

}
