package Food2Door.Manufacturer;

import Food2Door.Product;
import Food2Door.RecipientOfDelivery;

public class ExtraFoodShop implements ManufacturerService {

    public boolean implementation(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {

        if(product.getProductWeight() <= 10.0) {
            System.out.println(manufacturer.getManufacturerName() + ", product: " + product.getProductName() + " has been sent to "
                    + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname()+".");
            return true;
        } else {
            System.out.println("Here, ExtraFoodShop, we can not process your order. The maximal weight of the product must be 10 kg.");
            return false;
        }
    }
}
