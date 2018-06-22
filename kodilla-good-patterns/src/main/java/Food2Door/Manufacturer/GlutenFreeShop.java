package Food2Door.Manufacturer;

import Food2Door.RecipientOfDelivery;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements ManufacturerService{

    final List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();

    public boolean process(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {

//        if (product.getToPay()>=20) {
            System.out.println(manufacturer.getManufacturerName() + ", confirms the completion of the order: " + product.getProductName() + ", "
                    + recipientOfDelivery.getName() + " " + recipientOfDelivery.getSurname()+".");
            return true;

}
