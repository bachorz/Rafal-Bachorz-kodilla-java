package food2Door.manufacturer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manufacturers {

    ManufacturerService extraFoodShop = new ExtraFoodShop();
    ManufacturerService glutenFreeShop = new GlutenFreeShop();
    ManufacturerService healthyShop = new HealthyShop();




    public Map<String, List<ProductInStock>> getManufacturers(){


        Map<String, List<ProductInStock>> mapOfProducers = new HashMap<>();
        mapOfProducers.put("extraFoodShop", extraFoodShop.process());
        mapOfProducers.put("glutenFreeShop", glutenFreeShop.process());
        mapOfProducers.put("healthyShop", healthyShop.process());


        return mapOfProducers;
    }
}
