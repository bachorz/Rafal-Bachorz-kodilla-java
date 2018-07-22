package food2Door.informationService;

public class MailService implements InformationService {

    @Override
    public String inform(){

        return "\nThe order has been sent \n";
    }
    @Override
    public String informNegative(){

        return "\nThe order has not been processed \n";
    }
}
