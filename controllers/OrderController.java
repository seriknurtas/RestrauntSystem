package controllers;

import models.BillingService;
import models.Menu;
import models.Order;
import models.OrderFactory;
import models.PaymentStrategy;
import views.ConsoleView;

public class OrderController {
    private ConsoleView view;
    private BillingService billingService;
    private Menu menu;
    public OrderController(ConsoleView view, BillingService billingService, Menu menu) {
        this.view = view;
        this.billingService = billingService;
        this.menu = menu;
    }
    public void createAndPlaceOrder(String description, double amount, PaymentStrategy paymentStrategy) {
    Order order = OrderFactory.createOrder(description, amount);
    view.showOrderDetails(order);
    billingService.processPayment(order);
    paymentStrategy.pay(order);
    view.showMessage("Order placed successfully! Status: " + order.getStatus());
}

    public void showMenu() {
        view.showMenu(menu);
    }
}
