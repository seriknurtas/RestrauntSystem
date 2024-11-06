package views;

import models.Menu;
import models.Order;
import models.User;

public class ConsoleView {
    public void showOrderDetails(Order order) {
        System.out.println("Displaying order details: " + order);
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
    public void showMenu(Menu menu) {
        menu.displayMenu();
    }
    public void showUserDetails(User user) {
        System.out.println("User Details - Name: " + user.getName() + ", Email: " + user.getEmail());
    }
}
