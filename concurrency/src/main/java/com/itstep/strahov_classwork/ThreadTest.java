package com.itstep.strahov_classwork;

public class ThreadTest {
    public static void main (String[] args ){
//        System.out.println("main thread "+ Thread.currentThread().getName());
//        final Thread thread = new Thread(() -> {
//            System.out.println("child thread "+ Thread.currentThread().getName());
//            for (int i = 0; i <10 ; ++i) {
//                System.out.println(i);
//            }
//
//        });
//        thread.start();
        final Thread thread1 = new Thread(() -> {
        int x=0;
        while(true){
            x++;
            System.out.println("flag interrupt"+Thread.currentThread().isInterrupted() );
            if(x==10 && Thread.currentThread().isInterrupted()){//разрешение на прирывание потока
                System.out.println(x);
                System.out.printf("Stop thread...");
                // throw new RuntimeException(e);
                return;

            }
//            try{
//                Thread.sleep(100);
//            }catch (InterruptedException e){
//                throws new RuntimeException(e);
//            }
        }
        });
        thread1.setUncaughtExceptionHandler((t,e)-> System.out.println("thread "+t+"exeption "+e));
        thread1.start();
        thread1.interrupt();
        }



    }

