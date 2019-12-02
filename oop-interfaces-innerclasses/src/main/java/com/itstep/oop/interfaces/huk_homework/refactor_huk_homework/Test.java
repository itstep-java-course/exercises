package com.itstep.oop.interfaces.huk_homework.refactor_huk_homework;

public class Test {
    public static void main(String[] args) {
        String str = "description,main,maintenance-polimorfism encapsulation, bodies";

        //initialize (create) transformers
        WordTransformer reverseTransformer = new ReverseTransformer();
        WordTransformer countLettersTransformer = new CountLettersTransformer();
        WordTransformer countLettersWithFilterTransformer = new CountLettersWithFilterTransformer();

        WordTransformer[] transformers =
                new WordTransformer[]{reverseTransformer, countLettersTransformer, countLettersWithFilterTransformer};

        SourceStringSplitter sourceStringSplitter = new SourceStringSplitter(str);
        String[] words = sourceStringSplitter.makeSplit();

        //perform transformation
        TransformLogicPerformer logicPerformer = new TransformLogicPerformer(words, transformers);
        String[] results = logicPerformer.performLogic();

        //print
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.print(results);
    }
}
