package food2Door;


import food2Door.informationService.InformationService;
import food2Door.manufacturer.Manufacturers;
import food2Door.manufacturer.ProductInStock;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {


    private InformationService informationService;
    Manufacturers manufacturers = new Manufacturers();

    public OrderService(InformationService informationService){
        this.informationService = informationService;

    }

    public Map<OrderCard, InformationService> orderProcessor(List<OrderCard> orders) {

        Map<OrderCard, InformationService> result = new HashMap<>();

        for (int i = 0; i < orders.size(); i++) {
            ProductInStock order = manufacturers.getManufacturers().entrySet().stream()
                    .flatMap(s -> s.getValue().stream())
                    .filter(s -> s.getProductNameInStock().equals(orders.get(0).getProductName()))
                    .filter(s -> s.getQuantityInStock() >= orders.get(0).getQuantityOfPieces())
                    .min(Comparator.comparingDouble(ProductInStock::getPrice))
                    .orElse(null);

            if (order == null) {
                informationService.informNegativ();

            } else {
                informationService.inform();
            }
            result.put(orders.get(i), informationService);
        }
        return result;
    }
}
