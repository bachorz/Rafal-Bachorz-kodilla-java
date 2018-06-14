package Food2Door.InformationService;

import Food2Door.Manufacturer.Manufacturer;
import Food2Door.Product;

public interface InformationService {

    void inform(Product product, Manufacturer manufacturer);

    void informNegative(Product product, Manufacturer manufacturer);
}
