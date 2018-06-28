package food2Door.informationService;

public class MailService implements InformationService {

//    FillTheOrder fillTheOrder= new FillTheOrder();
//    OrderCard orderCard = fillTheOrder.completing();

    public void inform(){

        System.out.println("The order has been sent");
    }

    public void informNegativ(){

//        ProductBase productBase = new ProductBase();
//        FillTheOrder fillTheOrder = new FillTheOrder();
//        OrderCard orderCard = fillTheOrder.completing();
//
//        ProductInStock result5 = productBase.getProducts().entrySet().stream()
//                .flatMap(s -> s.getValue().stream())
//                .filter(s -> s.getProductNameInStock() == orderCard.getProductName())
//                .max(Comparator.comparingInt(ProductInStock::getQuantityInStock))
//                .orElse(null);
//
//        int maxQuantityInStock = result5.getQuantityInStock();
//
        System.out.println("The order has not been processed");
    }

    public  void closingTheOrder(){

        System.out.println("Closes the order.");
    }
}
