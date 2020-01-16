package com.itstep.collections.arraylist;

public class Car implements Comparable<Car> {
    private String vin;
    private final String model;
    private String year;
    private String colour;
    private String type;

    Car(String vin, String model, String year, String colour, String type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.type = type;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
    @Override
    public int compareTo(Car o) {
        return this.colour.compareTo(o.colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
