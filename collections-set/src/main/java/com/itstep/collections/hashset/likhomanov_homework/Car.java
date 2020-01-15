package com.itstep.collections.hashset.likhomanov_homework;

import java.util.Objects;

public class Car {

    private final String vin;
    private final String model;
    private final String year;
    private final String colour;
    private final String type;

    Car(String vin, String model, String year, Colour colour, BodyType type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.colour = colour.toString();
        this.type = type.toString();
    }

    public String getVin() {
        return vin;
    }

    public String getFullVin() {
        return "vin: " + vin;
    }

    public String getModel() {
        return model;
    }

    public String getFullModel() {
        return "model: " + model;
    }

    public String getYear() {
        return year;
    }

    public String getFullYear() {
        return "year: " + year;
    }

    public String getColour() {
        return colour;
    }

    public String getFullColour() {
        return "colour: " + colour;
    }

    public String getType() {
        return type;
    }

    public String getFullType() {
        return "type: " + type;
    }

    @Override
    public String toString() {
        return model + "-" + vin + "-" + colour + "-" + type + "-" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vin.equals(car.vin) &&
                model.equals(car.model) &&
                year.equals(car.year) &&
                colour.equals(car.colour) &&
                type.equals(car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
