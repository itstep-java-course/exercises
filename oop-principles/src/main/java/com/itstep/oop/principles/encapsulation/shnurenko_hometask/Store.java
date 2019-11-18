package com.itstep.oop.principles.encapsulation.shnurenko_hometask;

public class Store {
    public static void main(String[] args) {
        int[] orders = new int[]{1, 2, 4};

        OrderManager orderManager = new OrderManager(orders);

        double finalPrice = orderManager.purchaseOrder(22, 12.12);

        System.out.println(finalPrice);

        System.out.println("ids ========= ids");
        for (int order : orders) {
            System.out.println(order);
        }
    }
}
