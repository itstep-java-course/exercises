package com.itstep.oop.principles.encapsulation.likhomanov_homework.stock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrderManager {

    private Item[] stock;

    public OrderManager(int itemsNumber) {
        fillStock(itemsNumber);
    }

    private void fillStock(int itemsNumber) {
        stock = new Item[itemsNumber];
        Random random = new Random();
        ArrayList<String> ids = generateUniqueIds(itemsNumber);

        for (int i = 0; i < stock.length; ++i) {
            stock[i] = new Item(
                    ids.get(i),
                    random.nextInt(500),
                    "$");
            stock[i].addToStock();
        }
    }

    private ArrayList<String> generateUniqueIds(int itemsNumber) {
        ArrayList<String> ids = new ArrayList<>();
        for (int i = 1; i <= itemsNumber; ++i) {
            ids.add("id#" + i);
        }
        Collections.shuffle(ids);
        return ids;
    }

    public String purchaseOrder(String orderId) throws RuntimeException {
        for (Item item : stock) {
            if (item.getId().equals(orderId)) {
                if (item.isOnStock()) {
                    item.removeFromStock();
                    return (item.getPrice() * 1.2) + item.getCurrency();
                } else {
                    throw new RuntimeException("Item is out of stock");
                }
            }
        }
        throw new RuntimeException("There is no such an item on stock");
    }

    public boolean isStockEmpty() {
        for (Item item : stock) {
            if (item.isOnStock()) return false;
        }
        return true;
    }
}
