package com.itstep.oop.principles.safankov_homework;

public class OrderManager {
    private final int[]orderIds;

    OrderManager(int[]orderIds){
        this.orderIds=orderIds;
    }

    double purchaseOrder(int orderId, double price) {
        if (isOrderExistInStore(orderId)) {
            deleteOrderId(orderId);
            return price + price * 0.2;
        }
        throw new RuntimeException("Order not found");
    }

    private boolean isOrderExistInStore(int orderId){
        for(int ourId : orderIds){
            if(ourId == orderId){
                return true;
            }
        }
        return false;
    }
    private void deleteOrderId(int orderId){
        for (int i = 0; i <orderIds.length; i++) {
            if (orderIds[i] == orderId) {
                orderIds[i] = -1;
            }
        }
    }


}
