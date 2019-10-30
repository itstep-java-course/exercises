package com.itstep.string.array.chubuk_array_string;

public class CrystalTask2
{
    public static void main(String[] args)
    {
//        y''+py'+qy=0 - Однородные дифференциальные уравнения второго порядка с постоянными коэффициентами
//        Для каждого такого дифференциального уравнения можно записать так называемое характеристическое уравнение
//        k^2+pk+q=0
//        1) D>0
//        y(x)=C1e^(k1x)+C2e^(k2x)
//        2) D=0
//        y(x)=(C1x+C2)e^(k1x)
//        3) D<0
//        y(x)=e^(ax)[C1cos(bx)+C2sin(bx)]
//        k1=a+bi; k2=a-bi
        int p=6, q=5;
        double k1, k2, D;
        D=p*p-4*q;
        if(D>0)
        {
            k1=(Math.sqrt(D)+p)/2;
            k2=(Math.sqrt(D)-p)/2;
            System.out.println("k1: " + k1 + "k2: " + k2);
        }
        if(D==0)
        {
            k1=Math.sqrt(q);
            System.out.println("k: " + k1);
        }
        if(D<0)
        {
            k1=Math.sqrt(Math.abs(D));
            System.out.println("k" + k1+"+-i");
        }
    }
}
