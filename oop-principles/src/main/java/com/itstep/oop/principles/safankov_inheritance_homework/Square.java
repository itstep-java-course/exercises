package com.itstep.oop.principles.safankov_inheritance_homework;

 public class Square extends Rectangle {
    Square(double width){
        super(width,width);
    }
    @Override
    public double getArea(){
        double plochadKvadrata = width*width;
        return plochadKvadrata;
    }
}
