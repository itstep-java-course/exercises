package com.itstep.string.array.strahov_hometask;

public class StringTask2 {
    public static void main(String[] args){
        String g="hello_java_world";
                final String[] g2 = g.split("_");
                for (String g1 : g2) {
                    final char a = g1.charAt(2);
                    final char b = g1.charAt(3);
                    System.out.println("вторая и третья буквы " + a + "," + b);
                    String result = g1.replace("o", "$");
                    System.out.println("Изменения=" + result);

                }
            }
        }

