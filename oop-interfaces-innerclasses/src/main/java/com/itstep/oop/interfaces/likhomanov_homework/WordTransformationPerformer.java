package com.itstep.oop.interfaces.likhomanov_homework;

import com.itstep.oop.interfaces.likhomanov_homework.transformers.WordTransformer;

class WordTransformationPerformer {

    private final String[] words;
    private final WordTransformer[] transformers;

    WordTransformationPerformer(String[] words, WordTransformer[] transformers) {
        this.words = words;
        this.transformers = transformers;
    }

    String[] makeTransformation() {
        String[] transformedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();

            for (WordTransformer transformer : transformers) {
                word.append(transformer.transform(words[i]));
            }

            transformedWords[i] = word.toString();
        }
        return transformedWords;
    }
}
