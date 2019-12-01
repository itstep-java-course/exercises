package com.itstep.oop.interfaces.chubuk_homework;

public class ResultArray {

    public String[][] printAll(String str) {
        WordDesigner reversWords = new ReversWords();
        WordDesigner wordChange = new WordsChange();
        WordDesigner countWordsChange = new CountingWordsChange();

        WordDesigner[] outputLatestVersion = new WordDesigner[]{reversWords, wordChange, countWordsChange};

        TransformToArray transformToArray = new TransformToArray();
        String[] string = transformToArray.performString(str);

        TransformLogicPerform logicPerformer = new TransformLogicPerform(outputLatestVersion, string);
        return logicPerformer.performLogic();
    }
}
