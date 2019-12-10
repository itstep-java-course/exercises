package com.itstep.oop.interfaces.perepeliatnyk_homework.new_homework;

import com.itstep.oop.interfaces.perepeliatnyk_homework.Word;

public class Test {

    public static void main(String[] args) {
        WordTransformer reverseTransformer = new ReverseTramsformer();
        WordTransformer countLettersTransformer = new CountLettersTransformer();
        WordTransformer countLettersWithFilterTransformer = new CountLettersWithFilterTransformer();

        WordTransformer[] transformers = new WordTransformer[]{reverseTransformer, countLettersTransformer, countLettersWithFilterTransformer};


        String sourceStr = "description,main,maintenance-polimorfism encapsulation, bodies";
        SourceStringSplitter sourceStringSplitter = new SourceStringSplitter(sourceStr);
        String[] words = sourceStringSplitter.makeSplit();


        TransformLogicPerformer logicPerformer = new TransformLogicPerformer(words, transformers);
        String[] result = logicPerformer.performLogic();


        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.print(result);
    }

}
