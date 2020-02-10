package com.itstep;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(5);

//        for (int i = 0; i < 20; i++) {
//            executorService.submit(() -> {
//                System.out.println("Thread run: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        executorService.shutdown();


//        future example
        final ExecutorService service = Executors.newFixedThreadPool(5);

//        for (int i = 0; i < 10; i++) {
//
//        }
        final Future<Integer> future = service.submit(() -> {
            try {
                System.out.println("waiting 3 sec...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 15;
        });
        final Integer result = future.get();

        System.out.println("end of main...");

        System.out.println(result);
    }
}
