package com.itstep.collections.dudkin_hometask.Garage;

public class Mashinka implements Comparable<Mashinka> {
    private String vin;
    private String model;
    private String color;
    private int year;
    private MashinkaTypes type;
    private int currentNumber;
    private static int number = 0;

    {
        number++;
        currentNumber = number;
    }

    public Mashinka(String vin, String model, String color, MashinkaTypes type, int year) {
        this.year = year;
        this.type = type;
        this.vin = vin;
        this.model = model;
        this.color = color;
    }

    public void SoutMashinkaInfo() {
        System.out.println("Car" + currentNumber + "\tvin=" + vin + "\tmodel=" + model + "\tcolor=" + color + "\ttype=" + type + "\tyear=" + year);
    }

    @Override
    public int compareTo(Mashinka o) {
        return this.color.compareTo(o.color);
    }
}
