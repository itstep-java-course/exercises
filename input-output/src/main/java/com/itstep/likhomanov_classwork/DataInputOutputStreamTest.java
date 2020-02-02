package com.itstep.likhomanov_classwork;

import java.io.*;

public class DataInputOutputStreamTest {

    public static void main(String[] args) {
        File dataFile = new File("input-output/src/main/java/data/data.txt");

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(dataFile))){
            outputStream.writeDouble(98.6);
            outputStream.writeInt(1000);
            outputStream.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(dataFile))){
            System.out.println("Double: " + inputStream.readDouble());
            System.out.println("Integer: " + inputStream.readInt());
            System.out.println("Boolean: " + inputStream.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
