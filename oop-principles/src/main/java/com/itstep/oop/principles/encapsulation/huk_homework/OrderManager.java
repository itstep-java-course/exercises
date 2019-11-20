//package com.itstep.oop.principles.encapsulation.huk_homework;
///*
//описать создание заказа на сайте
//создать класс OrderManager с методом purchaseOrder
//метод purchaseOrder должен принимать 2 поля: orderId and price
//метод purchaseOrder должен возвращать стоимость товара расчитанную по формуле, если товар есть на складе, если товара нет бросить эксепшн
//
//
//формула для расчета стоимости товара:
//price = price + price * 20%
//
//Подсказки:
//
//- айдишки доступных товаров хранить в классе OrderManager в массиве
//- пример как бросить эксепшн смотри тут
//
// */
//
//public class OrderManager { //создали класс OrderManager
//
//    private final int[] orderIds;
//
//    OrderManager(int[] orderIds) {
//
//        this.orderIds = orderIds;
//    }
//
//    public double purchaseOrder(int orderId, double price) { //метод purchaseOrder, метод принимает 2 поля: orderId and price
//        return price + price * 0.2;
//
//    }
//
//   double purchaseOrder(int orderId, double price){
//        if(isOrderExists(orderId)){
//            daleteExistingOrder(orderId);
//            return price + price * 0.2;
//        }
//   }
//
//    private boolean isOrderExists(int orderId) {
//        for (int id : orderIds) {
//            if (id == orderId) {
//                return false;
//            }
//
//        }
//    }
//
//    private void daleteExistingOrder(int orderId){
//        for (int i = 0; i<orderIds.length; i++){
//            if(orderIds[i]==orderId){
//                orderIds[i]=-1;
//            }
//        }
//    }
//}
