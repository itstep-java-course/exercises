package com.itstep.oop.interfaces.borovoy_homework;

public class WordsPrinter {
    public static void main(String[] args) {

        WordTransformer reverseTransformer = new ReverseTransformer();
        WordTransformer countLettersTransformer = new CountLettersTransformer();
        WordTransformer countLettersWithFilterTransformer = new CountLettersWithFilterTransformer();


        WordTransformer[] transformers =
                new WordTransformer[]{reverseTransformer, countLettersTransformer, countLettersWithFilterTransformer};


        String sourceStr = "description,main,maintenance-polimorfism encapsulation, bodies";
        SourceStringSplitter sourceStringSplitter = new SourceStringSplitter(sourceStr);
        String[] words = sourceStringSplitter.makeSplit();


        TransformLogicPerformer logicPerformer = new TransformLogicPerformer(words, transformers);
        String[] results = logicPerformer.performLogic();


        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.print(results);

    }
}
