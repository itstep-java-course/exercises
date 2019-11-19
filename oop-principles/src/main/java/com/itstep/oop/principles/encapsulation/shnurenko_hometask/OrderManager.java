package com.itstep.oop.principles.encapsulation.shnurenko_hometask;

class OrderManager {

    private final int[] orderIds;

    OrderManager(int[] orderIds) {
        this.orderIds = orderIds;
    }

    double purchaseOrder(int orderId, double price) {
        if (isOrderExists(orderId)) {
            deleteExistingOrder(orderId);
            return price + price * 0.2;
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
