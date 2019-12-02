package com.itstep.oop.anonymous.huk_classwork_lift;

public class Lift implements UpMoveable, DownMoveable, Stopable {

    private final Button[] buttons;
    private int currentFloor = 1; //начальное положение лифта

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

    public void pressButton(String buttonName){ //нажатие кнопки
        if (buttonName == null){
            return;
        }
        Button pressedButton = findPressedButton(buttonName);
        if ( pressedButton == null){
            return;
        }
        pressedButton.onClick();

        if (currentFloor>pressedButton.floor){//если мы на  10м то едим вниз
            moveDown(); //движемся вниз
        }else if(currentFloor == pressedButton.floor){//если нажимаем 10 и стоим на 10 этаже
            stop();// тогда стоим
        }else {
            moveUp();
        }
    }
    private  Button findPressedButton(String buttonName){
        for (Button button :buttons){
            if (buttonName.equals(button.name)) {
                return button;
            }
        }
        return null;
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
