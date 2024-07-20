package com.example.blackcofferassignment;

public class Person {

    String name;
    String details;
    String height;
    String lookingFor;
    String about;

    public Person(String name, String details, String height, String lookingFor, String about) {
        this.name = name;
        this.details = details;
        this.height = height;
        this.lookingFor = lookingFor;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getHeight() {
        return height;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public String getAbout() {
        return about;
    }
}
