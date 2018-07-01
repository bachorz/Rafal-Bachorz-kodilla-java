package food2Door.manufacturer;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Manufacturer {

    public List<ProductInStock> process() {

        List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
        listProductsGlutenFreeShop.add(new ProductInStock("Apples", "GlutenFreeShop", 3.10, 10));
        listProductsGlutenFreeShop.add(new ProductInStock("Sour cream", "GlutenFreeShop", 3.10, 2));
        listProductsGlutenFreeShop.add(new ProductInStock("Orange juice", "GlutenFreeShop", 2.5, 3));
        listProductsGlutenFreeShop.add( new ProductInStock("Milk", "GlutenFreeShop", 5.00, 11));
        listProductsGlutenFreeShop.add(new ProductInStock("Butter", "GlutenFreeShop", 6.00, 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Rolls", "GlutenFreeShop", 1.00, 6));

        return listProductsGlutenFreeShop;
    }
}
