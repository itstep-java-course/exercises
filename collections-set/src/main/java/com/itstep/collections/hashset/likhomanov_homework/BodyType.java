package com.itstep.collections.hashset.likhomanov_homework;

public enum BodyType {
    MINIVAN("Minivan"),
    SUV("SUV"),
    SEDAN("Sedan"),
    COUPE("Coupe");

    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return bodyType;
    }
}
