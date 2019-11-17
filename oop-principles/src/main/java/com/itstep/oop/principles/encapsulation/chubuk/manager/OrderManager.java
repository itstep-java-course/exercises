package com.itstep.oop.principles.encapsulation.chubuk.manager;
import java.util.Random;

public class OrderManager
{
    private static int[][] stock;

    public OrderManager(int productNumber)
    {
        fillStock(productNumber);
    }

    private int[][] fillStock(int productNumber)
    {
        stock = new int[productNumber][3];
        Random random = new Random();
        for (int i = 0; i < stock.length ; i++)
        {
            stock[i][0] = random.nextInt(210);
            stock[i][1] = 1;
        }
        return stock;
    }

    public static double purchaseOrder(int orderId, double price) throws RuntimeException
    {
        if (orderId < stock.length)
        {
            if (orderId >= 0) {
                if (stock[orderId][1] == 1) {
                    stock[orderId][1] = 0;
                    price = stock[orderId][0];
                    return (price * 1.2);
                } else
                {
                    throw new RuntimeException("Product is out");
                }
            }
        }
        throw new RuntimeException("There is no such Products on stock");
    }
}
