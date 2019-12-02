package com.itstep.oop.shyrkov_lift;

public class Lift implements UpMovable, DownMovable, Stopable {

    private final Button[] buttons;
    private int currentFloor = 1;

    public Lift() {
        Button firstButton = new Button(1, "First");
        Button secondButton = new Button(2, "Second");
        Button thirdButton = new Button(3, "Third");
        Button stopButton = new Button("Stop");
        Button emergencyButton = new Button("Emergency");
        this.buttons = new Button[]{firstButton, secondButton, thirdButton, stopButton, emergencyButton};
    }

    public void pressButton(String buttonName) {
        if (buttonName == null)
            return;
        Button pressedButton = findPressedButton(buttonName);
        if (pressedButton == null)
            return;
        pressedButton.onClick();
        if (currentFloor == pressedButton.floor) {
            stop();
        } else if (currentFloor > pressedButton.floor) {
            moveDown();
            currentFloor = pressedButton.floor;
            System.out.println("Current floor = " + currentFloor);
        } else {
            moveUp();
            currentFloor = pressedButton.floor;
            System.out.println("Current floor = " + currentFloor);
        }


    }

    private Button findPressedButton(String buttonName) {
        for (Button button : buttons) {
            if (button.name.equals(buttonName)) {
                return button;

            }
        }
        return null;
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up");
    }

    private class Button {
        private final int floor;
        private final String name;

        public Button(int floor, String name) {
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
            System.out.println("Button " + name + " has been pressed");
        }
    }
}
