package food2Door;


import food2Door.informationService.InformationService;
import food2Door.manufacturer.Manufacturer;
import food2Door.manufacturer.Manufacturers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            final Manufacturer manufacturer = manufacturers.getManufacturers().stream()
                    .filter(m -> m.checkInStock(currentOrder.getProductName(), currentOrder.getQuantityOfPieces()))
                    .min(Comparator.comparing(Manufacturer::getProductPrice))
                    .orElse(null);
            if (manufacturer == null) {
                result.put(orders.get(i), informationService.informNegativ());
            } else {
                boolean orderResult = manufacturer.process(currentOrder);
                if (orderResult) {
                    result.put(orders.get(i), informationService.infor());
                } else {
                    result.put(orders.get(i), informationService.informNegativ());
                }
            }
        }
        return result;
//        for (int i = 0; i < orders.size(); i++) {
//            final OrderCard currentOrder = orders.get(i);
//            ProductInStock order = manufacturers.getManufacturers().entrySet().stream()
//                    .flatMap(s -> s.getValue().stream())
//                    .filter(s -> s.getProductNameInStock().equals(currentOrder.getProductName()))
//                    .filter(s -> s.getQuantityInStock() >= currentOrder.getQuantityOfPieces())
//                    .min(Comparator.comparingDouble(ProductInStock::getPrice))
//                    .orElse(null);
//            if (order == null) {
//                result.put(orders.get(i), informationService.informNegativ());
//            }else{
//                result.put(orders.get(i), informationService.infor());
//            }
//        }
//        return result;
    }
}





