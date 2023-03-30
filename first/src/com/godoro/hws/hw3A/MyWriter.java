package com.godoro.hws.hw3A;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter{

    private String path = null;
    private FileWriter fw = null;
    private BufferedWriter writer = null;

    public MyWriter(String path) throws IOException{
        this.path = path;
        this.fw = new FileWriter(path); 
        this.writer = new BufferedWriter(fw);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

   

   

    public void writeFile(String line) {

        try {

           

            writer.write(line);
            writer.write(" \n");

            writer.flush();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
