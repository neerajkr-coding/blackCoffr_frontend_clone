package com.example.blackcofferassignment;

public class Item {

    String title;
    String desc;
    String location;
    String price;
    int Image;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return Image;
    }

    public Item(String title, String desc, String location, String price, int image) {
        this.title = title;
        this.desc = desc;
        this.location = location;
        this.price = price;
        Image = image;
    }


}
