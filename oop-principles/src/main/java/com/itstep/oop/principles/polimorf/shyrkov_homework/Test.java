package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";

        Splitter splitter = new Splitter();
        String[] splittedArray = splitter.split(str);

        Transformable firstLogic = new TransformerToFirstLogic();
        Transformable secondLogic = new TransformerToSecondLogic();
        Transformable thirdLogic = new TransformerToThirdLogic();

        StringArrayTransformer transformer = new StringArrayTransformer();
        transformer.transform(splittedArray, firstLogic);
        transformer.transform(splittedArray, secondLogic);
        transformer.transform(splittedArray, thirdLogic);
    }
}
