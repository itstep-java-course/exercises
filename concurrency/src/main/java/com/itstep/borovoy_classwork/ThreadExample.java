package com.itstep.borovoy_classwork;

public class ThreadExample {
    public static void main(String[] args) {

        final Thread thread = new Thread(() -> {
            System.out.println("Thread:" + Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });
        thread.start();

    }
}

