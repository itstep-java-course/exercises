package com.itstep.cl.object;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getCarInfo() {
        return "The car model: " + model + " has color: " + color;
    }
}
