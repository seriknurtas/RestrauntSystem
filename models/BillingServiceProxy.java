package models;

public class BillingServiceProxy extends BillingService {
    private BillingService realBillingService;

    public BillingServiceProxy() {
        this.realBillingService = new BillingService();
    }

    @Override
    public void processPayment(Order order) {
        System.out.println("Processing payment for Order ID: " + order.getId());
        
        //Переадресация на illingService
        realBillingService.processPayment(order);
    }
}
