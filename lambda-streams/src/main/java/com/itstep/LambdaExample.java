package com.itstep;

public class LambdaExample {
    public static void main(String[] args) {
        run(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable1 anon run");
            }
        });

        run(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable2 anon run");
            }
        });

        run(() -> System.out.println("Runnable lambda run"));


        callNonFunctionalInterface(new NonFunctionalInterface() {
            @Override
            public void run(String s) {
                System.out.println("run");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        });

        callNonFunctionalInterface(() -> System.out.println("run"));


//        lambda with parameters
        startBuilding(name -> System.out.println("Builder name: " + name));

        startBuilding(name -> {
            if (name.startsWith("G")) {
                System.out.println("Builder name: " + name);
            } else {
                System.out.println("Pasha");
            }
        });

        startBuilding(new MethodWithParameters() {
            @Override
            public void build(String builderName) {
                if (builderName.startsWith("G")) {
                    System.out.println("Builder name: " + builderName);
                } else {
                    System.out.println("Pasha");
                }
            }
        });
    }

    private static void run(Runnable runnable) {
        runnable.run();
    }

    private static void callNonFunctionalInterface(NonFunctionalInterface nonFunctionalInterface) {
        nonFunctionalInterface.run("s");
        nonFunctionalInterface.stop();
    }

    private static void startBuilding(MethodWithParameters methodWithParameters) {
        methodWithParameters.build("Grisha");
    }

    //    can't use lambda
    private static interface NonFunctionalInterface {
        default void run(String s) {
            System.out.println(s);
        }

        void stop();
    }

    //    lambda with parameters
    private interface MethodWithParameters {
        void build(String builderName);
    }
}
