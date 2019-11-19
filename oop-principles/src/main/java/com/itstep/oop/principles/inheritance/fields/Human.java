package com.itstep.oop.principles.inheritance.fields;

class Human extends HomoSapiens {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    String getHomoSapiensName() {
        return super.name;
    }
}
