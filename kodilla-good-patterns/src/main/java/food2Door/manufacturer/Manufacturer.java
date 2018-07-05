package food2Door.manufacturer;

import food2Door.OrderCard;

import java.math.BigDecimal;

public interface Manufacturer{

    boolean process(OrderCard currentOrder);
    boolean checkInStock(String productName, int orderedQuantity);
    BigDecimal getProductPrice();
}
