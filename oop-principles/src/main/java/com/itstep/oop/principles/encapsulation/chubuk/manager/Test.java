package com.itstep.oop.principles.encapsulation.chubuk.manager;

public class Test
{
    public static void main(String[] args)
    {
        Product shop = new Product();
        int i = 0;
        do
            {
            System.out.println("Enter the order id: ");
            System.out.println(shop.printOut());
            i++;
            }
        while (i != 5);
    }
}
