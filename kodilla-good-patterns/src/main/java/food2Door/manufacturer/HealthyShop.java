package food2Door.manufacturer;

import food2Door.OrderCard;

import java.math.BigDecimal;

public class HealthyShop implements Manufacturer{

    public boolean process(OrderCard currentOrder) {

        return true;
    }

    public boolean checkInStock(String productName){

        return true;
    }

    @Override
    public BigDecimal getProductPrice() {
        return null;
    }
}
