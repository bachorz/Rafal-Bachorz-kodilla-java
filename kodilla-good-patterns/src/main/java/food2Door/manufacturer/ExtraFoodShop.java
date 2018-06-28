package food2Door.manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ManufacturerService {

    public List<ProductInStock> process() {
        List<ProductInStock> listProductsExtraFoodShop = new ArrayList<>();
        listProductsExtraFoodShop.add(new ProductInStock("Apples", "ExtraFoodShop", 2.90, 10));
        listProductsExtraFoodShop.add(new ProductInStock("Tomatoes", "ExtraFoodShop", 4.10, 5));
        listProductsExtraFoodShop.add(new ProductInStock("Orange juice", "ExtraFoodShop", 2.0, 8));
        listProductsExtraFoodShop.add(new ProductInStock("Bananas", "ExtraFoodShop", 5.00, 11));
        listProductsExtraFoodShop.add(new ProductInStock("Butter", "ExtraFoodShop", 6.00, 3));
        listProductsExtraFoodShop.add(new ProductInStock("Tomato juice", "ExtraFoodShop", 2.50, 4));

        return listProductsExtraFoodShop;
    }

}
