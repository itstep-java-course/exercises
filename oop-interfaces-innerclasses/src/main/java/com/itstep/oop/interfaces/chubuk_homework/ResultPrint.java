package com.itstep.oop.interfaces.chubuk_homework;

public class ResultPrint {

    public String[][] printAll(String str) {
        TransformToArray transformToArray = new TransformToArray();
        String[] string = transformToArray.performString(str);

        String[][] designer = new String[3][string.length];
        for (int i = 0; i < string.length; i++) {

            WordDesigner reversWords = new ReversWords();
            String[] revers = reversWords.outputLatestVersion(string);
            WordDesigner wordChange = new WordsChange();
            String[] change = wordChange.outputLatestVersion(string);
            WordDesigner countWordsChange = new CountingWordsChange();
            String[] countChange = countWordsChange.outputLatestVersion(string);

            designer = new String[][]{revers, change, countChange};
        }
        return designer;
    }
}
