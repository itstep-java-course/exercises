package com.itstep.oop.principles.encapsulation.dudkin_homework.not_API;

public class OrderManager {
    public static double purchaseOrder(int orderId, double price) {
        if (!Storage.checkAvailability(orderId))
            throw new RuntimeException("We don't have this product!");
        return price + price * 0.2;
    }
}
