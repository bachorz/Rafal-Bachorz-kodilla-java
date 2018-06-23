package food2Door;

import food2Door.manufacturer.ProductInStock;

import java.util.*;

public class ProductBase {

    final List<ProductInStock> listProductsExtraFoodShop = new ArrayList<>();
    final List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
    final List<ProductInStock> listHealthyShop = new ArrayList<>();
    final Map<String, List<ProductInStock>> listOfProducers = new HashMap<>();

    public Map <String, List<ProductInStock>> getProducts (){

        List<ProductInStock> listProductsExtraFoodShop = new ArrayList<>();
        listProductsExtraFoodShop.add(new ProductInStock("Apples", "ExtraFoodShop", 2.90, 10));
        listProductsExtraFoodShop.add(new ProductInStock("Tomatoes", "ExtraFoodShop", 4.10, 5));
        listProductsExtraFoodShop.add( new ProductInStock("Orange juice", "ExtraFoodShop", 2.0, 8));
        listProductsExtraFoodShop.add(new ProductInStock("Bananas", "ExtraFoodShop", 5.00, 11));
        listProductsExtraFoodShop.add(new ProductInStock("Butter", "ExtraFoodShop", 6.00, 3));
        listProductsExtraFoodShop.add(new ProductInStock("Tomato juice", "ExtraFoodShop", 2.50, 4));

        List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
        listProductsGlutenFreeShop.add(new ProductInStock("Apples", "GlutenFreeShop", 3.10, 10));
        listProductsGlutenFreeShop.add(new ProductInStock("Sour cream", "GlutenFreeShop", 3.10, 2));
        listProductsGlutenFreeShop.add(new ProductInStock("Orange juice", "GlutenFreeShop", 2.5, 3));
        listProductsGlutenFreeShop.add( new ProductInStock("Milk", "GlutenFreeShop", 5.00, 11));
        listProductsGlutenFreeShop.add(new ProductInStock("Butter", "GlutenFreeShop", 6.00, 3));
        listProductsGlutenFreeShop.add(new ProductInStock("Rolls", "GlutenFreeShop", 1.00, 6));

        List<ProductInStock> listHealthyShop = new ArrayList<>();
        listHealthyShop.add(new ProductInStock("Apples", "HealthyShop", 2.40, 5));
        listHealthyShop.add(new ProductInStock("Tomatoes", "HealthyShop", 4.12, 5));
        listHealthyShop.add(new ProductInStock("Orange juice", "HealthyShop", 2.1, 8));
        listHealthyShop.add( new ProductInStock("Bananas", "HealthyShop", 5.50, 2));
        listHealthyShop.add( new ProductInStock("Mineral water", "HealthyShop", 1.80, 0));
        listHealthyShop.add(new ProductInStock("Tomato juice", "HealthyShop", 2.50, 12));

        Map<String, List<ProductInStock>> listOfProducers = new HashMap<>();
        listOfProducers.put("ExtraFoodShop", listProductsExtraFoodShop);
        listOfProducers.put("GlutenFreeShop",listProductsGlutenFreeShop);
        listOfProducers.put("HealthyShop",listHealthyShop);

        return listOfProducers;
    }
}


