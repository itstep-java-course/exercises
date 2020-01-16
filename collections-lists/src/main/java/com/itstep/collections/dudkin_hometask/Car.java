package com.itstep.collections.dudkin_hometask;

import com.itstep.collections.dudkin_hometask.Garage.MashinkaTypes;

public class Car {
    private String vin;
    private String model;
    private String color;
    private int year;
    private MashinkaTypes type;

    public Car(String vin, String model, String color, MashinkaTypes type, int year) {
        this.year = year;
        this.type = type;
        this.vin = vin;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public MashinkaTypes getType() {
        return type;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

}
