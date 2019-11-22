package com.itstep.oop.principles.polimorf;

public class Test {

    public static void main(String[] args) {
        LineWriter lineWriter = new LineWriter();

        Writable markerWritable = new Marker();
        Writable penWritable = new Pen();
        Writable pencil = new Pencil();

        lineWriter.writeLine(pencil);
    }
}
