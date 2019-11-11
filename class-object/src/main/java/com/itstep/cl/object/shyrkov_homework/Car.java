package com.itstep.cl.object.shyrkov_homework;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private final int releaseYear;
    private boolean isNew;
    private double trip;

    public Car(String model, String color, int maxSpeed, int releaseYear, boolean isNew, double trip) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.releaseYear = releaseYear;
        this.isNew = isNew;
        if(isNew)
            this.trip = 0;
        else
            this.trip = trip;
    }

    public void goTrip(double distance){
        if(isNew)
            isNew = false;
        trip+=distance;
        System.out.println("You have travelled "+distance+"km. Your mileage = "+trip+"km.");
    }

    public void printCarInfo()
    {
        System.out.print("Car model - "+model+", color - "+color+", max speed = "+maxSpeed+", released in "+releaseYear);
        if(isNew){
            System.out.println(" and it`s new.");
        }
        else
            System.out.println(", it`s not new, trip = "+trip);
    }

    public static void main(String[] args) {
        Car audi = new Car("Audi A3","white", 250, 2013,true,0);
        Car bmw = new Car("BMW X5", "black", 220, 2010,false, 2000);
        audi.printCarInfo();
        audi.goTrip(100.5);
        audi.printCarInfo();
        bmw.printCarInfo();
    }
}
