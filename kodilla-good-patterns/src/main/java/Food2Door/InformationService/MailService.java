package Food2Door.InformationService;

import Food2Door.Manufacturer.Manufacturer;
import Food2Door.Product;

public class MailService implements InformationService {


    public void inform(Product product, Manufacturer manufacturer){

        System.out.println("Food2Door here," + product.getProductName() + " was sent today by " + manufacturer.getManufacturerName() + ". To pay: " + product.getToPay());
    }

    public void informNegative(Product product, Manufacturer manufacturer){
        System.out.println("Food2Door here, announces the " + manufacturer.getManufacturerName() + " refused to process the order for the " + product.getProductName() +
                ", see the attachment with information from the manufacturer.");
    }
}
