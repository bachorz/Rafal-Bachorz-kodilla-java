package food2Door.manufacturer;

import food2Door.OrderCard;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Manufacturer{

    private Map<ProductInStock, Integer> stock = new HashMap<ProductInStock, Integer>();

    public void addToStock(ProductInStock productInStock, Integer inStock) {
        Integer inStockCurrent = stock.get(productInStock);

        if (inStockCurrent == null) {
            stock.put(productInStock, inStockCurrent);
        } else {
            stock.put(productInStock, inStockCurrent + inStock);
        }
    }

    public boolean process(OrderCard currentOrder) {
        if (checkInStock(currentOrder.getProductName(), currentOrder.getQuantityOfPieces()))  {
            ProductInStock product = new ProductInStock(currentOrder.getProductName());
            Integer inStockCurrent = stock.get(product);
            stock.put(product, inStockCurrent - currentOrder.getQuantityOfPieces());
            return true;
        } else {
            return false;
        }
    }

    public boolean checkInStock(String productName, int orderedQuantity) {
        Integer numberInStock = stock.get(productName);
        if (numberInStock == null) {
            return false;
        } else {
            return numberInStock >= orderedQuantity;
        }
    }

    @Override
    public BigDecimal getProductPrice(String productName) {
        return stock.entrySet()
                .stream()
                .filter(p -> p.getKey().getProductNameInStock().equals(productName))
                .map(p -> p.getKey().getPrice())
                .findFirst()
                .orElse(null);
    }
}

