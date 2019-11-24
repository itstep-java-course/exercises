package com.itstep.oop.principles.encapsulation.huk_homework;


public class Main {
    public static void main(String[] args) {
        int[] orders = new int[5];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = (int) (Math.random() * 13);
            System.out.println(orders[i]);
        }

        OrderManager orderManager = new OrderManager(orders);
        double finalPrice = orderManager.purchaseOrder(12,14.14);
        System.out.println(finalPrice);

        System.out.println("ids====ids");
        for (int order : orders
        ) {
            System.out.println(order);

        }
    }
}