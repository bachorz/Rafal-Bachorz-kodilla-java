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
        orders.forEach(currentOrder -> {
            final Manufacturer manufacturer = findCheapestManufacturer(currentOrder.getProductName(), currentOrder.getQuantityOfPieces());
            if (manufacturer == null) {
                result.put(currentOrder, informationService.informNegative());
            } else {
                boolean orderResult = manufacturer.process(currentOrder);
                if (orderResult) {
                    result.put(currentOrder, informationService.inform());
                } else {
                    result.put(currentOrder, informationService.informNegative());
                }
            }
        });
        return result;
    }

    private Manufacturer findCheapestManufacturer(String productName, int quantity) {
        return manufacturers.getManufacturers().stream()
                .filter(m -> m.checkInStock(productName, quantity))
                .min(Comparator.comparing(m -> m.getProductPrice(productName)))
                .orElse(null);
    }
}







