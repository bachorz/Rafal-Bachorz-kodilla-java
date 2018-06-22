package Food2Door;

public class OrderCard {

    private String productName;
    private int quantityOfPieces ;
    private RecipientOfDelivery recipientOfDelivery;


    public OrderCard(String productName, int quantityOfPieces, RecipientOfDelivery recipientOfDelivery) {
        this.productName = productName;
        this.quantityOfPieces = quantityOfPieces;
        this.recipientOfDelivery = recipientOfDelivery;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfPieces() {
        return quantityOfPieces;
    }

    public RecipientOfDelivery getRecipientOfDelivery() {
        return recipientOfDelivery;
    }

    @Override
    public String toString() {
        return "OrderCard{" + "productName='" + productName + '\'' + ", quantityOfPieces=" + quantityOfPieces + ", recipientOfDelivery=" + recipientOfDelivery + '}';
    }
}
