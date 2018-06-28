//package food2Door;
//
//import food2Door.informationService.InformationService;
//import food2Door.informationService.MailService;
//import food2Door.manufacturer.ExtraFoodShop;
//import food2Door.manufacturer.GlutenFreeShop;
//import food2Door.manufacturer.HealthyShop;
//import food2Door.manufacturer.ProductInStock;
//
//import java.util.Comparator;
//
//public class ManufacturerSelection {
//
//    public ProductInStock selection() {
//
//        ProductBase productBase = new ProductBase();
//        FillTheOrder fillTheOrder = new FillTheOrder();
//        OrderCard orderCard = fillTheOrder.completing();
//
//
//        ProductInStock result = productBase.getProducts().entrySet().stream()
//                .flatMap(s -> s.getValue().stream())
//                .filter(s -> s.getProductNameInStock() == orderCard.getProductName())
//                .filter(s -> s.getQuantityInStock() >= orderCard.getQuantityOfPieces())
//                .min(Comparator.comparingDouble(ProductInStock::getPrice))
//                .orElse(null);
//
//        return result;
//    }
//
//    public boolean verificationOfImplementation() {
//
//        ManufacturerSelection manufacturerSelection = new ManufacturerSelection();
//        ProductInStock result2 = manufacturerSelection.selection();
//
//        if (result2 != null) {
//            return true;
//        }
//        return false;
//    }
//
//    public void orderConfirmation (){
//
//        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
//        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
//        HealthyShop healthyShop = new HealthyShop();
//
//        ManufacturerSelection manufacturerSelection = new ManufacturerSelection();
//        InformationService informationService = new MailService();
//
//        ProductInStock result3  = manufacturerSelection.selection();
//        if(result3 != null) {
//            if (result3.getManufacturerName() == "ExtraFoodShop") {
//                extraFoodShop.process();
//            }
//            if (result3.getManufacturerName() == "GlutenFreeShop") {
//                glutenFreeShop.process();
//            }
//            if (result3.getManufacturerName() == "HealthyShop") {
//                healthyShop.process();
//            }
//        }else {
//            ((MailService) informationService).closingTheOrder();
//        }
//    }
//}
//
//
//
