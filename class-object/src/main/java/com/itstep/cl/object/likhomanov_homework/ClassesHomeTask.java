package com.itstep.cl.object.likhomanov_homework;

public class ClassesHomeTask {

    public static void main(String[] args) {

        Reverser reverser = new Reverser("Hello everybody. What's up?");

        Car myDadsCar = new Car();
        Car myMomsCar = new Car("Mazda",
                "CX 5",
                "2018",
                "Wet asphalt",
                "Brand new");
        Car mySistersCar = new Car("Volkswagen",
                "Beetle",
                "2012",
                "Bubble gum pink",
                "Moderate, needs some oil change");
        Car myGrandpasCar = new Car("Trabant",
                "601",
                "1963",
                "Maroon",
                "Just a piece of scrap metal");
        Car myCar = new Car();

        myCar.setBrandAndModel("Chevrolet", "Camaro SS");
        myCar.setProductionYear("2018");
        myCar.setColour("Pitch black");
        myCar.setCondition("Just about perfect");

        System.out.println(reverser.doReverse());
        System.out.println();
        System.out.println("Cars in my family:");
        System.out.println("My dad's car: " + myDadsCar.getCarInfo());
        System.out.println("My mom's car: " + myMomsCar.getCarInfo());
        System.out.println("My sis' car: " + mySistersCar.getCarInfo());
        System.out.println("My grandpa's car: " + myGrandpasCar.getCarInfo());
        System.out.println("My car: " + myCar.getCarInfo());
    }
}
