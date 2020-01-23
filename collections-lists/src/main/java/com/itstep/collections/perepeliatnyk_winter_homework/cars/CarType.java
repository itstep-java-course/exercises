package com.itstep.collections.perepeliatnyk_winter_homework.cars;

public enum CarType {
    SEDAN("sedan"),
    COUPE("coupe"),
    SUV("suv");

    private String bodyTypePrintable;

    CarType(String bodyTypePrintable) {
        this.bodyTypePrintable = bodyTypePrintable;
    }

    public static CarType getTypeByTypeName(String name) {
        final CarType[] carTypes = values();

        for (CarType value : carTypes) {
            if (value.bodyTypePrintable.equals(name)) {
                return value;
            }
        }
        throw new RuntimeException("Illegal type: " + name);
    }

    @Override
    public String toString() {
        return bodyTypePrintable;
    }
}
