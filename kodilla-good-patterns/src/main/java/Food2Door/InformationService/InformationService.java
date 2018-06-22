package Food2Door.InformationService;

import Food2Door.Manufacturer.ProductInStock;
import Food2Door.OrderCard;

public interface InformationService {

    void inform(OrderCard orderCard, ProductInStock productInStock);
    void informNegativ();
}
