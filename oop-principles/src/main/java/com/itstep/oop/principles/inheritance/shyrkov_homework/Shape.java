package com.itstep.oop.principles.inheritance.shyrkov_homework;

abstract public class Shape {
    protected String name;

    Shape(String name){
        this.name = name;
    }

    abstract public double calculateArea();
}
