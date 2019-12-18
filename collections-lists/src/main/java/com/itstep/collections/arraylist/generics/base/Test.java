package com.itstep.collections.arraylist.generics.base;

import com.itstep.collections.arraylist.generics.Car;

public class Test {
    public static void main(String[] args) {
        processorClient(new IntProcessor(), 1, 2);
        processorClient(new StringProcessor(), "1", "2");
        processorClient(new CarProcessor(),
                        new Car() {
                            @Override
                            public String getModel() {
                                return null;
                            }
                        },
                        new Car() {
                            @Override
                            public String getModel() {
                                return null;
                            }
                        });
    }

    private static <T, E> void processorClient(Processor<T, E> processor, T item, E element) {
        T result = processor.process(item);

        T result2 = processor.process(element, item);
    }

    private static <T, E> void processorClient(IntProcessor processor, Integer item, Integer element) {
        Integer result = processor.process(item);

        Integer result2 = processor.process(element, item);
    }

    private static <T, E> void processorClient(StringProcessor processor, String item, String element) {
        String result = processor.process(item);

        String result2 = processor.process(element, item);
    }

    private static class IntProcessor implements Processor<Integer, Integer> {


        @Override
        public Integer process(Integer item) {
            return null;
        }

        @Override
        public Integer process(Integer element, Integer item) {
            return null;
        }
    }

    private static class StringProcessor implements Processor<String, String> {


        @Override
        public String process(String item) {
            return null;
        }

        @Override
        public String process(String element, String item) {
            return null;
        }
    }

    private static class CarProcessor implements Processor<Car, Car> {

        @Override
        public Car process(Car item) {
            return null;
        }

        @Override
        public Car process(Car element, Car item) {
            return null;
        }
    }
}
