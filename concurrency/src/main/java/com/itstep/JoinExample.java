package com.itstep;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Wait...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        thread.join();


        System.out.println("Terminated state: " + thread.getState());

        System.out.println("The main stops");
    }
}
