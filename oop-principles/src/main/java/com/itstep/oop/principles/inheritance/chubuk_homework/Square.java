package com.itstep.oop.principles.inheritance.chubuk_homework;

class Square extends Rectangle
{
    Square(String name, double sides1)
    {
        super(name, sides1);
    }
    @Override
    double getAreaArea()
    {
        return getSides()[0]*getSides()[0];
    }
}
