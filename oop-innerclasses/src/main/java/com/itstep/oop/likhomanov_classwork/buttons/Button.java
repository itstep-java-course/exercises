package com.itstep.oop.likhomanov_classwork.buttons;

import com.itstep.oop.likhomanov_classwork.lift.Lift;
import com.itstep.oop.likhomanov_classwork.Messages;

public abstract class Button implements Clickable, Messages {

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
