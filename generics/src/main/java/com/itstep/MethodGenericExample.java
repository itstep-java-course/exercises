package com.itstep;

public class MethodGenericExample {

    private static <T> T getValue(T t, T defaultValue) {
        return t == null ? defaultValue : t;
    }

    private static <T, E> void process(T input, E input2) {
        System.out.println("Start processing....");
        System.out.println("Process: " + input);
        System.out.println("Process: " + input2);
        System.out.println("End processing....");
    }

    public static void main(String[] args) {
        String s = getValue("Hello", "default");
        System.out.println(s);
        Integer i = getValue(12, 6);
        System.out.println(i);
        Car car = getValue(new Car("X5"), new Car("default"));
        System.out.println(car);


        process(12, new Car("X5"));
        process(12, 12);
        process("str", 12);
    }

    private static class Car {
        private final String model;

        private Car(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }
}
