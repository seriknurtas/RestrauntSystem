package models;

public class Order {
    private int id;
    private String description;
    private double amount;
    private String status;
    public Order(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.status = "Pending";  // Nachalnyi status zakaza
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public double getAmount() {
        return amount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + ", Description: " + description + ", Amount: " + amount + ", Status: " + status;
    }
}
