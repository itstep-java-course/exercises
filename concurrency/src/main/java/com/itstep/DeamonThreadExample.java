package com.itstep;

public class DeamonThreadExample {

    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(() -> {
            int x = 0;
            while (true) {
                System.out.println(x++);
            }
        });
        thread.setDaemon(true);

        thread.start();

        Thread.sleep(300);


//        ask if thread is daemon
        thread.isDaemon();

//      end of main thread.
    }
}
