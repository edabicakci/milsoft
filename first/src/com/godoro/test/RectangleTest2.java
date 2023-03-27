package com.godoro.test;

public class RectangleTest2 {
    static int getArea(int width, int height){
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {

        int width = 3;
        int height = 4;
        int area = getArea(width, height);

        System.out.println("Alan: " + area);
        
    }
    
}
