package models;

public class OrderFactory {
    private static int idCounter = 1;
    public static Order createOrder(String description, double amount) {
        return new Order(idCounter++, description, amount);
    }
}
