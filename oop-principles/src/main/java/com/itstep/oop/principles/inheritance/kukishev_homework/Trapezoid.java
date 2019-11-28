package com.itstep.oop.principles.inheritance.kukishev_homework;

public class Trapezoid extends Shape{


    private double lenghtUp;
    private double lenghtDown;
    private double height;


    public Trapezoid (double lenghtUp, double lenghtDown, double height){
        super("Trapezoid");
        this.lenghtUp = lenghtUp;
        this.lenghtDown = lenghtDown;
        this.height = height;
    }





    @Override
    public double getArea() {
        return (lenghtDown + lenghtUp) / 2 * height;
    }



}
