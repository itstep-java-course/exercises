package com.itstep.oop.principles.inheritance.chubuk_homework;

class Triangle extends Shape
{
    Triangle(String name, double sides1, double sides2, double sides3)
    {
        super(name, sides1, sides2, sides3);
    }

    @Override
    double getAreaArea()
    {
        double halfPerimeter = (getSides()[2]+getSides()[1]+getSides()[0])/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-getSides()[0])*(halfPerimeter-getSides()[1])*(halfPerimeter-getSides()[2]));
    }
}
