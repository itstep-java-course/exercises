package com.itstep.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExecutionTimeAnnotationProcessor {

    public void processAnnotation(Object o) throws InvocationTargetException, IllegalAccessException {
        for (Method method : o.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(ExecutionTime.class)) {
                System.out.println("Start time: " + System.currentTimeMillis());

                method.invoke(o);

                System.out.println("End time: " + System.currentTimeMillis());
            } else {
                method.invoke(o);
            }
        }
    }
}
