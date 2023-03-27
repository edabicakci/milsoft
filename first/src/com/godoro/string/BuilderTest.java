package com.godoro.string;

public class BuilderTest {
    public static void main(String[] args) {

        //Builder pattern , design patterns 

        StringBuilder builder = new StringBuilder("Godoro");
        builder.append(".");
        builder.append("Java").append(",");
        builder.append("SpringBoot").append(",");
        builder.append("Javascript").append(",");
        builder.append("React").append(".");

        String string = builder.toString();
        System.out.println("Sicim: " + string);


        //java verbose

        String text = new StringBuilder("Godoro")
        .append(".")
        .append("Java").append(",")
        .append("SpringBoot").append(",")
        .append("Javascript").append(",").toString();
        System.out.println("Yazı" + text);





    }
    
}
