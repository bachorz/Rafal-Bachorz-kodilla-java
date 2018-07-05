package food2Door.manufacturer;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductInStock  {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInStock that = (ProductInStock) o;
        return Objects.equals(productNameInStock, that.productNameInStock);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productNameInStock);
    }
}





