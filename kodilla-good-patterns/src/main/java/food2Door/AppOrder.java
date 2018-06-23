package food2Door;

import food2Door.informationService.InformationService;
import food2Door.informationService.MailService;

public class AppOrder {

    public static void main(String[] args){

        ManufacturerSelection manufacturerSelection = new ManufacturerSelection();

        boolean result4 = manufacturerSelection.verificationOfImplementation();
        InformationService informationService = new MailService();

        if(result4){
            informationService.inform();
        }else {
            informationService.informNegativ();
        }
        manufacturerSelection.orderConfirmation();
    }
}
