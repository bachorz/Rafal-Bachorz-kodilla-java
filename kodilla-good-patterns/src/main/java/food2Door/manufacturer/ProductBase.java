package food2Door.manufacturer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductBase {

    public ProductBase () {

        List<ProductInStock> listProductsExtraFoodShop = new ArrayList<>();

        listProductsExtraFoodShop.add(new ProductInStock("Apples", "ExtraFoodShop", new BigDecimal("2.90"), 10));
        listProductsExtraFoodShop.add(new ProductInStock("Tomatoes", "ExtraFoodShop", new BigDecimal("4.10"), 5));
        listProductsExtraFoodShop.add(new ProductInStock("Orange juice", "ExtraFoodShop", new BigDecimal("2.0"), 8));
        listProductsExtraFoodShop.add(new ProductInStock("Bananas", "ExtraFoodShop", new BigDecimal("5.00"), 11));
        listProductsExtraFoodShop.add(new ProductInStock("Butter", "ExtraFoodShop", new BigDecimal("6.00"), 3));
        listProductsExtraFoodShop.add(new ProductInStock("Tomato juice", "ExtraFoodShop", new BigDecimal("2.50"), 4));

        List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
        listProductsGlutenFreeShop.add(new ProductInStock("Apples", "GlutenFreeShop", new BigDecimal("3.10"), 10));
        listProductsGlutenFreeShop.add(new ProductInStock("Sour cream", "GlutenFreeShop", new BigDecimal("3.10"), 2));
        listProductsGlutenFreeShop.add(new ProductInStock("Orange juice", "GlutenFreeShop", new BigDecimal("2.5"), 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Milk", "GlutenFreeShop", new BigDecimal("5.00"), 11));
        listProductsGlutenFreeShop.add(new ProductInStock("Butter", "GlutenFreeShop", new BigDecimal("6.00"), 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Rolls", "GlutenFreeShop", new BigDecimal("1.00"), 6));

        List<ProductInStock> listHealthyShop = new ArrayList<>();
        listHealthyShop.add(new ProductInStock("Apples", "HealthyShop", new BigDecimal("2.40"), 5));
        listHealthyShop.add(new ProductInStock("Tomatoes", "HealthyShop", new BigDecimal("4.12"), 5));
        listHealthyShop.add(new ProductInStock("Orange juice", "HealthyShop", new BigDecimal("2.1"), 8));
        listHealthyShop.add(new ProductInStock("Bananas", "HealthyShop", new BigDecimal("5.50"), 2));
        listHealthyShop.add(new ProductInStock("Mineral water", "HealthyShop", new BigDecimal("1.80"), 0));
        listHealthyShop.add(new ProductInStock("Tomato juice", "HealthyShop", new BigDecimal("2.50"), 12));

    }
}
