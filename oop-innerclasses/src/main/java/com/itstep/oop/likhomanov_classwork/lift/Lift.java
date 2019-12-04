package com.itstep.oop.likhomanov_classwork.lift;

import com.itstep.oop.likhomanov_classwork.Messages;
import com.itstep.oop.likhomanov_classwork.buttons.Button;
import com.itstep.oop.likhomanov_classwork.buttons.FloorButton;
import com.itstep.oop.likhomanov_classwork.buttons.FunctionalButton;
import com.itstep.oop.likhomanov_classwork.display.Monitor;
import com.itstep.oop.likhomanov_classwork.door.Door;

public class Lift implements UpMovable, DownMovable, Stoppable, Messages {

    private final Button[] buttons;
    private final Door door;
    private final Monitor monitor;

    private int currentFloor = 1;
    private int nextFloor = 1;
    private int numberOfPassengers;

    private Lift() {
        Button firstFloorButton = FloorButton.getInstance("First floor", 1, this);
        Button secondFloorButton = FloorButton.getInstance("Second floor", 2, this);
        Button thirdFloorButton = FloorButton.getInstance("Third floor", 3, this);
        Button forthFloorButton = FloorButton.getInstance("Forth floor", 4, this);
        Button fifthFloorButton = FloorButton.getInstance("Fifth floor", 5, this);
        Button emergencyButton = FunctionalButton.getInstance("Emergency", this);
        Button stopButton = FunctionalButton.getInstance("Stop", this);

        buttons = new Button[]{
                firstFloorButton,
                secondFloorButton,
                thirdFloorButton,
                forthFloorButton,
                fifthFloorButton,
                emergencyButton,
                stopButton
        };

        door = new Door();
        door.open();
        monitor = new Monitor();
    }

    public static Lift getInstance() {
        return new Lift();
    }

    public void letPassengersIn(int numberOfPassengers) {

        if (numberOfPassengers <= 0) {
            return;
        }

        if (door.isOpen()) {
            this.numberOfPassengers = numberOfPassengers;
            monitor.display(NUMBER_OF_PASSENGERS + numberOfPassengers);
        } else {
            monitor.display(CLOSE_DOOR);
        }
    }

    public void letPassengersOut() {
        if (door.isOpen()) {
            numberOfPassengers = 0;
            monitor.display(IS_EMPTY);
        } else {
            monitor.display(CLOSE_DOOR);
        }
    }

    public void pressButton(String buttonName) {

        if (buttonName == null) {
            return;
        }

        Button pressedButton = findPressedButton(buttonName);
        if (pressedButton == null) {
           return;
        }
        monitor.display(pressedButton.onClick());

        if (currentFloor > nextFloor) {
            moveDown();
        } else if (currentFloor == nextFloor){
            stop();
        } else {
            moveUp();
        }
    }

    public void setNextFloor(int floor) {
        nextFloor = floor;
    }

    public String[] getButtons() {
        String[] buttons = new String[this.buttons.length];

        for (int i = 0; i < this.buttons.length; ++i) {
            buttons[i] = this.buttons[i].getName();
        }
        return buttons;
    }

    private Button findPressedButton(String buttonName) {
        for (Button button : buttons) {
            if (buttonName.equals(button.getName())) {
                return button;
            }
        }
        return null;
    }

    private void countFloors() {
        if (currentFloor > nextFloor) {
            incrementFloors();
        } else {
            decrementFloors();
        }
    }

    private void incrementFloors() {
        do {
            monitor.display(CURRENT_FLOOR + (--currentFloor));
        } while (currentFloor != nextFloor);
        stop();
    }

    private void decrementFloors() {
        do {
            monitor.display(CURRENT_FLOOR + (++currentFloor));
        } while (currentFloor != nextFloor);
        stop();
    }

    private boolean isNumberOfPassengersOk() {
        return numberOfPassengers <= 6;
    }

    @Override
    public void moveDown() {                                    //????How to make private????
        if (isNumberOfPassengersOk()) {
            door.close();
            monitor.display(CLOSE_DOOR);
            monitor.display(GOING_DOWN + nextFloor);
            countFloors();
        } else {
            monitor.display(TOO_MANY_PASSENGERS);
        }
    }

    @Override
    public void stop() {
        door.open();
        monitor.display(STOP);
        monitor.display(OPEN_DOOR);
    }

    @Override
    public void moveUp() {
        if (isNumberOfPassengersOk()) {
            door.close();
            monitor.display(CLOSE_DOOR);
            monitor.display(GOING_UP + nextFloor);
            countFloors();
        } else {
            monitor.display(TOO_MANY_PASSENGERS);
        }
    }
}
