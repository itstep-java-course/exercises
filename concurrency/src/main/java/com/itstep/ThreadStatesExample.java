package com.itstep;

//https://www.geeksforgeeks.org/lifecycle-and-states-of-a-thread-in-java/
public class ThreadStatesExample {
    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(() -> {
            int x = 0;
//            while (true){
//                System.out.println(x++);
//            }
        });
        System.out.println("New thread state: " + thread.getState());

        thread.start();

        System.out.println("After start thread state: " + thread.getState());

//        State BLOCKED
//        thread.wait();


//        System.out.println("Wait thread state: " + thread.getState());

//        State TIMED_WAITING
//        thread.wait(2000)

        //        State WAITING
//        thread.wait()

        //        State TERMINATED
//        the thread finished execution
        thread.join();
        System.out.println("After execution: " + thread.getState());
    }
}
