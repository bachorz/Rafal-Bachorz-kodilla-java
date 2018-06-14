package Food2Door;

import Food2Door.InformationService.InformationService;
import Food2Door.InformationService.TransferOfOrder;
import Food2Door.Manufacturer.ManufacturerService;

public class OrderProcessor {

    private InformationService informationService;
    private ManufacturerService manufacturerService;
    private TransferOfOrder transferOfOrder;

    public OrderProcessor(final InformationService informationService, final ManufacturerService manufacturerService, final TransferOfOrder transferOfOrder) {
        this.informationService = informationService;
        this.manufacturerService = manufacturerService;
        this.transferOfOrder = transferOfOrder;
    }

    public Dto process (final OrderCard orderCard) {
        transferOfOrder.transfer(orderCard.getProduct(), orderCard.getRecipientOfDelivery());
        boolean isOrdered = manufacturerService.implementation(orderCard.getProduct(), orderCard.getManufacturer(), orderCard.getRecipientOfDelivery());
        if(isOrdered) {
            informationService.inform(orderCard.getProduct(), orderCard.getManufacturer());
            return new Dto(orderCard.getRecipientOfDelivery(), true);
        }else {
            informationService.informNegative(orderCard.getProduct(), orderCard.getManufacturer());
            return new Dto(orderCard.getRecipientOfDelivery(), false);
        }
    }
}
