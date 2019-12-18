package com.itstep.oop.interfaces.likhomanov_homework_decorator;

class Reverser extends Modificator {

    Reverser(Modifiable modifiable) {
        super(modifiable);
    }

    @Override
    public String modify() {
        return reverse(getModifiable().modify());
    }

    private String reverse(String word) {
        return new StringBuilder().append(word).reverse() + " ";
    }
}
