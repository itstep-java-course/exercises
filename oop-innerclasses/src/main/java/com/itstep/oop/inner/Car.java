package com.itstep.oop.inner;

public class Car {

    private Engine engine = new Engine();

    public Car() {
    }

    public void init() {
        System.out.println(engine.model);
        engine.launch();
    }

    public class Engine {
        private final String model = "MNK-12000";

        public void launch() {
            System.out.println("The engine is starte");
        }
    }
}
