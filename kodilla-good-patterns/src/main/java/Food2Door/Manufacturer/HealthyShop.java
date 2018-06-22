package Food2Door.Manufacturer;

import Food2Door.RecipientOfDelivery;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements ManufacturerService{



    public boolean process(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {
        System.out.println(manufacturer.getManufacturerName() + ", product: " + product.getProductName() + " has been sent to " + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname() + ".");

        return true;
    }

}
