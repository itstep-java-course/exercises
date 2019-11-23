package com.itstep.oop.principles.inheritance.huk_homework;

public  class Shape { //Фигура

    private double a; //одно общее поле

    public Shape(double a) {
        this.a = a;
    }

    double getPayableSquare()
    {
        return a;
    }

}