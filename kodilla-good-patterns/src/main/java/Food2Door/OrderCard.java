package Food2Door;

import Food2Door.Manufacturer.Manufacturer;

public class OrderCard {

    private int orderNumber;
    private Product product;
    private Manufacturer manufacturer;
    private RecipientOfDelivery recipientOfDelivery;

    public OrderCard(int orderNumber, Product product, Manufacturer manufacturer, RecipientOfDelivery recipientOfDelivery) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.manufacturer = manufacturer;
        this.recipientOfDelivery = recipientOfDelivery;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Product getProduct() {
        return product;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public RecipientOfDelivery getRecipientOfDelivery() {
        return recipientOfDelivery;
    }

    @Override
    public String toString() {
        return "OrderCard{" + "orderNumber=" + orderNumber + ", product=" + product + ", manufacturer=" + manufacturer + ", recipientOfDelivery=" + recipientOfDelivery + '}';
    }
}
