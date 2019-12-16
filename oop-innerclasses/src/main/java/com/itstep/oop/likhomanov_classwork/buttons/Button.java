package com.itstep.oop.likhomanov_classwork.buttons;

import com.itstep.oop.likhomanov_classwork.lift.Lift;

public abstract class Button implements Clickable {

    private final String name;
    private final Lift parentLift;

    Button(String name, Lift lift) {
        this.name = name;
        this.parentLift = lift;
    }

    public String getName() {
        return name;
    }

    Lift getParentLift() {
        return parentLift;
    }
}
