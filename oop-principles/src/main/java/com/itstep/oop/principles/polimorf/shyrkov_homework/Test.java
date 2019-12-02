package com.itstep.oop.principles.polimorf.shyrkov_homework;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";

        Splitter splitter = new Splitter();
        String[] splittedArray = splitter.split(str);

        Transformable firstLogicTransformer = new TransformerToFirstLogic();
        Transformable secondLogicTransformer = new TransformerToSecondLogic();
        Transformable thirdLogicTransformer = new TransformerToThirdLogic();

        StringArrayPrinter printer = new StringArrayPrinter();
        StringArrayTransformer transformer = new StringArrayTransformer();
        String[] strsByFirstLogic = transformer.transform(splittedArray, firstLogicTransformer);
        printer.printArray(strsByFirstLogic);
        String[] strsBySecondLogic = transformer.transform(splittedArray, secondLogicTransformer);
        printer.printArray(strsBySecondLogic);
        String[] strsByThirdLogic = transformer.transform(splittedArray, thirdLogicTransformer);
        printer.printArray(strsByThirdLogic);
    }
}
