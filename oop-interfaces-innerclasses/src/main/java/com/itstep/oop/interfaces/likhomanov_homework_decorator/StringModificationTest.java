package com.itstep.oop.interfaces.likhomanov_homework_decorator;

class StringModificationTest {

    public static void main(String[] args) {

        StringModificationTest test = new StringModificationTest();

        String line = "description,main,maintenance-polymorphism encapsulation, bodies";

        Modifiable[] words = Splitter.splitLine(line, "\\s*,\\s*|-|\\s");

        test.replaceWords(words);

        test.reverseWords(words);

        test.replaceLongWords(words);
    }

    private void print(Modifiable[] modifiables) {
        for (Modifiable modifiable : modifiables) {
            System.out.print(modifiable.modify());
        }
        System.out.println();
    }

    private void reverseWords(Modifiable[] words) {
        Modifiable[] modifiables = new Modifiable[words.length];

        for (int i = 0; i < words.length; ++i) {
            modifiables[i] = new Reverser(words[i]);
        }
        print(modifiables);
    }

    private void replaceWords(Modifiable[] words) {
        Modifiable[] modifiables = new Modifiable[words.length];

        for (int i = 0; i < words.length; ++i) {
            modifiables[i] = new Replacer(words[i]);
        }
        print(modifiables);
    }

    private void replaceLongWords(Modifiable[] words) {
        Modifiable[] modifiables = new Modifiable[words.length];

        for (int i = 0; i < words.length; ++i) {
            modifiables[i] = new LongReplacer(words[i]);
        }
        print(modifiables);
    }
}
