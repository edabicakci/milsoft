package com.godoro.test;

public class RectangleTest4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(-3);
        rectangle.setHeight(4);;

        System.out.println("Alan: " + rectangle.getArea());
        System.out.println("Çevrel: " + rectangle.getPerimeter());

    }
    
}
