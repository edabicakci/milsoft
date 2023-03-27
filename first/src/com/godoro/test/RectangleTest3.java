package com.godoro.test;

public class RectangleTest3 {
    static int getArea(Rect rectangle){
        int area = rectangle.width * rectangle.height;
        return area;
    }

    public static void main(String[] args) {
        Rect rectangle = new Rect();
        rectangle.width = 3;
        rectangle.height = 4;

        int area = getArea(rectangle);

        System.out.println("Alan: " + area);

    }


    
}
