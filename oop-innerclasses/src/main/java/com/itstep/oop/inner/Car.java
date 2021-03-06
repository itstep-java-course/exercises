package com.itstep.oop.inner;

import java.util.Objects;

public class Car {

    private Engine engine = new Engine();
    private String carModel;

    public Car() {

    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void veryComplexLogic() {
        final int x = 5;

        class EncapsulateLogic {
            private String name;

            EncapsulateLogic(String name) {
                this.name = name;
            }

            public void printName() {
                System.out.println(x);
                init();
                engine.launch();

                System.out.println(name);
            }
        }

        EncapsulateLogic name = new EncapsulateLogic("name");
        name.printName();

//        recursion
        veryComplexLogic();
    }

    public void init() {
        System.out.println(engine.model);
        engine.launch();
    }

    //    может наследовать другие классы и имплементировать интерфейсы
    public class Engine {

//        не может содержать статик поля
//        private static int x = 5;

//        не может содержать статик методы
//        public static void printS(String s) {
//            System.out.println(s);
//        }

        public static final String STRING = "";

        private final String model = "MNK-12000";

        public void launch() {

            System.out.println("The engine is starte");
        }

        public class E {

        }

    }

    //    внутренний класс может наследовать другой внутренний класс
    public class Engine2 extends Engine {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel);
    }
}
