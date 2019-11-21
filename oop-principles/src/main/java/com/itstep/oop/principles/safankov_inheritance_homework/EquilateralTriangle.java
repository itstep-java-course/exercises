package com.itstep.oop.principles.safankov_inheritance_homework;

 class EquilateralTriangle extends RightAngledTriangle {//равносторонний треугольник
    EquilateralTriangle(double width){
        super(width,width);
    }
    @Override
   public double getArea(){
        double squareEquilateralTriangle= (Math.pow(width,2)*Math.sqrt(3))/2;              //(a^2*корень из 3)/2
    return squareEquilateralTriangle;
    }
}
