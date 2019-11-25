package com.itstep.oop.principles.inheritance.shyrkov_classwork;

public abstract class Car {
    private String mark;
    private String model;
    private double maxSpeed;

    Car(String mark, String model, double maxSpeed) {
        this.mark = mark;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void getCarInfo(){
        System.out.println(mark+" "+model+" "+maxSpeed+"km/h");
    }

    public abstract void startEngine();
}
