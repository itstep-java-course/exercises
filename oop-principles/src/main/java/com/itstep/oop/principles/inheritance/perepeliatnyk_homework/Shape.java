package com.itstep.oop.principles.inheritance.perepeliatnyk_homework;

public abstract class Shape {
    private String name;



    public Shape(String name) {
        this.name = name;

    }


    public abstract double getArea();

    public String getName(){
        return name;
    }


}
