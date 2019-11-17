package com.itstep.oop.principles.encapsulation.chubuk.manager;
import java.util.Scanner;

public class Product
{
    public static double printOut()
    {
        Scanner in = new Scanner(System.in);
        return OrderManager.purchaseOrder(in.nextInt(), 100);
    }
}
