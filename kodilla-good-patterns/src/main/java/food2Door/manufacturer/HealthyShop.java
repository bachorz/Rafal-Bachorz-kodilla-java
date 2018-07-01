package food2Door.manufacturer;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Manufacturer{

    public List<ProductInStock> process() {
        List<ProductInStock> listHealthyShop = new ArrayList<>();
        listHealthyShop.add(new ProductInStock("Apples", "HealthyShop", 2.40, 5));
        listHealthyShop.add(new ProductInStock("Tomatoes", "HealthyShop", 4.12, 5));
        listHealthyShop.add(new ProductInStock("Orange juice", "HealthyShop", 2.1, 8));
        listHealthyShop.add( new ProductInStock("Bananas", "HealthyShop", 5.50, 2));
        listHealthyShop.add( new ProductInStock("Mineral water", "HealthyShop", 1.80, 0));
        listHealthyShop.add(new ProductInStock("Tomato juice", "HealthyShop", 2.50, 12));

        return listHealthyShop;
    }
}
