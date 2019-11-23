package com.itstep.oop.principles.encapsulation.perepeliatnyk_homework;

import com.itstep.oop.principles.encapsulation.likhomanov_homework.stock.OrderManager;

//описать создание заказа на сайте
//        создать класс OrderManager с методом purchaseOrder
//        метод purchaseOrder должен принимать 2 поля: orderId and price
//        метод purchaseOrder должен возвращать стоимость товара расчитанную по формуле, если товар есть на складе, если товара нет бросить эксепшн
//
//        формула для расчета стоимости товара:
//        price = price + price * 20%

 class OrderManagerTask {

    private final int[] orderIds;

    OrderManagerTask(int[] idOrder) {
        this.orderIds = idOrder;
    }

    double purchaseOrder(int idOrder, int prise) {
        if (isOrderExists(idOrder)) {
            deleteExistingOrder(idOrder);
            return prise + prise * 0.2;
        }
        throw new RuntimeException("Order not found");
    }

    private boolean isOrderExists(int idOrder) {
        for (int id : orderIds) {
            if (id == idOrder) {
                return true;
            }

        }
        return false;
    }

    private void deleteExistingOrder(int idOrder) {
        for (int i = 0; i < orderIds.length; i++) {
            if (orderIds[i] == idOrder) {
                orderIds[i] = 0;
            }

        }

    }


}
