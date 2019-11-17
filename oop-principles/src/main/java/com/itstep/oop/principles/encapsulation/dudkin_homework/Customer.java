package com.itstep.oop.principles.encapsulation.dudkin_homework;

import com.itstep.oop.principles.encapsulation.dudkin_homework.not_API.OrderManager;

public class Customer {
    public static void main(String[] args) {
        System.out.println(OrderManager.purchaseOrder(1003,400));
        System.out.println(OrderManager.purchaseOrder(1003,400));
        System.out.println(OrderManager.purchaseOrder(1003,400));
        System.out.println(OrderManager.purchaseOrder(1004,600));
        System.out.println(OrderManager.purchaseOrder(1005,4050));
    }
}
