package com.itstep.cl.object.perepeliatnyk_classwork;

public class CalculatorTask {
    private double vol1;
    private double vol2;
    private String sign;

    public CalculatorTask(double vol1, double vol2, String sign) {
        this.vol1 = vol1;
        this.vol2 = vol2;
        this.sign = sign;
    }
    public double calculateMethod (){
        switch (sign){
            case "+":
                return vol1 + vol2;
            case "-":
                return vol1 - vol2;
            case "*":
                return vol1 * vol2;
            case "/":
                return vol1 / vol2;
            default:
                return 0.0;

        }
    }

}
