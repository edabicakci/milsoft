package com.godoro.hws.hw3A;

import java.io.BufferedReader;
import java.io.FileReader;

//extra
public class MyReader {
    public String readFile(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            StringBuilder builder = new StringBuilder();

            while ((line = reader.readLine()) != null) {

                builder.append(line);

            }

            return builder.toString();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return null;

    }

}
