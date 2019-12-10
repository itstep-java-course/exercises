
package com.itstep.oop.interfaces.safankov_homework_interfaces;

public class ResultArray {

    public String[][] returnArray(String str) {
        WordStyle InversionOfWords = new InversionOfWords();
        WordStyle LogicWithFirstAndLastLetter = new LogicWithFirstAndLastLetter();
        WordStyle MoreThanSixWords = new MoreThanSixWords();

        WordStyle[] outputLatestVersion = new WordStyle[]{MoreThanSixWords,InversionOfWords,LogicWithFirstAndLastLetter };

        TransformStringToArray transformToArray = new TransformStringToArray();
        String[] string = transformToArray.performString(str);

        TransformLogicPerform logicPerformer = new TransformLogicPerform(outputLatestVersion, string);
        return logicPerformer.performLogic();
    }
}
