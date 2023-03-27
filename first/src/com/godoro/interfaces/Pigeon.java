package com.godoro.interfaces;

public class Pigeon extends Bird{

    public Pigeon(String name) {
        super(name);
    }


    public void fly(){

        System.out.println("Güvercin " + name + " uçuyor");


    }

    public void land(){

        System.out.println("Güvercin " + name + " konuyor...");


    }

    
}
