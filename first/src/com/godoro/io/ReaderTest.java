package com.godoro.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.FileReader;
public class ReaderTest {
    public static void main(String[] args) throws Exception {
        String path = "workspace/first/src/com/godoro/io/test.txt";
        FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr);
        String line = null;

        StringBuilder builder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            builder.append(line).append("\r\n");
            // text += line + "\r\n";

        }

        reader.close();
        String text = builder.toString();
        System.out.println(text);

    }

}
