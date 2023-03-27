package com.godoro.hws.hw2.partB;

public class Test {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();

        double[] cof = {-6,5,1};
        Function f1 = new Polynomial(cof);
        drawer.draw(f1, 3,4,5);

        Function f2=new Sinusoidal(10,2,Math.PI/6);
	    drawer.draw(f2,3,4,5);
    }
    
}
