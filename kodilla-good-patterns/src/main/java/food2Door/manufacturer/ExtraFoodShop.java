package food2Door.manufacturer;

import food2Door.OrderCard;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class ExtraFoodShop implements Manufacturer {

    private Map<ProductInStock, Integer> stock = new HashMap<ProductInStock, Integer>();

//    @Override
//    public ProductInStock(String productNameInStock) {
//        this.productNameInStock = productNameInStock;
//    }


    public void addToStock(ProductInStock productInStock, Integer inStock) {
        Integer inStockCurrent = stock.get(productInStock);

            if (inStockCurrent == null) {
                stock.put(productInStock, inStock);
            } else {
                stock.put(productInStock, inStockCurrent + inStock);
            }
        }

    public boolean process(OrderCard currentOrder) {
        ProductInStock product = null;
        if (checkInStock(currentOrder.getProductName(), currentOrder.getQuantityOfPieces())) {
            Integer inStockCurrent = stock.get(new ProductInStock(currentOrder.getProductName(), product.getPrice()));
            stock.put(product, inStockCurrent - currentOrder.getQuantityOfPieces());
            return true;
        } else {
            return false;
        }
    }


    public boolean checkInStock(String productName, int orderedQuantity) {

ProductInStock product = null;

       // BigDecimal price = product.getPrice();
        //productName = product.getProductNameInStock();
        Integer numberInStock = stock.get(new ProductInStock(productName, product.getPrice()));
        if (numberInStock == null) {
            return false;
        } else {
            return numberInStock >= orderedQuantity;
        }
    }

    @Override
    public BigDecimal getProductPrice() {
        OrderCard orderCard = null;
        String productName = orderCard.getProductName();
        return stock.entrySet()
                .stream()
                .filter(p -> p.getKey().getProductNameInStock().equals(productName))
                .map(p -> p.getKey().getPrice())
                .findFirst()
                .orElse(null);
    }
}
