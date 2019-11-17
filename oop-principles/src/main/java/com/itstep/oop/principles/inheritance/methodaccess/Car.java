package com.itstep.oop.principles.inheritance.methodaccess;

public class Car {
    private String color;
    private String name;

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    protected String getCarInfo() {
        return "The color is: " + color + ", the name is: " + name;
    }
}
