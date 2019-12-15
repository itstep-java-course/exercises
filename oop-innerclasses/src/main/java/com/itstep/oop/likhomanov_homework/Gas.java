package com.itstep.oop.likhomanov_homework;

abstract class Gas {

    private int volume;

    Gas(int volume) {
        this.volume = volume;
    }

    abstract void burn();

    int getVolume() {
        return volume;
    }

    void reduceVolume(int consumptionRate) {
        volume -= consumptionRate;
    }
}
