package com.itstep.oop.principles.inheritance.chubuk_homework;

class RectangularTriangle extends Rectangle
{
    RectangularTriangle(String name, double sides1, double sides2)
    {
        super(name, sides1, sides2);
    }

    @Override
    double getAreaArea()
    {
        return getSides()[1]*getSides()[0]/2;
    }
}
