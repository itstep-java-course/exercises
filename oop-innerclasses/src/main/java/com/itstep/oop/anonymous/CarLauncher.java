package com.itstep.oop.anonymous;

public class CarLauncher {
    public static void main(String[] args) {
//        Car launched = new Car() {
//            @Override
//            public void launch() {
//                System.out.println("The car is launched");
//            }
//        };
//        launchCar(launched);

//        Car car = new CustomCar();
//        launchCar(car);


//        Car car1 = new Car() {
//            @Override
//            public void launch() {
//
//            }
//        };

//        new Car() {
//
//            @Override
//            public void launch() {
//
//            }
//
//            @Override
//            public String getModel() {
//                return null;
//            }
//        };

//        Car car1 = new Car() {
//
//            @Override
//            public void launch(Car car) {
//
//            }
//        };
//
//        car1.launch(new Car() {
//            @Override
//            public void launch(Car car) {
//
//            }
//        });

        Table table = new Table("20.0") {

            @Override
            public String getColor() {
                return "red";
            }
        };

        System.out.println(table.getColor());
        System.out.println(table.getSquare());

        launchCar(new Car() {
            @Override
            public void launch() {

            }
        });

        Printer printer = new Printer() {

            @Override
            public void print() throws Exception {
                System.out.println("print");
            }
        };

        try {
            printer.print();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        =====================================

        PrinterCaller printerCaller = new PrinterCaller();
        printerCaller.callPrinter(new Printer() {
            @Override
            public void print() throws Exception {
                System.out.println("print logic");
            }
        });

    }

    private static void launchCar(Car car) {
        car.launch();
    }

//    private static class CustomCar implements Car {
//
//        @Override
//        public void launch() {
//            System.out.println("Custom car");
//        }
//    }
}
