package com.itstep.oop.likhomanov_classwork.buttons;

import com.itstep.oop.likhomanov_classwork.lift.Lift;
import static com.itstep.oop.likhomanov_classwork.Messages.*;

public class FunctionalButton extends Button {

    private FunctionalButton(String name, Lift lift) {
        super(name, lift);
    }

    public static FunctionalButton getInstance(String name, Lift lift) {
        return new FunctionalButton(name, lift);
    }

    @Override
    public String onClick() {
        return getName() + PRESSED;
    }
}
