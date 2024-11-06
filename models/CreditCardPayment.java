package models;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        //через кредитную карту
        System.out.println("Paying " + order.getAmount() + " using credit card.");
    }
}