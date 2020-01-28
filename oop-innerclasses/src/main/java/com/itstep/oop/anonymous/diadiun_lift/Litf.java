package com.itstep.oop.anonymous.diadiun_lift;

public class Litf implements UpMoveable, Stopable, DownMovable {
    private final Button[] buttons;
    private int currentFloor;

    public Litf() {
        Button firstFloorButton = new Button(1, "first");
        Button secondFloorButton = new Button(2, "second");
        Button thirdFloorButton = new Button(3, "third");


        Button emergency = new Button("Emergency");
        Button stopButton = new Button("Stop");

        this.buttons = new Button[]{
                firstFloorButton,
                secondFloorButton,
                thirdFloorButton,
                emergency,
                stopButton,
        };


    }

    public void pressButton(String buttonName) {
        if (buttonName == null) {
            return;
            Button pressedButton = findPressed
        }
        private Button pressesButton (String buttonName){
            for (Button button : buttons) {
                if (buttonName.equals(button.name)) {
                    return button;
                }
            }
        }
        for (Button button : buttons) {
            if (buttonName.equals(button.name)) {
                downmove();
            } else if (currentFloor == button.floor) {
                stop();
            } else {
                upMove();
            }
        }
    }

    @Override
    public void downmove() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void upMove() {
    }

    private class Button {
        private final int floor;
        private final String name;

        private Button(int floor, String name) {
            this.floor = floor;
            this.name = name;
        }

        public Button(String name) {
            this(0, name);
        }

        public int getFloor() {
            return floor;
        }

        public void onClick() {
            System.out.println("The button " + name + "");
        }
    }
}

