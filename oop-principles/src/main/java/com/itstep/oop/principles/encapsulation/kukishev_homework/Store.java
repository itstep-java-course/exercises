package com.itstep.oop.principles.encapsulation.kukishev_homework;

public class Store {

    public static void main(String[] args) {
        int [] orders = new int[] {3, 7, 8};

        OrderManager orderManager = new OrderManager(orders);

        double finalPrice = orderManager.purchaseOrder(7, 25.58);

        System.out.println(finalPrice);

        System.out.println("ids=====ids");
        for (int order : orders){

            System.out.println(order);

        }



    }



}
