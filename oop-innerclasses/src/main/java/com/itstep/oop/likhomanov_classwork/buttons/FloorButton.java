package com.itstep.oop.likhomanov_classwork.buttons;

import com.itstep.oop.likhomanov_classwork.lift.Lift;

public class FloorButton extends Button {

    private final int floor;

    private FloorButton(String name, int floor, Lift lift) {
        super(name, lift);
        this.floor = floor;
    }

    public static FloorButton getInstance (String name, int floor, Lift lift) {
        return new FloorButton(name, floor, lift);
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String onClick() {
        getParentLift().setNextFloor(floor);
        return getName() + PRESSED;
    }
}
