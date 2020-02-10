package com.itstep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) {
        final Class<Car> aClass = Car.class;

//        получить поля класса
        final Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
//            тип переменной поля
            System.out.println("type: " + field.getType());

//            имя переменной поля
            System.out.println("name: " + field.getName());

//            разрешает устанавливать значение приватной переменной
            field.setAccessible(true);
        }

        final Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            try {
                final Object instance = constructor.newInstance();

                System.out.println(instance);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Car {
        private final String model;
        private int age;

        public Car(String model) {
            this.model = model;
        }

        public Car() {
            this.model = "";
        }

        public String getModel() {
            return model;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
