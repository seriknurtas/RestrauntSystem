package controllers;

import models.User;
import views.ConsoleView;

public class UserController {
    private ConsoleView view;
    public UserController(ConsoleView view) {
        this.view = view;
    }
    public void displayUserDetails(User user) {
        view.showUserDetails(user);
    }
}
