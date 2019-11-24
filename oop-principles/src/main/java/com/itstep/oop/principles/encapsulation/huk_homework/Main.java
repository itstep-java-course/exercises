package com.itstep.oop.principles.encapsulation.huk_homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] orders = new int[]{1, 2, 3, 4, 5};

        // Random random = new Random();
        // int orders = random.nextInt(100);

        OrderManager orderManager = new OrderManager(orders);
        double finalPrice = orderManager.purchaseOrder(22, 12, 12);
        System.out.println(finalPrice);

        System.out.println("ids====ids");
        for (int order : orders
        ) {
            System.out.println(order);

        }
    }
}