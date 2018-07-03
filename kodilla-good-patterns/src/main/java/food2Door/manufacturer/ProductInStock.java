package food2Door.manufacturer;

import java.math.BigDecimal;

public class ProductInStock {

    private String productNameInStock;
    private String manufacturerName;
    private BigDecimal price;
    private int quantityInStock;

    public ProductInStock(String productNameInStock, String manufacturerName, BigDecimal price, int quantityInStock) {
        this.productNameInStock = productNameInStock;
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getProductNameInStock() {
        return productNameInStock;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}


