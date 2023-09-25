package org.launchcode;

public class MenuItem {
     private String name;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String Category,boolean N) {
        this.name = name;
        this.price = price;
        this.category = Category;
        this.isNew = N ;
    }
    public void setCategory(String category) {
      this.category = category;
    }

    public void setIsNew(boolean I) {
        this.isNew = I;
    }
    public void setPrice(double price) {
        this.price =  price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
