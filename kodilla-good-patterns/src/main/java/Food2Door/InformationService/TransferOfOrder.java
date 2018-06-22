package Food2Door.InformationService;

import Food2Door.RecipientOfDelivery;

public class TransferOfOrder {

    public void transfer(Product product, RecipientOfDelivery recipientOfDelivery){

        System.out.println("Here, Food2Door, we send the order for processing: " + product.getProductName() + ", weight: " +  product.getProductWeight() + ", pieces: " +
                product.getQuantityOfPieces() + ", "  + recipientOfDelivery.getName() +", "  + recipientOfDelivery.getSurname() +", " + recipientOfDelivery.getAddress());
    }

}
