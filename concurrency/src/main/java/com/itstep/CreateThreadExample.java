package com.itstep;

public class CreateThreadExample {
    public static void main(String[] args) {
        System.out.println("main thread: " + Thread.currentThread().getName());
        final Thread thread = new Thread(() -> {
            System.out.println("child thread: " + Thread.currentThread().getName());
        });

        final Thread thread1 = new Thread(() -> {
            System.out.println("child thread: " + Thread.currentThread().getName());
        });

//        start new thread
        thread.start();
        thread1.start();

//        returns true when the thread is started but not terminated
        thread.isAlive();

//        set flag to stop thread. See InterruptedExample
        thread.isInterrupted();


        final int priority = thread.getPriority();
    }


//    what is the thread theory
//    create thread and start
//    states
//    deamon
}
