package com.itstep.oop.dshnurenko_lift;

public class Lift implements UpMoveable, DownMoveable, Stopable {

    private final Button[] buttons;

    private int currentFloor = 1;
    private Button pressedButton;
    private boolean isStopPressed;

    public Lift() {
        Button firstFloorButton = new Button(1, "first");
        Button secondFloorButton = new Button(2, "second");
        Button thirdFloorButton = new Button(3, "third");
        Button fourthFloorButton = new Button(4, "fourth");
        Button fifthFloorButton = new Button(5, "fifth");

        Button emergency = new Button("Emergency");
        Button stopButton = new Button("Stop");

        this.buttons = new Button[]{
                firstFloorButton,
                secondFloorButton,
                thirdFloorButton,
                fourthFloorButton,
                fifthFloorButton,
                emergency,
                stopButton};
    }

    public void pressButton(String buttonName) {
        if (buttonName == null) {
            return;
        }
        pressedButton = findPressedButton(buttonName);
        if (pressedButton == null) {
            return;
        }
        pressedButton.onClick();

        if (currentFloor > pressedButton.floor) {
            moveDown();
        } else if (currentFloor == pressedButton.floor) {
            stop();
        } else {
            moveUp();
        }
    }

    private Button findPressedButton(String buttonName) {
        for (Button button : buttons) {
            if (buttonName.equals(button.name)) {
                return button;
            }
        }
        return null;
    }

    @Override
    public void moveDown() {
        while (currentFloor > pressedButton.floor && !isStopPressed) {
            System.out.println("The lift on the floor: " + currentFloor);
            currentFloor--;
        }
        System.out.println("The lift on the floor: " + currentFloor);
    }

    @Override
    public void stop() {
        isStopPressed = true;
    }

    @Override
    public void moveUp() {
        while (currentFloor < pressedButton.floor && !isStopPressed) {
            System.out.println("The lift on the floor: " + currentFloor);
            currentFloor++;
        }
        System.out.println("The lift on the floor: " + currentFloor);
    }

    private class Button {
        private final int floor;
        private final String name;

        private Button(int floor, String name) {
            this.floor = floor;
            this.name = name;
        }

        private Button(String name) {
            this(0, name);
        }

        public int getFloor() {
            return floor;
        }

        public void onClick() {
            System.out.println("The button " + name + " has been pressed...");
        }
    }
}
