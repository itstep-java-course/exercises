package com.itstep.annotation;

import java.lang.reflect.InvocationTargetException;

public class AnnotationTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Processor processor = new Processor();

        ExecutionTimeAnnotationProcessor annotationProcessor = new ExecutionTimeAnnotationProcessor();

        annotationProcessor.processAnnotation(processor);

        final ProcessorDecorator decorator = new ProcessorDecorator(processor);
        decorator.process();
        decorator.process2();

    }
}
