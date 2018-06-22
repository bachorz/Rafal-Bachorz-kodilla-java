package Food2Door;

import Food2Door.InformationService.MailService;
import Food2Door.Manufacturer.ProductInStock;

import java.util.List;
import java.util.stream.Collectors;

public class ManufacturerSelection {

    public List<ProductInStock> selection() {

        ProductBase productBase = new ProductBase();
        MailService mailService = new MailService();

        FillTheOrder fillTheOrder = new FillTheOrder();
        OrderCard orderCard = fillTheOrder.completing();


        List<ProductInStock> result = productBase.getProducts().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .filter(s -> s.getProductNameInStock() == orderCard.getProductName())
                .filter(s -> s.getQuantityInStock() >= orderCard.getQuantityOfPieces())
                //        .filter(s -> s.getQuantityInStock() < orderCard.getQuantityOfPieces()|| s.getQuantityInStock() == 0 = mailService.informNegativ())
                //.filter(s -> s.getQuantityInStock() < orderCard.getQuantityOfPieces()|| s.getQuantityInStock() == 0 )
                 // .map(MailService::informNegativ)
                .limit(1)
                .collect(Collectors.toList());

//        if (result == null) {
//            return result;
//
//        } else {
//
//            return mailService.informNegativ();
//        }
    }
}
