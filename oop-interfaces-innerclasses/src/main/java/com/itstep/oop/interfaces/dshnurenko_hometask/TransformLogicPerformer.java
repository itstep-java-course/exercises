package com.itstep.oop.interfaces.dshnurenko_hometask;

public class TransformLogicPerformer {
    private final String[] words;
    private final WordTransformer[] transformers;

    public TransformLogicPerformer(String[] words,
                                   WordTransformer[] transformers) {
        this.words = words;
        this.transformers = transformers;
    }

    public String[] performLogic() {
        String result = "";
        String[] arr = new String[transformers.length];
        for (int i = 0; i < transformers.length; i++) {
            for (String word : words) {
                result += transformers[i].transform(word);
                arr[i] = result;

            }
        }
        return arr;
    }
}
