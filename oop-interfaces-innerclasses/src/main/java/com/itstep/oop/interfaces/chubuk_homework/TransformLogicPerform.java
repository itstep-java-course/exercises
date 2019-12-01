package com.itstep.oop.interfaces.chubuk_homework;

public class TransformLogicPerform {
    private final WordDesigner[] transformers;
    private final String[] result;

    public TransformLogicPerform(WordDesigner[] outputLatestVersion, String[] result) {
        this.transformers = outputLatestVersion;
        this.result = result;
    }

    public String[][] performLogic() {
        String[][] designer = new String[transformers.length][result.length];
        String[] tempString;
        for (int i = 0; i < transformers.length; i++) {
            tempString = transformers[i].outputLatestVersion(result);
            designer[i] = tempString;
        }
        return designer;
    }
}
