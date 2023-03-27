package com.godoro.interfaces;

public class Test {
    public static void main(String[] args) {
        Pigeon pigeon  = new Pigeon("Paçalı");
        pigeon.fly();
        pigeon.land();


        Bird bird = new Pigeon("Taklacı");
        bird.fly();
        bird.land();

        Flyable flyable = new Pigeon("Postacı");
        flyable.fly();
        flyable.land();


        Bat bat = new Bat("Batman");
        bat.fly();
        bat.land();



        //Mammal mammal = new Mammal("Robin");
        //mammal.fly();
        //mammal.land();


        Flyable flayable2 = new Bat("Vampir");
        flayable2.fly();
        flayable2.land();

        makeFly(pigeon);
        makeFly(bird);
        makeFly(bat);


    }


    static void makeFly(Flyable flyable){
        System.out.println();
        System.out.println("UÇ!");
        flyable.fly();
        System.out.println("KON!");
        flyable.land();

    }
    
}
