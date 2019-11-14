package com.itstep.cl.object.huk_classwork;


public class Calculator {

        private double value1;
        private double value2;
        private String sign;

    public Calculator(double value1, double value2, String sign) {
        this.value1 = value1;
        this.value2 = value2;
        this.sign = sign;
    }

    public double calculator(){
        if (sign.equals("+") ){
           double sum = value1+value2;
           return sum;
        }

        else if (sign.equals("-")){
            double min = value1-value2;
            return min;
        }

        else if  (sign.equals("/")){
            double del = (value1/value2);
            return del;
        }

        else if(sign.equals("*")){
            double ymn = (value1*value2);
            return ymn;
        }
       return 0;
    }


    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(20.00, 30.00,"+");
        System.out.println(calculator1.calculator());
        Calculator calculator2 = new Calculator(20.00, 30.00,"-");
        System.out.println(calculator2.calculator());
        Calculator calculator3 = new Calculator(20.00, 30.00,"*");
        System.out.println(calculator3.calculator());
        Calculator calculator4 = new Calculator(20.00, 30.00,"/");
        System.out.println(calculator4.calculator());
    }
}
