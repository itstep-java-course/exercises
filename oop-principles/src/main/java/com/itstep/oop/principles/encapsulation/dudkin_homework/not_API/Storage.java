package com.itstep.oop.principles.encapsulation.dudkin_homework.not_API;

class Storage {
    private int[][] products = new int[5][5];

     Storage(){
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                products[i][j] = Integer.valueOf("100" + i);
    }

     boolean checkAvailability(int id) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (products[i][j] == id) {
                    products[i][j] = 0;
                    return true;
                }
        return false;
    }

}
