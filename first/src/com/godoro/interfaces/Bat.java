package com.godoro.interfaces;

public class Bat extends Mammal implements Flyable{

    public Bat(String name) {
        super(name);
    }

    public void fly(){

        System.out.println("Yarasa " + name + " uçuyor");


    }

    public void land(){

        System.out.println("Yarasa " + name + " konuyor...");


    }
       
}
