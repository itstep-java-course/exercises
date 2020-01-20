package com.itstep.collections.shyrkov_collections_homework;

public class Car implements Comparable<Car>{

    private int vin;
    private String model;
    private String year;
    private String color;
    private String type;

    public Car(int vin, String model, String year, String color, String type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public int getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString(){

        return "Vin: "+vin+"; Model: "+model+"; Year: "+year+"; Color: "+color+"; Type: "+type;
    }

    @Override
    public int compareTo(Car car){
        if(this.year.equals(car.year))
            return 1;
        else
            return -1;

    }
}
