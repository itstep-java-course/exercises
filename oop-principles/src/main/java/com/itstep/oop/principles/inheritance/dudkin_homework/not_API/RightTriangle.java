package com.itstep.oop.principles.inheritance.dudkin_homework.not_API;

public class RightTriangle extends Triangle {
    public RightTriangle(double[] side) {
        super(side);
    }

    @Override
    public double calcArea() {
        int j = 0;
        for (int i = 0; i < side.length; i++)
            if (side[i] > side[j])
                j = i;
        double temp = side[j];
        side[j] = side[0];
        side[0] = temp;
        area = (side[1] * side[2]) / 2;
        return area;
    }
}
