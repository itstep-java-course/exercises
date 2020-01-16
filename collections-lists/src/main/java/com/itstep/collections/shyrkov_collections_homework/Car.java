package com.itstep.collections.shyrkov_collections_homework;

public class Car implements Comparable<Car>{

    private int vin;
    private String model;
    private int year;
    private String color;
    private String type;

    public Car(int vin, String model, int year, String color, String type) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString(){

        return "Vin: "+vin+"; Model: "+model+"; Year: "+year+"; Color: "+color+"; Type: "+type;
    }

    @Override
    public int compareTo(Car car){
        if(this.year>=car.year)
            return 1;
        else
            return -1;

    }
}
