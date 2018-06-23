package food2Door.manufacturer;

import food2Door.FillTheOrder;
import food2Door.ManufacturerSelection;
import food2Door.OrderCard;

public class GlutenFreeShop implements ManufacturerService {

    public void process() {

        FillTheOrder fillTheOrder= new FillTheOrder();
        OrderCard orderCard = fillTheOrder.completing();

        ManufacturerSelection manufacturerSelection = new ManufacturerSelection();
        ProductInStock productInStock = manufacturerSelection.selection();

        System.out.println("Here, GlutenFreeShop order: " + productInStock.getProductNameInStock() +  ", pieces: " + orderCard.getQuantityOfPieces() +
                " has been sent. The payment amount is "  + (productInStock.getPrice() * orderCard.getQuantityOfPieces()) + ". Delivery address: " +
                orderCard.getRecipientOfDelivery());
    }
}
