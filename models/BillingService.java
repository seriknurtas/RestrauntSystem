package models;

public class BillingService {
    public void processPayment(Order order) {
        System.out.println("Processing payment for " + order.getAmount() + " for Order ID: " + order.getId());
        order.setStatus("Paid");
    }
}
