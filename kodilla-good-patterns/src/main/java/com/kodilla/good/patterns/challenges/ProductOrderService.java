package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private EshopService eshopService;
    private EshopRepository eshopRepository;

    public ProductOrderService(final InformationService informationService,
                               final EshopService eshopService,
                               final EshopRepository eshopRepository) {
        this.informationService = informationService;
        this.eshopService = eshopService;
        this.eshopRepository = eshopRepository;
    }

    public EshopDto process(final OrderForm orderForm) {
        boolean isBought = eshopService.buy(orderForm.getClient(), orderForm.getProduct());

        if(isBought) {
            informationService.inform(orderForm.getClient());
            eshopRepository.createRental(orderForm.getClient(), orderForm.getProduct());
            return new EshopDto(orderForm.getClient(), true);
        } else {
            return new EshopDto(orderForm.getClient(), false);
        }
    }
}
