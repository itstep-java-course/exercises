package com.itstep.oop.principles.encapsulation.shyrkov_homework;

public class Customer {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.getOrder(1,300);
        orderManager.getOrder(2,500);
        orderManager.getOrder(3,100);
        orderManager.getOrder(4,150);
        orderManager.getOrder(5,200);

    }
}
