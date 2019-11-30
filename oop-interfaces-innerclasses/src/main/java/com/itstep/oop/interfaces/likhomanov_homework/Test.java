package com.itstep.oop.interfaces.likhomanov_homework;

import com.itstep.oop.interfaces.likhomanov_homework.transformers.LettersToNumberReplacer;
import com.itstep.oop.interfaces.likhomanov_homework.transformers.LettersToNumberWithFilterReplacer;
import com.itstep.oop.interfaces.likhomanov_homework.transformers.Reverser;
import com.itstep.oop.interfaces.likhomanov_homework.transformers.WordTransformer;

class Test {

    public static void main(String[] args) {

        String line = "description,main,maintenance-polymorphism encapsulation, bodies";
        String regex = "\\s*,\\s*|-|\\s";

        WordTransformer[] transformers = {
                new LettersToNumberReplacer(),
                new Reverser(),
                new LettersToNumberWithFilterReplacer()
        };

        WordTransformationPerformer performer = new WordTransformationPerformer(
                new StringSplitter(line, regex).split(),
                transformers);

        ResultPrinter printer = new ResultPrinter();

        printer.print(performer.makeTransformation());
    }
}
