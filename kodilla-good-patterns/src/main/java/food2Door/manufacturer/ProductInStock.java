package food2Door.manufacturer;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductInStock  {

    private String productNameInStock;
    private BigDecimal price;

    public ProductInStock(String productNameInStock, BigDecimal price) {
        this.productNameInStock = productNameInStock;
        this.price = price;
    }

    public String getProductNameInStock() {
        return productNameInStock;
    }

    public BigDecimal getPrice() {
        return price;
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





