package Food2Door.Manufacturer;

import Food2Door.Product;
import Food2Door.RecipientOfDelivery;

public class HealthyShop implements ManufacturerService{

    public boolean implementation(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {
        System.out.println(manufacturer.getManufacturerName() + ", product: " + product.getProductName() + " has been sent to "
                + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname()+".");

        return true;
    }
}
