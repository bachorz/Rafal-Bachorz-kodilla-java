package food2Door.informationService;

public class MailService implements InformationService {

    @Override
    public String infor(){

        return "\nThe order has been sent \n";
    }
    @Override
    public String informNegativ(){

        System.out.println("\nThe order has not been processed \n");

        return "\nThe order has not been processed \n";
    }

}
