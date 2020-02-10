package com.itstep.annotation;

public class ProcessorDecorator {
    private final Processor processor;

    public ProcessorDecorator(Processor processor) {
        this.processor = processor;
    }

    public void process() {
        System.out.println("Start time: " + System.currentTimeMillis());

        processor.process();

        System.out.println("End time: " + System.currentTimeMillis());

    }

    public void process2() {
        System.out.println("Start time process2: " + System.currentTimeMillis());

        processor.process();

        System.out.println("End time process2: " + System.currentTimeMillis());
    }


}
