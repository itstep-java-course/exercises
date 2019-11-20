package com.itstep.oop.principles.encapsulation.borovoy_homework;

import java.util.Random;

public class OrderManager {
    private int orderId;
    private double price;
    private int[] arr = new int[5];

    private OrderManager() {

        this.orderId = orderId;
        this.price = price;
        this.arr = arr;
    }

    private double purchaseOrder(double price) throws RuntimeException {

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(10);

            if (arr[i] != 0)
                return price + (price / 5);
             else
                throw new RuntimeException("Товара нет на складе");
        }
        return 0;
    }


    public static void main(String[] args) throws RuntimeException {

        OrderManager orderPrice = new OrderManager();
        System.out.println(orderPrice.purchaseOrder(100));
        System.out.println(orderPrice.purchaseOrder(400));
        System.out.println(orderPrice.purchaseOrder(900));
        System.out.println(orderPrice.purchaseOrder(1000));
        System.out.println(orderPrice.purchaseOrder(2650));

    }

}
