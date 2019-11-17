package com.itstep.oop.principles.encapsulation.likhomanov_homework.stock;

class Item {

    private String id;
    private String currency;
    private int price;
    private boolean isOnStock;

    Item(String id, int price, String currency) {
        this.id = id;
        this.price = price;
        this.currency = currency;
    }

    void addToStock() {
        isOnStock = true;
    }

    void removeFromStock() {
        isOnStock = false;
    }

    boolean isOnStock() {
        return isOnStock;
    }

    String getId() {
        return id;
    }

    int getPrice() {
        return price;
    }

    String getCurrency() {
        return currency;
    }
}
