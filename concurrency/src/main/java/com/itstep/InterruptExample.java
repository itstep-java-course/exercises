package com.itstep;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int x = 0;
            while (true) {
                System.out.println("execution....");
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("close thread");
                    return;
                }
            }
        });

        t.start();

        Thread.sleep(2000);

        t.interrupt();
    }
}
