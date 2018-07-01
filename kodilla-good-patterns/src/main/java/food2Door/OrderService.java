package food2Door;


import food2Door.informationService.InformationService;
import food2Door.manufacturer.Manufacturers;
import food2Door.manufacturer.ProductInStock;

import java.util.*;

public class OrderService {

    private InformationService informationService;
    private Manufacturers manufacturers;

    public OrderService(final InformationService informationService, final Manufacturers manufacturers) {
        this.informationService = informationService;
        this.manufacturers = manufacturers;
    }

    public Map<OrderCard, String> orderProcessor(List<OrderCard> orders) {

        Map<OrderCard, String> result = new HashMap<>();

        for (int i = 0; i < orders.size(); i++) {
            final OrderCard currentOrder = orders.get(i);
            ProductInStock order = manufacturers.getManufacturers().entrySet().stream()
                    .flatMap(s -> s.getValue().stream())
                    .filter(s -> s.getProductNameInStock().equals(currentOrder.getProductName()))
                    .filter(s -> s.getQuantityInStock() >= currentOrder.getQuantityOfPieces())
                    .min(Comparator.comparingDouble(ProductInStock::getPrice))
                    .orElse(null);
            if (order == null) {
                result.put(orders.get(i), informationService.informNegativ());
            }else{
                result.put(orders.get(i), informationService.infor());
            }
        }
        return result;
    }
}





