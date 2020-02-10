package com.itstep.annotation;

public class Processor {

    @ExecutionTime
    public void process() {
        System.out.println("Processing start...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processing end...");
    }

    @ExecutionTime
    public void process2() {
        System.out.println("Processing start process2 ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processing end process2 ...");
    }
}
