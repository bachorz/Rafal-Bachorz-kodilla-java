package Food2Door;

public class Food2DoorDto {

    private RecipientOfDelivery recipientOfDelivery;
    private boolean isOrdered;

    public Food2DoorDto(RecipientOfDelivery recipientOfDelivery, boolean isOrdered) {
        this.recipientOfDelivery = recipientOfDelivery;
        this.isOrdered = isOrdered;
    }

    public RecipientOfDelivery getRecipientOfDelivery() {
        return recipientOfDelivery;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
