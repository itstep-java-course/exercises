package com.itstep.oop.principles.encapsulation.perepeliatnyk_homework;

public class StoreHouseTask {
    public static void main(String[] args) {
        int[] manyOrders = new int[]{1, 2, 5, 7};

        OrderManagerTask orderManagerTask = new OrderManagerTask(manyOrders);

        double finalPrice = orderManagerTask.purchaseOrder(5, 10);

        System.out.println(finalPrice);

        for (int order : manyOrders) {
            System.out.println(order);

        }
    }
}
