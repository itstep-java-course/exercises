package com.itstep.oop.likhomanov_classwork.lift;

import com.itstep.oop.likhomanov_classwork.buttons.Button;
import com.itstep.oop.likhomanov_classwork.buttons.FloorButton;
import com.itstep.oop.likhomanov_classwork.buttons.FunctionalButton;
import com.itstep.oop.likhomanov_classwork.display.Monitor;
import com.itstep.oop.likhomanov_classwork.door.Door;

import static com.itstep.oop.likhomanov_classwork.Messages.*;

public class Lift implements UpMovable, DownMovable, Stoppable {

    private final Button[] buttons;
    private final Door door;
    private final Monitor monitor;
    private final PassengersController passengersController;
    private final FloorCounter floorCounter;

    private Lift(int capacity) {
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
        passengersController = new PassengersController(capacity);
        floorCounter = new FloorCounter();
    }

    public static Lift getInstance(int capacity) {
        return new Lift(capacity);
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

        if (floorCounter.isNextFloorBelow()) {
            moveDown();
        } else if (floorCounter.isNextFloorAbove()){
            moveUp();
        } else {
            stop();
        }
    }

    public String[] getButtons() {
        String[] buttons = new String[this.buttons.length];

        for (int i = 0; i < this.buttons.length; ++i) {
            buttons[i] = this.buttons[i].getName();
        }
        return buttons;
    }

    public void setNextFloor(int floor) {
        floorCounter.setNextFloor(floor);
    }

    public void comeIn(int numberOfPassengers) {
        passengersController.letPassengersIn(numberOfPassengers);
    }

    public void getOut() {
        passengersController.letPassengersOut();
    }

    private Button findPressedButton(String buttonName) {
        for (Button button : buttons) {
            if (buttonName.equals(button.getName())) {
                return button;
            }
        }
        return null;
    }

    @Override
    public void moveDown() {
        if (passengersController.isNumberOfPassengersOk()) {
//            door.close();
            monitor.display(CLOSE_DOOR);
            monitor.display(GOING_DOWN + floorCounter.nextFloor);
            floorCounter.decrementFloors();
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
        if (passengersController.isNumberOfPassengersOk()) {
//            door.close();
            monitor.display(CLOSE_DOOR);
            monitor.display(GOING_UP + floorCounter.nextFloor);
            floorCounter.incrementFloors();
        } else {
            monitor.display(TOO_MANY_PASSENGERS);
        }
    }

    private class PassengersController {

        private final int maxNumberOfPassengers;
        private int numberOfPassengers;

        private PassengersController(int maxNumberOfPassengers) {
            this.maxNumberOfPassengers = maxNumberOfPassengers;
        }

        private void letPassengersIn(int numberOfPassengers) {

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

        private void letPassengersOut() {
            if (door.isOpen()) {
                numberOfPassengers = 0;
                monitor.display(IS_EMPTY);
            } else {
                monitor.display(CLOSE_DOOR);
            }
        }

        private boolean isNumberOfPassengersOk() {
            return numberOfPassengers <= maxNumberOfPassengers;
        }
    }

    private class FloorCounter {

        private int currentFloor = 1;
        private int nextFloor = 1;

        private void setNextFloor(int floor) {
            nextFloor = floor;
        }

        private void incrementFloors() {
            do {
                monitor.display(CURRENT_FLOOR + (++currentFloor));
            } while (currentFloor != nextFloor);
            stop();
        }

        private void decrementFloors() {
            do {
                monitor.display(CURRENT_FLOOR + (--currentFloor));
            } while (currentFloor != nextFloor);
            stop();
        }

        private boolean isNextFloorBelow() {
            return currentFloor > nextFloor;
        }

        private boolean isNextFloorAbove() {
            return currentFloor < nextFloor;
        }
    }
}
