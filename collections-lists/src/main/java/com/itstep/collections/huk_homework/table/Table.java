package com.itstep.collections.huk_homework.table;


/*
Создать class Table. У класса должно быть поле “площадь поверхности”. Отсортировать столы по площади поверхности начиная
 с наибольшей. Table должен быть Comparable. Вывести элементы в консоль. Для решения задачи используйте TreeSet
 */
public abstract class Table implements Comparable<Table> { //стол


    private String name;
    private double surfaceArea;

    public Table( String name, double surfaceArea) {
        this.name = name;
        this.surfaceArea = surfaceArea;
    }


    public String getName() {
        return name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public abstract double getArea();


    @Override
    public int compareTo(Table o) {
         return Double.compare(surfaceArea, o.surfaceArea);
    }


    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}

