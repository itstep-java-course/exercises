package com.itstep.oop.principles.encapsulation.dudkin_homework.not_API;

public class OrderManager {
    private Storage firstStorage;
    public OrderManager(){
        firstStorage=new Storage();
    }
    public double purchaseOrder(int orderId, double price) {
        if (!firstStorage.checkAvailability(orderId))
            throw new RuntimeException("We don't have this product!");
        return price + price * 0.2;
    }
}
