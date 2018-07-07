package food2Door.manufacturer;

import food2Door.OrderCard;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class ExtraFoodShop implements Manufacturer {

    private Map<ProductInStock, Integer> stock = new HashMap<ProductInStock, Integer>();

    public void addToStock(ProductInStock productInStock, Integer inStock) {
        Integer inStockCurrent = stock.get(productInStock);

            if (inStockCurrent == null) {
                stock.put(productInStock, inStock);
            } else {
                stock.put(productInStock, inStockCurrent + inStock);
            }
        }

    public boolean process(OrderCard currentOrder) {
                stock.entrySet().stream()
                .map(s -> s.getValue()-currentOrder.getQuantityOfPieces());
        return true;
    }

    public boolean checkInStock(String productName, int orderedQuantity) {

        OrderCard currentOrder = addToStock();
        orderedQuantity = currentOrder.getQuantityOfPieces();


        ProductInStock productInStock = null;
        productName = productInStock.getProductNameInStock();


        Integer numberInStock = stock.get(new ProductInStock(productName, productInStock.getPrice()));
        if (numberInStock == null) {
            return false;
        } else {
            return numberInStock >= orderedQuantity;
        }
    }

    @Override
    public BigDecimal getProductPrice() {
        BigDecimal price = null;
        for (Map.Entry<ProductInStock, Integer> entry : stock.entrySet()) {
            price = entry.getKey().getPrice();
        }

        return price;
    }
}
