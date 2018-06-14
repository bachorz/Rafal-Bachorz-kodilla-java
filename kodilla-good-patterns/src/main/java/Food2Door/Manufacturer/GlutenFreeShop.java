package Food2Door.Manufacturer;

import Food2Door.Product;
import Food2Door.RecipientOfDelivery;

public class GlutenFreeShop implements ManufacturerService{

    public boolean implementation(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {

        if (product.getToPay()>=20) {
            System.out.println(manufacturer.getManufacturerName() + ", confirms the completion of the order: " + product.getProductName() + ", "
                    + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname()+".");
            return true;
        } else {

            System.out.println("Here, GlutenShreeShop, we can not process your order. The minimum order value must be 20$.");
            return false;
        }
    }
}
