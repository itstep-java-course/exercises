package com.itstep.oop.principles.encapsulation.dudkin_homework.not_API;

public class OrderManager {
    Storage firstStorage=new Storage();
    public double purchaseOrder(int orderId, double price) {
        //Storage firstStorage=new Storage();
        if (!firstStorage.checkAvailability(orderId))
            throw new RuntimeException("We don't have this product!");
        return price + price * 0.2;
    }
}
