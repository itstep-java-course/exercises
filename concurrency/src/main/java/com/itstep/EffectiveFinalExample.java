package com.itstep;

public class EffectiveFinalExample {

    public static void main(String[] args) {
        int x = 0;

        Thread thread = new Thread(() -> {
            System.out.println("new thread " + Thread.currentThread().getName());
//            мы не можем изменять значение локальной переменной внутри лямбды
//            x = 7;
        });

        thread.start();
    }
}
