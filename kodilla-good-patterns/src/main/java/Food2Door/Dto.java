package Food2Door;

public class Dto {

    private RecipientOfDelivery recipientOfDelivery;
    private boolean isOrdered;

    public Dto(RecipientOfDelivery recipientOfDelivery, boolean isOrdered) {
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


