package com.itstep.cl.object.dudkin_homework;

public class Car {
    private static int counter=0;
    private double maxSpeed;
    private String model;
    private int numberOfSeats;
    {
        counter++;
    }
    public Car(double maxSpeed,String model,int numberOfSeats){
        this.numberOfSeats=numberOfSeats;
        this.model=model;
        this.maxSpeed=maxSpeed;
    }
    public void show(){
        System.out.println(maxSpeed+" "+model+" "+numberOfSeats);
    }
    public static void showCounter(){
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Car first=new Car(200.4,"Bugatti",4);
        first.show();
        Car second=new Car(180.6,"BMW",4);
        second.show();
        showCounter();
    }
}
