package com.itstep.oop.principles.encapsulation.safankov_homework;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[]ids = new int[]{1,3,5};

        OrderManager manager=new OrderManager(ids);
        double priceAfterCalculating = manager.purchaseOrder(3,18.5);

        System.out.println(priceAfterCalculating);

        System.out.println("---------");
        for (int order: ids) {
            System.out.println(Arrays.toString(ids));
        }
    }
}
