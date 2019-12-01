package com.itstep.oop.interfaces.likhomanov_homework;

abstract class Modificator implements Modifiable{

    private final Modifiable modifiable;

    Modificator(Modifiable modifiable) {
        this.modifiable = modifiable;
    }

    Modifiable getModifiable() {
        return modifiable;
    }
}
