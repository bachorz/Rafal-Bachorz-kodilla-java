package Food2Door;

public class Product {

    private String productName;
    private double productWeight;
    private double quantityOfPieces ;
    private double price;
    private double toPay = (productWeight + quantityOfPieces) * price;

    public Product(String productName, double productWeight, double quantityOfPieces, double price, double toPay) {
        this.productName = productName;
        this.productWeight = productWeight;
        this.quantityOfPieces = quantityOfPieces;
        this.price = price;
        this.toPay = (productWeight + quantityOfPieces) * price;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public double getQuantityOfPieces() {
        return quantityOfPieces;
    }

    public double getPrice() {
        return price;
    }

    public double getToPay() {
        return toPay;
    }

    @Override
    public String toString() {
        return "Product{" + "productName='" + productName + '\'' + ", productWeight=" + productWeight +
                ", quantityOfPieces=" + quantityOfPieces + ", price=" + price + ", toPay=" + toPay + '}';
    }
}
