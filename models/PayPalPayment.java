package models;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        //через PayPal
        System.out.println("Paying " + order.getAmount() + " using PayPal.");
    }
}
