package com.itstep.collections.dudkin_hometask;

import com.itstep.collections.dudkin_hometask.Garage.MashinkaTypes;

public class Car {
    private String vin;
    private String model;
    private String color;
    private String year;
    private String type;

    public Car(String vin, String model, String color, MashinkaTypes type, Integer year) {
        this.year = Integer.toString(year);
        this.type = type.toString();
        this.vin = vin;
        this.model = model;
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

}
