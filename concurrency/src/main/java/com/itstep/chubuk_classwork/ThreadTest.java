package com.itstep.chubuk_classwork;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("thread name: " + Thread.currentThread().getName());
        final Thread thread = new Thread(() -> {
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
            }
            System.out.println("thread name: " + Thread.currentThread().getName());
        });
        thread.start();
    }
}
