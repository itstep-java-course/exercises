package com.itstep.oop.principles.encapsulation.chubuk.manager;
import java.util.Scanner;

public class Product
{
    public double printOut()
    {
        Scanner in = new Scanner(System.in);
        OrderManager order = new OrderManager(20);
        return order.purchaseOrder(in.nextInt(),0);
    }
}
