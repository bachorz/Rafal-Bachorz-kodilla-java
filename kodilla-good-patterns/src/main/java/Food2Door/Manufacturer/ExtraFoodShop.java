package Food2Door.Manufacturer;

import Food2Door.RecipientOfDelivery;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ManufacturerService {



    public boolean process(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {

//        if(product.getProductWeight() <= 10.0) {
        System.out.println(manufacturer.getManufacturerName() + ", product: " + product.getProductName() + " has been sent to " + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname() + ".");
        return true;
    }

}
