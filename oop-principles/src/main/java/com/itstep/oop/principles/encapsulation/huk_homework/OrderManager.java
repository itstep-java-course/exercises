package com.itstep.oop.principles.encapsulation.huk_homework;

public class OrderManager {

    private int orderId;
    private double price;
    private final int[] orderIds;

    public OrderManager(int[] orderIds) {
        this.orderId = orderId;
        this.price = price;
        this.orderIds = orderIds;
    }

    public double purchaseOrder(int id, int orderId, double price) {
        if (isOrderExists(orderId)) {
            deleteExistingOrder(orderId);
            return price + price *0.2;
        }
        throw new RuntimeException("Order not found");
    }

    private boolean isOrderExists(int orderId) {
        for (int id : orderIds) {
            if (id == orderId) {
                return true;
            }
        }
        return false;
    }

    private void deleteExistingOrder(int orderId) {
        for (int i = 0; i < orderIds.length; i++) {
            if (orderIds[i] == orderId) {
                orderIds[i] = -1;
            }
        }
    }

}
