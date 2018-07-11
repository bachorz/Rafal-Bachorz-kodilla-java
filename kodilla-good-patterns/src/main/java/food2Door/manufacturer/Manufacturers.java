package food2Door.manufacturer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manufacturers {

    ExtraFoodShop extraFoodShop = new  ExtraFoodShop();
    GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
 //   HealthyShop healthyShop = new HealthyShop();

    public List<Manufacturer> getManufacturers(){

        List<Manufacturer> listOfProducers = new ArrayList<>();

       // List<ProductInStock> listProductsextraFoodShop = new ArrayList<>();
        extraFoodShop.addToStock(new ProductInStock("Apples",  new BigDecimal("2.90")), 10);
        extraFoodShop.addToStock(new ProductInStock("Tomatoes", new BigDecimal("4.10")), 5);
        extraFoodShop.addToStock(new ProductInStock("Orange juice",  new BigDecimal("2.0")), 8);
        extraFoodShop.addToStock(new ProductInStock("Bananas", new BigDecimal("5.00")), 11);
        extraFoodShop.addToStock(new ProductInStock("Butter",  new BigDecimal("6.00")), 3);
        extraFoodShop.addToStock(new ProductInStock("Tomato juice", new BigDecimal("2.50")), 4);
        listOfProducers.add(extraFoodShop);

        //List<ProductInStock> listProductsGlutenFreeShop = new ArrayList<>();
        glutenFreeShop.addToStock(new ProductInStock("Apples", new BigDecimal("3.10")), 10);
        glutenFreeShop.addToStock(new ProductInStock("Sour cream",  new BigDecimal("3.10")), 2);
        glutenFreeShop.addToStock(new ProductInStock("Orange juice",  new BigDecimal("2.5")), 3);
        glutenFreeShop.addToStock(new ProductInStock("Milk",  new BigDecimal("5.00")), 11);
        glutenFreeShop.addToStock(new ProductInStock("Butter",  new BigDecimal("6.00")), 3);
        glutenFreeShop.addToStock(new ProductInStock("Rolls",  new BigDecimal("1.00")), 6);
        listOfProducers.add(glutenFreeShop);

       // List<ProductInStock> listHealthyShop = new ArrayList<>();
//        healthyShop.addToStock(new ProductInStock("Apples",  new BigDecimal("2.40")), 5);
//        healthyShop.addToStock(new ProductInStock("Tomatoes", new BigDecimal("4.12")), 5);
//        healthyShop.addToStock(new ProductInStock("Orange juice", new BigDecimal("2.1")), 8);
//        healthyShop.addToStock(new ProductInStock("Bananas",  new BigDecimal("5.50")), 2);
//        healthyShop.addToStock(new ProductInStock("Mineral water", new BigDecimal("1.80")), 0);
//        healthyShop.addToStock(new ProductInStock("Tomato juice", new BigDecimal("2.50")), 12);
//        listOfProducers.add(healthyShop);

        return listOfProducers;
    }
}
