package com.itstep;

//https://metanit.com/java/tutorial/8.5.php
public class WaitNotifyExample {
    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }

    // Класс Магазин, хранящий произведенные товары
    private static class Store {
        private int product = 0;

        public synchronized void get() {
            while (product < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);
            notifyAll();
        }

        public synchronized void put() {
            while (product >= 3) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + product);
            notifyAll();
        }
    }

    // класс Производитель
    private static class Producer implements Runnable {

        Store store;

        Producer(Store store) {
            this.store = store;
        }

        public void run() {
            for (int i = 1; i < 6; i++) {
                store.put();
            }
        }
    }

    // Класс Потребитель
    private static class Consumer implements Runnable {

        Store store;

        Consumer(Store store) {
            this.store = store;
        }

        public void run() {
            for (int i = 1; i < 6; i++) {
                store.get();
            }
        }
    }
}