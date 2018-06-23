package food2Door.informationService;

import food2Door.FillTheOrder;
import food2Door.OrderCard;
import food2Door.ProductBase;
import food2Door.manufacturer.ProductInStock;

import java.util.Comparator;

public class MailService implements InformationService {

    FillTheOrder fillTheOrder= new FillTheOrder();
    OrderCard orderCard = fillTheOrder.completing();

    public void inform(){

        System.out.println("food2Door here, order: " + orderCard.getProductName() +
                ", pieces: " + orderCard.getQuantityOfPieces() + " has been accepted for implementation.");
    }

    public void informNegativ(){

        ProductBase productBase = new ProductBase();
        FillTheOrder fillTheOrder = new FillTheOrder();
        OrderCard orderCard = fillTheOrder.completing();

        ProductInStock result5 = productBase.getProducts().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .filter(s -> s.getProductNameInStock() == orderCard.getProductName())
                .max(Comparator.comparingInt(ProductInStock::getQuantityInStock))
                .orElse(null);

        int maxQuantityInStock = result5.getQuantityInStock();

        System.out.println("food2Door here, order: " + orderCard.getProductName() +
                ", pieces: " + orderCard.getQuantityOfPieces() +
                " can not be completed. Order a smaller quantity or change the product. The stock status of the "
                + orderCard.getProductName() + " is a number: " + maxQuantityInStock + ".");
    }

    public  void closingTheOrder(){

        System.out.println("Closes the order.");
    }
}
