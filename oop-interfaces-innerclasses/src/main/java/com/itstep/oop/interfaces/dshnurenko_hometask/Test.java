package com.itstep.oop.interfaces.dshnurenko_hometask;

public class Test {
    public static void main(String[] args) {
        //initialize (create) transformers
        WordTransformer reverseTransformer = new ReverseTransformer();
        WordTransformer countLettersTransformer = new CountLettersTransformer();
        WordTransformer countLettersWithFilterTransformer = new CountLettersWithFilterTransformer();

        WordTransformer[] transformers =
                new WordTransformer[]{reverseTransformer, countLettersTransformer, countLettersWithFilterTransformer};

        //split source str
        String sourceStr = "";
        SourceStringSplitter sourceStringSplitter = new SourceStringSplitter(sourceStr);
        String[] words = sourceStringSplitter.makeSplit();

        //perform transformation
        TransformLogicPerformer logicPerformer = new TransformLogicPerformer(words, transformers);
        String[] results = logicPerformer.performLogic();

        //print
        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.print(results);
    }
}
