package com.itstep.oop.anonymous.borovoy_lift;

import java.awt.*;

public class Lift implements DownMoveable, Upmoveable, Stopable {
    private final Button[] buttons;
    private int currentFloor;

    public Lift() {


        Button firstFloor = new Button(1, "firstFloor");
        Button secondFloor = new Button(1, "secondFloor");
        Button thirdFloor = new Button(1, "thirdFloor");
        Button emergency = new Button("Emergency");
        Button stopButton = new Button("Stop");
        this.buttons = new Button[]{
                firstFloor,
                secondFloor,
                thirdFloor,
                emergency,
                stopButton};

    }

    public void pressButton(String buttonName) {
        if (buttonName == null) {
            return;
        }
 Button pressedButton =findPressedButton(buttonName);
        pressedButton.onClick();
        if (buttonName == null) {
            return;
        }
                if (currentFloor > pressedButton.floor) {
                    moveDown();
                } else if (currentFloor == pressedButton.floor)
                    stop();
                else
                    moveUp();

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

    }

    @Override
    public void stop() {

    }

    @Override
    public void moveUp() {

    }

    private class Button {
        private final int floor;
        private final String name;

        private Button(int floor, String name) {
            this.floor = floor;
            this.name = name;
        }

         Button(String name) {
            this(0, name);
        }

        public int getFloor() {
            return floor;
        }

         void onClick() {
            System.out.println("The button is :" + name + "has been pressed");
        }
    }

}
