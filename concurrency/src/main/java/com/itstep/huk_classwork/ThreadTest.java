package com.itstep.huk_classwork;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("main thread: " + Thread.currentThread().getName());

        final Thread thread = new Thread(() -> {
            System.out.println("child thread: " + Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        });
        thread.start();
        
    }
}

