package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class TransformLogicPerform {
    private final WordStyle[] transformers;
    private final String[] result;

    public TransformLogicPerform(WordStyle[] outputLatestVersion, String[] result) {
        this.transformers = outputLatestVersion;
        this.result = result;
    }

    public String[][] performLogic() {
        String[][] transformer = new String[transformers.length][result.length];
        String[] tempString;
        for (int i = 0; i < transformers.length; i++) {
            tempString = transformers[i].reverser(result);
            transformer[i] = tempString;
        }
        return transformer;
    }
}
