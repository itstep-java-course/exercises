package com.itstep.oop.interfaces.chubuk_homework;

class CountingWordsChange extends WordsChange{

    @Override
    public String[] outputLatestVersion(String[] word){
        String[] result = new String[word.length];
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > 6)
                result[i] = word[i].charAt(0) + "" + word[i].length() + "" + word[i].charAt(word[i].length() - 1);
            else result[i] ="";
        }
        return result;
    }
}
