package com.itstep.oop.interfaces.borovoy_homework;

 class TransformLogicPerformer {
    private final String[] words;
    private final WordTransformer[] transformers;

     TransformLogicPerformer(String[] words,
                                   WordTransformer[] transformers) {
        this.words = words;
        this.transformers = transformers;
    }

     String[] performLogic() {
        String[] arr = new String[transformers.length];
        for (int i = 0; i < transformers.length; i++) {
            String result = "";
            for (String word : words) {
                result += transformers[i].transform(word);
                arr[i] = result;

            }
        }
        return arr;
    }
}
