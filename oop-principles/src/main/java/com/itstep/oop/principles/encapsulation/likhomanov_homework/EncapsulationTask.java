package com.itstep.oop.principles.encapsulation.likhomanov_homework;

import com.itstep.oop.principles.encapsulation.likhomanov_homework.stock.OrderManager;

import java.util.Scanner;

public class EncapsulationTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        OrderManager orderManager = new OrderManager(10);

        do {
            System.out.println("Place your order by specifying the ID of an item (id#???)");
            try {
                System.out.println("The price of your order is: " + orderManager.purchaseOrder(in.nextLine()));
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } while (!orderManager.isStockEmpty());

        System.out.println("The stock is sold out");
    }
}
