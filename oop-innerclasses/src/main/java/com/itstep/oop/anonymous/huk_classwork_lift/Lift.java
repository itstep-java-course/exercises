package com.itstep.oop.anonymous.huk_classwork_lift;

public class Lift implements UpMoveable, DownMoveable, Stopable {

    private final Button[] buttons;

    public Lift(Button[] buttons){



        Button firstFloorButton = new Button(1,"first");
        Button secondFloorButton = new Button(2,"second");
        Button thirdFloorButton = new Button(3,"third");


        Button emergency = new Button(1,"Emergency");
        Button stopButton = new Button(1,"stop");

        this.buttons = new Button[]{
                firstFloorButton,
                secondFloorButton,
                thirdFloorButton,
                emergency,
                stopButton
        };
    }

    @Override
    public void moveDown() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void moveUp() {

    }

    private class Button{
        private final int floor;
        private  final String name;

        private Button(int floor, String name) {
            this.floor = floor;
            this.name = name;
        }

        private Button(String name) { //обратились к 1му конструктору и передали 0 этаж
            this(0, name);

        }

        public int getFloor() {
            return floor;
        }

        public void onClick(){ //метод при нажатии на кнопку
            System.out.println("The button " + name + " has been pressed...");
        }
    }

}
