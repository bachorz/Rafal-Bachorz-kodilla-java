package food2Door.manufacturer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manufacturers {

    Manufacturer extraFoodShop = new  ExtraFoodShop();
    Manufacturer glutenFreeShop = new GlutenFreeShop();
    Manufacturer healthyShop = new HealthyShop();

    public List<Manufacturer> getManufacturers(){

        List<Manufacturer> listOfProducers = new ArrayList<>();

        List<ProductInStock> listProductsextraFoodShop = new ArrayList<>();
        listProductsextraFoodShop.add(new ProductInStock("Apples", "ExtraFoodShop", new BigDecimal("2.90"), 10));
        listProductsextraFoodShop.add(new ProductInStock("Tomatoes", "ExtraFoodShop", new BigDecimal("4.10"), 5));
        listProductsextraFoodShop.add(new ProductInStock("Orange juice", "ExtraFoodShop", new BigDecimal("2.0"), 8));
        listProductsextraFoodShop.add(new ProductInStock("Bananas", "ExtraFoodShop", new BigDecimal("5.00"), 11));
        listProductsextraFoodShop.add(new ProductInStock("Butter", "ExtraFoodShop", new BigDecimal("6.00"), 3));
        listProductsextraFoodShop.add(new ProductInStock("Tomato juice", "ExtraFoodShop", new BigDecimal("2.50"), 4));
        listOfProducers.add(extraFoodShop);

        List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
        listProductsGlutenFreeShop.add(new ProductInStock("Apples", "GlutenFreeShop", new BigDecimal("3.10"), 10));
        listProductsGlutenFreeShop.add(new ProductInStock("Sour cream", "GlutenFreeShop", new BigDecimal("3.10"), 2));
        listProductsGlutenFreeShop.add(new ProductInStock("Orange juice", "GlutenFreeShop", new BigDecimal("2.5"), 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Milk", "GlutenFreeShop", new BigDecimal("5.00"), 11));
        listProductsGlutenFreeShop.add(new ProductInStock("Butter", "GlutenFreeShop", new BigDecimal("6.00"), 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Rolls", "GlutenFreeShop", new BigDecimal("1.00"), 6));
        listOfProducers.add(glutenFreeShop);

        List<ProductInStock> listHealthyShop = new ArrayList<>();
        listHealthyShop.add(new ProductInStock("Apples", "HealthyShop", new BigDecimal("2.40"), 5));
        listHealthyShop.add(new ProductInStock("Tomatoes", "HealthyShop", new BigDecimal("4.12"), 5));
        listHealthyShop.add(new ProductInStock("Orange juice", "HealthyShop", new BigDecimal("2.1"), 8));
        listHealthyShop.add(new ProductInStock("Bananas", "HealthyShop", new BigDecimal("5.50"), 2));
        listHealthyShop.add(new ProductInStock("Mineral water", "HealthyShop", new BigDecimal("1.80"), 0));
        listHealthyShop.add(new ProductInStock("Tomato juice", "HealthyShop", new BigDecimal("2.50"), 12));
        listOfProducers.add(healthyShop);

        return listOfProducers;
    }
}
