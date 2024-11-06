package models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> items;

    public Menu() {
        items = new ArrayList<>();
        items.add("Chiken Doner");
        items.add("Besparmak");
        items.add("Shashlyk (Beef)");
        items.add("Lagman");
    }
    public List<String> getItems() {
        return items;
    }
    public void displayMenu() {
        System.out.println("Menu:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

