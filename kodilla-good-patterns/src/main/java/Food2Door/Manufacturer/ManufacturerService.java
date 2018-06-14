package Food2Door.Manufacturer;

import Food2Door.Product;
import Food2Door.RecipientOfDelivery;

public interface ManufacturerService {

    boolean implementation(Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery);

}
