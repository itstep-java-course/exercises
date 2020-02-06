package com.itstep;

public class SynchronizedExample {

    private final Object lock = new Object();

    //    synchronized block
    public void method1() throws InterruptedException {
//        logic
        synchronized (lock) {
            System.out.println("Call Method 1");
            Thread.sleep(4000);
        }
    }

//    synchronized method
    public synchronized void method2() throws InterruptedException {
        System.out.println("Call Method 2");
        Thread.sleep(3000);
    }

    public static void main(String[] args) {
        final SynchronizedExample synchronizedExample = new SynchronizedExample();

        new Thread(() -> {
            try {
                System.out.println("Start thread 1");
                synchronizedExample.method1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Start thread 2");
                synchronizedExample.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }



}
