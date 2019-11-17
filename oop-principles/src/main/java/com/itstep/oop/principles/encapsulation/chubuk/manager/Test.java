package com.itstep.oop.principles.encapsulation.chubuk.manager;

public class Test
{
    public static void main(String[] args)
    {
        OrderManager manager = new OrderManager(25);

        int i = 0;
        do
            {
            System.out.println("Enter the order id: ");
            System.out.println(Product.printOut());
            i++;
            }
        while (i != 5);
    }
}
