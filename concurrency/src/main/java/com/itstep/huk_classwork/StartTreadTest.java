package com.itstep.huk_classwork;

public class StartTreadTest {


    public static void main(String[] args) throws RuntimeException{



        System.out.println("main thread: " + Thread.currentThread().getName());

        final Thread thread = new Thread(() -> {
            System.out.println("child thread: " + Thread.currentThread().getName());
           int x = 0;
            while (x <= 10) {
                x++;
                System.out.println("is interrupted flag:" + Thread.currentThread().isInterrupted());

                if (x == 10 && Thread.currentThread().isInterrupted()) {// разрешаем пррвать поток, ты прерван Фалс фалс
                    System.out.println(x);
                    System.out.println("Stopping thread...");
                    return;
                }
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                }

        });

 thread.setUncaughtExceptionHandler((t,e) -> System.out.println("Thread: " + t + " Exception" + e));

        thread.start();
        thread.interrupt();
    }
}
