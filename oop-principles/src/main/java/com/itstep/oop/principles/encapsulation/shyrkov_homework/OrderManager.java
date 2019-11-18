package com.itstep.oop.principles.encapsulation.shyrkov_homework;

import java.util.Random;

public class OrderManager {
    private int[][] storage;
    //склад продуктов[айди][кл-во товаров под айди]
    public OrderManager(){
        storage = fillStorage();
    }

    private int[][] fillStorage(){
        int[][] fullStorage = new int[5][2];
        for(int i = 0;i<5;i++){
            fullStorage[i][0] = i+1;
            fullStorage[i][1] = new Random().nextInt(3);
        }
        return fullStorage;
    }
    //для защиты от изменения формулы
    public double getOrder(int orderId, double price)
    {
        price = purchaseOrder(orderId, price);
        System.out.println("Order sum = "+price);
        return price;
    }

    private double purchaseOrder(int orderId, double price) throws RuntimeException{
        if(storage[orderId-1][1]>0){
            storage[orderId-1][1]--;
            return price*1.2;
        }
        else
            throw new RuntimeException("There is no items with "+orderId+" id");
    }
}
