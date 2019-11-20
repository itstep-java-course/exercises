package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public class RightTriangle extends Triangle {
    public RightTriangle(double side1, double side2, double side3, String name) {
        super(side1, side2, side3, name);
    }

    @Override
    public double calcArea() {
        int j = 0;
        for (int i = 0; i < 3; i++)
            if (side[i] > side[j])
                j = i;
        double temp = side[j];
        side[j] = side[0];
        side[0] = temp;
        area = (side[1] * side[2]) / 2;
        return area;
    }
}
