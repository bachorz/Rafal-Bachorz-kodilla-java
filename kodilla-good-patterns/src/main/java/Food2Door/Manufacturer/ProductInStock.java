package Food2Door.Manufacturer;

public class ProductInStock {

    private String productNameInStock;
    private String manufacturerName;
    private double price;
    private int quantityInStock;


    public ProductInStock(String productNameInStock, String manufacturerName, double price, int quantityInStock) {
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

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
    

    }

}
