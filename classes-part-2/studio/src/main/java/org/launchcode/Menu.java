package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(Date d, ArrayList <MenuItem> m) {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }
    public void addMenuItem(MenuItem item){
        menuItems.add(item);
        lastUpdated = new Date();
    }
    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }
    public void updateLastUpdated() {
        lastUpdated = new Date();
    }
    public ArrayList<MenuItem> getAllMenuItems() {
        return menuItems;
    }

    public ArrayList<MenuItem> getMenuItemsByCategory(String category) {
    return menuItems;
    }
}
