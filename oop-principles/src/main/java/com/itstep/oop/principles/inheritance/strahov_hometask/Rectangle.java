package com.itstep.oop.principles.inheritance.strahov_hometask;

public class Rectangle extends Shape {
    private double lenght ;
    private double weight;
    public Rectangle(String name, double lenght, double weight){
        super (name);
        this.lenght=lenght;
        this.weight=weight;
    }
    public Rectangle(double lenght,double weight){
        super("Rectangle");
        this.weight=weight;
        this.lenght=lenght;

    }
    @Override
    public double getArea(){
        return weight*lenght;
    }
}
