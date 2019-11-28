package com.itstep.oop.principles.inheritance.kukishev_homework;

public class Rectangle extends Shape{

    private double lenght;
    private double widht;


    public Rectangle(String name, double lenght, double widht) {
        super(name);
        this.lenght = lenght;
        this.widht = widht;

    }


    public Rectangle(double lenght, double widht){
        super("Rectangle");
        this.lenght = lenght;
        this.widht = widht;


    }

    @Override
    public double getArea() {
        return lenght * widht;
    }

}




